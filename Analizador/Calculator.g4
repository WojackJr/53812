grammar Calculator;

// REGLAS DEL PARSER
dsl: regla+ accion+ EOF ;

regla: REGLA_KW COMILLA IDENTIFICADOR COMILLA LLAVE_ABRE CUANDO_KW condicion ENTONCES_KW comando LLAVE_CIERRA ;

accion: ACCION_KW COMILLA (IDENTIFICADOR | AGREGAR_USUARIO | AGREGAR_IP | ACTIVAR_MONITOREO) COMILLA LLAVE_ABRE LLAVE_CIERRA ;

condicion
    : ACCESO_NO_AUTORIZADO                #condAcceso
    | INTENTOS_FALLIDOS MAYOR_QUE DIGITO  #condIntentos
    | ACCESO_SENSIBLES Y_KW NO_ADMIN      #condSospechosa
    ;

comando
    : AGREGAR_USUARIO                     #cmdUsuario
    | AGREGAR_IP                          #cmdIP
    | ACTIVAR_MONITOREO                   #cmdMonitoreo
    ;

// REGLAS DEL LEXER
REGLA_KW    : 'regla' ;
ACCION_KW   : 'accion' ;
CUANDO_KW   : 'cuando' ;
ENTONCES_KW : 'entonces' ;

ACCESO_NO_AUTORIZADO : 'intentoAccesoFueraHorario' ;
INTENTOS_FALLIDOS    : 'intentosFallidos' ;
ACCESO_SENSIBLES     : 'accesoARecursosSensibles' ;
Y_KW                 : 'y' ;
NO_ADMIN             : 'noEsAdministrador' ;

AGREGAR_USUARIO      : 'agregarUsuarioAListaNegra' ;
AGREGAR_IP           : 'agregarIPAListaNegra' ;
ACTIVAR_MONITOREO    : 'activarMonitoreoDetallado' ;

LLAVE_ABRE   : '{' ;
LLAVE_CIERRA : '}' ;
COMILLA      : '\'' ;
MAYOR_QUE    : '>' ;

IDENTIFICADOR : [a-zA-Z] [a-zA-Z0-9_]* ;
DIGITO        : [0-9] ;

ESPACIOS : [ \t\r\n]+ -> skip ;
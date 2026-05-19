grammar Calculator;

// REGLAS DEL PARSER
dsl: regla+ accion+ EOF ;

regla: REGLA_KW QUOTE ID QUOTE LBRACE CUANDO_KW condicion ENTONCES_KW comando RBRACE ;

accion: ACCION_KW QUOTE (ID | AGREGAR_USUARIO | AGREGAR_IP | ACTIVAR_MONITOREO) QUOTE LBRACE RBRACE ;

condicion
    : ACCESO_NO_AUTORIZADO                #condAcceso
    | INTENTOS_FALLIDOS GT DIGITO         #condIntentos
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

LBRACE : '{' ;
RBRACE : '}' ;
QUOTE  : '\'' ;
GT     : '>' ;

ID     : [a-zA-Z] [a-zA-Z0-9_]* ;
DIGITO : [0-9] ;

WS : [ \t\r\n]+ -> skip ;
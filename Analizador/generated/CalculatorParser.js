// Generated from /home/Brian/Escritorio/53812/Analizador/Calculator.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import CalculatorListener from './CalculatorListener.js';
import CalculatorVisitor from './CalculatorVisitor.js';

const serializedATN = [4,1,19,55,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
1,0,4,0,12,8,0,11,0,12,0,13,1,0,4,0,17,8,0,11,0,12,0,18,1,0,1,0,1,1,1,1,
1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,3,1,3,
1,3,1,3,1,3,1,3,1,3,3,3,48,8,3,1,4,1,4,1,4,3,4,53,8,4,1,4,0,0,5,0,2,4,6,
8,0,1,2,0,10,12,17,17,55,0,11,1,0,0,0,2,22,1,0,0,0,4,33,1,0,0,0,6,47,1,0,
0,0,8,52,1,0,0,0,10,12,3,2,1,0,11,10,1,0,0,0,12,13,1,0,0,0,13,11,1,0,0,0,
13,14,1,0,0,0,14,16,1,0,0,0,15,17,3,4,2,0,16,15,1,0,0,0,17,18,1,0,0,0,18,
16,1,0,0,0,18,19,1,0,0,0,19,20,1,0,0,0,20,21,5,0,0,1,21,1,1,0,0,0,22,23,
5,1,0,0,23,24,5,15,0,0,24,25,5,17,0,0,25,26,5,15,0,0,26,27,5,13,0,0,27,28,
5,3,0,0,28,29,3,6,3,0,29,30,5,4,0,0,30,31,3,8,4,0,31,32,5,14,0,0,32,3,1,
0,0,0,33,34,5,2,0,0,34,35,5,15,0,0,35,36,7,0,0,0,36,37,5,15,0,0,37,38,5,
13,0,0,38,39,5,14,0,0,39,5,1,0,0,0,40,48,5,5,0,0,41,42,5,6,0,0,42,43,5,16,
0,0,43,48,5,18,0,0,44,45,5,7,0,0,45,46,5,8,0,0,46,48,5,9,0,0,47,40,1,0,0,
0,47,41,1,0,0,0,47,44,1,0,0,0,48,7,1,0,0,0,49,53,5,10,0,0,50,53,5,11,0,0,
51,53,5,12,0,0,52,49,1,0,0,0,52,50,1,0,0,0,52,51,1,0,0,0,53,9,1,0,0,0,4,
13,18,47,52];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class CalculatorParser extends antlr4.Parser {

    static grammarFileName = "Calculator.g4";
    static literalNames = [ null, "'regla'", "'accion'", "'cuando'", "'entonces'", 
                            "'intentoAccesoFueraHorario'", "'intentosFallidos'", 
                            "'accesoARecursosSensibles'", "'y'", "'noEsAdministrador'", 
                            "'agregarUsuarioAListaNegra'", "'agregarIPAListaNegra'", 
                            "'activarMonitoreoDetallado'", "'{'", "'}'", 
                            "'''", "'>'" ];
    static symbolicNames = [ null, "REGLA_KW", "ACCION_KW", "CUANDO_KW", 
                             "ENTONCES_KW", "ACCESO_NO_AUTORIZADO", "INTENTOS_FALLIDOS", 
                             "ACCESO_SENSIBLES", "Y_KW", "NO_ADMIN", "AGREGAR_USUARIO", 
                             "AGREGAR_IP", "ACTIVAR_MONITOREO", "LLAVE_ABRE", 
                             "LLAVE_CIERRA", "COMILLA", "MAYOR_QUE", "IDENTIFICADOR", 
                             "DIGITO", "ESPACIOS" ];
    static ruleNames = [ "dsl", "regla", "accion", "condicion", "comando" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = CalculatorParser.ruleNames;
        this.literalNames = CalculatorParser.literalNames;
        this.symbolicNames = CalculatorParser.symbolicNames;
    }



	dsl() {
	    let localctx = new DslContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, CalculatorParser.RULE_dsl);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 11; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 10;
	            this.regla();
	            this.state = 13; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===1);
	        this.state = 16; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 15;
	            this.accion();
	            this.state = 18; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===2);
	        this.state = 20;
	        this.match(CalculatorParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	regla() {
	    let localctx = new ReglaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, CalculatorParser.RULE_regla);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 22;
	        this.match(CalculatorParser.REGLA_KW);
	        this.state = 23;
	        this.match(CalculatorParser.COMILLA);
	        this.state = 24;
	        this.match(CalculatorParser.IDENTIFICADOR);
	        this.state = 25;
	        this.match(CalculatorParser.COMILLA);
	        this.state = 26;
	        this.match(CalculatorParser.LLAVE_ABRE);
	        this.state = 27;
	        this.match(CalculatorParser.CUANDO_KW);
	        this.state = 28;
	        this.condicion();
	        this.state = 29;
	        this.match(CalculatorParser.ENTONCES_KW);
	        this.state = 30;
	        this.comando();
	        this.state = 31;
	        this.match(CalculatorParser.LLAVE_CIERRA);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	accion() {
	    let localctx = new AccionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, CalculatorParser.RULE_accion);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 33;
	        this.match(CalculatorParser.ACCION_KW);
	        this.state = 34;
	        this.match(CalculatorParser.COMILLA);
	        this.state = 35;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 138240) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 36;
	        this.match(CalculatorParser.COMILLA);
	        this.state = 37;
	        this.match(CalculatorParser.LLAVE_ABRE);
	        this.state = 38;
	        this.match(CalculatorParser.LLAVE_CIERRA);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	condicion() {
	    let localctx = new CondicionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, CalculatorParser.RULE_condicion);
	    try {
	        this.state = 47;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 5:
	            localctx = new CondAccesoContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 40;
	            this.match(CalculatorParser.ACCESO_NO_AUTORIZADO);
	            break;
	        case 6:
	            localctx = new CondIntentosContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 41;
	            this.match(CalculatorParser.INTENTOS_FALLIDOS);
	            this.state = 42;
	            this.match(CalculatorParser.MAYOR_QUE);
	            this.state = 43;
	            this.match(CalculatorParser.DIGITO);
	            break;
	        case 7:
	            localctx = new CondSospechosaContext(this, localctx);
	            this.enterOuterAlt(localctx, 3);
	            this.state = 44;
	            this.match(CalculatorParser.ACCESO_SENSIBLES);
	            this.state = 45;
	            this.match(CalculatorParser.Y_KW);
	            this.state = 46;
	            this.match(CalculatorParser.NO_ADMIN);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	comando() {
	    let localctx = new ComandoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, CalculatorParser.RULE_comando);
	    try {
	        this.state = 52;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 10:
	            localctx = new CmdUsuarioContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 49;
	            this.match(CalculatorParser.AGREGAR_USUARIO);
	            break;
	        case 11:
	            localctx = new CmdIPContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 50;
	            this.match(CalculatorParser.AGREGAR_IP);
	            break;
	        case 12:
	            localctx = new CmdMonitoreoContext(this, localctx);
	            this.enterOuterAlt(localctx, 3);
	            this.state = 51;
	            this.match(CalculatorParser.ACTIVAR_MONITOREO);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

CalculatorParser.EOF = antlr4.Token.EOF;
CalculatorParser.REGLA_KW = 1;
CalculatorParser.ACCION_KW = 2;
CalculatorParser.CUANDO_KW = 3;
CalculatorParser.ENTONCES_KW = 4;
CalculatorParser.ACCESO_NO_AUTORIZADO = 5;
CalculatorParser.INTENTOS_FALLIDOS = 6;
CalculatorParser.ACCESO_SENSIBLES = 7;
CalculatorParser.Y_KW = 8;
CalculatorParser.NO_ADMIN = 9;
CalculatorParser.AGREGAR_USUARIO = 10;
CalculatorParser.AGREGAR_IP = 11;
CalculatorParser.ACTIVAR_MONITOREO = 12;
CalculatorParser.LLAVE_ABRE = 13;
CalculatorParser.LLAVE_CIERRA = 14;
CalculatorParser.COMILLA = 15;
CalculatorParser.MAYOR_QUE = 16;
CalculatorParser.IDENTIFICADOR = 17;
CalculatorParser.DIGITO = 18;
CalculatorParser.ESPACIOS = 19;

CalculatorParser.RULE_dsl = 0;
CalculatorParser.RULE_regla = 1;
CalculatorParser.RULE_accion = 2;
CalculatorParser.RULE_condicion = 3;
CalculatorParser.RULE_comando = 4;

class DslContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CalculatorParser.RULE_dsl;
    }

	EOF() {
	    return this.getToken(CalculatorParser.EOF, 0);
	};

	regla = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ReglaContext);
	    } else {
	        return this.getTypedRuleContext(ReglaContext,i);
	    }
	};

	accion = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(AccionContext);
	    } else {
	        return this.getTypedRuleContext(AccionContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.enterDsl(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.exitDsl(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalculatorVisitor ) {
	        return visitor.visitDsl(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ReglaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CalculatorParser.RULE_regla;
    }

	REGLA_KW() {
	    return this.getToken(CalculatorParser.REGLA_KW, 0);
	};

	COMILLA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(CalculatorParser.COMILLA);
	    } else {
	        return this.getToken(CalculatorParser.COMILLA, i);
	    }
	};


	IDENTIFICADOR() {
	    return this.getToken(CalculatorParser.IDENTIFICADOR, 0);
	};

	LLAVE_ABRE() {
	    return this.getToken(CalculatorParser.LLAVE_ABRE, 0);
	};

	CUANDO_KW() {
	    return this.getToken(CalculatorParser.CUANDO_KW, 0);
	};

	condicion() {
	    return this.getTypedRuleContext(CondicionContext,0);
	};

	ENTONCES_KW() {
	    return this.getToken(CalculatorParser.ENTONCES_KW, 0);
	};

	comando() {
	    return this.getTypedRuleContext(ComandoContext,0);
	};

	LLAVE_CIERRA() {
	    return this.getToken(CalculatorParser.LLAVE_CIERRA, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.enterRegla(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.exitRegla(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalculatorVisitor ) {
	        return visitor.visitRegla(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class AccionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CalculatorParser.RULE_accion;
    }

	ACCION_KW() {
	    return this.getToken(CalculatorParser.ACCION_KW, 0);
	};

	COMILLA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(CalculatorParser.COMILLA);
	    } else {
	        return this.getToken(CalculatorParser.COMILLA, i);
	    }
	};


	LLAVE_ABRE() {
	    return this.getToken(CalculatorParser.LLAVE_ABRE, 0);
	};

	LLAVE_CIERRA() {
	    return this.getToken(CalculatorParser.LLAVE_CIERRA, 0);
	};

	IDENTIFICADOR() {
	    return this.getToken(CalculatorParser.IDENTIFICADOR, 0);
	};

	AGREGAR_USUARIO() {
	    return this.getToken(CalculatorParser.AGREGAR_USUARIO, 0);
	};

	AGREGAR_IP() {
	    return this.getToken(CalculatorParser.AGREGAR_IP, 0);
	};

	ACTIVAR_MONITOREO() {
	    return this.getToken(CalculatorParser.ACTIVAR_MONITOREO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.enterAccion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.exitAccion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalculatorVisitor ) {
	        return visitor.visitAccion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CondicionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CalculatorParser.RULE_condicion;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class CondSospechosaContext extends CondicionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	ACCESO_SENSIBLES() {
	    return this.getToken(CalculatorParser.ACCESO_SENSIBLES, 0);
	};

	Y_KW() {
	    return this.getToken(CalculatorParser.Y_KW, 0);
	};

	NO_ADMIN() {
	    return this.getToken(CalculatorParser.NO_ADMIN, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.enterCondSospechosa(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.exitCondSospechosa(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalculatorVisitor ) {
	        return visitor.visitCondSospechosa(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CalculatorParser.CondSospechosaContext = CondSospechosaContext;

class CondIntentosContext extends CondicionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	INTENTOS_FALLIDOS() {
	    return this.getToken(CalculatorParser.INTENTOS_FALLIDOS, 0);
	};

	MAYOR_QUE() {
	    return this.getToken(CalculatorParser.MAYOR_QUE, 0);
	};

	DIGITO() {
	    return this.getToken(CalculatorParser.DIGITO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.enterCondIntentos(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.exitCondIntentos(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalculatorVisitor ) {
	        return visitor.visitCondIntentos(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CalculatorParser.CondIntentosContext = CondIntentosContext;

class CondAccesoContext extends CondicionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	ACCESO_NO_AUTORIZADO() {
	    return this.getToken(CalculatorParser.ACCESO_NO_AUTORIZADO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.enterCondAcceso(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.exitCondAcceso(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalculatorVisitor ) {
	        return visitor.visitCondAcceso(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CalculatorParser.CondAccesoContext = CondAccesoContext;

class ComandoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CalculatorParser.RULE_comando;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class CmdMonitoreoContext extends ComandoContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	ACTIVAR_MONITOREO() {
	    return this.getToken(CalculatorParser.ACTIVAR_MONITOREO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.enterCmdMonitoreo(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.exitCmdMonitoreo(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalculatorVisitor ) {
	        return visitor.visitCmdMonitoreo(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CalculatorParser.CmdMonitoreoContext = CmdMonitoreoContext;

class CmdIPContext extends ComandoContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	AGREGAR_IP() {
	    return this.getToken(CalculatorParser.AGREGAR_IP, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.enterCmdIP(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.exitCmdIP(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalculatorVisitor ) {
	        return visitor.visitCmdIP(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CalculatorParser.CmdIPContext = CmdIPContext;

class CmdUsuarioContext extends ComandoContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	AGREGAR_USUARIO() {
	    return this.getToken(CalculatorParser.AGREGAR_USUARIO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.enterCmdUsuario(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.exitCmdUsuario(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalculatorVisitor ) {
	        return visitor.visitCmdUsuario(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CalculatorParser.CmdUsuarioContext = CmdUsuarioContext;


CalculatorParser.DslContext = DslContext; 
CalculatorParser.ReglaContext = ReglaContext; 
CalculatorParser.AccionContext = AccionContext; 
CalculatorParser.CondicionContext = CondicionContext; 
CalculatorParser.ComandoContext = ComandoContext; 

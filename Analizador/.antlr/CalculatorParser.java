// Generated from /home/mapag8/Escritorio/53812/Analizador/Calculator.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REGLA_KW=1, ACCION_KW=2, CUANDO_KW=3, ENTONCES_KW=4, ACCESO_NO_AUTORIZADO=5, 
		INTENTOS_FALLIDOS=6, ACCESO_SENSIBLES=7, Y_KW=8, NO_ADMIN=9, AGREGAR_USUARIO=10, 
		AGREGAR_IP=11, ACTIVAR_MONITOREO=12, LLAVE_ABRE=13, LLAVE_CIERRA=14, COMILLA=15, 
		MAYOR_QUE=16, IDENTIFICADOR=17, DIGITO=18, ESPACIOS=19;
	public static final int
		RULE_dsl = 0, RULE_regla = 1, RULE_accion = 2, RULE_condicion = 3, RULE_comando = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"dsl", "regla", "accion", "condicion", "comando"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'regla'", "'accion'", "'cuando'", "'entonces'", "'intentoAccesoFueraHorario'", 
			"'intentosFallidos'", "'accesoARecursosSensibles'", "'y'", "'noEsAdministrador'", 
			"'agregarUsuarioAListaNegra'", "'agregarIPAListaNegra'", "'activarMonitoreoDetallado'", 
			"'{'", "'}'", "'''", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REGLA_KW", "ACCION_KW", "CUANDO_KW", "ENTONCES_KW", "ACCESO_NO_AUTORIZADO", 
			"INTENTOS_FALLIDOS", "ACCESO_SENSIBLES", "Y_KW", "NO_ADMIN", "AGREGAR_USUARIO", 
			"AGREGAR_IP", "ACTIVAR_MONITOREO", "LLAVE_ABRE", "LLAVE_CIERRA", "COMILLA", 
			"MAYOR_QUE", "IDENTIFICADOR", "DIGITO", "ESPACIOS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DslContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CalculatorParser.EOF, 0); }
		public List<ReglaContext> regla() {
			return getRuleContexts(ReglaContext.class);
		}
		public ReglaContext regla(int i) {
			return getRuleContext(ReglaContext.class,i);
		}
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public DslContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl; }
	}

	public final DslContext dsl() throws RecognitionException {
		DslContext _localctx = new DslContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dsl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				regla();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==REGLA_KW );
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				accion();
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ACCION_KW );
			setState(20);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReglaContext extends ParserRuleContext {
		public TerminalNode REGLA_KW() { return getToken(CalculatorParser.REGLA_KW, 0); }
		public List<TerminalNode> COMILLA() { return getTokens(CalculatorParser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(CalculatorParser.COMILLA, i);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(CalculatorParser.IDENTIFICADOR, 0); }
		public TerminalNode LLAVE_ABRE() { return getToken(CalculatorParser.LLAVE_ABRE, 0); }
		public TerminalNode CUANDO_KW() { return getToken(CalculatorParser.CUANDO_KW, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode ENTONCES_KW() { return getToken(CalculatorParser.ENTONCES_KW, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public TerminalNode LLAVE_CIERRA() { return getToken(CalculatorParser.LLAVE_CIERRA, 0); }
		public ReglaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regla; }
	}

	public final ReglaContext regla() throws RecognitionException {
		ReglaContext _localctx = new ReglaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_regla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(REGLA_KW);
			setState(23);
			match(COMILLA);
			setState(24);
			match(IDENTIFICADOR);
			setState(25);
			match(COMILLA);
			setState(26);
			match(LLAVE_ABRE);
			setState(27);
			match(CUANDO_KW);
			setState(28);
			condicion();
			setState(29);
			match(ENTONCES_KW);
			setState(30);
			comando();
			setState(31);
			match(LLAVE_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccionContext extends ParserRuleContext {
		public TerminalNode ACCION_KW() { return getToken(CalculatorParser.ACCION_KW, 0); }
		public List<TerminalNode> COMILLA() { return getTokens(CalculatorParser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(CalculatorParser.COMILLA, i);
		}
		public TerminalNode LLAVE_ABRE() { return getToken(CalculatorParser.LLAVE_ABRE, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(CalculatorParser.LLAVE_CIERRA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(CalculatorParser.IDENTIFICADOR, 0); }
		public TerminalNode AGREGAR_USUARIO() { return getToken(CalculatorParser.AGREGAR_USUARIO, 0); }
		public TerminalNode AGREGAR_IP() { return getToken(CalculatorParser.AGREGAR_IP, 0); }
		public TerminalNode ACTIVAR_MONITOREO() { return getToken(CalculatorParser.ACTIVAR_MONITOREO, 0); }
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_accion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(ACCION_KW);
			setState(34);
			match(COMILLA);
			setState(35);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AGREGAR_USUARIO) | (1L << AGREGAR_IP) | (1L << ACTIVAR_MONITOREO) | (1L << IDENTIFICADOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(36);
			match(COMILLA);
			setState(37);
			match(LLAVE_ABRE);
			setState(38);
			match(LLAVE_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionContext extends ParserRuleContext {
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	 
		public CondicionContext() { }
		public void copyFrom(CondicionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondSospechosaContext extends CondicionContext {
		public TerminalNode ACCESO_SENSIBLES() { return getToken(CalculatorParser.ACCESO_SENSIBLES, 0); }
		public TerminalNode Y_KW() { return getToken(CalculatorParser.Y_KW, 0); }
		public TerminalNode NO_ADMIN() { return getToken(CalculatorParser.NO_ADMIN, 0); }
		public CondSospechosaContext(CondicionContext ctx) { copyFrom(ctx); }
	}
	public static class CondIntentosContext extends CondicionContext {
		public TerminalNode INTENTOS_FALLIDOS() { return getToken(CalculatorParser.INTENTOS_FALLIDOS, 0); }
		public TerminalNode MAYOR_QUE() { return getToken(CalculatorParser.MAYOR_QUE, 0); }
		public TerminalNode DIGITO() { return getToken(CalculatorParser.DIGITO, 0); }
		public CondIntentosContext(CondicionContext ctx) { copyFrom(ctx); }
	}
	public static class CondAccesoContext extends CondicionContext {
		public TerminalNode ACCESO_NO_AUTORIZADO() { return getToken(CalculatorParser.ACCESO_NO_AUTORIZADO, 0); }
		public CondAccesoContext(CondicionContext ctx) { copyFrom(ctx); }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicion);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCESO_NO_AUTORIZADO:
				_localctx = new CondAccesoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(ACCESO_NO_AUTORIZADO);
				}
				break;
			case INTENTOS_FALLIDOS:
				_localctx = new CondIntentosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(INTENTOS_FALLIDOS);
				setState(42);
				match(MAYOR_QUE);
				setState(43);
				match(DIGITO);
				}
				break;
			case ACCESO_SENSIBLES:
				_localctx = new CondSospechosaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(ACCESO_SENSIBLES);
				setState(45);
				match(Y_KW);
				setState(46);
				match(NO_ADMIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CmdMonitoreoContext extends ComandoContext {
		public TerminalNode ACTIVAR_MONITOREO() { return getToken(CalculatorParser.ACTIVAR_MONITOREO, 0); }
		public CmdMonitoreoContext(ComandoContext ctx) { copyFrom(ctx); }
	}
	public static class CmdIPContext extends ComandoContext {
		public TerminalNode AGREGAR_IP() { return getToken(CalculatorParser.AGREGAR_IP, 0); }
		public CmdIPContext(ComandoContext ctx) { copyFrom(ctx); }
	}
	public static class CmdUsuarioContext extends ComandoContext {
		public TerminalNode AGREGAR_USUARIO() { return getToken(CalculatorParser.AGREGAR_USUARIO, 0); }
		public CmdUsuarioContext(ComandoContext ctx) { copyFrom(ctx); }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AGREGAR_USUARIO:
				_localctx = new CmdUsuarioContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(AGREGAR_USUARIO);
				}
				break;
			case AGREGAR_IP:
				_localctx = new CmdIPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(AGREGAR_IP);
				}
				break;
			case ACTIVAR_MONITOREO:
				_localctx = new CmdMonitoreoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				match(ACTIVAR_MONITOREO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\259\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\2\6\2\23\n\2\r"+
		"\2\16\2\24\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\62\n\5\3\6\3\6\3"+
		"\6\5\6\67\n\6\3\6\2\2\7\2\4\6\b\n\2\3\4\2\f\16\23\23\29\2\r\3\2\2\2\4"+
		"\30\3\2\2\2\6#\3\2\2\2\b\61\3\2\2\2\n\66\3\2\2\2\f\16\5\4\3\2\r\f\3\2"+
		"\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2\21\23\5\6"+
		"\4\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\26\3\2"+
		"\2\2\26\27\7\2\2\3\27\3\3\2\2\2\30\31\7\3\2\2\31\32\7\21\2\2\32\33\7\23"+
		"\2\2\33\34\7\21\2\2\34\35\7\17\2\2\35\36\7\5\2\2\36\37\5\b\5\2\37 \7\6"+
		"\2\2 !\5\n\6\2!\"\7\20\2\2\"\5\3\2\2\2#$\7\4\2\2$%\7\21\2\2%&\t\2\2\2"+
		"&\'\7\21\2\2\'(\7\17\2\2()\7\20\2\2)\7\3\2\2\2*\62\7\7\2\2+,\7\b\2\2,"+
		"-\7\22\2\2-\62\7\24\2\2./\7\t\2\2/\60\7\n\2\2\60\62\7\13\2\2\61*\3\2\2"+
		"\2\61+\3\2\2\2\61.\3\2\2\2\62\t\3\2\2\2\63\67\7\f\2\2\64\67\7\r\2\2\65"+
		"\67\7\16\2\2\66\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\13\3\2\2\2\6"+
		"\17\24\61\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
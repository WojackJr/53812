// Generated from /home/Brian/Escritorio/53812/Calculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REGLA_KW=1, ACCION_KW=2, CUANDO_KW=3, ENTONCES_KW=4, ACCESO_NO_AUTORIZADO=5, 
		INTENTOS_FALLIDOS=6, ACCESO_SENSIBLES=7, Y_KW=8, NO_ADMIN=9, AGREGAR_USUARIO=10, 
		AGREGAR_IP=11, ACTIVAR_MONITOREO=12, LBRACE=13, RBRACE=14, QUOTE=15, GT=16, 
		ID=17, DIGITO=18, WS=19;
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
			"AGREGAR_IP", "ACTIVAR_MONITOREO", "LBRACE", "RBRACE", "QUOTE", "GT", 
			"ID", "DIGITO", "WS"
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterDsl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitDsl(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReglaContext extends ParserRuleContext {
		public TerminalNode REGLA_KW() { return getToken(CalculatorParser.REGLA_KW, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(CalculatorParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(CalculatorParser.QUOTE, i);
		}
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(CalculatorParser.LBRACE, 0); }
		public TerminalNode CUANDO_KW() { return getToken(CalculatorParser.CUANDO_KW, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode ENTONCES_KW() { return getToken(CalculatorParser.ENTONCES_KW, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CalculatorParser.RBRACE, 0); }
		public ReglaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterRegla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitRegla(this);
		}
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
			match(QUOTE);
			setState(24);
			match(ID);
			setState(25);
			match(QUOTE);
			setState(26);
			match(LBRACE);
			setState(27);
			match(CUANDO_KW);
			setState(28);
			condicion();
			setState(29);
			match(ENTONCES_KW);
			setState(30);
			comando();
			setState(31);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccionContext extends ParserRuleContext {
		public TerminalNode ACCION_KW() { return getToken(CalculatorParser.ACCION_KW, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(CalculatorParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(CalculatorParser.QUOTE, i);
		}
		public TerminalNode LBRACE() { return getToken(CalculatorParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CalculatorParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode AGREGAR_USUARIO() { return getToken(CalculatorParser.AGREGAR_USUARIO, 0); }
		public TerminalNode AGREGAR_IP() { return getToken(CalculatorParser.AGREGAR_IP, 0); }
		public TerminalNode ACTIVAR_MONITOREO() { return getToken(CalculatorParser.ACTIVAR_MONITOREO, 0); }
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterAccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitAccion(this);
		}
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
			match(QUOTE);
			setState(35);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 138240L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(36);
			match(QUOTE);
			setState(37);
			match(LBRACE);
			setState(38);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class CondSospechosaContext extends CondicionContext {
		public TerminalNode ACCESO_SENSIBLES() { return getToken(CalculatorParser.ACCESO_SENSIBLES, 0); }
		public TerminalNode Y_KW() { return getToken(CalculatorParser.Y_KW, 0); }
		public TerminalNode NO_ADMIN() { return getToken(CalculatorParser.NO_ADMIN, 0); }
		public CondSospechosaContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterCondSospechosa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitCondSospechosa(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondIntentosContext extends CondicionContext {
		public TerminalNode INTENTOS_FALLIDOS() { return getToken(CalculatorParser.INTENTOS_FALLIDOS, 0); }
		public TerminalNode GT() { return getToken(CalculatorParser.GT, 0); }
		public TerminalNode DIGITO() { return getToken(CalculatorParser.DIGITO, 0); }
		public CondIntentosContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterCondIntentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitCondIntentos(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondAccesoContext extends CondicionContext {
		public TerminalNode ACCESO_NO_AUTORIZADO() { return getToken(CalculatorParser.ACCESO_NO_AUTORIZADO, 0); }
		public CondAccesoContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterCondAcceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitCondAcceso(this);
		}
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
				match(GT);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class CmdMonitoreoContext extends ComandoContext {
		public TerminalNode ACTIVAR_MONITOREO() { return getToken(CalculatorParser.ACTIVAR_MONITOREO, 0); }
		public CmdMonitoreoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterCmdMonitoreo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitCmdMonitoreo(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CmdIPContext extends ComandoContext {
		public TerminalNode AGREGAR_IP() { return getToken(CalculatorParser.AGREGAR_IP, 0); }
		public CmdIPContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterCmdIP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitCmdIP(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CmdUsuarioContext extends ComandoContext {
		public TerminalNode AGREGAR_USUARIO() { return getToken(CalculatorParser.AGREGAR_USUARIO, 0); }
		public CmdUsuarioContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterCmdUsuario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitCmdUsuario(this);
		}
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
		"\u0004\u0001\u00137\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0004\u0000"+
		"\u0011\b\u0000\u000b\u0000\f\u0000\u0012\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u00030\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u00045\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006"+
		"\b\u0000\u0001\u0002\u0000\n\f\u0011\u00117\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000\u0000"+
		"\u0006/\u0001\u0000\u0000\u0000\b4\u0001\u0000\u0000\u0000\n\f\u0003\u0002"+
		"\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000"+
		"\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e"+
		"\u0010\u0001\u0000\u0000\u0000\u000f\u0011\u0003\u0004\u0002\u0000\u0010"+
		"\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012"+
		"\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013"+
		"\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0000\u0000\u0001\u0015"+
		"\u0001\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017"+
		"\u0018\u0005\u000f\u0000\u0000\u0018\u0019\u0005\u0011\u0000\u0000\u0019"+
		"\u001a\u0005\u000f\u0000\u0000\u001a\u001b\u0005\r\u0000\u0000\u001b\u001c"+
		"\u0005\u0003\u0000\u0000\u001c\u001d\u0003\u0006\u0003\u0000\u001d\u001e"+
		"\u0005\u0004\u0000\u0000\u001e\u001f\u0003\b\u0004\u0000\u001f \u0005"+
		"\u000e\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!\"\u0005\u0002\u0000"+
		"\u0000\"#\u0005\u000f\u0000\u0000#$\u0007\u0000\u0000\u0000$%\u0005\u000f"+
		"\u0000\u0000%&\u0005\r\u0000\u0000&\'\u0005\u000e\u0000\u0000\'\u0005"+
		"\u0001\u0000\u0000\u0000(0\u0005\u0005\u0000\u0000)*\u0005\u0006\u0000"+
		"\u0000*+\u0005\u0010\u0000\u0000+0\u0005\u0012\u0000\u0000,-\u0005\u0007"+
		"\u0000\u0000-.\u0005\b\u0000\u0000.0\u0005\t\u0000\u0000/(\u0001\u0000"+
		"\u0000\u0000/)\u0001\u0000\u0000\u0000/,\u0001\u0000\u0000\u00000\u0007"+
		"\u0001\u0000\u0000\u000015\u0005\n\u0000\u000025\u0005\u000b\u0000\u0000"+
		"35\u0005\f\u0000\u000041\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000"+
		"43\u0001\u0000\u0000\u00005\t\u0001\u0000\u0000\u0000\u0004\r\u0012/4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
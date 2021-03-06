package desi;

// Generated from ./src/desi/grammar/DesiGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DesiGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, DIGITS=14, BOOLEAN=15, ADD=16, 
		SUB=17, MUL=18, DIV=19, AND=20, OR=21, LESSER=22, GREATER=23, LESS_or_EQU=24, 
		MORE_or_EQU=25, NotEquals=26, ISEquals=27, IDENTIFIER=28, EQUALSto=29, 
		WS=30, Comment=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "DIGITS", "BOOLEAN", "ADD", "SUB", 
		"MUL", "DIV", "AND", "OR", "LESSER", "GREATER", "LESS_or_EQU", "MORE_or_EQU", 
		"NotEquals", "ISEquals", "IDENTIFIER", "EQUALSto", "WS", "Comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'shuru'", "'khatam'", "'int'", "'boolean'", "'('", "')'", "'agar'", 
		"'bas'", "'magar'", "'nahitoh'", "'jabtak'", "'tabtak'", "'dikhao'", null, 
		null, "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'<'", "'>'", "'<='", 
		"'>='", "'!='", "'=='", null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "DIGITS", "BOOLEAN", "ADD", "SUB", "MUL", "DIV", "AND", "OR", 
		"LESSER", "GREATER", "LESS_or_EQU", "MORE_or_EQU", "NotEquals", "ISEquals", 
		"IDENTIFIER", "EQUALSto", "WS", "Comment"
	};
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


	public DesiGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DesiGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00e5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17\u008d\n\17\f\17\16\17\u0090\13"+
		"\17\3\17\5\17\u0093\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u009e\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\7\35\u00c0\n\35\f\35\16\35\u00c3\13"+
		"\35\3\36\3\36\3\37\6\37\u00c8\n\37\r\37\16\37\u00c9\3\37\3\37\3 \3 \3"+
		" \3 \7 \u00d2\n \f \16 \u00d5\13 \3 \3 \3 \3 \7 \u00db\n \f \16 \u00de"+
		"\13 \3 \3 \5 \u00e2\n \3 \3 \3\u00dc\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\b\3\2\63;\3\2\62;\5\2"+
		"C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00ec\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5G\3\2\2\2\7N\3\2\2\2\tR\3\2\2\2\13"+
		"Z\3\2\2\2\r\\\3\2\2\2\17^\3\2\2\2\21c\3\2\2\2\23g\3\2\2\2\25m\3\2\2\2"+
		"\27u\3\2\2\2\31|\3\2\2\2\33\u0083\3\2\2\2\35\u0092\3\2\2\2\37\u009d\3"+
		"\2\2\2!\u009f\3\2\2\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'\u00a5\3\2\2\2)\u00a7"+
		"\3\2\2\2+\u00aa\3\2\2\2-\u00ad\3\2\2\2/\u00af\3\2\2\2\61\u00b1\3\2\2\2"+
		"\63\u00b4\3\2\2\2\65\u00b7\3\2\2\2\67\u00ba\3\2\2\29\u00bd\3\2\2\2;\u00c4"+
		"\3\2\2\2=\u00c7\3\2\2\2?\u00e1\3\2\2\2AB\7u\2\2BC\7j\2\2CD\7w\2\2DE\7"+
		"t\2\2EF\7w\2\2F\4\3\2\2\2GH\7m\2\2HI\7j\2\2IJ\7c\2\2JK\7v\2\2KL\7c\2\2"+
		"LM\7o\2\2M\6\3\2\2\2NO\7k\2\2OP\7p\2\2PQ\7v\2\2Q\b\3\2\2\2RS\7d\2\2ST"+
		"\7q\2\2TU\7q\2\2UV\7n\2\2VW\7g\2\2WX\7c\2\2XY\7p\2\2Y\n\3\2\2\2Z[\7*\2"+
		"\2[\f\3\2\2\2\\]\7+\2\2]\16\3\2\2\2^_\7c\2\2_`\7i\2\2`a\7c\2\2ab\7t\2"+
		"\2b\20\3\2\2\2cd\7d\2\2de\7c\2\2ef\7u\2\2f\22\3\2\2\2gh\7o\2\2hi\7c\2"+
		"\2ij\7i\2\2jk\7c\2\2kl\7t\2\2l\24\3\2\2\2mn\7p\2\2no\7c\2\2op\7j\2\2p"+
		"q\7k\2\2qr\7v\2\2rs\7q\2\2st\7j\2\2t\26\3\2\2\2uv\7l\2\2vw\7c\2\2wx\7"+
		"d\2\2xy\7v\2\2yz\7c\2\2z{\7m\2\2{\30\3\2\2\2|}\7v\2\2}~\7c\2\2~\177\7"+
		"d\2\2\177\u0080\7v\2\2\u0080\u0081\7c\2\2\u0081\u0082\7m\2\2\u0082\32"+
		"\3\2\2\2\u0083\u0084\7f\2\2\u0084\u0085\7k\2\2\u0085\u0086\7m\2\2\u0086"+
		"\u0087\7j\2\2\u0087\u0088\7c\2\2\u0088\u0089\7q\2\2\u0089\34\3\2\2\2\u008a"+
		"\u008e\t\2\2\2\u008b\u008d\t\3\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0093\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0093\7\62\2\2\u0092\u008a\3\2\2\2\u0092\u0091\3"+
		"\2\2\2\u0093\36\3\2\2\2\u0094\u0095\7V\2\2\u0095\u0096\7t\2\2\u0096\u0097"+
		"\7w\2\2\u0097\u009e\7g\2\2\u0098\u0099\7H\2\2\u0099\u009a\7c\2\2\u009a"+
		"\u009b\7n\2\2\u009b\u009c\7u\2\2\u009c\u009e\7g\2\2\u009d\u0094\3\2\2"+
		"\2\u009d\u0098\3\2\2\2\u009e \3\2\2\2\u009f\u00a0\7-\2\2\u00a0\"\3\2\2"+
		"\2\u00a1\u00a2\7/\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7,\2\2\u00a4&\3\2\2\2"+
		"\u00a5\u00a6\7\61\2\2\u00a6(\3\2\2\2\u00a7\u00a8\7(\2\2\u00a8\u00a9\7"+
		"(\2\2\u00a9*\3\2\2\2\u00aa\u00ab\7~\2\2\u00ab\u00ac\7~\2\2\u00ac,\3\2"+
		"\2\2\u00ad\u00ae\7>\2\2\u00ae.\3\2\2\2\u00af\u00b0\7@\2\2\u00b0\60\3\2"+
		"\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b3\7?\2\2\u00b3\62\3\2\2\2\u00b4\u00b5"+
		"\7@\2\2\u00b5\u00b6\7?\2\2\u00b6\64\3\2\2\2\u00b7\u00b8\7#\2\2\u00b8\u00b9"+
		"\7?\2\2\u00b9\66\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb\u00bc\7?\2\2\u00bc8"+
		"\3\2\2\2\u00bd\u00c1\t\4\2\2\u00be\u00c0\t\5\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2:\3\2\2\2"+
		"\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7?\2\2\u00c5<\3\2\2\2\u00c6\u00c8\t\6"+
		"\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b\37\2\2\u00cc>\3\2\2\2"+
		"\u00cd\u00ce\7\61\2\2\u00ce\u00cf\7\61\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00d2"+
		"\n\7\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00e2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7\61"+
		"\2\2\u00d7\u00d8\7,\2\2\u00d8\u00dc\3\2\2\2\u00d9\u00db\13\2\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7,\2\2\u00e0"+
		"\u00e2\7\61\2\2\u00e1\u00cd\3\2\2\2\u00e1\u00d6\3\2\2\2\u00e2\u00e3\3"+
		"\2\2\2\u00e3\u00e4\b \2\2\u00e4@\3\2\2\2\13\2\u008e\u0092\u009d\u00c1"+
		"\u00c9\u00d3\u00dc\u00e1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
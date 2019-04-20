package desi;
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
		T__0=1, T__1=2, DATATYPE=3, DIGIT=4, IDENTIFIER=5, SHURU=6, KHATAM=7, 
		ADD=8, SUB=9, MUL=10, DIV=11, ASSIGNMENT=12, EQUALS=13, GREATERTHAN=14, 
		LESSTHAN=15, NOTEQUALTO=16, KHATAMOFSTATEMENT=17, WHILE=18, KHATAMWHILE=19, 
		IF=20, ELSE=21, KHATAMIF=22, OPENPARA=23, CLOSEPARA=24, WS=25, Comment=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "DATATYPE", "DIGIT", "IDENTIFIER", "SHURU", "KHATAM", 
		"ADD", "SUB", "MUL", "DIV", "ASSIGNMENT", "EQUALS", "GREATERTHAN", "LESSTHAN", 
		"NOTEQUALTO", "KHATAMOFSTATEMENT", "WHILE", "KHATAMWHILE", "IF", "ELSE", 
		"KHATAMIF", "OPENPARA", "CLOSEPARA", "WS", "Comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'TRUE'", "'FALSE'", null, null, null, "'shuru'", "'khatam'", "'+'", 
		"'-'", "'*'", "'/'", "'='", "'=='", "'>'", "'<'", "'!'", "';'", "'jabtak'", 
		"'tabtak'", "'agar'", "'nahitoh'", "'bas'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "DATATYPE", "DIGIT", "IDENTIFIER", "SHURU", "KHATAM", 
		"ADD", "SUB", "MUL", "DIV", "ASSIGNMENT", "EQUALS", "GREATERTHAN", "LESSTHAN", 
		"NOTEQUALTO", "KHATAMOFSTATEMENT", "WHILE", "KHATAMWHILE", "IF", "ELSE", 
		"KHATAMIF", "OPENPARA", "CLOSEPARA", "WS", "Comment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00c0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5"+
		"\3\5\5\5T\n\5\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\6\32\u00a3\n\32\r\32\16\32\u00a4\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\7\33\u00ad\n\33\f\33\16\33\u00b0\13\33\3\33\3\33\3"+
		"\33\3\33\7\33\u00b6\n\33\f\33\16\33\u00b9\13\33\3\33\3\33\5\33\u00bd\n"+
		"\33\3\33\3\33\3\u00b7\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\3\2\b\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f"+
		"\17\17\"\"\4\2\f\f\17\17\2\u00c7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\3\67\3\2\2\2\5<\3\2\2\2\7I\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\r\\\3\2\2"+
		"\2\17b\3\2\2\2\21i\3\2\2\2\23k\3\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31q\3\2"+
		"\2\2\33s\3\2\2\2\35v\3\2\2\2\37x\3\2\2\2!z\3\2\2\2#|\3\2\2\2%~\3\2\2\2"+
		"\'\u0085\3\2\2\2)\u008c\3\2\2\2+\u0091\3\2\2\2-\u0099\3\2\2\2/\u009d\3"+
		"\2\2\2\61\u009f\3\2\2\2\63\u00a2\3\2\2\2\65\u00bc\3\2\2\2\678\7V\2\28"+
		"9\7T\2\29:\7W\2\2:;\7G\2\2;\4\3\2\2\2<=\7H\2\2=>\7C\2\2>?\7N\2\2?@\7U"+
		"\2\2@A\7G\2\2A\6\3\2\2\2BC\7k\2\2CD\7p\2\2DJ\7v\2\2EF\7d\2\2FG\7q\2\2"+
		"GH\7q\2\2HJ\7n\2\2IB\3\2\2\2IE\3\2\2\2J\b\3\2\2\2KO\t\2\2\2LN\t\3\2\2"+
		"ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PT\3\2\2\2QO\3\2\2\2RT\7\62\2"+
		"\2SK\3\2\2\2SR\3\2\2\2T\n\3\2\2\2UY\t\4\2\2VX\t\5\2\2WV\3\2\2\2X[\3\2"+
		"\2\2YW\3\2\2\2YZ\3\2\2\2Z\f\3\2\2\2[Y\3\2\2\2\\]\7u\2\2]^\7j\2\2^_\7w"+
		"\2\2_`\7t\2\2`a\7w\2\2a\16\3\2\2\2bc\7m\2\2cd\7j\2\2de\7c\2\2ef\7v\2\2"+
		"fg\7c\2\2gh\7o\2\2h\20\3\2\2\2ij\7-\2\2j\22\3\2\2\2kl\7/\2\2l\24\3\2\2"+
		"\2mn\7,\2\2n\26\3\2\2\2op\7\61\2\2p\30\3\2\2\2qr\7?\2\2r\32\3\2\2\2st"+
		"\7?\2\2tu\7?\2\2u\34\3\2\2\2vw\7@\2\2w\36\3\2\2\2xy\7>\2\2y \3\2\2\2z"+
		"{\7#\2\2{\"\3\2\2\2|}\7=\2\2}$\3\2\2\2~\177\7l\2\2\177\u0080\7c\2\2\u0080"+
		"\u0081\7d\2\2\u0081\u0082\7v\2\2\u0082\u0083\7c\2\2\u0083\u0084\7m\2\2"+
		"\u0084&\3\2\2\2\u0085\u0086\7v\2\2\u0086\u0087\7c\2\2\u0087\u0088\7d\2"+
		"\2\u0088\u0089\7v\2\2\u0089\u008a\7c\2\2\u008a\u008b\7m\2\2\u008b(\3\2"+
		"\2\2\u008c\u008d\7c\2\2\u008d\u008e\7i\2\2\u008e\u008f\7c\2\2\u008f\u0090"+
		"\7t\2\2\u0090*\3\2\2\2\u0091\u0092\7p\2\2\u0092\u0093\7c\2\2\u0093\u0094"+
		"\7j\2\2\u0094\u0095\7k\2\2\u0095\u0096\7v\2\2\u0096\u0097\7q\2\2\u0097"+
		"\u0098\7j\2\2\u0098,\3\2\2\2\u0099\u009a\7d\2\2\u009a\u009b\7c\2\2\u009b"+
		"\u009c\7u\2\2\u009c.\3\2\2\2\u009d\u009e\7*\2\2\u009e\60\3\2\2\2\u009f"+
		"\u00a0\7+\2\2\u00a0\62\3\2\2\2\u00a1\u00a3\t\6\2\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a7\b\32\2\2\u00a7\64\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9"+
		"\u00aa\7\61\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ad\n\7\2\2\u00ac\u00ab\3"+
		"\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00bd\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\61\2\2\u00b2\u00b3\7"+
		",\2\2\u00b3\u00b7\3\2\2\2\u00b4\u00b6\13\2\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7,\2\2\u00bb\u00bd\7\61\2\2\u00bc"+
		"\u00a8\3\2\2\2\u00bc\u00b1\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\33"+
		"\2\2\u00bf\66\3\2\2\2\13\2IOSY\u00a4\u00ae\u00b7\u00bc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
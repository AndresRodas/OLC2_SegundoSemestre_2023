// Generated from c:\Users\darkm\OneDrive\Documentos\Proyectos\OLC2_SegundoSemestre_2023\Proyecto1\server1\Swift_L.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Swift_L extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BOOL=3, PRINT=4, LET=5, IF=6, WHILE=7, NUMBER=8, STRING=9, 
		ID=10, PUNTO=11, PYC=12, DIF=13, IG_IG=14, NOT=15, OR=16, AND=17, IG=18, 
		MAY_IG=19, MEN_IG=20, MAY=21, MEN=22, MUL=23, DIV=24, ADD=25, SUB=26, 
		PARIZQ=27, PARDER=28, LLAVEIZQ=29, LLAVEDER=30, CORIZQ=31, CORDER=32, 
		WHITESPACE=33, COMMENT=34, LINE_COMMENT=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "BOOL", "PRINT", "LET", "IF", "WHILE", "NUMBER", "STRING", 
			"ID", "PUNTO", "PYC", "DIF", "IG_IG", "NOT", "OR", "AND", "IG", "MAY_IG", 
			"MEN_IG", "MAY", "MEN", "MUL", "DIV", "ADD", "SUB", "PARIZQ", "PARDER", 
			"LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "WHITESPACE", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'bool'", "'print'", "'let'", "'if'", "'while'", 
			null, null, null, "'.'", "';'", "'!='", "'=='", "'!'", "'||'", "'&&'", 
			"'='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOL", "PRINT", "LET", "IF", "WHILE", "NUMBER", 
			"STRING", "ID", "PUNTO", "PYC", "DIF", "IG_IG", "NOT", "OR", "AND", "IG", 
			"MAY_IG", "MEN_IG", "MAY", "MEN", "MUL", "DIV", "ADD", "SUB", "PARIZQ", 
			"PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "WHITESPACE", "COMMENT", 
			"LINE_COMMENT"
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


	public Swift_L(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Swift_L.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00da\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\6\tm\n\t\r\t\16\tn\3\t\3\t\6\ts\n\t\r\t\16\t"+
		"t\5\tw\n\t\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\n\3\n\3\13\3\13\7\13\u0084"+
		"\n\13\f\13\16\13\u0087\13\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\6\"\u00bc"+
		"\n\"\r\"\16\"\u00bd\3\"\3\"\3#\3#\3#\3#\7#\u00c6\n#\f#\16#\u00c9\13#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\7$\u00d4\n$\f$\16$\u00d7\13$\3$\3$\3\u00c7\2"+
		"%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%\3\2\b\3\2\62;\3\2$$\4\2C\\c|\6\2\62;C\\aac|\6\2\13\f\17"+
		"\17\"\"^^\4\2\f\f\17\17\2\u00e1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5M\3\2\2\2\7S\3\2\2\2\tX"+
		"\3\2\2\2\13^\3\2\2\2\rb\3\2\2\2\17e\3\2\2\2\21l\3\2\2\2\23x\3\2\2\2\25"+
		"\u0081\3\2\2\2\27\u0088\3\2\2\2\31\u008a\3\2\2\2\33\u008c\3\2\2\2\35\u008f"+
		"\3\2\2\2\37\u0092\3\2\2\2!\u0094\3\2\2\2#\u0097\3\2\2\2%\u009a\3\2\2\2"+
		"\'\u009c\3\2\2\2)\u009f\3\2\2\2+\u00a2\3\2\2\2-\u00a4\3\2\2\2/\u00a6\3"+
		"\2\2\2\61\u00a8\3\2\2\2\63\u00aa\3\2\2\2\65\u00ac\3\2\2\2\67\u00ae\3\2"+
		"\2\29\u00b0\3\2\2\2;\u00b2\3\2\2\2=\u00b4\3\2\2\2?\u00b6\3\2\2\2A\u00b8"+
		"\3\2\2\2C\u00bb\3\2\2\2E\u00c1\3\2\2\2G\u00cf\3\2\2\2IJ\7k\2\2JK\7p\2"+
		"\2KL\7v\2\2L\4\3\2\2\2MN\7h\2\2NO\7n\2\2OP\7q\2\2PQ\7c\2\2QR\7v\2\2R\6"+
		"\3\2\2\2ST\7d\2\2TU\7q\2\2UV\7q\2\2VW\7n\2\2W\b\3\2\2\2XY\7r\2\2YZ\7t"+
		"\2\2Z[\7k\2\2[\\\7p\2\2\\]\7v\2\2]\n\3\2\2\2^_\7n\2\2_`\7g\2\2`a\7v\2"+
		"\2a\f\3\2\2\2bc\7k\2\2cd\7h\2\2d\16\3\2\2\2ef\7y\2\2fg\7j\2\2gh\7k\2\2"+
		"hi\7n\2\2ij\7g\2\2j\20\3\2\2\2km\t\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2ov\3\2\2\2pr\7\60\2\2qs\t\2\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2"+
		"\2tu\3\2\2\2uw\3\2\2\2vp\3\2\2\2vw\3\2\2\2w\22\3\2\2\2x|\7$\2\2y{\n\3"+
		"\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177"+
		"\u0080\7$\2\2\u0080\24\3\2\2\2\u0081\u0085\t\4\2\2\u0082\u0084\t\5\2\2"+
		"\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\26\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\60\2\2\u0089"+
		"\30\3\2\2\2\u008a\u008b\7=\2\2\u008b\32\3\2\2\2\u008c\u008d\7#\2\2\u008d"+
		"\u008e\7?\2\2\u008e\34\3\2\2\2\u008f\u0090\7?\2\2\u0090\u0091\7?\2\2\u0091"+
		"\36\3\2\2\2\u0092\u0093\7#\2\2\u0093 \3\2\2\2\u0094\u0095\7~\2\2\u0095"+
		"\u0096\7~\2\2\u0096\"\3\2\2\2\u0097\u0098\7(\2\2\u0098\u0099\7(\2\2\u0099"+
		"$\3\2\2\2\u009a\u009b\7?\2\2\u009b&\3\2\2\2\u009c\u009d\7@\2\2\u009d\u009e"+
		"\7?\2\2\u009e(\3\2\2\2\u009f\u00a0\7>\2\2\u00a0\u00a1\7?\2\2\u00a1*\3"+
		"\2\2\2\u00a2\u00a3\7@\2\2\u00a3,\3\2\2\2\u00a4\u00a5\7>\2\2\u00a5.\3\2"+
		"\2\2\u00a6\u00a7\7,\2\2\u00a7\60\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9\62"+
		"\3\2\2\2\u00aa\u00ab\7-\2\2\u00ab\64\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad"+
		"\66\3\2\2\2\u00ae\u00af\7*\2\2\u00af8\3\2\2\2\u00b0\u00b1\7+\2\2\u00b1"+
		":\3\2\2\2\u00b2\u00b3\7}\2\2\u00b3<\3\2\2\2\u00b4\u00b5\7\177\2\2\u00b5"+
		">\3\2\2\2\u00b6\u00b7\7]\2\2\u00b7@\3\2\2\2\u00b8\u00b9\7_\2\2\u00b9B"+
		"\3\2\2\2\u00ba\u00bc\t\6\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\""+
		"\2\2\u00c0D\3\2\2\2\u00c1\u00c2\7\61\2\2\u00c2\u00c3\7,\2\2\u00c3\u00c7"+
		"\3\2\2\2\u00c4\u00c6\13\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2"+
		"\u00c7\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\u00cb\7,\2\2\u00cb\u00cc\7\61\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\b#\2\2\u00ceF\3\2\2\2\u00cf\u00d0\7\61\2\2\u00d0\u00d1\7\61\2\2"+
		"\u00d1\u00d5\3\2\2\2\u00d2\u00d4\n\7\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\b$\2\2\u00d9H\3\2\2\2\13\2ntv|\u0085\u00bd"+
		"\u00c7\u00d5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
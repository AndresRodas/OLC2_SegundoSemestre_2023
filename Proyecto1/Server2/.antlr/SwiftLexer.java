// Generated from c:\Users\darkm\OneDrive\Documentos\Proyectos\OLC2_SegundoSemestre_2023\Proyecto1\Server2\SwiftLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BOOL=3, STR=4, TRU=5, FAL=6, PRINT=7, IF=8, ELSE=9, WHILE=10, 
		VAR=11, NUMBER=12, STRING=13, ID=14, DIF=15, IG_IG=16, NOT=17, OR=18, 
		AND=19, IG=20, MAY_IG=21, MEN_IG=22, MAYOR=23, MENOR=24, MUL=25, DIV=26, 
		ADD=27, SUB=28, PARIZQ=29, PARDER=30, LLAVEIZQ=31, LLAVEDER=32, D_PTS=33, 
		CORIZQ=34, CORDER=35, COMA=36, WHITESPACE=37, COMMENT=38, LINE_COMMENT=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "BOOL", "STR", "TRU", "FAL", "PRINT", "IF", "ELSE", "WHILE", 
			"VAR", "NUMBER", "STRING", "ID", "DIF", "IG_IG", "NOT", "OR", "AND", 
			"IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", 
			"PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "D_PTS", "CORIZQ", "CORDER", 
			"COMA", "WHITESPACE", "COMMENT", "LINE_COMMENT", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Int'", "'Float'", "'Bool'", "'String'", "'true'", "'false'", 
			"'print'", "'if'", "'else'", "'while'", "'var'", null, null, null, "'!='", 
			"'=='", "'!'", "'||'", "'&&'", "'='", "'>='", "'<='", "'>'", "'<'", "'*'", 
			"'/'", "'+'", "'-'", "'('", "')'", "'{'", "'}'", "':'", "'['", "']'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOL", "STR", "TRU", "FAL", "PRINT", "IF", "ELSE", 
			"WHILE", "VAR", "NUMBER", "STRING", "ID", "DIF", "IG_IG", "NOT", "OR", 
			"AND", "IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MUL", "DIV", "ADD", 
			"SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "D_PTS", "CORIZQ", 
			"CORDER", "COMA", "WHITESPACE", "COMMENT", "LINE_COMMENT"
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


	public SwiftLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SwiftLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u00fe\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\6\r\u008e\n\r\r\r\16\r\u008f\3\r\3\r\6\r\u0094\n\r\r\r"+
		"\16\r\u0095\5\r\u0098\n\r\3\16\3\16\7\16\u009c\n\16\f\16\16\16\u009f\13"+
		"\16\3\16\3\16\3\17\3\17\7\17\u00a5\n\17\f\17\16\17\u00a8\13\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\6&\u00dd\n&\r&\16&\u00de\3&\3&\3\'\3\'\3\'\3\'\7\'\u00e7"+
		"\n\'\f\'\16\'\u00ea\13\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\7(\u00f5\n(\f"+
		"(\16(\u00f8\13(\3(\3(\3)\3)\3)\3\u00e8\2*\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q\2\3"+
		"\2\t\3\2\62;\3\2$$\4\2C\\c|\6\2\62;C\\aac|\6\2\13\f\17\17\"\"^^\4\2\f"+
		"\f\17\17\t\2\"#%%--/\60<<BB]_\2\u0104\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\3S\3\2\2\2\5W\3\2\2\2\7]\3\2\2\2\tb\3\2\2\2\13i\3\2\2\2"+
		"\rn\3\2\2\2\17t\3\2\2\2\21z\3\2\2\2\23}\3\2\2\2\25\u0082\3\2\2\2\27\u0088"+
		"\3\2\2\2\31\u008d\3\2\2\2\33\u0099\3\2\2\2\35\u00a2\3\2\2\2\37\u00a9\3"+
		"\2\2\2!\u00ac\3\2\2\2#\u00af\3\2\2\2%\u00b1\3\2\2\2\'\u00b4\3\2\2\2)\u00b7"+
		"\3\2\2\2+\u00b9\3\2\2\2-\u00bc\3\2\2\2/\u00bf\3\2\2\2\61\u00c1\3\2\2\2"+
		"\63\u00c3\3\2\2\2\65\u00c5\3\2\2\2\67\u00c7\3\2\2\29\u00c9\3\2\2\2;\u00cb"+
		"\3\2\2\2=\u00cd\3\2\2\2?\u00cf\3\2\2\2A\u00d1\3\2\2\2C\u00d3\3\2\2\2E"+
		"\u00d5\3\2\2\2G\u00d7\3\2\2\2I\u00d9\3\2\2\2K\u00dc\3\2\2\2M\u00e2\3\2"+
		"\2\2O\u00f0\3\2\2\2Q\u00fb\3\2\2\2ST\7K\2\2TU\7p\2\2UV\7v\2\2V\4\3\2\2"+
		"\2WX\7H\2\2XY\7n\2\2YZ\7q\2\2Z[\7c\2\2[\\\7v\2\2\\\6\3\2\2\2]^\7D\2\2"+
		"^_\7q\2\2_`\7q\2\2`a\7n\2\2a\b\3\2\2\2bc\7U\2\2cd\7v\2\2de\7t\2\2ef\7"+
		"k\2\2fg\7p\2\2gh\7i\2\2h\n\3\2\2\2ij\7v\2\2jk\7t\2\2kl\7w\2\2lm\7g\2\2"+
		"m\f\3\2\2\2no\7h\2\2op\7c\2\2pq\7n\2\2qr\7u\2\2rs\7g\2\2s\16\3\2\2\2t"+
		"u\7r\2\2uv\7t\2\2vw\7k\2\2wx\7p\2\2xy\7v\2\2y\20\3\2\2\2z{\7k\2\2{|\7"+
		"h\2\2|\22\3\2\2\2}~\7g\2\2~\177\7n\2\2\177\u0080\7u\2\2\u0080\u0081\7"+
		"g\2\2\u0081\24\3\2\2\2\u0082\u0083\7y\2\2\u0083\u0084\7j\2\2\u0084\u0085"+
		"\7k\2\2\u0085\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087\26\3\2\2\2\u0088\u0089"+
		"\7x\2\2\u0089\u008a\7c\2\2\u008a\u008b\7t\2\2\u008b\30\3\2\2\2\u008c\u008e"+
		"\t\2\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0097\3\2\2\2\u0091\u0093\7\60\2\2\u0092\u0094\t"+
		"\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\32\3\2\2\2\u0099\u009d\7$\2\2\u009a\u009c\n\3\2\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7$\2\2\u00a1\34\3\2\2\2"+
		"\u00a2\u00a6\t\4\2\2\u00a3\u00a5\t\5\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\36\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00aa\7#\2\2\u00aa\u00ab\7?\2\2\u00ab \3\2\2\2\u00ac"+
		"\u00ad\7?\2\2\u00ad\u00ae\7?\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7#\2\2\u00b0"+
		"$\3\2\2\2\u00b1\u00b2\7~\2\2\u00b2\u00b3\7~\2\2\u00b3&\3\2\2\2\u00b4\u00b5"+
		"\7(\2\2\u00b5\u00b6\7(\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8*\3"+
		"\2\2\2\u00b9\u00ba\7@\2\2\u00ba\u00bb\7?\2\2\u00bb,\3\2\2\2\u00bc\u00bd"+
		"\7>\2\2\u00bd\u00be\7?\2\2\u00be.\3\2\2\2\u00bf\u00c0\7@\2\2\u00c0\60"+
		"\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4"+
		"\64\3\2\2\2\u00c5\u00c6\7\61\2\2\u00c6\66\3\2\2\2\u00c7\u00c8\7-\2\2\u00c8"+
		"8\3\2\2\2\u00c9\u00ca\7/\2\2\u00ca:\3\2\2\2\u00cb\u00cc\7*\2\2\u00cc<"+
		"\3\2\2\2\u00cd\u00ce\7+\2\2\u00ce>\3\2\2\2\u00cf\u00d0\7}\2\2\u00d0@\3"+
		"\2\2\2\u00d1\u00d2\7\177\2\2\u00d2B\3\2\2\2\u00d3\u00d4\7<\2\2\u00d4D"+
		"\3\2\2\2\u00d5\u00d6\7]\2\2\u00d6F\3\2\2\2\u00d7\u00d8\7_\2\2\u00d8H\3"+
		"\2\2\2\u00d9\u00da\7.\2\2\u00daJ\3\2\2\2\u00db\u00dd\t\6\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\b&\2\2\u00e1L\3\2\2\2\u00e2\u00e3\7\61\2\2"+
		"\u00e3\u00e4\7,\2\2\u00e4\u00e8\3\2\2\2\u00e5\u00e7\13\2\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7,\2\2\u00ec\u00ed\7\61"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b\'\2\2\u00efN\3\2\2\2\u00f0\u00f1"+
		"\7\61\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f6\3\2\2\2\u00f3\u00f5\n\7\2\2"+
		"\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\b(\2\2\u00fa"+
		"P\3\2\2\2\u00fb\u00fc\7^\2\2\u00fc\u00fd\t\b\2\2\u00fdR\3\2\2\2\13\2\u008f"+
		"\u0095\u0097\u009d\u00a6\u00de\u00e8\u00f6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
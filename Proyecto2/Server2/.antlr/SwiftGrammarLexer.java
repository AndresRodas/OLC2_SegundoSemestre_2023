// Generated from c:\Users\darkm\OneDrive\Documentos\Proyectos\OLC2_SegundoSemestre_2023\Proyecto1\Server2\SwiftGrammar.g4 by ANTLR 4.9.2

    import "Server2/interfaces"
    import "Server2/environment"
    import "Server2/expressions"
    import "Server2/instructions"
    import "strings"

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BOOL=3, TRU=4, FAL=5, PRINT=6, IF=7, ELSE=8, WHILE=9, 
		NUMBER=10, STRING=11, ID=12, DIF=13, IG_IG=14, NOT=15, OR=16, AND=17, 
		IG=18, MAY_IG=19, MEN_IG=20, MAYOR=21, MENOR=22, MUL=23, DIV=24, ADD=25, 
		SUB=26, PARIZQ=27, PARDER=28, LLAVEIZQ=29, LLAVEDER=30, WHITESPACE=31, 
		COMMENT=32, LINE_COMMENT=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "BOOL", "TRU", "FAL", "PRINT", "IF", "ELSE", "WHILE", 
			"NUMBER", "STRING", "ID", "DIF", "IG_IG", "NOT", "OR", "AND", "IG", "MAY_IG", 
			"MEN_IG", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "PARIZQ", "PARDER", 
			"LLAVEIZQ", "LLAVEDER", "WHITESPACE", "COMMENT", "LINE_COMMENT", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'bool'", "'true'", "'false'", "'print'", "'if'", 
			"'else'", "'while'", null, null, null, "'!='", "'=='", "'!'", "'||'", 
			"'&&'", "'='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", 
			"'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOL", "TRU", "FAL", "PRINT", "IF", "ELSE", "WHILE", 
			"NUMBER", "STRING", "ID", "DIF", "IG_IG", "NOT", "OR", "AND", "IG", "MAY_IG", 
			"MEN_IG", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "PARIZQ", "PARDER", 
			"LLAVEIZQ", "LLAVEDER", "WHITESPACE", "COMMENT", "LINE_COMMENT"
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


	public SwiftGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SwiftGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00df\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6"+
		"\13w\n\13\r\13\16\13x\3\13\3\13\6\13}\n\13\r\13\16\13~\5\13\u0081\n\13"+
		"\3\f\3\f\7\f\u0085\n\f\f\f\16\f\u0088\13\f\3\f\3\f\3\r\3\r\7\r\u008e\n"+
		"\r\f\r\16\r\u0091\13\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \6 \u00be\n \r \16 \u00bf\3 \3 \3!\3!\3!\3!"+
		"\7!\u00c8\n!\f!\16!\u00cb\13!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\7\"\u00d6"+
		"\n\"\f\"\16\"\u00d9\13\"\3\"\3\"\3#\3#\3#\3\u00c9\2$\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E\2\3\2\t"+
		"\3\2\62;\3\2$$\4\2C\\c|\6\2\62;C\\aac|\6\2\13\f\17\17\"\"^^\4\2\f\f\17"+
		"\17\t\2\"#%%--/\60<<BB]_\2\u00e5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\3G\3\2\2\2\5K\3\2\2\2\7Q\3\2\2\2\tV\3\2\2\2\13[\3\2\2\2\r"+
		"a\3\2\2\2\17g\3\2\2\2\21j\3\2\2\2\23o\3\2\2\2\25v\3\2\2\2\27\u0082\3\2"+
		"\2\2\31\u008b\3\2\2\2\33\u0092\3\2\2\2\35\u0095\3\2\2\2\37\u0098\3\2\2"+
		"\2!\u009a\3\2\2\2#\u009d\3\2\2\2%\u00a0\3\2\2\2\'\u00a2\3\2\2\2)\u00a5"+
		"\3\2\2\2+\u00a8\3\2\2\2-\u00aa\3\2\2\2/\u00ac\3\2\2\2\61\u00ae\3\2\2\2"+
		"\63\u00b0\3\2\2\2\65\u00b2\3\2\2\2\67\u00b4\3\2\2\29\u00b6\3\2\2\2;\u00b8"+
		"\3\2\2\2=\u00ba\3\2\2\2?\u00bd\3\2\2\2A\u00c3\3\2\2\2C\u00d1\3\2\2\2E"+
		"\u00dc\3\2\2\2GH\7k\2\2HI\7p\2\2IJ\7v\2\2J\4\3\2\2\2KL\7h\2\2LM\7n\2\2"+
		"MN\7q\2\2NO\7c\2\2OP\7v\2\2P\6\3\2\2\2QR\7d\2\2RS\7q\2\2ST\7q\2\2TU\7"+
		"n\2\2U\b\3\2\2\2VW\7v\2\2WX\7t\2\2XY\7w\2\2YZ\7g\2\2Z\n\3\2\2\2[\\\7h"+
		"\2\2\\]\7c\2\2]^\7n\2\2^_\7u\2\2_`\7g\2\2`\f\3\2\2\2ab\7r\2\2bc\7t\2\2"+
		"cd\7k\2\2de\7p\2\2ef\7v\2\2f\16\3\2\2\2gh\7k\2\2hi\7h\2\2i\20\3\2\2\2"+
		"jk\7g\2\2kl\7n\2\2lm\7u\2\2mn\7g\2\2n\22\3\2\2\2op\7y\2\2pq\7j\2\2qr\7"+
		"k\2\2rs\7n\2\2st\7g\2\2t\24\3\2\2\2uw\t\2\2\2vu\3\2\2\2wx\3\2\2\2xv\3"+
		"\2\2\2xy\3\2\2\2y\u0080\3\2\2\2z|\7\60\2\2{}\t\2\2\2|{\3\2\2\2}~\3\2\2"+
		"\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080z\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\26\3\2\2\2\u0082\u0086\7$\2\2\u0083\u0085\n\3\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7$\2\2\u008a"+
		"\30\3\2\2\2\u008b\u008f\t\4\2\2\u008c\u008e\t\5\2\2\u008d\u008c\3\2\2"+
		"\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\32"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7#\2\2\u0093\u0094\7?\2\2\u0094"+
		"\34\3\2\2\2\u0095\u0096\7?\2\2\u0096\u0097\7?\2\2\u0097\36\3\2\2\2\u0098"+
		"\u0099\7#\2\2\u0099 \3\2\2\2\u009a\u009b\7~\2\2\u009b\u009c\7~\2\2\u009c"+
		"\"\3\2\2\2\u009d\u009e\7(\2\2\u009e\u009f\7(\2\2\u009f$\3\2\2\2\u00a0"+
		"\u00a1\7?\2\2\u00a1&\3\2\2\2\u00a2\u00a3\7@\2\2\u00a3\u00a4\7?\2\2\u00a4"+
		"(\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\u00a7\7?\2\2\u00a7*\3\2\2\2\u00a8\u00a9"+
		"\7@\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7>\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7"+
		",\2\2\u00ad\60\3\2\2\2\u00ae\u00af\7\61\2\2\u00af\62\3\2\2\2\u00b0\u00b1"+
		"\7-\2\2\u00b1\64\3\2\2\2\u00b2\u00b3\7/\2\2\u00b3\66\3\2\2\2\u00b4\u00b5"+
		"\7*\2\2\u00b58\3\2\2\2\u00b6\u00b7\7+\2\2\u00b7:\3\2\2\2\u00b8\u00b9\7"+
		"}\2\2\u00b9<\3\2\2\2\u00ba\u00bb\7\177\2\2\u00bb>\3\2\2\2\u00bc\u00be"+
		"\t\6\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\b \2\2\u00c2@\3\2\2\2\u00c3"+
		"\u00c4\7\61\2\2\u00c4\u00c5\7,\2\2\u00c5\u00c9\3\2\2\2\u00c6\u00c8\13"+
		"\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7,"+
		"\2\2\u00cd\u00ce\7\61\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b!\2\2\u00d0"+
		"B\3\2\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d3\7\61\2\2\u00d3\u00d7\3\2\2"+
		"\2\u00d4\u00d6\n\7\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00db\b\"\2\2\u00dbD\3\2\2\2\u00dc\u00dd\7^\2\2\u00dd\u00de\t\b\2\2\u00de"+
		"F\3\2\2\2\13\2x~\u0080\u0086\u008f\u00bf\u00c9\u00d7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
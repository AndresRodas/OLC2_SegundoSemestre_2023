// Generated from c:\Users\darkm\OneDrive\Documentos\Proyectos\OLC2_SegundoSemestre_2023\Proyecto1\Server1\SwiftGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lab1_GLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PARDER=1, PARIZQ=2, ENBLANCO=3, ENTERO=4, DECIMAL=5, ID=6, RETURN=7, UL_C=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PARDER", "PARIZQ", "ENBLANCO", "DIG", "ENTERO", "DECIMAL", "ID", "RETURN", 
			"UL_C"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "')'", "'('", null, null, null, null, "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PARDER", "PARIZQ", "ENBLANCO", "ENTERO", "DECIMAL", "ID", "RETURN", 
			"UL_C"
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


	public Lab1_GLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nS\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\6\4\33\n\4\r\4\16\4\34\3\4\3\4\3\5\3\5\3\6\6\6$\n\6\r\6\16"+
		"\6%\3\7\6\7)\n\7\r\7\16\7*\3\7\3\7\6\7/\n\7\r\7\16\7\60\3\b\3\b\7\b\65"+
		"\n\b\f\b\16\b8\13\b\3\b\3\b\6\b<\n\b\r\b\16\b=\5\b@\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\nM\n\n\f\n\16\nP\13\n\3\n\3\n\2\2\13"+
		"\3\3\5\4\7\5\t\2\13\6\r\7\17\b\21\t\23\n\3\2\7\5\2\13\f\17\17\"\"\3\2"+
		"\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\2Y\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\3\25\3\2\2\2\5\27\3\2\2\2\7\32\3\2\2\2\t \3\2\2\2\13#\3\2\2\2"+
		"\r(\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23H\3\2\2\2\25\26\7+\2\2\26\4\3\2"+
		"\2\2\27\30\7*\2\2\30\6\3\2\2\2\31\33\t\2\2\2\32\31\3\2\2\2\33\34\3\2\2"+
		"\2\34\32\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37\b\4\2\2\37\b\3\2\2"+
		"\2 !\t\3\2\2!\n\3\2\2\2\"$\5\t\5\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3"+
		"\2\2\2&\f\3\2\2\2\')\5\t\5\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2"+
		"+,\3\2\2\2,.\7\60\2\2-/\5\t\5\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61"+
		"\3\2\2\2\61\16\3\2\2\2\62\66\t\4\2\2\63\65\t\5\2\2\64\63\3\2\2\2\658\3"+
		"\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67@\3\2\2\28\66\3\2\2\29;\7a\2\2:<"+
		"\t\5\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?\62\3\2\2\2"+
		"?9\3\2\2\2@\20\3\2\2\2AB\7t\2\2BC\7g\2\2CD\7v\2\2DE\7w\2\2EF\7t\2\2FG"+
		"\7p\2\2G\22\3\2\2\2HI\7\61\2\2IJ\7\61\2\2JN\3\2\2\2KM\n\6\2\2LK\3\2\2"+
		"\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\b\n\3\2R\24\3\2"+
		"\2\2\13\2\34%*\60\66=?N\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
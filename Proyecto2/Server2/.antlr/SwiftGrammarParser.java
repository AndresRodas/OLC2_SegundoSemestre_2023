// Generated from c:/Users/darkm/OneDrive/Documentos/Proyectos/OLC2_SegundoSemestre_2023/Proyecto2/Server2/SwiftGrammar.g4 by ANTLR 4.13.1

    import "Server2/interfaces"
    import "Server2/environment"
    import "Server2/expressions"
    import "Server2/instructions"
    import "strings"

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SwiftGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BOOL=3, STR=4, TRU=5, FAL=6, PRINT=7, IF=8, ELSE=9, WHILE=10, 
		VAR=11, FUNC=12, STRUCT=13, NUMBER=14, STRING=15, ID=16, DIF=17, IG_IG=18, 
		NOT=19, OR=20, AND=21, IG=22, MAY_IG=23, MEN_IG=24, MAYOR=25, MENOR=26, 
		MUL=27, DIV=28, ADD=29, SUB=30, PARIZQ=31, PARDER=32, LLAVEIZQ=33, LLAVEDER=34, 
		D_PTS=35, CORIZQ=36, CORDER=37, COMA=38, ARROW1=39, PUNTO=40, WHITESPACE=41, 
		COMMENT=42, LINE_COMMENT=43;
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_instruction = 2, RULE_structCreation = 3, 
		RULE_listStructDec = 4, RULE_function = 5, RULE_listParamsFunc = 6, RULE_assignment = 7, 
		RULE_printstmt = 8, RULE_ifstmt = 9, RULE_declarationstmt = 10, RULE_types = 11, 
		RULE_expr = 12, RULE_listParams = 13, RULE_listArray = 14, RULE_listAccessArray = 15, 
		RULE_callFunction = 16, RULE_listParamsCall = 17, RULE_listStructExp = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "structCreation", "listStructDec", "function", 
			"listParamsFunc", "assignment", "printstmt", "ifstmt", "declarationstmt", 
			"types", "expr", "listParams", "listArray", "listAccessArray", "callFunction", 
			"listParamsCall", "listStructExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Int'", "'Float'", "'Bool'", "'String'", "'true'", "'false'", 
			"'print'", "'if'", "'else'", "'while'", "'var'", "'func'", "'struct'", 
			null, null, null, "'!='", "'=='", "'!'", "'||'", "'&&'", "'='", "'>='", 
			"'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'{'", 
			"'}'", "':'", "'['", "']'", "','", "'->'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOL", "STR", "TRU", "FAL", "PRINT", "IF", "ELSE", 
			"WHILE", "VAR", "FUNC", "STRUCT", "NUMBER", "STRING", "ID", "DIF", "IG_IG", 
			"NOT", "OR", "AND", "IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MUL", 
			"DIV", "ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "D_PTS", 
			"CORIZQ", "CORDER", "COMA", "ARROW1", "PUNTO", "WHITESPACE", "COMMENT", 
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

	@Override
	public String getGrammarFileName() { return "SwiftGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SwiftGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public []interface{} code;
		public BlockContext block;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SwiftGrammarParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			((SContext)_localctx).block = block();
			setState(39);
			match(EOF);
			   
			        _localctx.code = ((SContext)_localctx).block.blk
			    
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
	public static class BlockContext extends ParserRuleContext {
		public []interface{} blk;
		public InstructionContext instruction;
		public List<InstructionContext> ins = new ArrayList<InstructionContext>();
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);

		    _localctx.blk = []interface{}{}
		    var listInt []IInstructionContext
		  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				((BlockContext)_localctx).instruction = instruction();
				((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 80256L) != 0) );

			        listInt = localctx.(*BlockContext).GetIns()
			        for _, e := range listInt {
			            _localctx.blk = append(_localctx.blk, e.GetInst())
			        }
			    
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
	public static class InstructionContext extends ParserRuleContext {
		public interfaces.Instruction inst;
		public PrintstmtContext printstmt;
		public IfstmtContext ifstmt;
		public DeclarationstmtContext declarationstmt;
		public AssignmentContext assignment;
		public FunctionContext function;
		public StructCreationContext structCreation;
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public DeclarationstmtContext declarationstmt() {
			return getRuleContext(DeclarationstmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StructCreationContext structCreation() {
			return getRuleContext(StructCreationContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				((InstructionContext)_localctx).printstmt = printstmt();
				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				((InstructionContext)_localctx).ifstmt = ifstmt();
				 _localctx.inst = ((InstructionContext)_localctx).ifstmt.ifinst 
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				((InstructionContext)_localctx).declarationstmt = declarationstmt();
				 _localctx.inst = ((InstructionContext)_localctx).declarationstmt.dec 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				((InstructionContext)_localctx).assignment = assignment();
				 _localctx.inst = ((InstructionContext)_localctx).assignment.ass 
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				((InstructionContext)_localctx).function = function();
				 _localctx.inst = ((InstructionContext)_localctx).function.fun 
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				((InstructionContext)_localctx).structCreation = structCreation();
				 _localctx.inst = ((InstructionContext)_localctx).structCreation.dec 
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
	public static class StructCreationContext extends ParserRuleContext {
		public interfaces.Instruction dec;
		public Token STRUCT;
		public Token ID;
		public ListStructDecContext listStructDec;
		public TerminalNode STRUCT() { return getToken(SwiftGrammarParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public ListStructDecContext listStructDec() {
			return getRuleContext(ListStructDecContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public StructCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterStructCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitStructCreation(this);
		}
	}

	public final StructCreationContext structCreation() throws RecognitionException {
		StructCreationContext _localctx = new StructCreationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structCreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((StructCreationContext)_localctx).STRUCT = match(STRUCT);
			setState(70);
			((StructCreationContext)_localctx).ID = match(ID);
			setState(71);
			match(LLAVEIZQ);
			setState(72);
			((StructCreationContext)_localctx).listStructDec = listStructDec(0);
			setState(73);
			match(LLAVEDER);
			 _localctx.dec = instructions.NewStruct((((StructCreationContext)_localctx).STRUCT!=null?((StructCreationContext)_localctx).STRUCT.getLine():0), (((StructCreationContext)_localctx).STRUCT!=null?((StructCreationContext)_localctx).STRUCT.getCharPositionInLine():0), (((StructCreationContext)_localctx).ID!=null?((StructCreationContext)_localctx).ID.getText():null), ((StructCreationContext)_localctx).listStructDec.l) 
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
	public static class ListStructDecContext extends ParserRuleContext {
		public []interface{} l;
		public ListStructDecContext list;
		public Token ID;
		public TypesContext types;
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode D_PTS() { return getToken(SwiftGrammarParser.D_PTS, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListStructDecContext listStructDec() {
			return getRuleContext(ListStructDecContext.class,0);
		}
		public ListStructDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStructDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterListStructDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitListStructDec(this);
		}
	}

	public final ListStructDecContext listStructDec() throws RecognitionException {
		return listStructDec(0);
	}

	private ListStructDecContext listStructDec(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListStructDecContext _localctx = new ListStructDecContext(_ctx, _parentState);
		ListStructDecContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_listStructDec, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(77);
				match(VAR);
				setState(78);
				((ListStructDecContext)_localctx).ID = match(ID);
				setState(79);
				match(D_PTS);
				setState(80);
				((ListStructDecContext)_localctx).types = types();

				                        var arr []interface{}
				                        newParams := environment.NewStructType((((ListStructDecContext)_localctx).ID!=null?((ListStructDecContext)_localctx).ID.getText():null), ((ListStructDecContext)_localctx).types.ty)
				                        arr = append(arr, newParams)
				                        _localctx.l = arr
				                    
				}
				break;
			case 2:
				{
				 _localctx.l = []interface{}{} 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListStructDecContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listStructDec);
					setState(86);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(87);
					match(COMA);
					setState(88);
					match(VAR);
					setState(89);
					((ListStructDecContext)_localctx).ID = match(ID);
					setState(90);
					match(D_PTS);
					setState(91);
					((ListStructDecContext)_localctx).types = types();

					                                                          var arr []interface{}
					                                                          newParams := environment.NewStructType((((ListStructDecContext)_localctx).ID!=null?((ListStructDecContext)_localctx).ID.getText():null), ((ListStructDecContext)_localctx).types.ty)
					                                                          arr = append(((ListStructDecContext)_localctx).list.l, newParams)
					                                                          _localctx.l = arr
					                                                      
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public interfaces.Instruction fun;
		public Token FUNC;
		public Token ID;
		public ListParamsFuncContext listParamsFunc;
		public BlockContext block;
		public TypesContext types;
		public TerminalNode FUNC() { return getToken(SwiftGrammarParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ListParamsFuncContext listParamsFunc() {
			return getRuleContext(ListParamsFuncContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public TerminalNode ARROW1() { return getToken(SwiftGrammarParser.ARROW1, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				((FunctionContext)_localctx).FUNC = match(FUNC);
				setState(100);
				((FunctionContext)_localctx).ID = match(ID);
				setState(101);
				match(PARIZQ);
				setState(102);
				((FunctionContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(103);
				match(PARDER);
				setState(104);
				match(LLAVEIZQ);
				setState(105);
				((FunctionContext)_localctx).block = block();
				setState(106);
				match(LLAVEDER);

				    _localctx.fun = instructions.NewFunction((((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getLine():0), (((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getCharPositionInLine():0), (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).listParamsFunc.lpf, environment.NULL, ((FunctionContext)_localctx).block.blk)

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				((FunctionContext)_localctx).FUNC = match(FUNC);
				setState(110);
				((FunctionContext)_localctx).ID = match(ID);
				setState(111);
				match(PARIZQ);
				setState(112);
				((FunctionContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(113);
				match(PARDER);
				setState(114);
				match(ARROW1);
				setState(115);
				((FunctionContext)_localctx).types = types();
				setState(116);
				match(LLAVEIZQ);
				setState(117);
				((FunctionContext)_localctx).block = block();
				setState(118);
				match(LLAVEDER);

				    _localctx.fun = instructions.NewFunction((((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getLine():0), (((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getCharPositionInLine():0), (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).listParamsFunc.lpf, ((FunctionContext)_localctx).types.ty, ((FunctionContext)_localctx).block.blk)

				}
				break;
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
	public static class ListParamsFuncContext extends ParserRuleContext {
		public []interface{} lpf;
		public ListParamsFuncContext list;
		public Token ID;
		public TypesContext types;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode D_PTS() { return getToken(SwiftGrammarParser.D_PTS, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListParamsFuncContext listParamsFunc() {
			return getRuleContext(ListParamsFuncContext.class,0);
		}
		public ListParamsFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParamsFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterListParamsFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitListParamsFunc(this);
		}
	}

	public final ListParamsFuncContext listParamsFunc() throws RecognitionException {
		return listParamsFunc(0);
	}

	private ListParamsFuncContext listParamsFunc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsFuncContext _localctx = new ListParamsFuncContext(_ctx, _parentState);
		ListParamsFuncContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_listParamsFunc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(124);
				((ListParamsFuncContext)_localctx).ID = match(ID);
				setState(125);
				match(D_PTS);
				setState(126);
				((ListParamsFuncContext)_localctx).types = types();

				    _localctx.lpf = []interface{}{}
				    newParam := instructions.NewParamsDeclaration((((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getCharPositionInLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getText():null), ((ListParamsFuncContext)_localctx).types.ty)
				    _localctx.lpf = append(_localctx.lpf, newParam)
				    
				}
				break;
			case 2:
				{
				 _localctx.lpf = []interface{}{} 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsFuncContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParamsFunc);
					setState(132);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(133);
					match(COMA);
					setState(134);
					((ListParamsFuncContext)_localctx).ID = match(ID);
					setState(135);
					match(D_PTS);
					setState(136);
					((ListParamsFuncContext)_localctx).types = types();

					              var arr []interface{}
					              newParam := instructions.NewParamsDeclaration((((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getCharPositionInLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getText():null), ((ListParamsFuncContext)_localctx).types.ty)
					              arr = append(((ListParamsFuncContext)_localctx).list.lpf, newParam)
					              _localctx.lpf = arr
					              
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public interfaces.Instruction ass;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(145);
			match(IG);
			setState(146);
			((AssignmentContext)_localctx).expr = expr(0);
			 _localctx.ass = instructions.NewAssignment((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getLine():0), (((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getCharPositionInLine():0), (((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), ((AssignmentContext)_localctx).expr.e)
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
	public static class PrintstmtContext extends ParserRuleContext {
		public interfaces.Instruction prnt;
		public Token PRINT;
		public ExprContext expr;
		public TerminalNode PRINT() { return getToken(SwiftGrammarParser.PRINT, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterPrintstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitPrintstmt(this);
		}
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(150);
			match(PARIZQ);
			setState(151);
			((PrintstmtContext)_localctx).expr = expr(0);
			setState(152);
			match(PARDER);
			 _localctx.prnt = instructions.NewPrint((((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getLine():0),(((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getCharPositionInLine():0),((PrintstmtContext)_localctx).expr.e)
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
	public static class IfstmtContext extends ParserRuleContext {
		public interfaces.Instruction ifinst;
		public Token IF;
		public ExprContext expr;
		public BlockContext block;
		public TerminalNode IF() { return getToken(SwiftGrammarParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitIfstmt(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((IfstmtContext)_localctx).IF = match(IF);
			setState(156);
			((IfstmtContext)_localctx).expr = expr(0);
			setState(157);
			match(LLAVEIZQ);
			setState(158);
			((IfstmtContext)_localctx).block = block();
			setState(159);
			match(LLAVEDER);
			 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk) 
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
	public static class DeclarationstmtContext extends ParserRuleContext {
		public interfaces.Instruction dec;
		public Token VAR;
		public Token ID;
		public TypesContext types;
		public ExprContext expr;
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode D_PTS() { return getToken(SwiftGrammarParser.D_PTS, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterDeclarationstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitDeclarationstmt(this);
		}
	}

	public final DeclarationstmtContext declarationstmt() throws RecognitionException {
		DeclarationstmtContext _localctx = new DeclarationstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarationstmt);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(163);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(164);
				match(D_PTS);
				setState(165);
				((DeclarationstmtContext)_localctx).types = types();
				setState(166);
				match(IG);
				setState(167);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaration((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), ((DeclarationstmtContext)_localctx).types.ty, ((DeclarationstmtContext)_localctx).expr.e) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(171);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(172);
				match(IG);
				setState(173);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaration((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), environment.STRUCT , ((DeclarationstmtContext)_localctx).expr.e) 
				}
				break;
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
	public static class TypesContext extends ParserRuleContext {
		public environment.TipoExpresion ty;
		public TerminalNode INT() { return getToken(SwiftGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SwiftGrammarParser.FLOAT, 0); }
		public TerminalNode STR() { return getToken(SwiftGrammarParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(SwiftGrammarParser.BOOL, 0); }
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitTypes(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_types);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(INT);
				 _localctx.ty = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(FLOAT);
				 _localctx.ty = environment.FLOAT 
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(STR);
				 _localctx.ty = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(BOOL);
				 _localctx.ty = environment.BOOLEAN 
				}
				break;
			case CORIZQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				match(CORIZQ);
				setState(187);
				match(CORDER);
				 _localctx.ty = environment.ARRAY 
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
	public static class ExprContext extends ParserRuleContext {
		public interfaces.Expression e;
		public ExprContext left;
		public CallFunctionContext callFunction;
		public Token ID;
		public ListStructExpContext listStructExp;
		public ExprContext expr;
		public ListArrayContext list;
		public Token CORIZQ;
		public ListParamsContext listParams;
		public Token NUMBER;
		public Token STRING;
		public Token TRU;
		public Token FAL;
		public Token op;
		public ExprContext right;
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public ListStructExpContext listStructExp() {
			return getRuleContext(ListStructExpContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public TerminalNode NUMBER() { return getToken(SwiftGrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(SwiftGrammarParser.STRING, 0); }
		public TerminalNode TRU() { return getToken(SwiftGrammarParser.TRU, 0); }
		public TerminalNode FAL() { return getToken(SwiftGrammarParser.FAL, 0); }
		public TerminalNode MUL() { return getToken(SwiftGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SwiftGrammarParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(SwiftGrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SwiftGrammarParser.SUB, 0); }
		public TerminalNode MAY_IG() { return getToken(SwiftGrammarParser.MAY_IG, 0); }
		public TerminalNode MAYOR() { return getToken(SwiftGrammarParser.MAYOR, 0); }
		public TerminalNode MEN_IG() { return getToken(SwiftGrammarParser.MEN_IG, 0); }
		public TerminalNode MENOR() { return getToken(SwiftGrammarParser.MENOR, 0); }
		public TerminalNode IG_IG() { return getToken(SwiftGrammarParser.IG_IG, 0); }
		public TerminalNode DIF() { return getToken(SwiftGrammarParser.DIF, 0); }
		public TerminalNode AND() { return getToken(SwiftGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(SwiftGrammarParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(192);
				((ExprContext)_localctx).callFunction = callFunction();
				 _localctx.e = ((ExprContext)_localctx).callFunction.cf 
				}
				break;
			case 2:
				{
				setState(195);
				((ExprContext)_localctx).ID = match(ID);
				setState(196);
				match(LLAVEIZQ);
				setState(197);
				((ExprContext)_localctx).listStructExp = listStructExp(0);
				setState(198);
				match(LLAVEDER);
				 _localctx.e = expressions.NewStructExp((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), ((ExprContext)_localctx).listStructExp.l ) 
				}
				break;
			case 3:
				{
				setState(201);
				match(PARIZQ);
				setState(202);
				((ExprContext)_localctx).expr = expr(0);
				setState(203);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case 4:
				{
				setState(206);
				((ExprContext)_localctx).list = listArray(0);
				 _localctx.e = ((ExprContext)_localctx).list.p
				}
				break;
			case 5:
				{
				setState(209);
				((ExprContext)_localctx).CORIZQ = match(CORIZQ);
				setState(210);
				((ExprContext)_localctx).listParams = listParams(0);
				setState(211);
				match(CORDER);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getLine():0), (((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getCharPositionInLine():0), ((ExprContext)_localctx).listParams.l) 
				}
				break;
			case 6:
				{
				setState(214);
				((ExprContext)_localctx).NUMBER = match(NUMBER);

				        if (strings.Contains((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null),".")){
				            num,err := strconv.ParseFloat((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null), 64);
				            if err!= nil{
				                fmt.Println(err)
				            }
				            _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getLine():0),(((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getCharPositionInLine():0),num,environment.FLOAT)
				        }else{
				            num,err := strconv.Atoi((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null))
				            if err!= nil{
				                fmt.Println(err)
				            }
				            _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getLine():0),(((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getCharPositionInLine():0),num,environment.INTEGER)
				        }
				    
				}
				break;
			case 7:
				{
				setState(216);
				((ExprContext)_localctx).STRING = match(STRING);

				        str := (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getLine():0), (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case 8:
				{
				setState(218);
				((ExprContext)_localctx).TRU = match(TRU);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getLine():0), (((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case 9:
				{
				setState(220);
				((ExprContext)_localctx).FAL = match(FAL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getLine():0), (((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getCharPositionInLine():0), false, environment.BOOLEAN) 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(225);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(17);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(230);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(231);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(16);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(235);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAY_IG || _la==MAYOR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(236);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(15);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(240);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MEN_IG || _la==MENOR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(14);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(245);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIF || _la==IG_IG) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(246);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(13);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(250);
						((ExprContext)_localctx).op = match(AND);
						setState(251);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(12);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(255);
						((ExprContext)_localctx).op = match(OR);
						setState(256);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(11);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListParamsContext extends ParserRuleContext {
		public []interface{} l;
		public ListParamsContext list;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public ListParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterListParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitListParams(this);
		}
	}

	public final ListParamsContext listParams() throws RecognitionException {
		return listParams(0);
	}

	private ListParamsContext listParams(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsContext _localctx = new ListParamsContext(_ctx, _parentState);
		ListParamsContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_listParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(265);
			((ListParamsContext)_localctx).expr = expr(0);

			            _localctx.l = []interface{}{}
			            _localctx.l = append(_localctx.l, ((ListParamsContext)_localctx).expr.e)
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParams);
					setState(268);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(269);
					match(COMA);
					setState(270);
					((ListParamsContext)_localctx).expr = expr(0);

					                                          var arr []interface{}
					                                          arr = append(((ListParamsContext)_localctx).list.l, ((ListParamsContext)_localctx).expr.e)
					                                          _localctx.l = arr
					                                      
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListArrayContext extends ParserRuleContext {
		public interfaces.Expression p;
		public ListArrayContext list;
		public Token ID;
		public ListAccessArrayContext arr;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public ListAccessArrayContext listAccessArray() {
			return getRuleContext(ListAccessArrayContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public ListArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterListArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitListArray(this);
		}
	}

	public final ListArrayContext listArray() throws RecognitionException {
		return listArray(0);
	}

	private ListArrayContext listArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListArrayContext _localctx = new ListArrayContext(_ctx, _parentState);
		ListArrayContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(279);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expressions.NewCallVar((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(290);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ListArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listArray);
						setState(282);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(283);
						((ListArrayContext)_localctx).arr = listAccessArray(0);
						 _localctx.p = expressions.NewArrayAccess((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), ((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).arr.l) 
						}
						break;
					case 2:
						{
						_localctx = new ListArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listArray);
						setState(286);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(287);
						match(PUNTO);
						setState(288);
						((ListArrayContext)_localctx).ID = match(ID);
						 _localctx.p = expressions.NewStructAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))  
						}
						break;
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListAccessArrayContext extends ParserRuleContext {
		public []interface{} l;
		public ListAccessArrayContext list;
		public ExprContext expr;
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public ListAccessArrayContext listAccessArray() {
			return getRuleContext(ListAccessArrayContext.class,0);
		}
		public ListAccessArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAccessArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterListAccessArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitListAccessArray(this);
		}
	}

	public final ListAccessArrayContext listAccessArray() throws RecognitionException {
		return listAccessArray(0);
	}

	private ListAccessArrayContext listAccessArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListAccessArrayContext _localctx = new ListAccessArrayContext(_ctx, _parentState);
		ListAccessArrayContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_listAccessArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(296);
			match(CORIZQ);
			setState(297);
			((ListAccessArrayContext)_localctx).expr = expr(0);
			setState(298);
			match(CORDER);

			                            _localctx.l = []interface{}{}
			                            _localctx.l = append(_localctx.l, ((ListAccessArrayContext)_localctx).expr.e)
			                        
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListAccessArrayContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listAccessArray);
					setState(301);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(302);
					match(CORIZQ);
					setState(303);
					((ListAccessArrayContext)_localctx).expr = expr(0);
					setState(304);
					match(CORDER);

					                                                          var arr []interface{}
					                                                          arr = append(((ListAccessArrayContext)_localctx).list.l, ((ListAccessArrayContext)_localctx).expr.e)
					                                                          _localctx.l = arr
					                                                      
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionContext extends ParserRuleContext {
		public interfaces.Expression cf;
		public Token ID;
		public ListParamsCallContext listParamsCall;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ListParamsCallContext listParamsCall() {
			return getRuleContext(ListParamsCallContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitCallFunction(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_callFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			((CallFunctionContext)_localctx).ID = match(ID);
			setState(313);
			match(PARIZQ);
			setState(314);
			((CallFunctionContext)_localctx).listParamsCall = listParamsCall(0);
			setState(315);
			match(PARDER);
			 _localctx.cf = expressions.NewCallExp((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), ((CallFunctionContext)_localctx).listParamsCall.l) 
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
	public static class ListParamsCallContext extends ParserRuleContext {
		public []interface{} l;
		public ListParamsCallContext list;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListParamsCallContext listParamsCall() {
			return getRuleContext(ListParamsCallContext.class,0);
		}
		public ListParamsCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParamsCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterListParamsCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitListParamsCall(this);
		}
	}

	public final ListParamsCallContext listParamsCall() throws RecognitionException {
		return listParamsCall(0);
	}

	private ListParamsCallContext listParamsCall(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsCallContext _localctx = new ListParamsCallContext(_ctx, _parentState);
		ListParamsCallContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_listParamsCall, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(319);
				((ListParamsCallContext)_localctx).expr = expr(0);

				            _localctx.l = []interface{}{}
				            _localctx.l = append(_localctx.l, ((ListParamsCallContext)_localctx).expr.e)
				        
				}
				break;
			case 2:
				{

				        _localctx.l = []interface{}{}
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsCallContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParamsCall);
					setState(325);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(326);
					match(COMA);
					setState(327);
					((ListParamsCallContext)_localctx).expr = expr(0);

					                                              var arr []interface{}
					                                              arr = append(((ListParamsCallContext)_localctx).list.l, ((ListParamsCallContext)_localctx).expr.e)
					                                              _localctx.l = arr
					                                          
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListStructExpContext extends ParserRuleContext {
		public []interface{} l;
		public ListStructExpContext list;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode D_PTS() { return getToken(SwiftGrammarParser.D_PTS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListStructExpContext listStructExp() {
			return getRuleContext(ListStructExpContext.class,0);
		}
		public ListStructExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStructExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterListStructExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitListStructExp(this);
		}
	}

	public final ListStructExpContext listStructExp() throws RecognitionException {
		return listStructExp(0);
	}

	private ListStructExpContext listStructExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListStructExpContext _localctx = new ListStructExpContext(_ctx, _parentState);
		ListStructExpContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_listStructExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(336);
				((ListStructExpContext)_localctx).ID = match(ID);
				setState(337);
				match(D_PTS);
				setState(338);
				((ListStructExpContext)_localctx).expr = expr(0);

				                    var arr []interface{}
				                    StrExp := environment.NewStructContent((((ListStructExpContext)_localctx).ID!=null?((ListStructExpContext)_localctx).ID.getText():null), ((ListStructExpContext)_localctx).expr.e)
				                    arr = append(arr, StrExp)
				                    _localctx.l = arr
				                
				}
				break;
			case 2:
				{

				        _localctx.l = []interface{}{}
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListStructExpContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listStructExp);
					setState(344);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(345);
					match(COMA);
					setState(346);
					((ListStructExpContext)_localctx).ID = match(ID);
					setState(347);
					match(D_PTS);
					setState(348);
					((ListStructExpContext)_localctx).expr = expr(0);

					                                                      var arr []interface{}
					                                                      StrExp := environment.NewStructContent((((ListStructExpContext)_localctx).ID!=null?((ListStructExpContext)_localctx).ID.getText():null), ((ListStructExpContext)_localctx).expr.e)
					                                                      arr = append(((ListStructExpContext)_localctx).list.l, StrExp)
					                                                      _localctx.l = arr
					                                                  
					}
					} 
				}
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return listStructDec_sempred((ListStructDecContext)_localctx, predIndex);
		case 6:
			return listParamsFunc_sempred((ListParamsFuncContext)_localctx, predIndex);
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 13:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 14:
			return listArray_sempred((ListArrayContext)_localctx, predIndex);
		case 15:
			return listAccessArray_sempred((ListAccessArrayContext)_localctx, predIndex);
		case 17:
			return listParamsCall_sempred((ListParamsCallContext)_localctx, predIndex);
		case 18:
			return listStructExp_sempred((ListStructExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listStructDec_sempred(ListStructDecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean listParamsFunc_sempred(ListParamsFuncContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listArray_sempred(ListArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listAccessArray_sempred(ListAccessArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listParamsCall_sempred(ListParamsCallContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean listStructExp_sempred(ListStructExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0165\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001"+
		",\b\u0001\u000b\u0001\f\u0001-\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002D\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004U\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004_\b\u0004\n\u0004\f\u0004b\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005z\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0083\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u008c\b\u0006\n"+
		"\u0006\f\u0006\u008f\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00b1\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00be\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00df\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u0104\b\f\n\f\f\f\u0107\t\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0112"+
		"\b\r\n\r\f\r\u0115\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0123\b\u000e\n\u000e\f\u000e\u0126"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u0134\b\u000f\n\u000f\f\u000f\u0137\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0144\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u014b\b\u0011\n\u0011\f\u0011\u014e\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0157"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0160\b\u0012\n\u0012\f\u0012\u0163\t\u0012"+
		"\u0001\u0012\u0000\b\b\f\u0018\u001a\u001c\u001e\"$\u0013\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$\u0000\u0005\u0001\u0000\u001b\u001c\u0001\u0000\u001d\u001e\u0002"+
		"\u0000\u0017\u0017\u0019\u0019\u0002\u0000\u0018\u0018\u001a\u001a\u0001"+
		"\u0000\u0011\u0012\u0178\u0000&\u0001\u0000\u0000\u0000\u0002+\u0001\u0000"+
		"\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000"+
		"\bT\u0001\u0000\u0000\u0000\ny\u0001\u0000\u0000\u0000\f\u0082\u0001\u0000"+
		"\u0000\u0000\u000e\u0090\u0001\u0000\u0000\u0000\u0010\u0095\u0001\u0000"+
		"\u0000\u0000\u0012\u009b\u0001\u0000\u0000\u0000\u0014\u00b0\u0001\u0000"+
		"\u0000\u0000\u0016\u00bd\u0001\u0000\u0000\u0000\u0018\u00de\u0001\u0000"+
		"\u0000\u0000\u001a\u0108\u0001\u0000\u0000\u0000\u001c\u0116\u0001\u0000"+
		"\u0000\u0000\u001e\u0127\u0001\u0000\u0000\u0000 \u0138\u0001\u0000\u0000"+
		"\u0000\"\u0143\u0001\u0000\u0000\u0000$\u0156\u0001\u0000\u0000\u0000"+
		"&\'\u0003\u0002\u0001\u0000\'(\u0005\u0000\u0000\u0001()\u0006\u0000\uffff"+
		"\uffff\u0000)\u0001\u0001\u0000\u0000\u0000*,\u0003\u0004\u0002\u0000"+
		"+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0006\u0001"+
		"\uffff\uffff\u00000\u0003\u0001\u0000\u0000\u000012\u0003\u0010\b\u0000"+
		"23\u0006\u0002\uffff\uffff\u00003D\u0001\u0000\u0000\u000045\u0003\u0012"+
		"\t\u000056\u0006\u0002\uffff\uffff\u00006D\u0001\u0000\u0000\u000078\u0003"+
		"\u0014\n\u000089\u0006\u0002\uffff\uffff\u00009D\u0001\u0000\u0000\u0000"+
		":;\u0003\u000e\u0007\u0000;<\u0006\u0002\uffff\uffff\u0000<D\u0001\u0000"+
		"\u0000\u0000=>\u0003\n\u0005\u0000>?\u0006\u0002\uffff\uffff\u0000?D\u0001"+
		"\u0000\u0000\u0000@A\u0003\u0006\u0003\u0000AB\u0006\u0002\uffff\uffff"+
		"\u0000BD\u0001\u0000\u0000\u0000C1\u0001\u0000\u0000\u0000C4\u0001\u0000"+
		"\u0000\u0000C7\u0001\u0000\u0000\u0000C:\u0001\u0000\u0000\u0000C=\u0001"+
		"\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000D\u0005\u0001\u0000\u0000"+
		"\u0000EF\u0005\r\u0000\u0000FG\u0005\u0010\u0000\u0000GH\u0005!\u0000"+
		"\u0000HI\u0003\b\u0004\u0000IJ\u0005\"\u0000\u0000JK\u0006\u0003\uffff"+
		"\uffff\u0000K\u0007\u0001\u0000\u0000\u0000LM\u0006\u0004\uffff\uffff"+
		"\u0000MN\u0005\u000b\u0000\u0000NO\u0005\u0010\u0000\u0000OP\u0005#\u0000"+
		"\u0000PQ\u0003\u0016\u000b\u0000QR\u0006\u0004\uffff\uffff\u0000RU\u0001"+
		"\u0000\u0000\u0000SU\u0006\u0004\uffff\uffff\u0000TL\u0001\u0000\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000U`\u0001\u0000\u0000\u0000VW\n\u0003\u0000"+
		"\u0000WX\u0005&\u0000\u0000XY\u0005\u000b\u0000\u0000YZ\u0005\u0010\u0000"+
		"\u0000Z[\u0005#\u0000\u0000[\\\u0003\u0016\u000b\u0000\\]\u0006\u0004"+
		"\uffff\uffff\u0000]_\u0001\u0000\u0000\u0000^V\u0001\u0000\u0000\u0000"+
		"_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a\t\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0005\f"+
		"\u0000\u0000de\u0005\u0010\u0000\u0000ef\u0005\u001f\u0000\u0000fg\u0003"+
		"\f\u0006\u0000gh\u0005 \u0000\u0000hi\u0005!\u0000\u0000ij\u0003\u0002"+
		"\u0001\u0000jk\u0005\"\u0000\u0000kl\u0006\u0005\uffff\uffff\u0000lz\u0001"+
		"\u0000\u0000\u0000mn\u0005\f\u0000\u0000no\u0005\u0010\u0000\u0000op\u0005"+
		"\u001f\u0000\u0000pq\u0003\f\u0006\u0000qr\u0005 \u0000\u0000rs\u0005"+
		"\'\u0000\u0000st\u0003\u0016\u000b\u0000tu\u0005!\u0000\u0000uv\u0003"+
		"\u0002\u0001\u0000vw\u0005\"\u0000\u0000wx\u0006\u0005\uffff\uffff\u0000"+
		"xz\u0001\u0000\u0000\u0000yc\u0001\u0000\u0000\u0000ym\u0001\u0000\u0000"+
		"\u0000z\u000b\u0001\u0000\u0000\u0000{|\u0006\u0006\uffff\uffff\u0000"+
		"|}\u0005\u0010\u0000\u0000}~\u0005#\u0000\u0000~\u007f\u0003\u0016\u000b"+
		"\u0000\u007f\u0080\u0006\u0006\uffff\uffff\u0000\u0080\u0083\u0001\u0000"+
		"\u0000\u0000\u0081\u0083\u0006\u0006\uffff\uffff\u0000\u0082{\u0001\u0000"+
		"\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u008d\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\n\u0003\u0000\u0000\u0085\u0086\u0005&\u0000"+
		"\u0000\u0086\u0087\u0005\u0010\u0000\u0000\u0087\u0088\u0005#\u0000\u0000"+
		"\u0088\u0089\u0003\u0016\u000b\u0000\u0089\u008a\u0006\u0006\uffff\uffff"+
		"\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0084\u0001\u0000\u0000"+
		"\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\r\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0010\u0000\u0000"+
		"\u0091\u0092\u0005\u0016\u0000\u0000\u0092\u0093\u0003\u0018\f\u0000\u0093"+
		"\u0094\u0006\u0007\uffff\uffff\u0000\u0094\u000f\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\u0007\u0000\u0000\u0096\u0097\u0005\u001f\u0000\u0000"+
		"\u0097\u0098\u0003\u0018\f\u0000\u0098\u0099\u0005 \u0000\u0000\u0099"+
		"\u009a\u0006\b\uffff\uffff\u0000\u009a\u0011\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005\b\u0000\u0000\u009c\u009d\u0003\u0018\f\u0000\u009d\u009e"+
		"\u0005!\u0000\u0000\u009e\u009f\u0003\u0002\u0001\u0000\u009f\u00a0\u0005"+
		"\"\u0000\u0000\u00a0\u00a1\u0006\t\uffff\uffff\u0000\u00a1\u0013\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0005\u000b\u0000\u0000\u00a3\u00a4\u0005"+
		"\u0010\u0000\u0000\u00a4\u00a5\u0005#\u0000\u0000\u00a5\u00a6\u0003\u0016"+
		"\u000b\u0000\u00a6\u00a7\u0005\u0016\u0000\u0000\u00a7\u00a8\u0003\u0018"+
		"\f\u0000\u00a8\u00a9\u0006\n\uffff\uffff\u0000\u00a9\u00b1\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005\u000b\u0000\u0000\u00ab\u00ac\u0005\u0010"+
		"\u0000\u0000\u00ac\u00ad\u0005\u0016\u0000\u0000\u00ad\u00ae\u0003\u0018"+
		"\f\u0000\u00ae\u00af\u0006\n\uffff\uffff\u0000\u00af\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b0\u00a2\u0001\u0000\u0000\u0000\u00b0\u00aa\u0001\u0000"+
		"\u0000\u0000\u00b1\u0015\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0001"+
		"\u0000\u0000\u00b3\u00be\u0006\u000b\uffff\uffff\u0000\u00b4\u00b5\u0005"+
		"\u0002\u0000\u0000\u00b5\u00be\u0006\u000b\uffff\uffff\u0000\u00b6\u00b7"+
		"\u0005\u0004\u0000\u0000\u00b7\u00be\u0006\u000b\uffff\uffff\u0000\u00b8"+
		"\u00b9\u0005\u0003\u0000\u0000\u00b9\u00be\u0006\u000b\uffff\uffff\u0000"+
		"\u00ba\u00bb\u0005$\u0000\u0000\u00bb\u00bc\u0005%\u0000\u0000\u00bc\u00be"+
		"\u0006\u000b\uffff\uffff\u0000\u00bd\u00b2\u0001\u0000\u0000\u0000\u00bd"+
		"\u00b4\u0001\u0000\u0000\u0000\u00bd\u00b6\u0001\u0000\u0000\u0000\u00bd"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000\u00be"+
		"\u0017\u0001\u0000\u0000\u0000\u00bf\u00c0\u0006\f\uffff\uffff\u0000\u00c0"+
		"\u00c1\u0003 \u0010\u0000\u00c1\u00c2\u0006\f\uffff\uffff\u0000\u00c2"+
		"\u00df\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0010\u0000\u0000\u00c4"+
		"\u00c5\u0005!\u0000\u0000\u00c5\u00c6\u0003$\u0012\u0000\u00c6\u00c7\u0005"+
		"\"\u0000\u0000\u00c7\u00c8\u0006\f\uffff\uffff\u0000\u00c8\u00df\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0005\u001f\u0000\u0000\u00ca\u00cb\u0003"+
		"\u0018\f\u0000\u00cb\u00cc\u0005 \u0000\u0000\u00cc\u00cd\u0006\f\uffff"+
		"\uffff\u0000\u00cd\u00df\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003\u001c"+
		"\u000e\u0000\u00cf\u00d0\u0006\f\uffff\uffff\u0000\u00d0\u00df\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005$\u0000\u0000\u00d2\u00d3\u0003\u001a\r"+
		"\u0000\u00d3\u00d4\u0005%\u0000\u0000\u00d4\u00d5\u0006\f\uffff\uffff"+
		"\u0000\u00d5\u00df\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u000e\u0000"+
		"\u0000\u00d7\u00df\u0006\f\uffff\uffff\u0000\u00d8\u00d9\u0005\u000f\u0000"+
		"\u0000\u00d9\u00df\u0006\f\uffff\uffff\u0000\u00da\u00db\u0005\u0005\u0000"+
		"\u0000\u00db\u00df\u0006\f\uffff\uffff\u0000\u00dc\u00dd\u0005\u0006\u0000"+
		"\u0000\u00dd\u00df\u0006\f\uffff\uffff\u0000\u00de\u00bf\u0001\u0000\u0000"+
		"\u0000\u00de\u00c3\u0001\u0000\u0000\u0000\u00de\u00c9\u0001\u0000\u0000"+
		"\u0000\u00de\u00ce\u0001\u0000\u0000\u0000\u00de\u00d1\u0001\u0000\u0000"+
		"\u0000\u00de\u00d6\u0001\u0000\u0000\u0000\u00de\u00d8\u0001\u0000\u0000"+
		"\u0000\u00de\u00da\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00df\u0105\u0001\u0000\u0000\u0000\u00e0\u00e1\n\u0010\u0000\u0000"+
		"\u00e1\u00e2\u0007\u0000\u0000\u0000\u00e2\u00e3\u0003\u0018\f\u0011\u00e3"+
		"\u00e4\u0006\f\uffff\uffff\u0000\u00e4\u0104\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\n\u000f\u0000\u0000\u00e6\u00e7\u0007\u0001\u0000\u0000\u00e7\u00e8"+
		"\u0003\u0018\f\u0010\u00e8\u00e9\u0006\f\uffff\uffff\u0000\u00e9\u0104"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\n\u000e\u0000\u0000\u00eb\u00ec\u0007"+
		"\u0002\u0000\u0000\u00ec\u00ed\u0003\u0018\f\u000f\u00ed\u00ee\u0006\f"+
		"\uffff\uffff\u0000\u00ee\u0104\u0001\u0000\u0000\u0000\u00ef\u00f0\n\r"+
		"\u0000\u0000\u00f0\u00f1\u0007\u0003\u0000\u0000\u00f1\u00f2\u0003\u0018"+
		"\f\u000e\u00f2\u00f3\u0006\f\uffff\uffff\u0000\u00f3\u0104\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\n\f\u0000\u0000\u00f5\u00f6\u0007\u0004\u0000"+
		"\u0000\u00f6\u00f7\u0003\u0018\f\r\u00f7\u00f8\u0006\f\uffff\uffff\u0000"+
		"\u00f8\u0104\u0001\u0000\u0000\u0000\u00f9\u00fa\n\u000b\u0000\u0000\u00fa"+
		"\u00fb\u0005\u0015\u0000\u0000\u00fb\u00fc\u0003\u0018\f\f\u00fc\u00fd"+
		"\u0006\f\uffff\uffff\u0000\u00fd\u0104\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\n\n\u0000\u0000\u00ff\u0100\u0005\u0014\u0000\u0000\u0100\u0101\u0003"+
		"\u0018\f\u000b\u0101\u0102\u0006\f\uffff\uffff\u0000\u0102\u0104\u0001"+
		"\u0000\u0000\u0000\u0103\u00e0\u0001\u0000\u0000\u0000\u0103\u00e5\u0001"+
		"\u0000\u0000\u0000\u0103\u00ea\u0001\u0000\u0000\u0000\u0103\u00ef\u0001"+
		"\u0000\u0000\u0000\u0103\u00f4\u0001\u0000\u0000\u0000\u0103\u00f9\u0001"+
		"\u0000\u0000\u0000\u0103\u00fe\u0001\u0000\u0000\u0000\u0104\u0107\u0001"+
		"\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001"+
		"\u0000\u0000\u0000\u0106\u0019\u0001\u0000\u0000\u0000\u0107\u0105\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0006\r\uffff\uffff\u0000\u0109\u010a\u0003"+
		"\u0018\f\u0000\u010a\u010b\u0006\r\uffff\uffff\u0000\u010b\u0113\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\n\u0002\u0000\u0000\u010d\u010e\u0005&"+
		"\u0000\u0000\u010e\u010f\u0003\u0018\f\u0000\u010f\u0110\u0006\r\uffff"+
		"\uffff\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u010c\u0001\u0000"+
		"\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u001b\u0001\u0000"+
		"\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0117\u0006\u000e"+
		"\uffff\uffff\u0000\u0117\u0118\u0005\u0010\u0000\u0000\u0118\u0119\u0006"+
		"\u000e\uffff\uffff\u0000\u0119\u0124\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\n\u0003\u0000\u0000\u011b\u011c\u0003\u001e\u000f\u0000\u011c\u011d\u0006"+
		"\u000e\uffff\uffff\u0000\u011d\u0123\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\n\u0002\u0000\u0000\u011f\u0120\u0005(\u0000\u0000\u0120\u0121\u0005"+
		"\u0010\u0000\u0000\u0121\u0123\u0006\u000e\uffff\uffff\u0000\u0122\u011a"+
		"\u0001\u0000\u0000\u0000\u0122\u011e\u0001\u0000\u0000\u0000\u0123\u0126"+
		"\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0001\u0000\u0000\u0000\u0125\u001d\u0001\u0000\u0000\u0000\u0126\u0124"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0006\u000f\uffff\uffff\u0000\u0128"+
		"\u0129\u0005$\u0000\u0000\u0129\u012a\u0003\u0018\f\u0000\u012a\u012b"+
		"\u0005%\u0000\u0000\u012b\u012c\u0006\u000f\uffff\uffff\u0000\u012c\u0135"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\n\u0002\u0000\u0000\u012e\u012f\u0005"+
		"$\u0000\u0000\u012f\u0130\u0003\u0018\f\u0000\u0130\u0131\u0005%\u0000"+
		"\u0000\u0131\u0132\u0006\u000f\uffff\uffff\u0000\u0132\u0134\u0001\u0000"+
		"\u0000\u0000\u0133\u012d\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000"+
		"\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000"+
		"\u0000\u0000\u0136\u001f\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0005\u0010\u0000\u0000\u0139\u013a\u0005\u001f"+
		"\u0000\u0000\u013a\u013b\u0003\"\u0011\u0000\u013b\u013c\u0005 \u0000"+
		"\u0000\u013c\u013d\u0006\u0010\uffff\uffff\u0000\u013d!\u0001\u0000\u0000"+
		"\u0000\u013e\u013f\u0006\u0011\uffff\uffff\u0000\u013f\u0140\u0003\u0018"+
		"\f\u0000\u0140\u0141\u0006\u0011\uffff\uffff\u0000\u0141\u0144\u0001\u0000"+
		"\u0000\u0000\u0142\u0144\u0006\u0011\uffff\uffff\u0000\u0143\u013e\u0001"+
		"\u0000\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u014c\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\n\u0003\u0000\u0000\u0146\u0147\u0005&"+
		"\u0000\u0000\u0147\u0148\u0003\u0018\f\u0000\u0148\u0149\u0006\u0011\uffff"+
		"\uffff\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a\u0145\u0001\u0000"+
		"\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d#\u0001\u0000\u0000"+
		"\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0150\u0006\u0012\uffff"+
		"\uffff\u0000\u0150\u0151\u0005\u0010\u0000\u0000\u0151\u0152\u0005#\u0000"+
		"\u0000\u0152\u0153\u0003\u0018\f\u0000\u0153\u0154\u0006\u0012\uffff\uffff"+
		"\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0157\u0006\u0012\uffff"+
		"\uffff\u0000\u0156\u014f\u0001\u0000\u0000\u0000\u0156\u0155\u0001\u0000"+
		"\u0000\u0000\u0157\u0161\u0001\u0000\u0000\u0000\u0158\u0159\n\u0003\u0000"+
		"\u0000\u0159\u015a\u0005&\u0000\u0000\u015a\u015b\u0005\u0010\u0000\u0000"+
		"\u015b\u015c\u0005#\u0000\u0000\u015c\u015d\u0003\u0018\f\u0000\u015d"+
		"\u015e\u0006\u0012\uffff\uffff\u0000\u015e\u0160\u0001\u0000\u0000\u0000"+
		"\u015f\u0158\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000"+
		"\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000"+
		"\u0162%\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0014"+
		"-CT`y\u0082\u008d\u00b0\u00bd\u00de\u0103\u0105\u0113\u0122\u0124\u0135"+
		"\u0143\u014c\u0156\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
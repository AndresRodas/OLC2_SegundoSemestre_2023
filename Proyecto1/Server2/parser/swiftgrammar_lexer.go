// Code generated from SwiftGrammar.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser

import (
	"fmt"
	"github.com/antlr4-go/antlr/v4"
	"sync"
	"unicode"
)

/* import "Server2/interfaces"
import "Server2/environment"
import "Server2/expressions"
import "Server2/instructions"
import "strings" */

// Suppress unused import error
var _ = fmt.Printf
var _ = sync.Once{}
var _ = unicode.IsLetter

type SwiftGrammarLexer struct {
	*antlr.BaseLexer
	channelNames []string
	modeNames    []string
	// TODO: EOF string
}

var SwiftGrammarLexerLexerStaticData struct {
	once                   sync.Once
	serializedATN          []int32
	ChannelNames           []string
	ModeNames              []string
	LiteralNames           []string
	SymbolicNames          []string
	RuleNames              []string
	PredictionContextCache *antlr.PredictionContextCache
	atn                    *antlr.ATN
	decisionToDFA          []*antlr.DFA
}

func swiftgrammarlexerLexerInit() {
	staticData := &SwiftGrammarLexerLexerStaticData
	staticData.ChannelNames = []string{
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN",
	}
	staticData.ModeNames = []string{
		"DEFAULT_MODE",
	}
	staticData.LiteralNames = []string{
		"", "'int'", "'float'", "'bool'", "'true'", "'false'", "'print'", "'if'",
		"'else'", "'while'", "", "", "", "'!='", "'=='", "'!'", "'||'", "'&&'",
		"'='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'('",
		"')'", "'{'", "'}'",
	}
	staticData.SymbolicNames = []string{
		"", "INT", "FLOAT", "BOOL", "TRU", "FAL", "PRINT", "IF", "ELSE", "WHILE",
		"NUMBER", "STRING", "ID", "DIF", "IG_IG", "NOT", "OR", "AND", "IG",
		"MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "PARIZQ",
		"PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE", "COMMENT", "LINE_COMMENT",
	}
	staticData.RuleNames = []string{
		"INT", "FLOAT", "BOOL", "TRU", "FAL", "PRINT", "IF", "ELSE", "WHILE",
		"NUMBER", "STRING", "ID", "DIF", "IG_IG", "NOT", "OR", "AND", "IG",
		"MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "PARIZQ",
		"PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE", "COMMENT", "LINE_COMMENT",
		"ESC_SEQ",
	}
	staticData.PredictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 0, 33, 221, 6, -1, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2,
		4, 7, 4, 2, 5, 7, 5, 2, 6, 7, 6, 2, 7, 7, 7, 2, 8, 7, 8, 2, 9, 7, 9, 2,
		10, 7, 10, 2, 11, 7, 11, 2, 12, 7, 12, 2, 13, 7, 13, 2, 14, 7, 14, 2, 15,
		7, 15, 2, 16, 7, 16, 2, 17, 7, 17, 2, 18, 7, 18, 2, 19, 7, 19, 2, 20, 7,
		20, 2, 21, 7, 21, 2, 22, 7, 22, 2, 23, 7, 23, 2, 24, 7, 24, 2, 25, 7, 25,
		2, 26, 7, 26, 2, 27, 7, 27, 2, 28, 7, 28, 2, 29, 7, 29, 2, 30, 7, 30, 2,
		31, 7, 31, 2, 32, 7, 32, 2, 33, 7, 33, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1,
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 3, 1, 3, 1,
		3, 1, 3, 1, 3, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 5, 1, 5, 1, 5, 1,
		5, 1, 5, 1, 5, 1, 6, 1, 6, 1, 6, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 8, 1,
		8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 9, 4, 9, 117, 8, 9, 11, 9, 12, 9, 118, 1,
		9, 1, 9, 4, 9, 123, 8, 9, 11, 9, 12, 9, 124, 3, 9, 127, 8, 9, 1, 10, 1,
		10, 5, 10, 131, 8, 10, 10, 10, 12, 10, 134, 9, 10, 1, 10, 1, 10, 1, 11,
		1, 11, 5, 11, 140, 8, 11, 10, 11, 12, 11, 143, 9, 11, 1, 12, 1, 12, 1,
		12, 1, 13, 1, 13, 1, 13, 1, 14, 1, 14, 1, 15, 1, 15, 1, 15, 1, 16, 1, 16,
		1, 16, 1, 17, 1, 17, 1, 18, 1, 18, 1, 18, 1, 19, 1, 19, 1, 19, 1, 20, 1,
		20, 1, 21, 1, 21, 1, 22, 1, 22, 1, 23, 1, 23, 1, 24, 1, 24, 1, 25, 1, 25,
		1, 26, 1, 26, 1, 27, 1, 27, 1, 28, 1, 28, 1, 29, 1, 29, 1, 30, 4, 30, 188,
		8, 30, 11, 30, 12, 30, 189, 1, 30, 1, 30, 1, 31, 1, 31, 1, 31, 1, 31, 5,
		31, 198, 8, 31, 10, 31, 12, 31, 201, 9, 31, 1, 31, 1, 31, 1, 31, 1, 31,
		1, 31, 1, 32, 1, 32, 1, 32, 1, 32, 5, 32, 212, 8, 32, 10, 32, 12, 32, 215,
		9, 32, 1, 32, 1, 32, 1, 33, 1, 33, 1, 33, 1, 199, 0, 34, 1, 1, 3, 2, 5,
		3, 7, 4, 9, 5, 11, 6, 13, 7, 15, 8, 17, 9, 19, 10, 21, 11, 23, 12, 25,
		13, 27, 14, 29, 15, 31, 16, 33, 17, 35, 18, 37, 19, 39, 20, 41, 21, 43,
		22, 45, 23, 47, 24, 49, 25, 51, 26, 53, 27, 55, 28, 57, 29, 59, 30, 61,
		31, 63, 32, 65, 33, 67, 0, 1, 0, 7, 1, 0, 48, 57, 1, 0, 34, 34, 2, 0, 65,
		90, 97, 122, 4, 0, 48, 57, 65, 90, 95, 95, 97, 122, 4, 0, 9, 10, 13, 13,
		32, 32, 92, 92, 2, 0, 10, 10, 13, 13, 7, 0, 32, 33, 35, 35, 43, 43, 45,
		46, 58, 58, 64, 64, 91, 93, 227, 0, 1, 1, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0,
		5, 1, 0, 0, 0, 0, 7, 1, 0, 0, 0, 0, 9, 1, 0, 0, 0, 0, 11, 1, 0, 0, 0, 0,
		13, 1, 0, 0, 0, 0, 15, 1, 0, 0, 0, 0, 17, 1, 0, 0, 0, 0, 19, 1, 0, 0, 0,
		0, 21, 1, 0, 0, 0, 0, 23, 1, 0, 0, 0, 0, 25, 1, 0, 0, 0, 0, 27, 1, 0, 0,
		0, 0, 29, 1, 0, 0, 0, 0, 31, 1, 0, 0, 0, 0, 33, 1, 0, 0, 0, 0, 35, 1, 0,
		0, 0, 0, 37, 1, 0, 0, 0, 0, 39, 1, 0, 0, 0, 0, 41, 1, 0, 0, 0, 0, 43, 1,
		0, 0, 0, 0, 45, 1, 0, 0, 0, 0, 47, 1, 0, 0, 0, 0, 49, 1, 0, 0, 0, 0, 51,
		1, 0, 0, 0, 0, 53, 1, 0, 0, 0, 0, 55, 1, 0, 0, 0, 0, 57, 1, 0, 0, 0, 0,
		59, 1, 0, 0, 0, 0, 61, 1, 0, 0, 0, 0, 63, 1, 0, 0, 0, 0, 65, 1, 0, 0, 0,
		1, 69, 1, 0, 0, 0, 3, 73, 1, 0, 0, 0, 5, 79, 1, 0, 0, 0, 7, 84, 1, 0, 0,
		0, 9, 89, 1, 0, 0, 0, 11, 95, 1, 0, 0, 0, 13, 101, 1, 0, 0, 0, 15, 104,
		1, 0, 0, 0, 17, 109, 1, 0, 0, 0, 19, 116, 1, 0, 0, 0, 21, 128, 1, 0, 0,
		0, 23, 137, 1, 0, 0, 0, 25, 144, 1, 0, 0, 0, 27, 147, 1, 0, 0, 0, 29, 150,
		1, 0, 0, 0, 31, 152, 1, 0, 0, 0, 33, 155, 1, 0, 0, 0, 35, 158, 1, 0, 0,
		0, 37, 160, 1, 0, 0, 0, 39, 163, 1, 0, 0, 0, 41, 166, 1, 0, 0, 0, 43, 168,
		1, 0, 0, 0, 45, 170, 1, 0, 0, 0, 47, 172, 1, 0, 0, 0, 49, 174, 1, 0, 0,
		0, 51, 176, 1, 0, 0, 0, 53, 178, 1, 0, 0, 0, 55, 180, 1, 0, 0, 0, 57, 182,
		1, 0, 0, 0, 59, 184, 1, 0, 0, 0, 61, 187, 1, 0, 0, 0, 63, 193, 1, 0, 0,
		0, 65, 207, 1, 0, 0, 0, 67, 218, 1, 0, 0, 0, 69, 70, 5, 105, 0, 0, 70,
		71, 5, 110, 0, 0, 71, 72, 5, 116, 0, 0, 72, 2, 1, 0, 0, 0, 73, 74, 5, 102,
		0, 0, 74, 75, 5, 108, 0, 0, 75, 76, 5, 111, 0, 0, 76, 77, 5, 97, 0, 0,
		77, 78, 5, 116, 0, 0, 78, 4, 1, 0, 0, 0, 79, 80, 5, 98, 0, 0, 80, 81, 5,
		111, 0, 0, 81, 82, 5, 111, 0, 0, 82, 83, 5, 108, 0, 0, 83, 6, 1, 0, 0,
		0, 84, 85, 5, 116, 0, 0, 85, 86, 5, 114, 0, 0, 86, 87, 5, 117, 0, 0, 87,
		88, 5, 101, 0, 0, 88, 8, 1, 0, 0, 0, 89, 90, 5, 102, 0, 0, 90, 91, 5, 97,
		0, 0, 91, 92, 5, 108, 0, 0, 92, 93, 5, 115, 0, 0, 93, 94, 5, 101, 0, 0,
		94, 10, 1, 0, 0, 0, 95, 96, 5, 112, 0, 0, 96, 97, 5, 114, 0, 0, 97, 98,
		5, 105, 0, 0, 98, 99, 5, 110, 0, 0, 99, 100, 5, 116, 0, 0, 100, 12, 1,
		0, 0, 0, 101, 102, 5, 105, 0, 0, 102, 103, 5, 102, 0, 0, 103, 14, 1, 0,
		0, 0, 104, 105, 5, 101, 0, 0, 105, 106, 5, 108, 0, 0, 106, 107, 5, 115,
		0, 0, 107, 108, 5, 101, 0, 0, 108, 16, 1, 0, 0, 0, 109, 110, 5, 119, 0,
		0, 110, 111, 5, 104, 0, 0, 111, 112, 5, 105, 0, 0, 112, 113, 5, 108, 0,
		0, 113, 114, 5, 101, 0, 0, 114, 18, 1, 0, 0, 0, 115, 117, 7, 0, 0, 0, 116,
		115, 1, 0, 0, 0, 117, 118, 1, 0, 0, 0, 118, 116, 1, 0, 0, 0, 118, 119,
		1, 0, 0, 0, 119, 126, 1, 0, 0, 0, 120, 122, 5, 46, 0, 0, 121, 123, 7, 0,
		0, 0, 122, 121, 1, 0, 0, 0, 123, 124, 1, 0, 0, 0, 124, 122, 1, 0, 0, 0,
		124, 125, 1, 0, 0, 0, 125, 127, 1, 0, 0, 0, 126, 120, 1, 0, 0, 0, 126,
		127, 1, 0, 0, 0, 127, 20, 1, 0, 0, 0, 128, 132, 5, 34, 0, 0, 129, 131,
		8, 1, 0, 0, 130, 129, 1, 0, 0, 0, 131, 134, 1, 0, 0, 0, 132, 130, 1, 0,
		0, 0, 132, 133, 1, 0, 0, 0, 133, 135, 1, 0, 0, 0, 134, 132, 1, 0, 0, 0,
		135, 136, 5, 34, 0, 0, 136, 22, 1, 0, 0, 0, 137, 141, 7, 2, 0, 0, 138,
		140, 7, 3, 0, 0, 139, 138, 1, 0, 0, 0, 140, 143, 1, 0, 0, 0, 141, 139,
		1, 0, 0, 0, 141, 142, 1, 0, 0, 0, 142, 24, 1, 0, 0, 0, 143, 141, 1, 0,
		0, 0, 144, 145, 5, 33, 0, 0, 145, 146, 5, 61, 0, 0, 146, 26, 1, 0, 0, 0,
		147, 148, 5, 61, 0, 0, 148, 149, 5, 61, 0, 0, 149, 28, 1, 0, 0, 0, 150,
		151, 5, 33, 0, 0, 151, 30, 1, 0, 0, 0, 152, 153, 5, 124, 0, 0, 153, 154,
		5, 124, 0, 0, 154, 32, 1, 0, 0, 0, 155, 156, 5, 38, 0, 0, 156, 157, 5,
		38, 0, 0, 157, 34, 1, 0, 0, 0, 158, 159, 5, 61, 0, 0, 159, 36, 1, 0, 0,
		0, 160, 161, 5, 62, 0, 0, 161, 162, 5, 61, 0, 0, 162, 38, 1, 0, 0, 0, 163,
		164, 5, 60, 0, 0, 164, 165, 5, 61, 0, 0, 165, 40, 1, 0, 0, 0, 166, 167,
		5, 62, 0, 0, 167, 42, 1, 0, 0, 0, 168, 169, 5, 60, 0, 0, 169, 44, 1, 0,
		0, 0, 170, 171, 5, 42, 0, 0, 171, 46, 1, 0, 0, 0, 172, 173, 5, 47, 0, 0,
		173, 48, 1, 0, 0, 0, 174, 175, 5, 43, 0, 0, 175, 50, 1, 0, 0, 0, 176, 177,
		5, 45, 0, 0, 177, 52, 1, 0, 0, 0, 178, 179, 5, 40, 0, 0, 179, 54, 1, 0,
		0, 0, 180, 181, 5, 41, 0, 0, 181, 56, 1, 0, 0, 0, 182, 183, 5, 123, 0,
		0, 183, 58, 1, 0, 0, 0, 184, 185, 5, 125, 0, 0, 185, 60, 1, 0, 0, 0, 186,
		188, 7, 4, 0, 0, 187, 186, 1, 0, 0, 0, 188, 189, 1, 0, 0, 0, 189, 187,
		1, 0, 0, 0, 189, 190, 1, 0, 0, 0, 190, 191, 1, 0, 0, 0, 191, 192, 6, 30,
		0, 0, 192, 62, 1, 0, 0, 0, 193, 194, 5, 47, 0, 0, 194, 195, 5, 42, 0, 0,
		195, 199, 1, 0, 0, 0, 196, 198, 9, 0, 0, 0, 197, 196, 1, 0, 0, 0, 198,
		201, 1, 0, 0, 0, 199, 200, 1, 0, 0, 0, 199, 197, 1, 0, 0, 0, 200, 202,
		1, 0, 0, 0, 201, 199, 1, 0, 0, 0, 202, 203, 5, 42, 0, 0, 203, 204, 5, 47,
		0, 0, 204, 205, 1, 0, 0, 0, 205, 206, 6, 31, 0, 0, 206, 64, 1, 0, 0, 0,
		207, 208, 5, 47, 0, 0, 208, 209, 5, 47, 0, 0, 209, 213, 1, 0, 0, 0, 210,
		212, 8, 5, 0, 0, 211, 210, 1, 0, 0, 0, 212, 215, 1, 0, 0, 0, 213, 211,
		1, 0, 0, 0, 213, 214, 1, 0, 0, 0, 214, 216, 1, 0, 0, 0, 215, 213, 1, 0,
		0, 0, 216, 217, 6, 32, 0, 0, 217, 66, 1, 0, 0, 0, 218, 219, 5, 92, 0, 0,
		219, 220, 7, 6, 0, 0, 220, 68, 1, 0, 0, 0, 9, 0, 118, 124, 126, 132, 141,
		189, 199, 213, 1, 6, 0, 0,
	}
	deserializer := antlr.NewATNDeserializer(nil)
	staticData.atn = deserializer.Deserialize(staticData.serializedATN)
	atn := staticData.atn
	staticData.decisionToDFA = make([]*antlr.DFA, len(atn.DecisionToState))
	decisionToDFA := staticData.decisionToDFA
	for index, state := range atn.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(state, index)
	}
}

// SwiftGrammarLexerInit initializes any static state used to implement SwiftGrammarLexer. By default the
// static state used to implement the lexer is lazily initialized during the first call to
// NewSwiftGrammarLexer(). You can call this function if you wish to initialize the static state ahead
// of time.
func SwiftGrammarLexerInit() {
	staticData := &SwiftGrammarLexerLexerStaticData
	staticData.once.Do(swiftgrammarlexerLexerInit)
}

// NewSwiftGrammarLexer produces a new lexer instance for the optional input antlr.CharStream.
func NewSwiftGrammarLexer(input antlr.CharStream) *SwiftGrammarLexer {
	SwiftGrammarLexerInit()
	l := new(SwiftGrammarLexer)
	l.BaseLexer = antlr.NewBaseLexer(input)
	staticData := &SwiftGrammarLexerLexerStaticData
	l.Interpreter = antlr.NewLexerATNSimulator(l, staticData.atn, staticData.decisionToDFA, staticData.PredictionContextCache)
	l.channelNames = staticData.ChannelNames
	l.modeNames = staticData.ModeNames
	l.RuleNames = staticData.RuleNames
	l.LiteralNames = staticData.LiteralNames
	l.SymbolicNames = staticData.SymbolicNames
	l.GrammarFileName = "SwiftGrammar.g4"
	// TODO: l.EOF = antlr.TokenEOF

	return l
}

// SwiftGrammarLexer tokens.
const (
	SwiftGrammarLexerINT          = 1
	SwiftGrammarLexerFLOAT        = 2
	SwiftGrammarLexerBOOL         = 3
	SwiftGrammarLexerTRU          = 4
	SwiftGrammarLexerFAL          = 5
	SwiftGrammarLexerPRINT        = 6
	SwiftGrammarLexerIF           = 7
	SwiftGrammarLexerELSE         = 8
	SwiftGrammarLexerWHILE        = 9
	SwiftGrammarLexerNUMBER       = 10
	SwiftGrammarLexerSTRING       = 11
	SwiftGrammarLexerID           = 12
	SwiftGrammarLexerDIF          = 13
	SwiftGrammarLexerIG_IG        = 14
	SwiftGrammarLexerNOT          = 15
	SwiftGrammarLexerOR           = 16
	SwiftGrammarLexerAND          = 17
	SwiftGrammarLexerIG           = 18
	SwiftGrammarLexerMAY_IG       = 19
	SwiftGrammarLexerMEN_IG       = 20
	SwiftGrammarLexerMAYOR        = 21
	SwiftGrammarLexerMENOR        = 22
	SwiftGrammarLexerMUL          = 23
	SwiftGrammarLexerDIV          = 24
	SwiftGrammarLexerADD          = 25
	SwiftGrammarLexerSUB          = 26
	SwiftGrammarLexerPARIZQ       = 27
	SwiftGrammarLexerPARDER       = 28
	SwiftGrammarLexerLLAVEIZQ     = 29
	SwiftGrammarLexerLLAVEDER     = 30
	SwiftGrammarLexerWHITESPACE   = 31
	SwiftGrammarLexerCOMMENT      = 32
	SwiftGrammarLexerLINE_COMMENT = 33
)

// Code generated from SwiftLexer.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser

import (
	"fmt"
	"github.com/antlr4-go/antlr/v4"
	"sync"
	"unicode"
)

// Suppress unused import error
var _ = fmt.Printf
var _ = sync.Once{}
var _ = unicode.IsLetter

type SwiftLexer struct {
	*antlr.BaseLexer
	channelNames []string
	modeNames    []string
	// TODO: EOF string
}

var SwiftLexerLexerStaticData struct {
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

func swiftlexerLexerInit() {
	staticData := &SwiftLexerLexerStaticData
	staticData.ChannelNames = []string{
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN",
	}
	staticData.ModeNames = []string{
		"DEFAULT_MODE",
	}
	staticData.LiteralNames = []string{
		"", "'Int'", "'Float'", "'Bool'", "'String'", "'true'", "'false'", "'print'",
		"'if'", "'else'", "'while'", "'var'", "", "", "", "'!='", "'=='", "'!'",
		"'||'", "'&&'", "'='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'",
		"'-'", "'('", "')'", "'{'", "'}'", "':'", "'['", "']'", "','",
	}
	staticData.SymbolicNames = []string{
		"", "INT", "FLOAT", "BOOL", "STR", "TRU", "FAL", "PRINT", "IF", "ELSE",
		"WHILE", "VAR", "NUMBER", "STRING", "ID", "DIF", "IG_IG", "NOT", "OR",
		"AND", "IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MUL", "DIV", "ADD",
		"SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "D_PTS", "CORIZQ",
		"CORDER", "COMA", "WHITESPACE", "COMMENT", "LINE_COMMENT",
	}
	staticData.RuleNames = []string{
		"INT", "FLOAT", "BOOL", "STR", "TRU", "FAL", "PRINT", "IF", "ELSE",
		"WHILE", "VAR", "NUMBER", "STRING", "ID", "DIF", "IG_IG", "NOT", "OR",
		"AND", "IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MUL", "DIV", "ADD",
		"SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "D_PTS", "CORIZQ",
		"CORDER", "COMA", "WHITESPACE", "COMMENT", "LINE_COMMENT", "ESC_SEQ",
	}
	staticData.PredictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 0, 39, 252, 6, -1, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2,
		4, 7, 4, 2, 5, 7, 5, 2, 6, 7, 6, 2, 7, 7, 7, 2, 8, 7, 8, 2, 9, 7, 9, 2,
		10, 7, 10, 2, 11, 7, 11, 2, 12, 7, 12, 2, 13, 7, 13, 2, 14, 7, 14, 2, 15,
		7, 15, 2, 16, 7, 16, 2, 17, 7, 17, 2, 18, 7, 18, 2, 19, 7, 19, 2, 20, 7,
		20, 2, 21, 7, 21, 2, 22, 7, 22, 2, 23, 7, 23, 2, 24, 7, 24, 2, 25, 7, 25,
		2, 26, 7, 26, 2, 27, 7, 27, 2, 28, 7, 28, 2, 29, 7, 29, 2, 30, 7, 30, 2,
		31, 7, 31, 2, 32, 7, 32, 2, 33, 7, 33, 2, 34, 7, 34, 2, 35, 7, 35, 2, 36,
		7, 36, 2, 37, 7, 37, 2, 38, 7, 38, 2, 39, 7, 39, 1, 0, 1, 0, 1, 0, 1, 0,
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 3,
		1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 5,
		1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 7,
		1, 7, 1, 7, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9,
		1, 9, 1, 10, 1, 10, 1, 10, 1, 10, 1, 11, 4, 11, 140, 8, 11, 11, 11, 12,
		11, 141, 1, 11, 1, 11, 4, 11, 146, 8, 11, 11, 11, 12, 11, 147, 3, 11, 150,
		8, 11, 1, 12, 1, 12, 5, 12, 154, 8, 12, 10, 12, 12, 12, 157, 9, 12, 1,
		12, 1, 12, 1, 13, 1, 13, 5, 13, 163, 8, 13, 10, 13, 12, 13, 166, 9, 13,
		1, 14, 1, 14, 1, 14, 1, 15, 1, 15, 1, 15, 1, 16, 1, 16, 1, 17, 1, 17, 1,
		17, 1, 18, 1, 18, 1, 18, 1, 19, 1, 19, 1, 20, 1, 20, 1, 20, 1, 21, 1, 21,
		1, 21, 1, 22, 1, 22, 1, 23, 1, 23, 1, 24, 1, 24, 1, 25, 1, 25, 1, 26, 1,
		26, 1, 27, 1, 27, 1, 28, 1, 28, 1, 29, 1, 29, 1, 30, 1, 30, 1, 31, 1, 31,
		1, 32, 1, 32, 1, 33, 1, 33, 1, 34, 1, 34, 1, 35, 1, 35, 1, 36, 4, 36, 219,
		8, 36, 11, 36, 12, 36, 220, 1, 36, 1, 36, 1, 37, 1, 37, 1, 37, 1, 37, 5,
		37, 229, 8, 37, 10, 37, 12, 37, 232, 9, 37, 1, 37, 1, 37, 1, 37, 1, 37,
		1, 37, 1, 38, 1, 38, 1, 38, 1, 38, 5, 38, 243, 8, 38, 10, 38, 12, 38, 246,
		9, 38, 1, 38, 1, 38, 1, 39, 1, 39, 1, 39, 1, 230, 0, 40, 1, 1, 3, 2, 5,
		3, 7, 4, 9, 5, 11, 6, 13, 7, 15, 8, 17, 9, 19, 10, 21, 11, 23, 12, 25,
		13, 27, 14, 29, 15, 31, 16, 33, 17, 35, 18, 37, 19, 39, 20, 41, 21, 43,
		22, 45, 23, 47, 24, 49, 25, 51, 26, 53, 27, 55, 28, 57, 29, 59, 30, 61,
		31, 63, 32, 65, 33, 67, 34, 69, 35, 71, 36, 73, 37, 75, 38, 77, 39, 79,
		0, 1, 0, 7, 1, 0, 48, 57, 1, 0, 34, 34, 2, 0, 65, 90, 97, 122, 4, 0, 48,
		57, 65, 90, 95, 95, 97, 122, 4, 0, 9, 10, 13, 13, 32, 32, 92, 92, 2, 0,
		10, 10, 13, 13, 7, 0, 32, 33, 35, 35, 43, 43, 45, 46, 58, 58, 64, 64, 91,
		93, 258, 0, 1, 1, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 5, 1, 0, 0, 0, 0, 7, 1,
		0, 0, 0, 0, 9, 1, 0, 0, 0, 0, 11, 1, 0, 0, 0, 0, 13, 1, 0, 0, 0, 0, 15,
		1, 0, 0, 0, 0, 17, 1, 0, 0, 0, 0, 19, 1, 0, 0, 0, 0, 21, 1, 0, 0, 0, 0,
		23, 1, 0, 0, 0, 0, 25, 1, 0, 0, 0, 0, 27, 1, 0, 0, 0, 0, 29, 1, 0, 0, 0,
		0, 31, 1, 0, 0, 0, 0, 33, 1, 0, 0, 0, 0, 35, 1, 0, 0, 0, 0, 37, 1, 0, 0,
		0, 0, 39, 1, 0, 0, 0, 0, 41, 1, 0, 0, 0, 0, 43, 1, 0, 0, 0, 0, 45, 1, 0,
		0, 0, 0, 47, 1, 0, 0, 0, 0, 49, 1, 0, 0, 0, 0, 51, 1, 0, 0, 0, 0, 53, 1,
		0, 0, 0, 0, 55, 1, 0, 0, 0, 0, 57, 1, 0, 0, 0, 0, 59, 1, 0, 0, 0, 0, 61,
		1, 0, 0, 0, 0, 63, 1, 0, 0, 0, 0, 65, 1, 0, 0, 0, 0, 67, 1, 0, 0, 0, 0,
		69, 1, 0, 0, 0, 0, 71, 1, 0, 0, 0, 0, 73, 1, 0, 0, 0, 0, 75, 1, 0, 0, 0,
		0, 77, 1, 0, 0, 0, 1, 81, 1, 0, 0, 0, 3, 85, 1, 0, 0, 0, 5, 91, 1, 0, 0,
		0, 7, 96, 1, 0, 0, 0, 9, 103, 1, 0, 0, 0, 11, 108, 1, 0, 0, 0, 13, 114,
		1, 0, 0, 0, 15, 120, 1, 0, 0, 0, 17, 123, 1, 0, 0, 0, 19, 128, 1, 0, 0,
		0, 21, 134, 1, 0, 0, 0, 23, 139, 1, 0, 0, 0, 25, 151, 1, 0, 0, 0, 27, 160,
		1, 0, 0, 0, 29, 167, 1, 0, 0, 0, 31, 170, 1, 0, 0, 0, 33, 173, 1, 0, 0,
		0, 35, 175, 1, 0, 0, 0, 37, 178, 1, 0, 0, 0, 39, 181, 1, 0, 0, 0, 41, 183,
		1, 0, 0, 0, 43, 186, 1, 0, 0, 0, 45, 189, 1, 0, 0, 0, 47, 191, 1, 0, 0,
		0, 49, 193, 1, 0, 0, 0, 51, 195, 1, 0, 0, 0, 53, 197, 1, 0, 0, 0, 55, 199,
		1, 0, 0, 0, 57, 201, 1, 0, 0, 0, 59, 203, 1, 0, 0, 0, 61, 205, 1, 0, 0,
		0, 63, 207, 1, 0, 0, 0, 65, 209, 1, 0, 0, 0, 67, 211, 1, 0, 0, 0, 69, 213,
		1, 0, 0, 0, 71, 215, 1, 0, 0, 0, 73, 218, 1, 0, 0, 0, 75, 224, 1, 0, 0,
		0, 77, 238, 1, 0, 0, 0, 79, 249, 1, 0, 0, 0, 81, 82, 5, 73, 0, 0, 82, 83,
		5, 110, 0, 0, 83, 84, 5, 116, 0, 0, 84, 2, 1, 0, 0, 0, 85, 86, 5, 70, 0,
		0, 86, 87, 5, 108, 0, 0, 87, 88, 5, 111, 0, 0, 88, 89, 5, 97, 0, 0, 89,
		90, 5, 116, 0, 0, 90, 4, 1, 0, 0, 0, 91, 92, 5, 66, 0, 0, 92, 93, 5, 111,
		0, 0, 93, 94, 5, 111, 0, 0, 94, 95, 5, 108, 0, 0, 95, 6, 1, 0, 0, 0, 96,
		97, 5, 83, 0, 0, 97, 98, 5, 116, 0, 0, 98, 99, 5, 114, 0, 0, 99, 100, 5,
		105, 0, 0, 100, 101, 5, 110, 0, 0, 101, 102, 5, 103, 0, 0, 102, 8, 1, 0,
		0, 0, 103, 104, 5, 116, 0, 0, 104, 105, 5, 114, 0, 0, 105, 106, 5, 117,
		0, 0, 106, 107, 5, 101, 0, 0, 107, 10, 1, 0, 0, 0, 108, 109, 5, 102, 0,
		0, 109, 110, 5, 97, 0, 0, 110, 111, 5, 108, 0, 0, 111, 112, 5, 115, 0,
		0, 112, 113, 5, 101, 0, 0, 113, 12, 1, 0, 0, 0, 114, 115, 5, 112, 0, 0,
		115, 116, 5, 114, 0, 0, 116, 117, 5, 105, 0, 0, 117, 118, 5, 110, 0, 0,
		118, 119, 5, 116, 0, 0, 119, 14, 1, 0, 0, 0, 120, 121, 5, 105, 0, 0, 121,
		122, 5, 102, 0, 0, 122, 16, 1, 0, 0, 0, 123, 124, 5, 101, 0, 0, 124, 125,
		5, 108, 0, 0, 125, 126, 5, 115, 0, 0, 126, 127, 5, 101, 0, 0, 127, 18,
		1, 0, 0, 0, 128, 129, 5, 119, 0, 0, 129, 130, 5, 104, 0, 0, 130, 131, 5,
		105, 0, 0, 131, 132, 5, 108, 0, 0, 132, 133, 5, 101, 0, 0, 133, 20, 1,
		0, 0, 0, 134, 135, 5, 118, 0, 0, 135, 136, 5, 97, 0, 0, 136, 137, 5, 114,
		0, 0, 137, 22, 1, 0, 0, 0, 138, 140, 7, 0, 0, 0, 139, 138, 1, 0, 0, 0,
		140, 141, 1, 0, 0, 0, 141, 139, 1, 0, 0, 0, 141, 142, 1, 0, 0, 0, 142,
		149, 1, 0, 0, 0, 143, 145, 5, 46, 0, 0, 144, 146, 7, 0, 0, 0, 145, 144,
		1, 0, 0, 0, 146, 147, 1, 0, 0, 0, 147, 145, 1, 0, 0, 0, 147, 148, 1, 0,
		0, 0, 148, 150, 1, 0, 0, 0, 149, 143, 1, 0, 0, 0, 149, 150, 1, 0, 0, 0,
		150, 24, 1, 0, 0, 0, 151, 155, 5, 34, 0, 0, 152, 154, 8, 1, 0, 0, 153,
		152, 1, 0, 0, 0, 154, 157, 1, 0, 0, 0, 155, 153, 1, 0, 0, 0, 155, 156,
		1, 0, 0, 0, 156, 158, 1, 0, 0, 0, 157, 155, 1, 0, 0, 0, 158, 159, 5, 34,
		0, 0, 159, 26, 1, 0, 0, 0, 160, 164, 7, 2, 0, 0, 161, 163, 7, 3, 0, 0,
		162, 161, 1, 0, 0, 0, 163, 166, 1, 0, 0, 0, 164, 162, 1, 0, 0, 0, 164,
		165, 1, 0, 0, 0, 165, 28, 1, 0, 0, 0, 166, 164, 1, 0, 0, 0, 167, 168, 5,
		33, 0, 0, 168, 169, 5, 61, 0, 0, 169, 30, 1, 0, 0, 0, 170, 171, 5, 61,
		0, 0, 171, 172, 5, 61, 0, 0, 172, 32, 1, 0, 0, 0, 173, 174, 5, 33, 0, 0,
		174, 34, 1, 0, 0, 0, 175, 176, 5, 124, 0, 0, 176, 177, 5, 124, 0, 0, 177,
		36, 1, 0, 0, 0, 178, 179, 5, 38, 0, 0, 179, 180, 5, 38, 0, 0, 180, 38,
		1, 0, 0, 0, 181, 182, 5, 61, 0, 0, 182, 40, 1, 0, 0, 0, 183, 184, 5, 62,
		0, 0, 184, 185, 5, 61, 0, 0, 185, 42, 1, 0, 0, 0, 186, 187, 5, 60, 0, 0,
		187, 188, 5, 61, 0, 0, 188, 44, 1, 0, 0, 0, 189, 190, 5, 62, 0, 0, 190,
		46, 1, 0, 0, 0, 191, 192, 5, 60, 0, 0, 192, 48, 1, 0, 0, 0, 193, 194, 5,
		42, 0, 0, 194, 50, 1, 0, 0, 0, 195, 196, 5, 47, 0, 0, 196, 52, 1, 0, 0,
		0, 197, 198, 5, 43, 0, 0, 198, 54, 1, 0, 0, 0, 199, 200, 5, 45, 0, 0, 200,
		56, 1, 0, 0, 0, 201, 202, 5, 40, 0, 0, 202, 58, 1, 0, 0, 0, 203, 204, 5,
		41, 0, 0, 204, 60, 1, 0, 0, 0, 205, 206, 5, 123, 0, 0, 206, 62, 1, 0, 0,
		0, 207, 208, 5, 125, 0, 0, 208, 64, 1, 0, 0, 0, 209, 210, 5, 58, 0, 0,
		210, 66, 1, 0, 0, 0, 211, 212, 5, 91, 0, 0, 212, 68, 1, 0, 0, 0, 213, 214,
		5, 93, 0, 0, 214, 70, 1, 0, 0, 0, 215, 216, 5, 44, 0, 0, 216, 72, 1, 0,
		0, 0, 217, 219, 7, 4, 0, 0, 218, 217, 1, 0, 0, 0, 219, 220, 1, 0, 0, 0,
		220, 218, 1, 0, 0, 0, 220, 221, 1, 0, 0, 0, 221, 222, 1, 0, 0, 0, 222,
		223, 6, 36, 0, 0, 223, 74, 1, 0, 0, 0, 224, 225, 5, 47, 0, 0, 225, 226,
		5, 42, 0, 0, 226, 230, 1, 0, 0, 0, 227, 229, 9, 0, 0, 0, 228, 227, 1, 0,
		0, 0, 229, 232, 1, 0, 0, 0, 230, 231, 1, 0, 0, 0, 230, 228, 1, 0, 0, 0,
		231, 233, 1, 0, 0, 0, 232, 230, 1, 0, 0, 0, 233, 234, 5, 42, 0, 0, 234,
		235, 5, 47, 0, 0, 235, 236, 1, 0, 0, 0, 236, 237, 6, 37, 0, 0, 237, 76,
		1, 0, 0, 0, 238, 239, 5, 47, 0, 0, 239, 240, 5, 47, 0, 0, 240, 244, 1,
		0, 0, 0, 241, 243, 8, 5, 0, 0, 242, 241, 1, 0, 0, 0, 243, 246, 1, 0, 0,
		0, 244, 242, 1, 0, 0, 0, 244, 245, 1, 0, 0, 0, 245, 247, 1, 0, 0, 0, 246,
		244, 1, 0, 0, 0, 247, 248, 6, 38, 0, 0, 248, 78, 1, 0, 0, 0, 249, 250,
		5, 92, 0, 0, 250, 251, 7, 6, 0, 0, 251, 80, 1, 0, 0, 0, 9, 0, 141, 147,
		149, 155, 164, 220, 230, 244, 1, 6, 0, 0,
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

// SwiftLexerInit initializes any static state used to implement SwiftLexer. By default the
// static state used to implement the lexer is lazily initialized during the first call to
// NewSwiftLexer(). You can call this function if you wish to initialize the static state ahead
// of time.
func SwiftLexerInit() {
	staticData := &SwiftLexerLexerStaticData
	staticData.once.Do(swiftlexerLexerInit)
}

// NewSwiftLexer produces a new lexer instance for the optional input antlr.CharStream.
func NewSwiftLexer(input antlr.CharStream) *SwiftLexer {
	SwiftLexerInit()
	l := new(SwiftLexer)
	l.BaseLexer = antlr.NewBaseLexer(input)
	staticData := &SwiftLexerLexerStaticData
	l.Interpreter = antlr.NewLexerATNSimulator(l, staticData.atn, staticData.decisionToDFA, staticData.PredictionContextCache)
	l.channelNames = staticData.ChannelNames
	l.modeNames = staticData.ModeNames
	l.RuleNames = staticData.RuleNames
	l.LiteralNames = staticData.LiteralNames
	l.SymbolicNames = staticData.SymbolicNames
	l.GrammarFileName = "SwiftLexer.g4"
	// TODO: l.EOF = antlr.TokenEOF

	return l
}

// SwiftLexer tokens.
const (
	SwiftLexerINT          = 1
	SwiftLexerFLOAT        = 2
	SwiftLexerBOOL         = 3
	SwiftLexerSTR          = 4
	SwiftLexerTRU          = 5
	SwiftLexerFAL          = 6
	SwiftLexerPRINT        = 7
	SwiftLexerIF           = 8
	SwiftLexerELSE         = 9
	SwiftLexerWHILE        = 10
	SwiftLexerVAR          = 11
	SwiftLexerNUMBER       = 12
	SwiftLexerSTRING       = 13
	SwiftLexerID           = 14
	SwiftLexerDIF          = 15
	SwiftLexerIG_IG        = 16
	SwiftLexerNOT          = 17
	SwiftLexerOR           = 18
	SwiftLexerAND          = 19
	SwiftLexerIG           = 20
	SwiftLexerMAY_IG       = 21
	SwiftLexerMEN_IG       = 22
	SwiftLexerMAYOR        = 23
	SwiftLexerMENOR        = 24
	SwiftLexerMUL          = 25
	SwiftLexerDIV          = 26
	SwiftLexerADD          = 27
	SwiftLexerSUB          = 28
	SwiftLexerPARIZQ       = 29
	SwiftLexerPARDER       = 30
	SwiftLexerLLAVEIZQ     = 31
	SwiftLexerLLAVEDER     = 32
	SwiftLexerD_PTS        = 33
	SwiftLexerCORIZQ       = 34
	SwiftLexerCORDER       = 35
	SwiftLexerCOMA         = 36
	SwiftLexerWHITESPACE   = 37
	SwiftLexerCOMMENT      = 38
	SwiftLexerLINE_COMMENT = 39
)

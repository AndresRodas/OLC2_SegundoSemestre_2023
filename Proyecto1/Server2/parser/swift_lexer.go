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
		"'if'", "'else'", "'while'", "'var'", "'func'", "'struct'", "", "",
		"", "'!='", "'=='", "'!'", "'||'", "'&&'", "'='", "'>='", "'<='", "'>'",
		"'<'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'{'", "'}'", "':'",
		"'['", "']'", "','", "'->'", "'.'",
	}
	staticData.SymbolicNames = []string{
		"", "INT", "FLOAT", "BOOL", "STR", "TRU", "FAL", "PRINT", "IF", "ELSE",
		"WHILE", "VAR", "FUNC", "STRUCT", "NUMBER", "STRING", "ID", "DIF", "IG_IG",
		"NOT", "OR", "AND", "IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MUL",
		"DIV", "ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "D_PTS",
		"CORIZQ", "CORDER", "COMA", "ARROW1", "PUNTO", "WHITESPACE", "COMMENT",
		"LINE_COMMENT",
	}
	staticData.RuleNames = []string{
		"INT", "FLOAT", "BOOL", "STR", "TRU", "FAL", "PRINT", "IF", "ELSE",
		"WHILE", "VAR", "FUNC", "STRUCT", "NUMBER", "STRING", "ID", "DIF", "IG_IG",
		"NOT", "OR", "AND", "IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MUL",
		"DIV", "ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "D_PTS",
		"CORIZQ", "CORDER", "COMA", "ARROW1", "PUNTO", "WHITESPACE", "COMMENT",
		"LINE_COMMENT", "ESC_SEQ",
	}
	staticData.PredictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 0, 43, 277, 6, -1, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2,
		4, 7, 4, 2, 5, 7, 5, 2, 6, 7, 6, 2, 7, 7, 7, 2, 8, 7, 8, 2, 9, 7, 9, 2,
		10, 7, 10, 2, 11, 7, 11, 2, 12, 7, 12, 2, 13, 7, 13, 2, 14, 7, 14, 2, 15,
		7, 15, 2, 16, 7, 16, 2, 17, 7, 17, 2, 18, 7, 18, 2, 19, 7, 19, 2, 20, 7,
		20, 2, 21, 7, 21, 2, 22, 7, 22, 2, 23, 7, 23, 2, 24, 7, 24, 2, 25, 7, 25,
		2, 26, 7, 26, 2, 27, 7, 27, 2, 28, 7, 28, 2, 29, 7, 29, 2, 30, 7, 30, 2,
		31, 7, 31, 2, 32, 7, 32, 2, 33, 7, 33, 2, 34, 7, 34, 2, 35, 7, 35, 2, 36,
		7, 36, 2, 37, 7, 37, 2, 38, 7, 38, 2, 39, 7, 39, 2, 40, 7, 40, 2, 41, 7,
		41, 2, 42, 7, 42, 2, 43, 7, 43, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1,
		1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 3, 1, 3, 1, 3, 1,
		3, 1, 3, 1, 3, 1, 3, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 5, 1, 5, 1, 5, 1,
		5, 1, 5, 1, 5, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 7, 1, 7, 1, 7, 1,
		8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 10, 1,
		10, 1, 10, 1, 10, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 12, 1, 12, 1, 12,
		1, 12, 1, 12, 1, 12, 1, 12, 1, 13, 4, 13, 160, 8, 13, 11, 13, 12, 13, 161,
		1, 13, 1, 13, 4, 13, 166, 8, 13, 11, 13, 12, 13, 167, 3, 13, 170, 8, 13,
		1, 14, 1, 14, 5, 14, 174, 8, 14, 10, 14, 12, 14, 177, 9, 14, 1, 14, 1,
		14, 1, 15, 1, 15, 5, 15, 183, 8, 15, 10, 15, 12, 15, 186, 9, 15, 1, 16,
		1, 16, 1, 16, 1, 17, 1, 17, 1, 17, 1, 18, 1, 18, 1, 19, 1, 19, 1, 19, 1,
		20, 1, 20, 1, 20, 1, 21, 1, 21, 1, 22, 1, 22, 1, 22, 1, 23, 1, 23, 1, 23,
		1, 24, 1, 24, 1, 25, 1, 25, 1, 26, 1, 26, 1, 27, 1, 27, 1, 28, 1, 28, 1,
		29, 1, 29, 1, 30, 1, 30, 1, 31, 1, 31, 1, 32, 1, 32, 1, 33, 1, 33, 1, 34,
		1, 34, 1, 35, 1, 35, 1, 36, 1, 36, 1, 37, 1, 37, 1, 38, 1, 38, 1, 38, 1,
		39, 1, 39, 1, 40, 4, 40, 244, 8, 40, 11, 40, 12, 40, 245, 1, 40, 1, 40,
		1, 41, 1, 41, 1, 41, 1, 41, 5, 41, 254, 8, 41, 10, 41, 12, 41, 257, 9,
		41, 1, 41, 1, 41, 1, 41, 1, 41, 1, 41, 1, 42, 1, 42, 1, 42, 1, 42, 5, 42,
		268, 8, 42, 10, 42, 12, 42, 271, 9, 42, 1, 42, 1, 42, 1, 43, 1, 43, 1,
		43, 1, 255, 0, 44, 1, 1, 3, 2, 5, 3, 7, 4, 9, 5, 11, 6, 13, 7, 15, 8, 17,
		9, 19, 10, 21, 11, 23, 12, 25, 13, 27, 14, 29, 15, 31, 16, 33, 17, 35,
		18, 37, 19, 39, 20, 41, 21, 43, 22, 45, 23, 47, 24, 49, 25, 51, 26, 53,
		27, 55, 28, 57, 29, 59, 30, 61, 31, 63, 32, 65, 33, 67, 34, 69, 35, 71,
		36, 73, 37, 75, 38, 77, 39, 79, 40, 81, 41, 83, 42, 85, 43, 87, 0, 1, 0,
		7, 1, 0, 48, 57, 1, 0, 34, 34, 2, 0, 65, 90, 97, 122, 4, 0, 48, 57, 65,
		90, 95, 95, 97, 122, 4, 0, 9, 10, 13, 13, 32, 32, 92, 92, 2, 0, 10, 10,
		13, 13, 7, 0, 32, 33, 35, 35, 43, 43, 45, 46, 58, 58, 64, 64, 91, 93, 283,
		0, 1, 1, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 5, 1, 0, 0, 0, 0, 7, 1, 0, 0, 0,
		0, 9, 1, 0, 0, 0, 0, 11, 1, 0, 0, 0, 0, 13, 1, 0, 0, 0, 0, 15, 1, 0, 0,
		0, 0, 17, 1, 0, 0, 0, 0, 19, 1, 0, 0, 0, 0, 21, 1, 0, 0, 0, 0, 23, 1, 0,
		0, 0, 0, 25, 1, 0, 0, 0, 0, 27, 1, 0, 0, 0, 0, 29, 1, 0, 0, 0, 0, 31, 1,
		0, 0, 0, 0, 33, 1, 0, 0, 0, 0, 35, 1, 0, 0, 0, 0, 37, 1, 0, 0, 0, 0, 39,
		1, 0, 0, 0, 0, 41, 1, 0, 0, 0, 0, 43, 1, 0, 0, 0, 0, 45, 1, 0, 0, 0, 0,
		47, 1, 0, 0, 0, 0, 49, 1, 0, 0, 0, 0, 51, 1, 0, 0, 0, 0, 53, 1, 0, 0, 0,
		0, 55, 1, 0, 0, 0, 0, 57, 1, 0, 0, 0, 0, 59, 1, 0, 0, 0, 0, 61, 1, 0, 0,
		0, 0, 63, 1, 0, 0, 0, 0, 65, 1, 0, 0, 0, 0, 67, 1, 0, 0, 0, 0, 69, 1, 0,
		0, 0, 0, 71, 1, 0, 0, 0, 0, 73, 1, 0, 0, 0, 0, 75, 1, 0, 0, 0, 0, 77, 1,
		0, 0, 0, 0, 79, 1, 0, 0, 0, 0, 81, 1, 0, 0, 0, 0, 83, 1, 0, 0, 0, 0, 85,
		1, 0, 0, 0, 1, 89, 1, 0, 0, 0, 3, 93, 1, 0, 0, 0, 5, 99, 1, 0, 0, 0, 7,
		104, 1, 0, 0, 0, 9, 111, 1, 0, 0, 0, 11, 116, 1, 0, 0, 0, 13, 122, 1, 0,
		0, 0, 15, 128, 1, 0, 0, 0, 17, 131, 1, 0, 0, 0, 19, 136, 1, 0, 0, 0, 21,
		142, 1, 0, 0, 0, 23, 146, 1, 0, 0, 0, 25, 151, 1, 0, 0, 0, 27, 159, 1,
		0, 0, 0, 29, 171, 1, 0, 0, 0, 31, 180, 1, 0, 0, 0, 33, 187, 1, 0, 0, 0,
		35, 190, 1, 0, 0, 0, 37, 193, 1, 0, 0, 0, 39, 195, 1, 0, 0, 0, 41, 198,
		1, 0, 0, 0, 43, 201, 1, 0, 0, 0, 45, 203, 1, 0, 0, 0, 47, 206, 1, 0, 0,
		0, 49, 209, 1, 0, 0, 0, 51, 211, 1, 0, 0, 0, 53, 213, 1, 0, 0, 0, 55, 215,
		1, 0, 0, 0, 57, 217, 1, 0, 0, 0, 59, 219, 1, 0, 0, 0, 61, 221, 1, 0, 0,
		0, 63, 223, 1, 0, 0, 0, 65, 225, 1, 0, 0, 0, 67, 227, 1, 0, 0, 0, 69, 229,
		1, 0, 0, 0, 71, 231, 1, 0, 0, 0, 73, 233, 1, 0, 0, 0, 75, 235, 1, 0, 0,
		0, 77, 237, 1, 0, 0, 0, 79, 240, 1, 0, 0, 0, 81, 243, 1, 0, 0, 0, 83, 249,
		1, 0, 0, 0, 85, 263, 1, 0, 0, 0, 87, 274, 1, 0, 0, 0, 89, 90, 5, 73, 0,
		0, 90, 91, 5, 110, 0, 0, 91, 92, 5, 116, 0, 0, 92, 2, 1, 0, 0, 0, 93, 94,
		5, 70, 0, 0, 94, 95, 5, 108, 0, 0, 95, 96, 5, 111, 0, 0, 96, 97, 5, 97,
		0, 0, 97, 98, 5, 116, 0, 0, 98, 4, 1, 0, 0, 0, 99, 100, 5, 66, 0, 0, 100,
		101, 5, 111, 0, 0, 101, 102, 5, 111, 0, 0, 102, 103, 5, 108, 0, 0, 103,
		6, 1, 0, 0, 0, 104, 105, 5, 83, 0, 0, 105, 106, 5, 116, 0, 0, 106, 107,
		5, 114, 0, 0, 107, 108, 5, 105, 0, 0, 108, 109, 5, 110, 0, 0, 109, 110,
		5, 103, 0, 0, 110, 8, 1, 0, 0, 0, 111, 112, 5, 116, 0, 0, 112, 113, 5,
		114, 0, 0, 113, 114, 5, 117, 0, 0, 114, 115, 5, 101, 0, 0, 115, 10, 1,
		0, 0, 0, 116, 117, 5, 102, 0, 0, 117, 118, 5, 97, 0, 0, 118, 119, 5, 108,
		0, 0, 119, 120, 5, 115, 0, 0, 120, 121, 5, 101, 0, 0, 121, 12, 1, 0, 0,
		0, 122, 123, 5, 112, 0, 0, 123, 124, 5, 114, 0, 0, 124, 125, 5, 105, 0,
		0, 125, 126, 5, 110, 0, 0, 126, 127, 5, 116, 0, 0, 127, 14, 1, 0, 0, 0,
		128, 129, 5, 105, 0, 0, 129, 130, 5, 102, 0, 0, 130, 16, 1, 0, 0, 0, 131,
		132, 5, 101, 0, 0, 132, 133, 5, 108, 0, 0, 133, 134, 5, 115, 0, 0, 134,
		135, 5, 101, 0, 0, 135, 18, 1, 0, 0, 0, 136, 137, 5, 119, 0, 0, 137, 138,
		5, 104, 0, 0, 138, 139, 5, 105, 0, 0, 139, 140, 5, 108, 0, 0, 140, 141,
		5, 101, 0, 0, 141, 20, 1, 0, 0, 0, 142, 143, 5, 118, 0, 0, 143, 144, 5,
		97, 0, 0, 144, 145, 5, 114, 0, 0, 145, 22, 1, 0, 0, 0, 146, 147, 5, 102,
		0, 0, 147, 148, 5, 117, 0, 0, 148, 149, 5, 110, 0, 0, 149, 150, 5, 99,
		0, 0, 150, 24, 1, 0, 0, 0, 151, 152, 5, 115, 0, 0, 152, 153, 5, 116, 0,
		0, 153, 154, 5, 114, 0, 0, 154, 155, 5, 117, 0, 0, 155, 156, 5, 99, 0,
		0, 156, 157, 5, 116, 0, 0, 157, 26, 1, 0, 0, 0, 158, 160, 7, 0, 0, 0, 159,
		158, 1, 0, 0, 0, 160, 161, 1, 0, 0, 0, 161, 159, 1, 0, 0, 0, 161, 162,
		1, 0, 0, 0, 162, 169, 1, 0, 0, 0, 163, 165, 5, 46, 0, 0, 164, 166, 7, 0,
		0, 0, 165, 164, 1, 0, 0, 0, 166, 167, 1, 0, 0, 0, 167, 165, 1, 0, 0, 0,
		167, 168, 1, 0, 0, 0, 168, 170, 1, 0, 0, 0, 169, 163, 1, 0, 0, 0, 169,
		170, 1, 0, 0, 0, 170, 28, 1, 0, 0, 0, 171, 175, 5, 34, 0, 0, 172, 174,
		8, 1, 0, 0, 173, 172, 1, 0, 0, 0, 174, 177, 1, 0, 0, 0, 175, 173, 1, 0,
		0, 0, 175, 176, 1, 0, 0, 0, 176, 178, 1, 0, 0, 0, 177, 175, 1, 0, 0, 0,
		178, 179, 5, 34, 0, 0, 179, 30, 1, 0, 0, 0, 180, 184, 7, 2, 0, 0, 181,
		183, 7, 3, 0, 0, 182, 181, 1, 0, 0, 0, 183, 186, 1, 0, 0, 0, 184, 182,
		1, 0, 0, 0, 184, 185, 1, 0, 0, 0, 185, 32, 1, 0, 0, 0, 186, 184, 1, 0,
		0, 0, 187, 188, 5, 33, 0, 0, 188, 189, 5, 61, 0, 0, 189, 34, 1, 0, 0, 0,
		190, 191, 5, 61, 0, 0, 191, 192, 5, 61, 0, 0, 192, 36, 1, 0, 0, 0, 193,
		194, 5, 33, 0, 0, 194, 38, 1, 0, 0, 0, 195, 196, 5, 124, 0, 0, 196, 197,
		5, 124, 0, 0, 197, 40, 1, 0, 0, 0, 198, 199, 5, 38, 0, 0, 199, 200, 5,
		38, 0, 0, 200, 42, 1, 0, 0, 0, 201, 202, 5, 61, 0, 0, 202, 44, 1, 0, 0,
		0, 203, 204, 5, 62, 0, 0, 204, 205, 5, 61, 0, 0, 205, 46, 1, 0, 0, 0, 206,
		207, 5, 60, 0, 0, 207, 208, 5, 61, 0, 0, 208, 48, 1, 0, 0, 0, 209, 210,
		5, 62, 0, 0, 210, 50, 1, 0, 0, 0, 211, 212, 5, 60, 0, 0, 212, 52, 1, 0,
		0, 0, 213, 214, 5, 42, 0, 0, 214, 54, 1, 0, 0, 0, 215, 216, 5, 47, 0, 0,
		216, 56, 1, 0, 0, 0, 217, 218, 5, 43, 0, 0, 218, 58, 1, 0, 0, 0, 219, 220,
		5, 45, 0, 0, 220, 60, 1, 0, 0, 0, 221, 222, 5, 40, 0, 0, 222, 62, 1, 0,
		0, 0, 223, 224, 5, 41, 0, 0, 224, 64, 1, 0, 0, 0, 225, 226, 5, 123, 0,
		0, 226, 66, 1, 0, 0, 0, 227, 228, 5, 125, 0, 0, 228, 68, 1, 0, 0, 0, 229,
		230, 5, 58, 0, 0, 230, 70, 1, 0, 0, 0, 231, 232, 5, 91, 0, 0, 232, 72,
		1, 0, 0, 0, 233, 234, 5, 93, 0, 0, 234, 74, 1, 0, 0, 0, 235, 236, 5, 44,
		0, 0, 236, 76, 1, 0, 0, 0, 237, 238, 5, 45, 0, 0, 238, 239, 5, 62, 0, 0,
		239, 78, 1, 0, 0, 0, 240, 241, 5, 46, 0, 0, 241, 80, 1, 0, 0, 0, 242, 244,
		7, 4, 0, 0, 243, 242, 1, 0, 0, 0, 244, 245, 1, 0, 0, 0, 245, 243, 1, 0,
		0, 0, 245, 246, 1, 0, 0, 0, 246, 247, 1, 0, 0, 0, 247, 248, 6, 40, 0, 0,
		248, 82, 1, 0, 0, 0, 249, 250, 5, 47, 0, 0, 250, 251, 5, 42, 0, 0, 251,
		255, 1, 0, 0, 0, 252, 254, 9, 0, 0, 0, 253, 252, 1, 0, 0, 0, 254, 257,
		1, 0, 0, 0, 255, 256, 1, 0, 0, 0, 255, 253, 1, 0, 0, 0, 256, 258, 1, 0,
		0, 0, 257, 255, 1, 0, 0, 0, 258, 259, 5, 42, 0, 0, 259, 260, 5, 47, 0,
		0, 260, 261, 1, 0, 0, 0, 261, 262, 6, 41, 0, 0, 262, 84, 1, 0, 0, 0, 263,
		264, 5, 47, 0, 0, 264, 265, 5, 47, 0, 0, 265, 269, 1, 0, 0, 0, 266, 268,
		8, 5, 0, 0, 267, 266, 1, 0, 0, 0, 268, 271, 1, 0, 0, 0, 269, 267, 1, 0,
		0, 0, 269, 270, 1, 0, 0, 0, 270, 272, 1, 0, 0, 0, 271, 269, 1, 0, 0, 0,
		272, 273, 6, 42, 0, 0, 273, 86, 1, 0, 0, 0, 274, 275, 5, 92, 0, 0, 275,
		276, 7, 6, 0, 0, 276, 88, 1, 0, 0, 0, 9, 0, 161, 167, 169, 175, 184, 245,
		255, 269, 1, 6, 0, 0,
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
	SwiftLexerFUNC         = 12
	SwiftLexerSTRUCT       = 13
	SwiftLexerNUMBER       = 14
	SwiftLexerSTRING       = 15
	SwiftLexerID           = 16
	SwiftLexerDIF          = 17
	SwiftLexerIG_IG        = 18
	SwiftLexerNOT          = 19
	SwiftLexerOR           = 20
	SwiftLexerAND          = 21
	SwiftLexerIG           = 22
	SwiftLexerMAY_IG       = 23
	SwiftLexerMEN_IG       = 24
	SwiftLexerMAYOR        = 25
	SwiftLexerMENOR        = 26
	SwiftLexerMUL          = 27
	SwiftLexerDIV          = 28
	SwiftLexerADD          = 29
	SwiftLexerSUB          = 30
	SwiftLexerPARIZQ       = 31
	SwiftLexerPARDER       = 32
	SwiftLexerLLAVEIZQ     = 33
	SwiftLexerLLAVEDER     = 34
	SwiftLexerD_PTS        = 35
	SwiftLexerCORIZQ       = 36
	SwiftLexerCORDER       = 37
	SwiftLexerCOMA         = 38
	SwiftLexerARROW1       = 39
	SwiftLexerPUNTO        = 40
	SwiftLexerWHITESPACE   = 41
	SwiftLexerCOMMENT      = 42
	SwiftLexerLINE_COMMENT = 43
)

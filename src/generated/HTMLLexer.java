// Generated from E:/forth year/COMP/src\HTMLLexer.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_MUSTACHE=1, HTML_COMMENT=2, HTML_CONDITIONAL_COMMENT=3, XML=4, CDATA=5, 
		DTD=6, SCRIPTLET=7, SEA_WS=8, SCRIPT_OPEN=9, STYLE_OPEN=10, TAG_OPEN=11, 
		HTML_TEXT=12, CP_APP=13, CP_SHOW=14, CP_HIDE=15, CP_FOR=16, CP_SWITCH=17, 
		CP_SWITCH_CASE=18, CP_IF=19, CP_MODEL=20, CP_CLICK=21, CP_MOUSEOVER=22, 
		CP_SWITCH_DEF=23, TAG_CLOSE=24, TAG_SLASH_CLOSE=25, TAG_SLASH=26, TAG_EQUALS=27, 
		TAG_NAME=28, TAG_WHITESPACE=29, SCRIPT_BODY=30, SCRIPT_SHORT_BODY=31, 
		STYLE_BODY=32, STYLE_SHORT_BODY=33, ATTVALUE_VALUE=34, ATTRIBUTE=35, CP_EQUALS=36, 
		CP_OPEN_DOUBLE_QUOTE=37, CP_WS=38, CP_CONTENT_CLOSE_DOUBLE_QUOTE=39, CP_CONTENT_EQUALS=40, 
		CP_CONTENT_SEMI_COLON=41, CP_CONTENT_COLON=42, CP_CONTENT_COMMA=43, CP_CONTENT_OPEN_PAR=44, 
		CP_CONTENT_CLOSE_PAR=45, CP_CONTENT_OPEN_CURLY_BRACKETS=46, CP_CONTENT_CLOSE_CURLY_BRACKETS=47, 
		CP_CONTENT_OPEN_BRACKETS=48, CP_CONTENT_CLOSE_BRACKETS=49, CP_CONTENT_DOT=50, 
		CP_CONTENT_SINGLE_QUOTE=51, CP_CONTENT_QUESTION_MARK=52, CP_CONTENT_OR=53, 
		CP_CONTENT_AND=54, CP_CONTENT_NOT=55, IN=56, INDEX=57, CP_CONTENT_TRUE=58, 
		CP_CONTENT_FALSE=59, CP_CONTENT_NULL=60, CP_CONTENT_IDENTIFIER=61, CP_CONTENT_NUMBER=62, 
		CP_CONTENT_STRING=63, CP_CONTENT_GREATER_THAN=64, CP_CONTENT_LESS_THAN=65, 
		CP_CONTENT_GREATER_EQ=66, CP_CONTENT_LESS_EQ=67, CP_CONTENT_EQUAL_TO=68, 
		CP_CONTENT_NOT_EQUAL=69, CP_CONTENT_WS=70, CLOSE_MUSTACHE=71, MUSTACHE_FILTER=72, 
		MUSTACHE_EUQALS=73, MUSTACHE_COLON=74, MUSTACHE_QUESTION_MARK=75, MUSTACHE_GREATER_THAN=76, 
		MUSTACHE_LESS_THAN=77, MUSTACHE_GREATER_EQ=78, MUSTACHE_LESS_EQ=79, MUSTACHE_EQUAL_TO=80, 
		MUSTACHE_NOT_EQUAL=81, MUSTACHE_TRUE=82, MUSTACHE_FALSE=83, MUSTACHE_NULL=84, 
		MUSTACHE_STRING=85, MUSTACHE_NUMBER=86, MUSTACHE_IDENTIFIER=87, MUSTACHE_WS=88;
	public static final int
		TAG=1, SCRIPT=2, STYLE=3, ATTVALUE=4, CP=5, CP_CONTENT=6, MUSTACHE=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TAG", "SCRIPT", "STYLE", "ATTVALUE", "CP", "CP_CONTENT", 
		"MUSTACHE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPEN_MUSTACHE", "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", 
			"DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", 
			"HTML_TEXT", "EQUALS", "GREATER_THAN", "LESS_THAN", "GREATER_EQ", "LESS_EQ", 
			"EQUAL_TO", "NOT_EQUAL", "SEMI_COLON", "COLON", "COMMA", "OPEN_PAR", 
			"CLOSE_PAR", "OPEN_CURLY_BRACKETS", "CLOSE_CURLY_BRACKETS", "OPEN_BRACKETS", 
			"CLOSE_BRACKETS", "DOT", "SINGLE_QUOTE", "QUESTION_MARK", "OR", "AND", 
			"NOT", "NUMBER", "DIGIT", "STRING", "TRUE", "FALSE", "NULL", "IDENTIFIER", 
			"CP_APP", "CP_SHOW", "CP_HIDE", "CP_FOR", "CP_SWITCH", "CP_SWITCH_CASE", 
			"CP_IF", "CP_MODEL", "CP_CLICK", "CP_MOUSEOVER", "CP_SWITCH_DEF", "TAG_CLOSE", 
			"TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", 
			"HEXDIGIT", "TAG_NameChar", "TAG_NameStartChar", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", 
			"STYLE_BODY", "STYLE_SHORT_BODY", "ATTVALUE_VALUE", "ATTRIBUTE", "ATTCHARS", 
			"ATTCHAR", "HEXCHARS", "DECCHARS", "DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING", 
			"CP_EQUALS", "CP_OPEN_DOUBLE_QUOTE", "CP_WS", "CP_CONTENT_CLOSE_DOUBLE_QUOTE", 
			"CP_CONTENT_EQUALS", "CP_CONTENT_SEMI_COLON", "CP_CONTENT_COLON", "CP_CONTENT_COMMA", 
			"CP_CONTENT_OPEN_PAR", "CP_CONTENT_CLOSE_PAR", "CP_CONTENT_OPEN_CURLY_BRACKETS", 
			"CP_CONTENT_CLOSE_CURLY_BRACKETS", "CP_CONTENT_OPEN_BRACKETS", "CP_CONTENT_CLOSE_BRACKETS", 
			"CP_CONTENT_DOT", "CP_CONTENT_SINGLE_QUOTE", "CP_CONTENT_QUESTION_MARK", 
			"CP_CONTENT_OR", "CP_CONTENT_AND", "CP_CONTENT_NOT", "IN", "INDEX", "CP_CONTENT_TRUE", 
			"CP_CONTENT_FALSE", "CP_CONTENT_NULL", "CP_CONTENT_IDENTIFIER", "CP_CONTENT_NUMBER", 
			"CP_CONTENT_STRING", "CP_CONTENT_GREATER_THAN", "CP_CONTENT_LESS_THAN", 
			"CP_CONTENT_GREATER_EQ", "CP_CONTENT_LESS_EQ", "CP_CONTENT_EQUAL_TO", 
			"CP_CONTENT_NOT_EQUAL", "CP_CONTENT_WS", "CLOSE_MUSTACHE", "MUSTACHE_FILTER", 
			"MUSTACHE_EUQALS", "MUSTACHE_COLON", "MUSTACHE_QUESTION_MARK", "MUSTACHE_GREATER_THAN", 
			"MUSTACHE_LESS_THAN", "MUSTACHE_GREATER_EQ", "MUSTACHE_LESS_EQ", "MUSTACHE_EQUAL_TO", 
			"MUSTACHE_NOT_EQUAL", "MUSTACHE_TRUE", "MUSTACHE_FALSE", "MUSTACHE_NULL", 
			"MUSTACHE_STRING", "MUSTACHE_NUMBER", "MUSTACHE_IDENTIFIER", "MUSTACHE_WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{{'", null, null, null, null, null, null, null, null, null, "'<'", 
			null, "'cp-app'", "'cp-show'", "'cp-hide'", "'cp-for'", "'cp-switch'", 
			"'cp-switch-case'", "'cp-if'", "'cp-model'", "'@click'", "'@mouseover'", 
			"'cp-switchDefault'", "'>'", "'/>'", "'/'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'''", null, null, null, null, 
			"'in'", "'index'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'}}'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_MUSTACHE", "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", 
			"CDATA", "DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", 
			"HTML_TEXT", "CP_APP", "CP_SHOW", "CP_HIDE", "CP_FOR", "CP_SWITCH", "CP_SWITCH_CASE", 
			"CP_IF", "CP_MODEL", "CP_CLICK", "CP_MOUSEOVER", "CP_SWITCH_DEF", "TAG_CLOSE", 
			"TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", 
			"SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", 
			"ATTVALUE_VALUE", "ATTRIBUTE", "CP_EQUALS", "CP_OPEN_DOUBLE_QUOTE", "CP_WS", 
			"CP_CONTENT_CLOSE_DOUBLE_QUOTE", "CP_CONTENT_EQUALS", "CP_CONTENT_SEMI_COLON", 
			"CP_CONTENT_COLON", "CP_CONTENT_COMMA", "CP_CONTENT_OPEN_PAR", "CP_CONTENT_CLOSE_PAR", 
			"CP_CONTENT_OPEN_CURLY_BRACKETS", "CP_CONTENT_CLOSE_CURLY_BRACKETS", 
			"CP_CONTENT_OPEN_BRACKETS", "CP_CONTENT_CLOSE_BRACKETS", "CP_CONTENT_DOT", 
			"CP_CONTENT_SINGLE_QUOTE", "CP_CONTENT_QUESTION_MARK", "CP_CONTENT_OR", 
			"CP_CONTENT_AND", "CP_CONTENT_NOT", "IN", "INDEX", "CP_CONTENT_TRUE", 
			"CP_CONTENT_FALSE", "CP_CONTENT_NULL", "CP_CONTENT_IDENTIFIER", "CP_CONTENT_NUMBER", 
			"CP_CONTENT_STRING", "CP_CONTENT_GREATER_THAN", "CP_CONTENT_LESS_THAN", 
			"CP_CONTENT_GREATER_EQ", "CP_CONTENT_LESS_EQ", "CP_CONTENT_EQUAL_TO", 
			"CP_CONTENT_NOT_EQUAL", "CP_CONTENT_WS", "CLOSE_MUSTACHE", "MUSTACHE_FILTER", 
			"MUSTACHE_EUQALS", "MUSTACHE_COLON", "MUSTACHE_QUESTION_MARK", "MUSTACHE_GREATER_THAN", 
			"MUSTACHE_LESS_THAN", "MUSTACHE_GREATER_EQ", "MUSTACHE_LESS_EQ", "MUSTACHE_EQUAL_TO", 
			"MUSTACHE_NOT_EQUAL", "MUSTACHE_TRUE", "MUSTACHE_FALSE", "MUSTACHE_NULL", 
			"MUSTACHE_STRING", "MUSTACHE_NUMBER", "MUSTACHE_IDENTIFIER", "MUSTACHE_WS"
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


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Z\u03bf\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7"+
		"\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17"+
		"\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26"+
		"\4\27\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35"+
		"\4\36\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t"+
		"\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61"+
		"\4\62\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49"+
		"\t9\4:\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD"+
		"\4E\tE\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P"+
		"\tP\4Q\tQ\4R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t["+
		"\4\\\t\\\4]\t]\4^\t^\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4"+
		"g\tg\4h\th\4i\ti\4j\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\t"+
		"r\4s\ts\4t\tt\4u\tu\4v\tv\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4"+
		"~\t~\4\177\t\177\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0112"+
		"\n\3\f\3\16\3\u0115\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4\u0120"+
		"\n\4\f\4\16\4\u0123\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u012f"+
		"\n\5\f\5\16\5\u0132\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6\u0141\n\6\f\6\16\6\u0144\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\7\7\u014e\n\7\f\7\16\7\u0151\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u0159"+
		"\n\b\f\b\16\b\u015c\13\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0164\n\b\f\b\16"+
		"\b\u0167\13\b\3\b\3\b\5\b\u016b\n\b\3\t\3\t\5\t\u016f\n\t\3\t\6\t\u0172"+
		"\n\t\r\t\16\t\u0173\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0181"+
		"\n\n\f\n\16\n\u0184\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u0192\n\13\f\13\16\13\u0195\13\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\6\r\u01a0\n\r\r\r\16\r\u01a1\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3$\6$\u01d7\n$\r$\16$\u01d8\3$\3$\7$\u01dd\n$\f$\16$\u01e0\13$\5"+
		"$\u01e2\n$\3$\3$\6$\u01e6\n$\r$\16$\u01e7\5$\u01ea\n$\3%\3%\3&\3&\7&\u01f0"+
		"\n&\f&\16&\u01f3\13&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3*\3*\7*\u0209\n*\f*\16*\u020c\13*\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\39\3"+
		"9\39\39\3:\3:\7:\u029c\n:\f:\16:\u029f\13:\3;\3;\3;\3;\3<\3<\3=\3=\3="+
		"\3=\5=\u02ab\n=\3>\5>\u02ae\n>\3?\7?\u02b1\n?\f?\16?\u02b4\13?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\7@\u02c3\n@\f@\16@\u02c6\13@\3@\3@\3@"+
		"\3@\3@\3@\3A\7A\u02cf\nA\fA\16A\u02d2\13A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3B\7B\u02e0\nB\fB\16B\u02e3\13B\3B\3B\3B\3B\3B\3B\3C\7C\u02ec\nC"+
		"\fC\16C\u02ef\13C\3C\3C\3C\3C\3D\3D\3D\3D\3D\5D\u02fa\nD\3E\6E\u02fd\n"+
		"E\rE\16E\u02fe\3E\5E\u0302\nE\3F\5F\u0305\nF\3G\3G\6G\u0309\nG\rG\16G"+
		"\u030a\3H\6H\u030e\nH\rH\16H\u030f\3H\5H\u0313\nH\3I\3I\7I\u0317\nI\f"+
		"I\16I\u031a\13I\3I\3I\3J\3J\7J\u0320\nJ\fJ\16J\u0323\13J\3J\3J\3K\3K\3"+
		"L\3L\3L\3L\3M\3M\3M\3M\3N\3N\3N\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3"+
		"T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_"+
		"\3_\3_\3`\3`\3`\3`\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\7d\u0367\nd\fd\16d\u036a"+
		"\13d\3e\3e\3f\3f\7f\u0370\nf\ff\16f\u0373\13f\3f\3f\3f\7f\u0378\nf\ff"+
		"\16f\u037b\13f\3f\5f\u037e\nf\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3"+
		"m\3m\3m\3n\3n\3n\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3"+
		"v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177\3\177\5\177\u03b7"+
		"\n\177\3\177\6\177\u03ba\n\177\r\177\16\177\u03bb\3\177\3\177\17\u0113"+
		"\u0121\u0130\u0142\u014f\u015a\u0165\u0182\u0193\u02b2\u02c4\u02d0\u02e1"+
		"\2\u0080\n\3\f\4\16\5\20\6\22\7\24\b\26\t\30\n\32\13\34\f\36\r \16\"\2"+
		"$\2&\2(\2*\2,\2.\2\60\2\62\2\64\2\66\28\2:\2<\2>\2@\2B\2D\2F\2H\2J\2L"+
		"\2N\2P\2R\2T\2V\2X\2Z\2\\\17^\20`\21b\22d\23f\24h\25j\26l\27n\30p\31r"+
		"\32t\33v\34x\35z\36|\37~\2\u0080\2\u0082\2\u0084 \u0086!\u0088\"\u008a"+
		"#\u008c$\u008e%\u0090\2\u0092\2\u0094\2\u0096\2\u0098\2\u009a\2\u009c"+
		"&\u009e\'\u00a0(\u00a2)\u00a4*\u00a6+\u00a8,\u00aa-\u00ac.\u00ae/\u00b0"+
		"\60\u00b2\61\u00b4\62\u00b6\63\u00b8\64\u00ba\65\u00bc\66\u00be\67\u00c0"+
		"8\u00c29\u00c4:\u00c6;\u00c8<\u00ca=\u00cc>\u00ce?\u00d0@\u00d2A\u00d4"+
		"B\u00d6C\u00d8D\u00daE\u00dcF\u00deG\u00e0H\u00e2I\u00e4J\u00e6K\u00e8"+
		"L\u00eaM\u00ecN\u00eeO\u00f0P\u00f2Q\u00f4R\u00f6S\u00f8T\u00faU\u00fc"+
		"V\u00feW\u0100X\u0102Y\u0104Z\n\2\3\4\5\6\7\b\t\17\4\2\13\13\"\"\4\2>"+
		">}}\3\2\62;\4\2$$>>\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\5\2\62"+
		";CHch\4\2/\60aa\5\2\u00b9\u00b9\u0302\u0371\u2041\u2042\n\2<<C\\c|\u2072"+
		"\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\t\2%%-=??AAC\\"+
		"aac|\4\2))>>\2\u03c1\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2"+
		"\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34"+
		"\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\3\\\3\2\2\2\3^\3\2\2\2\3`\3\2\2\2\3b"+
		"\3\2\2\2\3d\3\2\2\2\3f\3\2\2\2\3h\3\2\2\2\3j\3\2\2\2\3l\3\2\2\2\3n\3\2"+
		"\2\2\3p\3\2\2\2\3r\3\2\2\2\3t\3\2\2\2\3v\3\2\2\2\3x\3\2\2\2\3z\3\2\2\2"+
		"\3|\3\2\2\2\4\u0084\3\2\2\2\4\u0086\3\2\2\2\5\u0088\3\2\2\2\5\u008a\3"+
		"\2\2\2\6\u008c\3\2\2\2\6\u008e\3\2\2\2\7\u009c\3\2\2\2\7\u009e\3\2\2\2"+
		"\7\u00a0\3\2\2\2\b\u00a2\3\2\2\2\b\u00a4\3\2\2\2\b\u00a6\3\2\2\2\b\u00a8"+
		"\3\2\2\2\b\u00aa\3\2\2\2\b\u00ac\3\2\2\2\b\u00ae\3\2\2\2\b\u00b0\3\2\2"+
		"\2\b\u00b2\3\2\2\2\b\u00b4\3\2\2\2\b\u00b6\3\2\2\2\b\u00b8\3\2\2\2\b\u00ba"+
		"\3\2\2\2\b\u00bc\3\2\2\2\b\u00be\3\2\2\2\b\u00c0\3\2\2\2\b\u00c2\3\2\2"+
		"\2\b\u00c4\3\2\2\2\b\u00c6\3\2\2\2\b\u00c8\3\2\2\2\b\u00ca\3\2\2\2\b\u00cc"+
		"\3\2\2\2\b\u00ce\3\2\2\2\b\u00d0\3\2\2\2\b\u00d2\3\2\2\2\b\u00d4\3\2\2"+
		"\2\b\u00d6\3\2\2\2\b\u00d8\3\2\2\2\b\u00da\3\2\2\2\b\u00dc\3\2\2\2\b\u00de"+
		"\3\2\2\2\b\u00e0\3\2\2\2\t\u00e2\3\2\2\2\t\u00e4\3\2\2\2\t\u00e6\3\2\2"+
		"\2\t\u00e8\3\2\2\2\t\u00ea\3\2\2\2\t\u00ec\3\2\2\2\t\u00ee\3\2\2\2\t\u00f0"+
		"\3\2\2\2\t\u00f2\3\2\2\2\t\u00f4\3\2\2\2\t\u00f6\3\2\2\2\t\u00f8\3\2\2"+
		"\2\t\u00fa\3\2\2\2\t\u00fc\3\2\2\2\t\u00fe\3\2\2\2\t\u0100\3\2\2\2\t\u0102"+
		"\3\2\2\2\t\u0104\3\2\2\2\n\u0106\3\2\2\2\f\u010b\3\2\2\2\16\u011a\3\2"+
		"\2\2\20\u0127\3\2\2\2\22\u0135\3\2\2\2\24\u0149\3\2\2\2\26\u016a\3\2\2"+
		"\2\30\u0171\3\2\2\2\32\u0177\3\2\2\2\34\u0189\3\2\2\2\36\u019a\3\2\2\2"+
		" \u019f\3\2\2\2\"\u01a3\3\2\2\2$\u01a5\3\2\2\2&\u01a7\3\2\2\2(\u01a9\3"+
		"\2\2\2*\u01ac\3\2\2\2,\u01af\3\2\2\2.\u01b2\3\2\2\2\60\u01b5\3\2\2\2\62"+
		"\u01b7\3\2\2\2\64\u01b9\3\2\2\2\66\u01bb\3\2\2\28\u01bd\3\2\2\2:\u01bf"+
		"\3\2\2\2<\u01c1\3\2\2\2>\u01c3\3\2\2\2@\u01c5\3\2\2\2B\u01c7\3\2\2\2D"+
		"\u01c9\3\2\2\2F\u01cb\3\2\2\2H\u01cd\3\2\2\2J\u01d0\3\2\2\2L\u01d3\3\2"+
		"\2\2N\u01e9\3\2\2\2P\u01eb\3\2\2\2R\u01ed\3\2\2\2T\u01f6\3\2\2\2V\u01fb"+
		"\3\2\2\2X\u0201\3\2\2\2Z\u0206\3\2\2\2\\\u020d\3\2\2\2^\u0216\3\2\2\2"+
		"`\u0220\3\2\2\2b\u022a\3\2\2\2d\u0233\3\2\2\2f\u023f\3\2\2\2h\u0250\3"+
		"\2\2\2j\u0258\3\2\2\2l\u0263\3\2\2\2n\u026c\3\2\2\2p\u0279\3\2\2\2r\u028a"+
		"\3\2\2\2t\u028e\3\2\2\2v\u0293\3\2\2\2x\u0295\3\2\2\2z\u0299\3\2\2\2|"+
		"\u02a0\3\2\2\2~\u02a4\3\2\2\2\u0080\u02aa\3\2\2\2\u0082\u02ad\3\2\2\2"+
		"\u0084\u02b2\3\2\2\2\u0086\u02c4\3\2\2\2\u0088\u02d0\3\2\2\2\u008a\u02e1"+
		"\3\2\2\2\u008c\u02ed\3\2\2\2\u008e\u02f9\3\2\2\2\u0090\u02fc\3\2\2\2\u0092"+
		"\u0304\3\2\2\2\u0094\u0306\3\2\2\2\u0096\u030d\3\2\2\2\u0098\u0314\3\2"+
		"\2\2\u009a\u031d\3\2\2\2\u009c\u0326\3\2\2\2\u009e\u0328\3\2\2\2\u00a0"+
		"\u032c\3\2\2\2\u00a2\u0330\3\2\2\2\u00a4\u0335\3\2\2\2\u00a6\u0337\3\2"+
		"\2\2\u00a8\u0339\3\2\2\2\u00aa\u033b\3\2\2\2\u00ac\u033d\3\2\2\2\u00ae"+
		"\u033f\3\2\2\2\u00b0\u0341\3\2\2\2\u00b2\u0343\3\2\2\2\u00b4\u0345\3\2"+
		"\2\2\u00b6\u0347\3\2\2\2\u00b8\u0349\3\2\2\2\u00ba\u034b\3\2\2\2\u00bc"+
		"\u034d\3\2\2\2\u00be\u034f\3\2\2\2\u00c0\u0351\3\2\2\2\u00c2\u0353\3\2"+
		"\2\2\u00c4\u0355\3\2\2\2\u00c6\u0358\3\2\2\2\u00c8\u035e\3\2\2\2\u00ca"+
		"\u0360\3\2\2\2\u00cc\u0362\3\2\2\2\u00ce\u0364\3\2\2\2\u00d0\u036b\3\2"+
		"\2\2\u00d2\u037d\3\2\2\2\u00d4\u037f\3\2\2\2\u00d6\u0381\3\2\2\2\u00d8"+
		"\u0383\3\2\2\2\u00da\u0385\3\2\2\2\u00dc\u0387\3\2\2\2\u00de\u0389\3\2"+
		"\2\2\u00e0\u038b\3\2\2\2\u00e2\u038f\3\2\2\2\u00e4\u0394\3\2\2\2\u00e6"+
		"\u0396\3\2\2\2\u00e8\u0398\3\2\2\2\u00ea\u039a\3\2\2\2\u00ec\u039c\3\2"+
		"\2\2\u00ee\u039e\3\2\2\2\u00f0\u03a0\3\2\2\2\u00f2\u03a2\3\2\2\2\u00f4"+
		"\u03a4\3\2\2\2\u00f6\u03a6\3\2\2\2\u00f8\u03a8\3\2\2\2\u00fa\u03aa\3\2"+
		"\2\2\u00fc\u03ac\3\2\2\2\u00fe\u03ae\3\2\2\2\u0100\u03b0\3\2\2\2\u0102"+
		"\u03b2\3\2\2\2\u0104\u03b9\3\2\2\2\u0106\u0107\7}\2\2\u0107\u0108\7}\2"+
		"\2\u0108\u0109\3\2\2\2\u0109\u010a\b\2\2\2\u010a\13\3\2\2\2\u010b\u010c"+
		"\7>\2\2\u010c\u010d\7#\2\2\u010d\u010e\7/\2\2\u010e\u010f\7/\2\2\u010f"+
		"\u0113\3\2\2\2\u0110\u0112\13\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3"+
		"\2\2\2\u0113\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0117\7/\2\2\u0117\u0118\7/\2\2\u0118\u0119\7@\2"+
		"\2\u0119\r\3\2\2\2\u011a\u011b\7>\2\2\u011b\u011c\7#\2\2\u011c\u011d\7"+
		"]\2\2\u011d\u0121\3\2\2\2\u011e\u0120\13\2\2\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7_\2\2\u0125\u0126\7@\2\2\u0126\17"+
		"\3\2\2\2\u0127\u0128\7>\2\2\u0128\u0129\7A\2\2\u0129\u012a\7z\2\2\u012a"+
		"\u012b\7o\2\2\u012b\u012c\7n\2\2\u012c\u0130\3\2\2\2\u012d\u012f\13\2"+
		"\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u0131\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7@"+
		"\2\2\u0134\21\3\2\2\2\u0135\u0136\7>\2\2\u0136\u0137\7#\2\2\u0137\u0138"+
		"\7]\2\2\u0138\u0139\7E\2\2\u0139\u013a\7F\2\2\u013a\u013b\7C\2\2\u013b"+
		"\u013c\7V\2\2\u013c\u013d\7C\2\2\u013d\u013e\7]\2\2\u013e\u0142\3\2\2"+
		"\2\u013f\u0141\13\2\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0145\u0146\7_\2\2\u0146\u0147\7_\2\2\u0147\u0148\7@\2\2\u0148\23"+
		"\3\2\2\2\u0149\u014a\7>\2\2\u014a\u014b\7#\2\2\u014b\u014f\3\2\2\2\u014c"+
		"\u014e\13\2\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0150\3"+
		"\2\2\2\u014f\u014d\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0153\7@\2\2\u0153\25\3\2\2\2\u0154\u0155\7>\2\2\u0155\u0156\7A\2\2\u0156"+
		"\u015a\3\2\2\2\u0157\u0159\13\2\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3"+
		"\2\2\2\u015a\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015d\u015e\7A\2\2\u015e\u016b\7@\2\2\u015f\u0160\7>\2"+
		"\2\u0160\u0161\7\'\2\2\u0161\u0165\3\2\2\2\u0162\u0164\13\2\2\2\u0163"+
		"\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0166\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7\'\2\2\u0169"+
		"\u016b\7@\2\2\u016a\u0154\3\2\2\2\u016a\u015f\3\2\2\2\u016b\27\3\2\2\2"+
		"\u016c\u0172\t\2\2\2\u016d\u016f\7\17\2\2\u016e\u016d\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\7\f\2\2\u0171\u016c\3\2\2\2\u0171"+
		"\u016e\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0176\b\t\3\2\u0176\31\3\2\2\2\u0177\u0178"+
		"\7>\2\2\u0178\u0179\7u\2\2\u0179\u017a\7e\2\2\u017a\u017b\7t\2\2\u017b"+
		"\u017c\7k\2\2\u017c\u017d\7r\2\2\u017d\u017e\7v\2\2\u017e\u0182\3\2\2"+
		"\2\u017f\u0181\13\2\2\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0185\u0186\7@\2\2\u0186\u0187\3\2\2\2\u0187\u0188\b\n\4\2\u0188"+
		"\33\3\2\2\2\u0189\u018a\7>\2\2\u018a\u018b\7u\2\2\u018b\u018c\7v\2\2\u018c"+
		"\u018d\7{\2\2\u018d\u018e\7n\2\2\u018e\u018f\7g\2\2\u018f\u0193\3\2\2"+
		"\2\u0190\u0192\13\2\2\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2"+
		"\2\2\u0196\u0197\7@\2\2\u0197\u0198\3\2\2\2\u0198\u0199\b\13\5\2\u0199"+
		"\35\3\2\2\2\u019a\u019b\7>\2\2\u019b\u019c\3\2\2\2\u019c\u019d\b\f\6\2"+
		"\u019d\37\3\2\2\2\u019e\u01a0\n\3\2\2\u019f\u019e\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2!\3\2\2\2\u01a3"+
		"\u01a4\7?\2\2\u01a4#\3\2\2\2\u01a5\u01a6\7@\2\2\u01a6%\3\2\2\2\u01a7\u01a8"+
		"\7>\2\2\u01a8\'\3\2\2\2\u01a9\u01aa\7@\2\2\u01aa\u01ab\7?\2\2\u01ab)\3"+
		"\2\2\2\u01ac\u01ad\7>\2\2\u01ad\u01ae\7?\2\2\u01ae+\3\2\2\2\u01af\u01b0"+
		"\7?\2\2\u01b0\u01b1\7?\2\2\u01b1-\3\2\2\2\u01b2\u01b3\7#\2\2\u01b3\u01b4"+
		"\7?\2\2\u01b4/\3\2\2\2\u01b5\u01b6\7=\2\2\u01b6\61\3\2\2\2\u01b7\u01b8"+
		"\7<\2\2\u01b8\63\3\2\2\2\u01b9\u01ba\7.\2\2\u01ba\65\3\2\2\2\u01bb\u01bc"+
		"\7*\2\2\u01bc\67\3\2\2\2\u01bd\u01be\7+\2\2\u01be9\3\2\2\2\u01bf\u01c0"+
		"\7}\2\2\u01c0;\3\2\2\2\u01c1\u01c2\7\177\2\2\u01c2=\3\2\2\2\u01c3\u01c4"+
		"\7]\2\2\u01c4?\3\2\2\2\u01c5\u01c6\7_\2\2\u01c6A\3\2\2\2\u01c7\u01c8\7"+
		"\60\2\2\u01c8C\3\2\2\2\u01c9\u01ca\7)\2\2\u01caE\3\2\2\2\u01cb\u01cc\7"+
		"A\2\2\u01ccG\3\2\2\2\u01cd\u01ce\7~\2\2\u01ce\u01cf\7~\2\2\u01cfI\3\2"+
		"\2\2\u01d0\u01d1\7(\2\2\u01d1\u01d2\7(\2\2\u01d2K\3\2\2\2\u01d3\u01d4"+
		"\7#\2\2\u01d4M\3\2\2\2\u01d5\u01d7\5P%\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8"+
		"\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01e1\3\2\2\2\u01da"+
		"\u01de\7\60\2\2\u01db\u01dd\5P%\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2"+
		"\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e1\u01da\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01ea\3\2"+
		"\2\2\u01e3\u01e5\7\60\2\2\u01e4\u01e6\5P%\2\u01e5\u01e4\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2"+
		"\2\2\u01e9\u01d6\3\2\2\2\u01e9\u01e3\3\2\2\2\u01eaO\3\2\2\2\u01eb\u01ec"+
		"\t\4\2\2\u01ecQ\3\2\2\2\u01ed\u01f1\7$\2\2\u01ee\u01f0\n\5\2\2\u01ef\u01ee"+
		"\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\7$\2\2\u01f5S\3\2\2\2\u01f6"+
		"\u01f7\7v\2\2\u01f7\u01f8\7t\2\2\u01f8\u01f9\7w\2\2\u01f9\u01fa\7g\2\2"+
		"\u01faU\3\2\2\2\u01fb\u01fc\7h\2\2\u01fc\u01fd\7c\2\2\u01fd\u01fe\7n\2"+
		"\2\u01fe\u01ff\7u\2\2\u01ff\u0200\7g\2\2\u0200W\3\2\2\2\u0201\u0202\7"+
		"p\2\2\u0202\u0203\7w\2\2\u0203\u0204\7n\2\2\u0204\u0205\7n\2\2\u0205Y"+
		"\3\2\2\2\u0206\u020a\t\6\2\2\u0207\u0209\t\7\2\2\u0208\u0207\3\2\2\2\u0209"+
		"\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b[\3\2\2\2"+
		"\u020c\u020a\3\2\2\2\u020d\u020e\7e\2\2\u020e\u020f\7r\2\2\u020f\u0210"+
		"\7/\2\2\u0210\u0211\7c\2\2\u0211\u0212\7r\2\2\u0212\u0213\7r\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0215\b+\7\2\u0215]\3\2\2\2\u0216\u0217\7e\2\2\u0217"+
		"\u0218\7r\2\2\u0218\u0219\7/\2\2\u0219\u021a\7u\2\2\u021a\u021b\7j\2\2"+
		"\u021b\u021c\7q\2\2\u021c\u021d\7y\2\2\u021d\u021e\3\2\2\2\u021e\u021f"+
		"\b,\7\2\u021f_\3\2\2\2\u0220\u0221\7e\2\2\u0221\u0222\7r\2\2\u0222\u0223"+
		"\7/\2\2\u0223\u0224\7j\2\2\u0224\u0225\7k\2\2\u0225\u0226\7f\2\2\u0226"+
		"\u0227\7g\2\2\u0227\u0228\3\2\2\2\u0228\u0229\b-\7\2\u0229a\3\2\2\2\u022a"+
		"\u022b\7e\2\2\u022b\u022c\7r\2\2\u022c\u022d\7/\2\2\u022d\u022e\7h\2\2"+
		"\u022e\u022f\7q\2\2\u022f\u0230\7t\2\2\u0230\u0231\3\2\2\2\u0231\u0232"+
		"\b.\7\2\u0232c\3\2\2\2\u0233\u0234\7e\2\2\u0234\u0235\7r\2\2\u0235\u0236"+
		"\7/\2\2\u0236\u0237\7u\2\2\u0237\u0238\7y\2\2\u0238\u0239\7k\2\2\u0239"+
		"\u023a\7v\2\2\u023a\u023b\7e\2\2\u023b\u023c\7j\2\2\u023c\u023d\3\2\2"+
		"\2\u023d\u023e\b/\7\2\u023ee\3\2\2\2\u023f\u0240\7e\2\2\u0240\u0241\7"+
		"r\2\2\u0241\u0242\7/\2\2\u0242\u0243\7u\2\2\u0243\u0244\7y\2\2\u0244\u0245"+
		"\7k\2\2\u0245\u0246\7v\2\2\u0246\u0247\7e\2\2\u0247\u0248\7j\2\2\u0248"+
		"\u0249\7/\2\2\u0249\u024a\7e\2\2\u024a\u024b\7c\2\2\u024b\u024c\7u\2\2"+
		"\u024c\u024d\7g\2\2\u024d\u024e\3\2\2\2\u024e\u024f\b\60\7\2\u024fg\3"+
		"\2\2\2\u0250\u0251\7e\2\2\u0251\u0252\7r\2\2\u0252\u0253\7/\2\2\u0253"+
		"\u0254\7k\2\2\u0254\u0255\7h\2\2\u0255\u0256\3\2\2\2\u0256\u0257\b\61"+
		"\7\2\u0257i\3\2\2\2\u0258\u0259\7e\2\2\u0259\u025a\7r\2\2\u025a\u025b"+
		"\7/\2\2\u025b\u025c\7o\2\2\u025c\u025d\7q\2\2\u025d\u025e\7f\2\2\u025e"+
		"\u025f\7g\2\2\u025f\u0260\7n\2\2\u0260\u0261\3\2\2\2\u0261\u0262\b\62"+
		"\7\2\u0262k\3\2\2\2\u0263\u0264\7B\2\2\u0264\u0265\7e\2\2\u0265\u0266"+
		"\7n\2\2\u0266\u0267\7k\2\2\u0267\u0268\7e\2\2\u0268\u0269\7m\2\2\u0269"+
		"\u026a\3\2\2\2\u026a\u026b\b\63\7\2\u026bm\3\2\2\2\u026c\u026d\7B\2\2"+
		"\u026d\u026e\7o\2\2\u026e\u026f\7q\2\2\u026f\u0270\7w\2\2\u0270\u0271"+
		"\7u\2\2\u0271\u0272\7g\2\2\u0272\u0273\7q\2\2\u0273\u0274\7x\2\2\u0274"+
		"\u0275\7g\2\2\u0275\u0276\7t\2\2\u0276\u0277\3\2\2\2\u0277\u0278\b\64"+
		"\7\2\u0278o\3\2\2\2\u0279\u027a\7e\2\2\u027a\u027b\7r\2\2\u027b\u027c"+
		"\7/\2\2\u027c\u027d\7u\2\2\u027d\u027e\7y\2\2\u027e\u027f\7k\2\2\u027f"+
		"\u0280\7v\2\2\u0280\u0281\7e\2\2\u0281\u0282\7j\2\2\u0282\u0283\7F\2\2"+
		"\u0283\u0284\7g\2\2\u0284\u0285\7h\2\2\u0285\u0286\7c\2\2\u0286\u0287"+
		"\7w\2\2\u0287\u0288\7n\2\2\u0288\u0289\7v\2\2\u0289q\3\2\2\2\u028a\u028b"+
		"\7@\2\2\u028b\u028c\3\2\2\2\u028c\u028d\b\66\b\2\u028ds\3\2\2\2\u028e"+
		"\u028f\7\61\2\2\u028f\u0290\7@\2\2\u0290\u0291\3\2\2\2\u0291\u0292\b\67"+
		"\b\2\u0292u\3\2\2\2\u0293\u0294\7\61\2\2\u0294w\3\2\2\2\u0295\u0296\5"+
		"\"\16\2\u0296\u0297\3\2\2\2\u0297\u0298\b9\t\2\u0298y\3\2\2\2\u0299\u029d"+
		"\5\u0082>\2\u029a\u029c\5\u0080=\2\u029b\u029a\3\2\2\2\u029c\u029f\3\2"+
		"\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e{\3\2\2\2\u029f\u029d"+
		"\3\2\2\2\u02a0\u02a1\t\b\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\b;\3\2\u02a3"+
		"}\3\2\2\2\u02a4\u02a5\t\t\2\2\u02a5\177\3\2\2\2\u02a6\u02ab\5\u0082>\2"+
		"\u02a7\u02ab\t\n\2\2\u02a8\u02ab\5P%\2\u02a9\u02ab\t\13\2\2\u02aa\u02a6"+
		"\3\2\2\2\u02aa\u02a7\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02a9\3\2\2\2\u02ab"+
		"\u0081\3\2\2\2\u02ac\u02ae\t\f\2\2\u02ad\u02ac\3\2\2\2\u02ae\u0083\3\2"+
		"\2\2\u02af\u02b1\13\2\2\2\u02b0\u02af\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02b2\3\2"+
		"\2\2\u02b5\u02b6\7>\2\2\u02b6\u02b7\7\61\2\2\u02b7\u02b8\7u\2\2\u02b8"+
		"\u02b9\7e\2\2\u02b9\u02ba\7t\2\2\u02ba\u02bb\7k\2\2\u02bb\u02bc\7r\2\2"+
		"\u02bc\u02bd\7v\2\2\u02bd\u02be\7@\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0"+
		"\b?\b\2\u02c0\u0085\3\2\2\2\u02c1\u02c3\13\2\2\2\u02c2\u02c1\3\2\2\2\u02c3"+
		"\u02c6\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c7\3\2"+
		"\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c8\7>\2\2\u02c8\u02c9\7\61\2\2\u02c9"+
		"\u02ca\7@\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\b@\b\2\u02cc\u0087\3\2\2"+
		"\2\u02cd\u02cf\13\2\2\2\u02ce\u02cd\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0"+
		"\u02d1\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d3\3\2\2\2\u02d2\u02d0\3\2"+
		"\2\2\u02d3\u02d4\7>\2\2\u02d4\u02d5\7\61\2\2\u02d5\u02d6\7u\2\2\u02d6"+
		"\u02d7\7v\2\2\u02d7\u02d8\7{\2\2\u02d8\u02d9\7n\2\2\u02d9\u02da\7g\2\2"+
		"\u02da\u02db\7@\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\bA\b\2\u02dd\u0089"+
		"\3\2\2\2\u02de\u02e0\13\2\2\2\u02df\u02de\3\2\2\2\u02e0\u02e3\3\2\2\2"+
		"\u02e1\u02e2\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e4\3\2\2\2\u02e3\u02e1"+
		"\3\2\2\2\u02e4\u02e5\7>\2\2\u02e5\u02e6\7\61\2\2\u02e6\u02e7\7@\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8\u02e9\bB\b\2\u02e9\u008b\3\2\2\2\u02ea\u02ec\7\""+
		"\2\2\u02eb\u02ea\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed"+
		"\u02ee\3\2\2\2\u02ee\u02f0\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f1\5\u008e"+
		"D\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\bC\b\2\u02f3\u008d\3\2\2\2\u02f4\u02fa"+
		"\5\u0098I\2\u02f5\u02fa\5\u009aJ\2\u02f6\u02fa\5\u0090E\2\u02f7\u02fa"+
		"\5\u0094G\2\u02f8\u02fa\5\u0096H\2\u02f9\u02f4\3\2\2\2\u02f9\u02f5\3\2"+
		"\2\2\u02f9\u02f6\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02f8\3\2\2\2\u02fa"+
		"\u008f\3\2\2\2\u02fb\u02fd\5\u0092F\2\u02fc\u02fb\3\2\2\2\u02fd\u02fe"+
		"\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\3\2\2\2\u0300"+
		"\u0302\7\"\2\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0091\3\2"+
		"\2\2\u0303\u0305\t\r\2\2\u0304\u0303\3\2\2\2\u0305\u0093\3\2\2\2\u0306"+
		"\u0308\7%\2\2\u0307\u0309\t\t\2\2\u0308\u0307\3\2\2\2\u0309\u030a\3\2"+
		"\2\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u0095\3\2\2\2\u030c"+
		"\u030e\t\4\2\2\u030d\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u030d\3\2"+
		"\2\2\u030f\u0310\3\2\2\2\u0310\u0312\3\2\2\2\u0311\u0313\7\'\2\2\u0312"+
		"\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0097\3\2\2\2\u0314\u0318\7$"+
		"\2\2\u0315\u0317\n\5\2\2\u0316\u0315\3\2\2\2\u0317\u031a\3\2\2\2\u0318"+
		"\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031b\3\2\2\2\u031a\u0318\3\2"+
		"\2\2\u031b\u031c\7$\2\2\u031c\u0099\3\2\2\2\u031d\u0321\7)\2\2\u031e\u0320"+
		"\n\16\2\2\u031f\u031e\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2"+
		"\u0321\u0322\3\2\2\2\u0322\u0324\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u0325"+
		"\7)\2\2\u0325\u009b\3\2\2\2\u0326\u0327\5\"\16\2\u0327\u009d\3\2\2\2\u0328"+
		"\u0329\7$\2\2\u0329\u032a\3\2\2\2\u032a\u032b\bL\n\2\u032b\u009f\3\2\2"+
		"\2\u032c\u032d\t\b\2\2\u032d\u032e\3\2\2\2\u032e\u032f\bM\3\2\u032f\u00a1"+
		"\3\2\2\2\u0330\u0331\7$\2\2\u0331\u0332\3\2\2\2\u0332\u0333\bN\b\2\u0333"+
		"\u0334\bN\b\2\u0334\u00a3\3\2\2\2\u0335\u0336\5\"\16\2\u0336\u00a5\3\2"+
		"\2\2\u0337\u0338\5\60\25\2\u0338\u00a7\3\2\2\2\u0339\u033a\5\62\26\2\u033a"+
		"\u00a9\3\2\2\2\u033b\u033c\5\64\27\2\u033c\u00ab\3\2\2\2\u033d\u033e\5"+
		"\66\30\2\u033e\u00ad\3\2\2\2\u033f\u0340\58\31\2\u0340\u00af\3\2\2\2\u0341"+
		"\u0342\5:\32\2\u0342\u00b1\3\2\2\2\u0343\u0344\5<\33\2\u0344\u00b3\3\2"+
		"\2\2\u0345\u0346\5>\34\2\u0346\u00b5\3\2\2\2\u0347\u0348\5@\35\2\u0348"+
		"\u00b7\3\2\2\2\u0349\u034a\5B\36\2\u034a\u00b9\3\2\2\2\u034b\u034c\7)"+
		"\2\2\u034c\u00bb\3\2\2\2\u034d\u034e\5F \2\u034e\u00bd\3\2\2\2\u034f\u0350"+
		"\5H!\2\u0350\u00bf\3\2\2\2\u0351\u0352\5J\"\2\u0352\u00c1\3\2\2\2\u0353"+
		"\u0354\5L#\2\u0354\u00c3\3\2\2\2\u0355\u0356\7k\2\2\u0356\u0357\7p\2\2"+
		"\u0357\u00c5\3\2\2\2\u0358\u0359\7k\2\2\u0359\u035a\7p\2\2\u035a\u035b"+
		"\7f\2\2\u035b\u035c\7g\2\2\u035c\u035d\7z\2\2\u035d\u00c7\3\2\2\2\u035e"+
		"\u035f\5T\'\2\u035f\u00c9\3\2\2\2\u0360\u0361\5V(\2\u0361\u00cb\3\2\2"+
		"\2\u0362\u0363\5X)\2\u0363\u00cd\3\2\2\2\u0364\u0368\t\6\2\2\u0365\u0367"+
		"\t\7\2\2\u0366\u0365\3\2\2\2\u0367\u036a\3\2\2\2\u0368\u0366\3\2\2\2\u0368"+
		"\u0369\3\2\2\2\u0369\u00cf\3\2\2\2\u036a\u0368\3\2\2\2\u036b\u036c\5N"+
		"$\2\u036c\u00d1\3\2\2\2\u036d\u0371\7$\2\2\u036e\u0370\n\5\2\2\u036f\u036e"+
		"\3\2\2\2\u0370\u0373\3\2\2\2\u0371\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372"+
		"\u0374\3\2\2\2\u0373\u0371\3\2\2\2\u0374\u037e\7$\2\2\u0375\u0379\7)\2"+
		"\2\u0376\u0378\n\16\2\2\u0377\u0376\3\2\2\2\u0378\u037b\3\2\2\2\u0379"+
		"\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037c\3\2\2\2\u037b\u0379\3\2"+
		"\2\2\u037c\u037e\7)\2\2\u037d\u036d\3\2\2\2\u037d\u0375\3\2\2\2\u037e"+
		"\u00d3\3\2\2\2\u037f\u0380\5$\17\2\u0380\u00d5\3\2\2\2\u0381\u0382\5&"+
		"\20\2\u0382\u00d7\3\2\2\2\u0383\u0384\5(\21\2\u0384\u00d9\3\2\2\2\u0385"+
		"\u0386\5*\22\2\u0386\u00db\3\2\2\2\u0387\u0388\5,\23\2\u0388\u00dd\3\2"+
		"\2\2\u0389\u038a\5.\24\2\u038a\u00df\3\2\2\2\u038b\u038c\t\b\2\2\u038c"+
		"\u038d\3\2\2\2\u038d\u038e\bm\3\2\u038e\u00e1\3\2\2\2\u038f\u0390\7\177"+
		"\2\2\u0390\u0391\7\177\2\2\u0391\u0392\3\2\2\2\u0392\u0393\bn\b\2\u0393"+
		"\u00e3\3\2\2\2\u0394\u0395\7~\2\2\u0395\u00e5\3\2\2\2\u0396\u0397\5\""+
		"\16\2\u0397\u00e7\3\2\2\2\u0398\u0399\5\62\26\2\u0399\u00e9\3\2\2\2\u039a"+
		"\u039b\5F \2\u039b\u00eb\3\2\2\2\u039c\u039d\5$\17\2\u039d\u00ed\3\2\2"+
		"\2\u039e\u039f\5&\20\2\u039f\u00ef\3\2\2\2\u03a0\u03a1\5(\21\2\u03a1\u00f1"+
		"\3\2\2\2\u03a2\u03a3\5*\22\2\u03a3\u00f3\3\2\2\2\u03a4\u03a5\5,\23\2\u03a5"+
		"\u00f5\3\2\2\2\u03a6\u03a7\5.\24\2\u03a7\u00f7\3\2\2\2\u03a8\u03a9\5T"+
		"\'\2\u03a9\u00f9\3\2\2\2\u03aa\u03ab\5V(\2\u03ab\u00fb\3\2\2\2\u03ac\u03ad"+
		"\5X)\2\u03ad\u00fd\3\2\2\2\u03ae\u03af\5R&\2\u03af\u00ff\3\2\2\2\u03b0"+
		"\u03b1\5N$\2\u03b1\u0101\3\2\2\2\u03b2\u03b3\5Z*\2\u03b3\u0103\3\2\2\2"+
		"\u03b4\u03ba\t\2\2\2\u03b5\u03b7\7\17\2\2\u03b6\u03b5\3\2\2\2\u03b6\u03b7"+
		"\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03ba\7\f\2\2\u03b9\u03b4\3\2\2\2\u03b9"+
		"\u03b6\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb\u03bc\3\2"+
		"\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\b\177\3\2\u03be\u0105\3\2\2\2\67"+
		"\2\3\4\5\6\7\b\t\u0113\u0121\u0130\u0142\u014f\u015a\u0165\u016a\u016e"+
		"\u0171\u0173\u0182\u0193\u01a1\u01d8\u01de\u01e1\u01e7\u01e9\u01f1\u020a"+
		"\u029d\u02aa\u02ad\u02b2\u02c4\u02d0\u02e1\u02ed\u02f9\u02fe\u0301\u0304"+
		"\u030a\u030f\u0312\u0318\u0321\u0368\u0371\u0379\u037d\u03b6\u03b9\u03bb"+
		"\13\7\t\2\2\3\2\7\4\2\7\5\2\7\3\2\7\7\2\6\2\2\7\6\2\7\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
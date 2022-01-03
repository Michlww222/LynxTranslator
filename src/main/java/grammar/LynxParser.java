// Generated from C:/Studia/Kompilatory/LynxTranslator/src/main/java/grammar\Lynx.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LynxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, BACK=8, DISTANCE=9, 
		FORWARD=10, HEADING=11, HOME=12, LEFT=13, POS=14, RIGHT=15, SETHEADING=16, 
		SETPOS=17, SETX=18, SETY=19, TOWARDS=20, XCOR=21, YCOR=22, BG=23, CG=24, 
		CLEAN=25, COLOR=26, COLORUNDER=27, FILL=28, FREEZEBG=29, NAMEFROMCOLOUR=30, 
		PD=31, PE=32, PENSIZE=33, PU=34, SETBG=35, SETCOLOR=36, SETPENSIZE=37, 
		STAMP=38, UNFREEZEBG=39, HT=40, INBACK=41, INFRONT=42, OPACITY=43, SETOPACITY=44, 
		SETSHAPE=45, SETSIZE=46, SHAPE=47, SIZE=48, ST=49, CLICKOFF=50, CLICKON=51, 
		CLONE=52, TELL=53, TOUCHINGX=54, WHO=55, ANNOUNCE=56, ASCII=57, BOTTOM=58, 
		CB=59, CC=60, CD=61, CF=62, CHAR=63, CLEARTEXT=64, CU=65, DELETE=66, EOL=67, 
		EOT=68, HIDETEXT=69, INSERT=70, PRINT=71, SELECT=72, SELECTED=73, SHOW=74, 
		SHOWTEXT=75, SOL=76, TEXTCOUNT=77, TEXTITEM=78, TEXTPICK=79, TEXTWHO=80, 
		TOP=81, TRANSPARENT=82, UNSELECT=83, BUTFIRST=84, BUTLAST=85, COUNT=86, 
		EMPTY=87, EQUALX=88, FIRST=89, FPUT=90, IDENTICALX=91, ITEM=92, LAST=93, 
		LIST=94, LISTX=95, LPUT=96, MEMBERX=97, NUMBER=98, PARSE=99, PICK=100, 
		SENTENCE=101, WORD=102, WORDX=103, ABS=104, ARCTAN=105, COS=106, DIFFERENCE=107, 
		EXP=108, INT=109, LN=110, LOG=111, MINUS=112, PI=113, POWER=114, PRODUCT=115, 
		QUOTIENT=116, RANDOM=117, REMAINDER=118, ROUND=119, SIN=120, SQRT=121, 
		SUM=122, TAN=123, COMPARISON=124, ASK=125, FREEZE=126, GET=127, NEWPAGE=128, 
		NEWSLIDER=129, NEWTEXT=130, NEWTURTLE=131, REMOVE=132, RENAME=133, SET=134, 
		TALKTO=135, UNFREEZE=136, RESETT=137, TIMER=138, CLEARNAME=139, CLEARNAMES=140, 
		LET=141, MAKE=142, NAMEX=143, NAMES=144, THING=145, GETPAGE=146, NAMEPAGE=147, 
		NEXTPAGE=148, PAGELIST=149, PREVPAGE=150, PROJECTSIZE=151, AND=152, IF=153, 
		IFELSE=154, NOT=155, OR=156, ANSWER=157, KEYX=158, MOUSEPOS=159, PEEKCHAR=160, 
		QUESTION=161, READCHAR=162, SAY=163, SAYAS=164, SKIPCHAR=165, VOICES=166, 
		BROADCAST=167, CANCEL=168, CAREFULLY=169, DOLIST=170, DOTIMES=171, ERRORMESSAGE=172, 
		EVERYONE=173, FOREVER=174, LAUNCH=175, OUTPUT=176, REPEAT=177, RUN=178, 
		STOP=179, STOPALL=180, STOPME=181, WAIT=182, PROCEDURE=183, CALL=184, 
		DIVISION=185, NATURALNUMBER=186, FLOATNUMBER=187, BOOLEAN=188, OTHERWORD=189, 
		WHITESPACE=190, NEWLINE=191;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_cmd = 2, RULE_mathStatement = 3, 
		RULE_mathSentence = 4, RULE_mathValue = 5, RULE_singleArgMathOperator = 6, 
		RULE_doubleArgMathOperator = 7, RULE_stringArg = 8, RULE_variableName = 9, 
		RULE_procedure = 10, RULE_procedureCall = 11, RULE_repeat = 12, RULE_back = 13, 
		RULE_forward = 14, RULE_left = 15, RULE_right = 16, RULE_setheading = 17, 
		RULE_setx = 18, RULE_sety = 19, RULE_namefromcolor = 20, RULE_setcolor = 21, 
		RULE_setpensize = 22, RULE_setbg = 23, RULE_setpos = 24, RULE_distance = 25, 
		RULE_towards = 26, RULE_clearname = 27, RULE_namex = 28, RULE_thing = 29, 
		RULE_ifc = 30, RULE_ifelse = 31, RULE_heading = 32, RULE_home = 33, RULE_pos = 34, 
		RULE_xcor = 35, RULE_ycor = 36, RULE_clearnames = 37, RULE_names = 38, 
		RULE_bg = 39, RULE_cg = 40, RULE_clean = 41, RULE_color = 42, RULE_colorrunder = 43, 
		RULE_fill = 44, RULE_freezebg = 45, RULE_pd = 46, RULE_pe = 47, RULE_pensize = 48, 
		RULE_pu = 49, RULE_stamp = 50, RULE_unfreezebg = 51, RULE_let = 52, RULE_make = 53, 
		RULE_spaceArg = 54, RULE_newLineArg = 55, RULE_brakeArg = 56, RULE_naturalNumberArg = 57, 
		RULE_list = 58, RULE_endFileArg = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "cmd", "mathStatement", "mathSentence", "mathValue", 
			"singleArgMathOperator", "doubleArgMathOperator", "stringArg", "variableName", 
			"procedure", "procedureCall", "repeat", "back", "forward", "left", "right", 
			"setheading", "setx", "sety", "namefromcolor", "setcolor", "setpensize", 
			"setbg", "setpos", "distance", "towards", "clearname", "namex", "thing", 
			"ifc", "ifelse", "heading", "home", "pos", "xcor", "ycor", "clearnames", 
			"names", "bg", "cg", "clean", "color", "colorrunder", "fill", "freezebg", 
			"pd", "pe", "pensize", "pu", "stamp", "unfreezebg", "let", "make", "spaceArg", 
			"newLineArg", "brakeArg", "naturalNumberArg", "list", "endFileArg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "'['", "']'", "','", "'''", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'!='", null, null, null, null, "'-'", null, null, "'*'", null, null, 
			null, null, null, null, "'+'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "BACK", "DISTANCE", "FORWARD", 
			"HEADING", "HOME", "LEFT", "POS", "RIGHT", "SETHEADING", "SETPOS", "SETX", 
			"SETY", "TOWARDS", "XCOR", "YCOR", "BG", "CG", "CLEAN", "COLOR", "COLORUNDER", 
			"FILL", "FREEZEBG", "NAMEFROMCOLOUR", "PD", "PE", "PENSIZE", "PU", "SETBG", 
			"SETCOLOR", "SETPENSIZE", "STAMP", "UNFREEZEBG", "HT", "INBACK", "INFRONT", 
			"OPACITY", "SETOPACITY", "SETSHAPE", "SETSIZE", "SHAPE", "SIZE", "ST", 
			"CLICKOFF", "CLICKON", "CLONE", "TELL", "TOUCHINGX", "WHO", "ANNOUNCE", 
			"ASCII", "BOTTOM", "CB", "CC", "CD", "CF", "CHAR", "CLEARTEXT", "CU", 
			"DELETE", "EOL", "EOT", "HIDETEXT", "INSERT", "PRINT", "SELECT", "SELECTED", 
			"SHOW", "SHOWTEXT", "SOL", "TEXTCOUNT", "TEXTITEM", "TEXTPICK", "TEXTWHO", 
			"TOP", "TRANSPARENT", "UNSELECT", "BUTFIRST", "BUTLAST", "COUNT", "EMPTY", 
			"EQUALX", "FIRST", "FPUT", "IDENTICALX", "ITEM", "LAST", "LIST", "LISTX", 
			"LPUT", "MEMBERX", "NUMBER", "PARSE", "PICK", "SENTENCE", "WORD", "WORDX", 
			"ABS", "ARCTAN", "COS", "DIFFERENCE", "EXP", "INT", "LN", "LOG", "MINUS", 
			"PI", "POWER", "PRODUCT", "QUOTIENT", "RANDOM", "REMAINDER", "ROUND", 
			"SIN", "SQRT", "SUM", "TAN", "COMPARISON", "ASK", "FREEZE", "GET", "NEWPAGE", 
			"NEWSLIDER", "NEWTEXT", "NEWTURTLE", "REMOVE", "RENAME", "SET", "TALKTO", 
			"UNFREEZE", "RESETT", "TIMER", "CLEARNAME", "CLEARNAMES", "LET", "MAKE", 
			"NAMEX", "NAMES", "THING", "GETPAGE", "NAMEPAGE", "NEXTPAGE", "PAGELIST", 
			"PREVPAGE", "PROJECTSIZE", "AND", "IF", "IFELSE", "NOT", "OR", "ANSWER", 
			"KEYX", "MOUSEPOS", "PEEKCHAR", "QUESTION", "READCHAR", "SAY", "SAYAS", 
			"SKIPCHAR", "VOICES", "BROADCAST", "CANCEL", "CAREFULLY", "DOLIST", "DOTIMES", 
			"ERRORMESSAGE", "EVERYONE", "FOREVER", "LAUNCH", "OUTPUT", "REPEAT", 
			"RUN", "STOP", "STOPALL", "STOPME", "WAIT", "PROCEDURE", "CALL", "DIVISION", 
			"NATURALNUMBER", "FLOATNUMBER", "BOOLEAN", "OTHERWORD", "WHITESPACE", 
			"NEWLINE"
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
	public String getGrammarFileName() { return "Lynx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LynxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public EndFileArgContext endFileArg() {
			return getRuleContext(EndFileArgContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				line();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACK) | (1L << DISTANCE) | (1L << FORWARD) | (1L << HEADING) | (1L << HOME) | (1L << LEFT) | (1L << POS) | (1L << RIGHT) | (1L << SETHEADING) | (1L << SETPOS) | (1L << SETX) | (1L << SETY) | (1L << TOWARDS) | (1L << XCOR) | (1L << YCOR) | (1L << BG) | (1L << CG) | (1L << CLEAN) | (1L << COLOR) | (1L << COLORUNDER) | (1L << FILL) | (1L << FREEZEBG) | (1L << NAMEFROMCOLOUR) | (1L << PD) | (1L << PE) | (1L << PENSIZE) | (1L << PU) | (1L << SETBG) | (1L << SETCOLOR) | (1L << SETPENSIZE) | (1L << STAMP) | (1L << UNFREEZEBG))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (CLEARNAME - 139)) | (1L << (CLEARNAMES - 139)) | (1L << (LET - 139)) | (1L << (MAKE - 139)) | (1L << (NAMEX - 139)) | (1L << (NAMES - 139)) | (1L << (THING - 139)) | (1L << (IF - 139)) | (1L << (IFELSE - 139)) | (1L << (REPEAT - 139)) | (1L << (PROCEDURE - 139)) | (1L << (CALL - 139)) | (1L << (WHITESPACE - 139)) | (1L << (NEWLINE - 139)))) != 0) );
			setState(125);
			endFileArg();
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

	public static class LineContext extends ParserRuleContext {
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<SpaceArgContext> spaceArg() {
			return getRuleContexts(SpaceArgContext.class);
		}
		public SpaceArgContext spaceArg(int i) {
			return getRuleContext(SpaceArgContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(127);
				brakeArg();
				}
				break;
			}
			setState(137); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE) {
						{
						setState(130);
						spaceArg();
						}
					}

					setState(133);
					cmd();
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(134);
						spaceArg();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(139); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(141);
				brakeArg();
				}
				break;
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

	public static class CmdContext extends ParserRuleContext {
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public ProcedureCallContext procedureCall() {
			return getRuleContext(ProcedureCallContext.class,0);
		}
		public ForwardContext forward() {
			return getRuleContext(ForwardContext.class,0);
		}
		public BackContext back() {
			return getRuleContext(BackContext.class,0);
		}
		public LeftContext left() {
			return getRuleContext(LeftContext.class,0);
		}
		public RightContext right() {
			return getRuleContext(RightContext.class,0);
		}
		public SetheadingContext setheading() {
			return getRuleContext(SetheadingContext.class,0);
		}
		public SetxContext setx() {
			return getRuleContext(SetxContext.class,0);
		}
		public SetyContext sety() {
			return getRuleContext(SetyContext.class,0);
		}
		public SetposContext setpos() {
			return getRuleContext(SetposContext.class,0);
		}
		public DistanceContext distance() {
			return getRuleContext(DistanceContext.class,0);
		}
		public TowardsContext towards() {
			return getRuleContext(TowardsContext.class,0);
		}
		public HeadingContext heading() {
			return getRuleContext(HeadingContext.class,0);
		}
		public HomeContext home() {
			return getRuleContext(HomeContext.class,0);
		}
		public PosContext pos() {
			return getRuleContext(PosContext.class,0);
		}
		public XcorContext xcor() {
			return getRuleContext(XcorContext.class,0);
		}
		public YcorContext ycor() {
			return getRuleContext(YcorContext.class,0);
		}
		public ClearnameContext clearname() {
			return getRuleContext(ClearnameContext.class,0);
		}
		public NamexContext namex() {
			return getRuleContext(NamexContext.class,0);
		}
		public ThingContext thing() {
			return getRuleContext(ThingContext.class,0);
		}
		public ClearnamesContext clearnames() {
			return getRuleContext(ClearnamesContext.class,0);
		}
		public NamesContext names() {
			return getRuleContext(NamesContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public MakeContext make() {
			return getRuleContext(MakeContext.class,0);
		}
		public IfcContext ifc() {
			return getRuleContext(IfcContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public BgContext bg() {
			return getRuleContext(BgContext.class,0);
		}
		public CgContext cg() {
			return getRuleContext(CgContext.class,0);
		}
		public CleanContext clean() {
			return getRuleContext(CleanContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ColorrunderContext colorrunder() {
			return getRuleContext(ColorrunderContext.class,0);
		}
		public FillContext fill() {
			return getRuleContext(FillContext.class,0);
		}
		public FreezebgContext freezebg() {
			return getRuleContext(FreezebgContext.class,0);
		}
		public NamefromcolorContext namefromcolor() {
			return getRuleContext(NamefromcolorContext.class,0);
		}
		public PdContext pd() {
			return getRuleContext(PdContext.class,0);
		}
		public PeContext pe() {
			return getRuleContext(PeContext.class,0);
		}
		public PensizeContext pensize() {
			return getRuleContext(PensizeContext.class,0);
		}
		public PuContext pu() {
			return getRuleContext(PuContext.class,0);
		}
		public SetbgContext setbg() {
			return getRuleContext(SetbgContext.class,0);
		}
		public SetcolorContext setcolor() {
			return getRuleContext(SetcolorContext.class,0);
		}
		public SetpensizeContext setpensize() {
			return getRuleContext(SetpensizeContext.class,0);
		}
		public StampContext stamp() {
			return getRuleContext(StampContext.class,0);
		}
		public UnfreezebgContext unfreezebg() {
			return getRuleContext(UnfreezebgContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				repeat();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				procedure();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				procedureCall();
				}
				break;
			case FORWARD:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				forward();
				}
				break;
			case BACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				back();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				left();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				right();
				}
				break;
			case SETHEADING:
				enterOuterAlt(_localctx, 8);
				{
				setState(151);
				setheading();
				}
				break;
			case SETX:
				enterOuterAlt(_localctx, 9);
				{
				setState(152);
				setx();
				}
				break;
			case SETY:
				enterOuterAlt(_localctx, 10);
				{
				setState(153);
				sety();
				}
				break;
			case SETPOS:
				enterOuterAlt(_localctx, 11);
				{
				setState(154);
				setpos();
				}
				break;
			case DISTANCE:
				enterOuterAlt(_localctx, 12);
				{
				setState(155);
				distance();
				}
				break;
			case TOWARDS:
				enterOuterAlt(_localctx, 13);
				{
				setState(156);
				towards();
				}
				break;
			case HEADING:
				enterOuterAlt(_localctx, 14);
				{
				setState(157);
				heading();
				}
				break;
			case HOME:
				enterOuterAlt(_localctx, 15);
				{
				setState(158);
				home();
				}
				break;
			case POS:
				enterOuterAlt(_localctx, 16);
				{
				setState(159);
				pos();
				}
				break;
			case XCOR:
				enterOuterAlt(_localctx, 17);
				{
				setState(160);
				xcor();
				}
				break;
			case YCOR:
				enterOuterAlt(_localctx, 18);
				{
				setState(161);
				ycor();
				}
				break;
			case CLEARNAME:
				enterOuterAlt(_localctx, 19);
				{
				setState(162);
				clearname();
				}
				break;
			case NAMEX:
				enterOuterAlt(_localctx, 20);
				{
				setState(163);
				namex();
				}
				break;
			case THING:
				enterOuterAlt(_localctx, 21);
				{
				setState(164);
				thing();
				}
				break;
			case CLEARNAMES:
				enterOuterAlt(_localctx, 22);
				{
				setState(165);
				clearnames();
				}
				break;
			case NAMES:
				enterOuterAlt(_localctx, 23);
				{
				setState(166);
				names();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 24);
				{
				setState(167);
				let();
				}
				break;
			case MAKE:
				enterOuterAlt(_localctx, 25);
				{
				setState(168);
				make();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 26);
				{
				setState(169);
				ifc();
				}
				break;
			case IFELSE:
				enterOuterAlt(_localctx, 27);
				{
				setState(170);
				ifelse();
				}
				break;
			case BG:
				enterOuterAlt(_localctx, 28);
				{
				setState(171);
				bg();
				}
				break;
			case CG:
				enterOuterAlt(_localctx, 29);
				{
				setState(172);
				cg();
				}
				break;
			case CLEAN:
				enterOuterAlt(_localctx, 30);
				{
				setState(173);
				clean();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 31);
				{
				setState(174);
				color();
				}
				break;
			case COLORUNDER:
				enterOuterAlt(_localctx, 32);
				{
				setState(175);
				colorrunder();
				}
				break;
			case FILL:
				enterOuterAlt(_localctx, 33);
				{
				setState(176);
				fill();
				}
				break;
			case FREEZEBG:
				enterOuterAlt(_localctx, 34);
				{
				setState(177);
				freezebg();
				}
				break;
			case NAMEFROMCOLOUR:
				enterOuterAlt(_localctx, 35);
				{
				setState(178);
				namefromcolor();
				}
				break;
			case PD:
				enterOuterAlt(_localctx, 36);
				{
				setState(179);
				pd();
				}
				break;
			case PE:
				enterOuterAlt(_localctx, 37);
				{
				setState(180);
				pe();
				}
				break;
			case PENSIZE:
				enterOuterAlt(_localctx, 38);
				{
				setState(181);
				pensize();
				}
				break;
			case PU:
				enterOuterAlt(_localctx, 39);
				{
				setState(182);
				pu();
				}
				break;
			case SETBG:
				enterOuterAlt(_localctx, 40);
				{
				setState(183);
				setbg();
				}
				break;
			case SETCOLOR:
				enterOuterAlt(_localctx, 41);
				{
				setState(184);
				setcolor();
				}
				break;
			case SETPENSIZE:
				enterOuterAlt(_localctx, 42);
				{
				setState(185);
				setpensize();
				}
				break;
			case STAMP:
				enterOuterAlt(_localctx, 43);
				{
				setState(186);
				stamp();
				}
				break;
			case UNFREEZEBG:
				enterOuterAlt(_localctx, 44);
				{
				setState(187);
				unfreezebg();
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

	public static class MathStatementContext extends ParserRuleContext {
		public MathSentenceContext mathSentence() {
			return getRuleContext(MathSentenceContext.class,0);
		}
		public MathStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterMathStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitMathStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitMathStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathStatementContext mathStatement() throws RecognitionException {
		MathStatementContext _localctx = new MathStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mathStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			mathSentence(0);
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

	public static class MathSentenceContext extends ParserRuleContext {
		public MathSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathSentence; }
	 
		public MathSentenceContext() { }
		public void copyFrom(MathSentenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleArgsContext extends MathSentenceContext {
		public SingleArgMathOperatorContext singleArgMathOperator() {
			return getRuleContext(SingleArgMathOperatorContext.class,0);
		}
		public MathSentenceContext mathSentence() {
			return getRuleContext(MathSentenceContext.class,0);
		}
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public SingleArgsContext(MathSentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSingleArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSingleArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSingleArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleArgsContext extends MathSentenceContext {
		public List<MathSentenceContext> mathSentence() {
			return getRuleContexts(MathSentenceContext.class);
		}
		public MathSentenceContext mathSentence(int i) {
			return getRuleContext(MathSentenceContext.class,i);
		}
		public DoubleArgMathOperatorContext doubleArgMathOperator() {
			return getRuleContext(DoubleArgMathOperatorContext.class,0);
		}
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public DoubleArgsContext(MathSentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterDoubleArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitDoubleArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitDoubleArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueContext extends MathSentenceContext {
		public MathValueContext mathValue() {
			return getRuleContext(MathValueContext.class,0);
		}
		public ValueContext(MathSentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BraketsContext extends MathSentenceContext {
		public MathSentenceContext mathSentence() {
			return getRuleContext(MathSentenceContext.class,0);
		}
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public BraketsContext(MathSentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterBrakets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitBrakets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitBrakets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathSentenceContext mathSentence() throws RecognitionException {
		return mathSentence(0);
	}

	private MathSentenceContext mathSentence(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathSentenceContext _localctx = new MathSentenceContext(_ctx, _parentState);
		MathSentenceContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_mathSentence, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new BraketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				{
				setState(193);
				match(T__0);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(194);
					brakeArg();
					}
				}

				setState(197);
				mathSentence(0);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(198);
					brakeArg();
					}
				}

				setState(201);
				match(T__1);
				}
				}
				break;
			case ABS:
			case ARCTAN:
			case COS:
			case INT:
			case LN:
			case MINUS:
			case RANDOM:
			case ROUND:
			case SIN:
			case SQRT:
			case TAN:
			case NOT:
				{
				_localctx = new SingleArgsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				singleArgMathOperator();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(204);
					brakeArg();
					}
				}

				setState(207);
				mathSentence(2);
				}
				break;
			case T__2:
			case NATURALNUMBER:
			case FLOATNUMBER:
			case BOOLEAN:
				{
				_localctx = new ValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				mathValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DoubleArgsContext(new MathSentenceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_mathSentence);
					setState(212);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE || _la==NEWLINE) {
						{
						setState(213);
						brakeArg();
						}
					}

					setState(216);
					doubleArgMathOperator();
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE || _la==NEWLINE) {
						{
						setState(217);
						brakeArg();
						}
					}

					setState(220);
					mathSentence(4);
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class MathValueContext extends ParserRuleContext {
		public TerminalNode FLOATNUMBER() { return getToken(LynxParser.FLOATNUMBER, 0); }
		public TerminalNode NATURALNUMBER() { return getToken(LynxParser.NATURALNUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(LynxParser.BOOLEAN, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public MathValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterMathValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitMathValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitMathValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathValueContext mathValue() throws RecognitionException {
		MathValueContext _localctx = new MathValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mathValue);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOATNUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(FLOATNUMBER);
				}
				break;
			case NATURALNUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(NATURALNUMBER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(BOOLEAN);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				variableName();
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

	public static class SingleArgMathOperatorContext extends ParserRuleContext {
		public SingleArgMathOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleArgMathOperator; }
	 
		public SingleArgMathOperatorContext() { }
		public void copyFrom(SingleArgMathOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TanContext extends SingleArgMathOperatorContext {
		public TerminalNode TAN() { return getToken(LynxParser.TAN, 0); }
		public TanContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterTan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitTan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitTan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RandomContext extends SingleArgMathOperatorContext {
		public TerminalNode RANDOM() { return getToken(LynxParser.RANDOM, 0); }
		public RandomContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterRandom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitRandom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitRandom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LnContext extends SingleArgMathOperatorContext {
		public TerminalNode LN() { return getToken(LynxParser.LN, 0); }
		public LnContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterLn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitLn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitLn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusSingleContext extends SingleArgMathOperatorContext {
		public TerminalNode MINUS() { return getToken(LynxParser.MINUS, 0); }
		public MinusSingleContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterMinusSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitMinusSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitMinusSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends SingleArgMathOperatorContext {
		public TerminalNode NOT() { return getToken(LynxParser.NOT, 0); }
		public NotContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbsContext extends SingleArgMathOperatorContext {
		public TerminalNode ABS() { return getToken(LynxParser.ABS, 0); }
		public AbsContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterAbs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitAbs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitAbs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int1Context extends SingleArgMathOperatorContext {
		public TerminalNode INT() { return getToken(LynxParser.INT, 0); }
		public Int1Context(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterInt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitInt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitInt1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArctanContext extends SingleArgMathOperatorContext {
		public TerminalNode ARCTAN() { return getToken(LynxParser.ARCTAN, 0); }
		public ArctanContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterArctan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitArctan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitArctan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RoundContext extends SingleArgMathOperatorContext {
		public TerminalNode ROUND() { return getToken(LynxParser.ROUND, 0); }
		public RoundContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterRound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitRound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitRound(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqrtContext extends SingleArgMathOperatorContext {
		public TerminalNode SQRT() { return getToken(LynxParser.SQRT, 0); }
		public SqrtContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSqrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSqrt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSqrt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosContext extends SingleArgMathOperatorContext {
		public TerminalNode COS() { return getToken(LynxParser.COS, 0); }
		public CosContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterCos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitCos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinContext extends SingleArgMathOperatorContext {
		public TerminalNode SIN() { return getToken(LynxParser.SIN, 0); }
		public SinContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleArgMathOperatorContext singleArgMathOperator() throws RecognitionException {
		SingleArgMathOperatorContext _localctx = new SingleArgMathOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleArgMathOperator);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABS:
				_localctx = new AbsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(ABS);
				}
				break;
			case ARCTAN:
				_localctx = new ArctanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(ARCTAN);
				}
				break;
			case COS:
				_localctx = new CosContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(COS);
				}
				break;
			case INT:
				_localctx = new Int1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(INT);
				}
				break;
			case LN:
				_localctx = new LnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				match(LN);
				}
				break;
			case MINUS:
				_localctx = new MinusSingleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				match(MINUS);
				}
				break;
			case RANDOM:
				_localctx = new RandomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(239);
				match(RANDOM);
				}
				break;
			case ROUND:
				_localctx = new RoundContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(240);
				match(ROUND);
				}
				break;
			case SIN:
				_localctx = new SinContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(241);
				match(SIN);
				}
				break;
			case SQRT:
				_localctx = new SqrtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(242);
				match(SQRT);
				}
				break;
			case TAN:
				_localctx = new TanContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(243);
				match(TAN);
				}
				break;
			case NOT:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(244);
				match(NOT);
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

	public static class DoubleArgMathOperatorContext extends ParserRuleContext {
		public DoubleArgMathOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleArgMathOperator; }
	 
		public DoubleArgMathOperatorContext() { }
		public void copyFrom(DoubleArgMathOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinusContext extends DoubleArgMathOperatorContext {
		public TerminalNode MINUS() { return getToken(LynxParser.MINUS, 0); }
		public MinusContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProductContext extends DoubleArgMathOperatorContext {
		public TerminalNode PRODUCT() { return getToken(LynxParser.PRODUCT, 0); }
		public ProductContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitProduct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends DoubleArgMathOperatorContext {
		public TerminalNode COMPARISON() { return getToken(LynxParser.COMPARISON, 0); }
		public ComparisonContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends DoubleArgMathOperatorContext {
		public TerminalNode OR() { return getToken(LynxParser.OR, 0); }
		public OrContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogContext extends DoubleArgMathOperatorContext {
		public TerminalNode LOG() { return getToken(LynxParser.LOG, 0); }
		public LogContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumContext extends DoubleArgMathOperatorContext {
		public TerminalNode SUM() { return getToken(LynxParser.SUM, 0); }
		public SumContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuotientContext extends DoubleArgMathOperatorContext {
		public TerminalNode QUOTIENT() { return getToken(LynxParser.QUOTIENT, 0); }
		public QuotientContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterQuotient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitQuotient(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitQuotient(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends DoubleArgMathOperatorContext {
		public TerminalNode DIVISION() { return getToken(LynxParser.DIVISION, 0); }
		public DivisionContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends DoubleArgMathOperatorContext {
		public TerminalNode AND() { return getToken(LynxParser.AND, 0); }
		public AndContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DifferenceContext extends DoubleArgMathOperatorContext {
		public TerminalNode DIFFERENCE() { return getToken(LynxParser.DIFFERENCE, 0); }
		public DifferenceContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterDifference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitDifference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitDifference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerContext extends DoubleArgMathOperatorContext {
		public TerminalNode POWER() { return getToken(LynxParser.POWER, 0); }
		public PowerContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpContext extends DoubleArgMathOperatorContext {
		public TerminalNode EXP() { return getToken(LynxParser.EXP, 0); }
		public ExpContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RemainderContext extends DoubleArgMathOperatorContext {
		public TerminalNode REMAINDER() { return getToken(LynxParser.REMAINDER, 0); }
		public RemainderContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterRemainder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitRemainder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitRemainder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleArgMathOperatorContext doubleArgMathOperator() throws RecognitionException {
		DoubleArgMathOperatorContext _localctx = new DoubleArgMathOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_doubleArgMathOperator);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIFFERENCE:
				_localctx = new DifferenceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(DIFFERENCE);
				}
				break;
			case POWER:
				_localctx = new PowerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(POWER);
				}
				break;
			case QUOTIENT:
				_localctx = new QuotientContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(QUOTIENT);
				}
				break;
			case REMAINDER:
				_localctx = new RemainderContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				match(REMAINDER);
				}
				break;
			case SUM:
				_localctx = new SumContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				match(SUM);
				}
				break;
			case MINUS:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				match(MINUS);
				}
				break;
			case PRODUCT:
				_localctx = new ProductContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				match(PRODUCT);
				}
				break;
			case DIVISION:
				_localctx = new DivisionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				match(DIVISION);
				}
				break;
			case COMPARISON:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(255);
				match(COMPARISON);
				}
				break;
			case EXP:
				_localctx = new ExpContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(256);
				match(EXP);
				}
				break;
			case LOG:
				_localctx = new LogContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(257);
				match(LOG);
				}
				break;
			case OR:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(258);
				match(OR);
				}
				break;
			case AND:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(259);
				match(AND);
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

	public static class StringArgContext extends ParserRuleContext {
		public TerminalNode OTHERWORD() { return getToken(LynxParser.OTHERWORD, 0); }
		public StringArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterStringArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitStringArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitStringArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringArgContext stringArg() throws RecognitionException {
		StringArgContext _localctx = new StringArgContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(OTHERWORD);
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode OTHERWORD() { return getToken(LynxParser.OTHERWORD, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__2);
			setState(265);
			match(OTHERWORD);
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(LynxParser.PROCEDURE, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_procedure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(PROCEDURE);
			setState(268);
			brakeArg();
			setState(269);
			stringArg();
			setState(270);
			brakeArg();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(271);
				variableName();
				setState(272);
				brakeArg();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(T__3);
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(280);
				brakeArg();
				}
				break;
			}
			setState(284); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(283);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(286); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(288);
				brakeArg();
				}
			}

			setState(291);
			match(T__4);
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

	public static class ProcedureCallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(LynxParser.CALL, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public List<MathStatementContext> mathStatement() {
			return getRuleContexts(MathStatementContext.class);
		}
		public MathStatementContext mathStatement(int i) {
			return getRuleContext(MathStatementContext.class,i);
		}
		public ProcedureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterProcedureCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitProcedureCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitProcedureCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureCallContext procedureCall() throws RecognitionException {
		ProcedureCallContext _localctx = new ProcedureCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_procedureCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(CALL);
			setState(294);
			brakeArg();
			setState(295);
			stringArg();
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					brakeArg();
					setState(297);
					mathStatement();
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(304);
				brakeArg();
				}
				break;
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

	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(LynxParser.REPEAT, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(REPEAT);
			setState(308);
			brakeArg();
			setState(309);
			mathStatement();
			setState(310);
			brakeArg();
			setState(311);
			match(T__3);
			setState(312);
			line();
			setState(313);
			match(T__4);
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

	public static class BackContext extends ParserRuleContext {
		public TerminalNode BACK() { return getToken(LynxParser.BACK, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public BackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_back; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterBack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitBack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitBack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackContext back() throws RecognitionException {
		BackContext _localctx = new BackContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_back);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(BACK);
			setState(316);
			brakeArg();
			setState(317);
			mathStatement();
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

	public static class ForwardContext extends ParserRuleContext {
		public TerminalNode FORWARD() { return getToken(LynxParser.FORWARD, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public ForwardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forward; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterForward(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitForward(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitForward(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForwardContext forward() throws RecognitionException {
		ForwardContext _localctx = new ForwardContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forward);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(FORWARD);
			setState(320);
			brakeArg();
			setState(321);
			mathStatement();
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

	public static class LeftContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(LynxParser.LEFT, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public LeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftContext left() throws RecognitionException {
		LeftContext _localctx = new LeftContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(LEFT);
			setState(324);
			brakeArg();
			setState(325);
			mathStatement();
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

	public static class RightContext extends ParserRuleContext {
		public TerminalNode RIGHT() { return getToken(LynxParser.RIGHT, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public RightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightContext right() throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(RIGHT);
			setState(328);
			brakeArg();
			setState(329);
			mathStatement();
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

	public static class SetheadingContext extends ParserRuleContext {
		public TerminalNode SETHEADING() { return getToken(LynxParser.SETHEADING, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public SetheadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setheading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSetheading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSetheading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSetheading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetheadingContext setheading() throws RecognitionException {
		SetheadingContext _localctx = new SetheadingContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_setheading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(SETHEADING);
			setState(332);
			brakeArg();
			setState(333);
			mathStatement();
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

	public static class SetxContext extends ParserRuleContext {
		public TerminalNode SETX() { return getToken(LynxParser.SETX, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public SetxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSetx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSetx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSetx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetxContext setx() throws RecognitionException {
		SetxContext _localctx = new SetxContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_setx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(SETX);
			setState(336);
			brakeArg();
			setState(337);
			mathStatement();
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

	public static class SetyContext extends ParserRuleContext {
		public TerminalNode SETY() { return getToken(LynxParser.SETY, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public SetyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sety; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSety(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSety(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSety(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetyContext sety() throws RecognitionException {
		SetyContext _localctx = new SetyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sety);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(SETY);
			setState(340);
			brakeArg();
			setState(341);
			mathStatement();
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

	public static class NamefromcolorContext extends ParserRuleContext {
		public TerminalNode NAMEFROMCOLOUR() { return getToken(LynxParser.NAMEFROMCOLOUR, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public NamefromcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namefromcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterNamefromcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitNamefromcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitNamefromcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamefromcolorContext namefromcolor() throws RecognitionException {
		NamefromcolorContext _localctx = new NamefromcolorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_namefromcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(NAMEFROMCOLOUR);
			setState(344);
			brakeArg();
			setState(345);
			mathStatement();
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

	public static class SetcolorContext extends ParserRuleContext {
		public TerminalNode SETCOLOR() { return getToken(LynxParser.SETCOLOR, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public SetcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSetcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSetcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSetcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetcolorContext setcolor() throws RecognitionException {
		SetcolorContext _localctx = new SetcolorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_setcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(SETCOLOR);
			setState(348);
			brakeArg();
			setState(349);
			mathStatement();
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

	public static class SetpensizeContext extends ParserRuleContext {
		public TerminalNode SETPENSIZE() { return getToken(LynxParser.SETPENSIZE, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public SetpensizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setpensize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSetpensize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSetpensize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSetpensize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetpensizeContext setpensize() throws RecognitionException {
		SetpensizeContext _localctx = new SetpensizeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_setpensize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(SETPENSIZE);
			setState(352);
			brakeArg();
			setState(353);
			mathStatement();
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

	public static class SetbgContext extends ParserRuleContext {
		public TerminalNode SETBG() { return getToken(LynxParser.SETBG, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public SetbgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setbg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSetbg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSetbg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSetbg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetbgContext setbg() throws RecognitionException {
		SetbgContext _localctx = new SetbgContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_setbg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(SETBG);
			setState(356);
			brakeArg();
			setState(357);
			mathStatement();
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

	public static class SetposContext extends ParserRuleContext {
		public TerminalNode SETPOS() { return getToken(LynxParser.SETPOS, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public List<MathStatementContext> mathStatement() {
			return getRuleContexts(MathStatementContext.class);
		}
		public MathStatementContext mathStatement(int i) {
			return getRuleContext(MathStatementContext.class,i);
		}
		public SetposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setpos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSetpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSetpos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSetpos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetposContext setpos() throws RecognitionException {
		SetposContext _localctx = new SetposContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_setpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(SETPOS);
			setState(360);
			brakeArg();
			setState(361);
			match(T__3);
			setState(362);
			brakeArg();
			setState(363);
			mathStatement();
			setState(364);
			brakeArg();
			setState(365);
			match(T__5);
			setState(366);
			brakeArg();
			setState(367);
			mathStatement();
			setState(368);
			brakeArg();
			setState(369);
			match(T__4);
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

	public static class DistanceContext extends ParserRuleContext {
		public TerminalNode DISTANCE() { return getToken(LynxParser.DISTANCE, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public DistanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterDistance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitDistance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitDistance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistanceContext distance() throws RecognitionException {
		DistanceContext _localctx = new DistanceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_distance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(DISTANCE);
			setState(372);
			brakeArg();
			setState(373);
			match(T__6);
			setState(374);
			stringArg();
			setState(375);
			match(T__6);
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

	public static class TowardsContext extends ParserRuleContext {
		public TerminalNode TOWARDS() { return getToken(LynxParser.TOWARDS, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public TowardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_towards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterTowards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitTowards(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitTowards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TowardsContext towards() throws RecognitionException {
		TowardsContext _localctx = new TowardsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_towards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(TOWARDS);
			setState(378);
			brakeArg();
			setState(379);
			match(T__6);
			setState(380);
			stringArg();
			setState(381);
			match(T__6);
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

	public static class ClearnameContext extends ParserRuleContext {
		public TerminalNode CLEARNAME() { return getToken(LynxParser.CLEARNAME, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public ClearnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clearname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterClearname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitClearname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitClearname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClearnameContext clearname() throws RecognitionException {
		ClearnameContext _localctx = new ClearnameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_clearname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(CLEARNAME);
			setState(384);
			brakeArg();
			setState(385);
			match(T__6);
			setState(386);
			stringArg();
			setState(387);
			match(T__6);
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

	public static class NamexContext extends ParserRuleContext {
		public TerminalNode NAMEX() { return getToken(LynxParser.NAMEX, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public NamexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterNamex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitNamex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitNamex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamexContext namex() throws RecognitionException {
		NamexContext _localctx = new NamexContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_namex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(NAMEX);
			setState(390);
			brakeArg();
			setState(391);
			match(T__6);
			setState(392);
			stringArg();
			setState(393);
			match(T__6);
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

	public static class ThingContext extends ParserRuleContext {
		public TerminalNode THING() { return getToken(LynxParser.THING, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public ThingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterThing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitThing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitThing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThingContext thing() throws RecognitionException {
		ThingContext _localctx = new ThingContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_thing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(THING);
			setState(396);
			brakeArg();
			setState(397);
			match(T__6);
			setState(398);
			stringArg();
			setState(399);
			match(T__6);
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

	public static class IfcContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LynxParser.IF, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public IfcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterIfc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitIfc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitIfc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfcContext ifc() throws RecognitionException {
		IfcContext _localctx = new IfcContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ifc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(IF);
			setState(402);
			brakeArg();
			setState(403);
			mathStatement();
			setState(404);
			brakeArg();
			setState(405);
			match(T__3);
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(406);
				brakeArg();
				}
				break;
			}
			setState(409);
			line();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(410);
				brakeArg();
				}
			}

			setState(413);
			match(T__4);
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

	public static class IfelseContext extends ParserRuleContext {
		public TerminalNode IFELSE() { return getToken(LynxParser.IFELSE, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitIfelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(IFELSE);
			setState(416);
			brakeArg();
			setState(417);
			mathStatement();
			setState(418);
			brakeArg();
			setState(419);
			match(T__3);
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(420);
				brakeArg();
				}
				break;
			}
			setState(423);
			line();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(424);
				brakeArg();
				}
			}

			setState(427);
			match(T__4);
			setState(428);
			brakeArg();
			setState(429);
			match(T__3);
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(430);
				brakeArg();
				}
				break;
			}
			setState(433);
			line();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(434);
				brakeArg();
				}
			}

			setState(437);
			match(T__4);
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

	public static class HeadingContext extends ParserRuleContext {
		public TerminalNode HEADING() { return getToken(LynxParser.HEADING, 0); }
		public HeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitHeading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitHeading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadingContext heading() throws RecognitionException {
		HeadingContext _localctx = new HeadingContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_heading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(HEADING);
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

	public static class HomeContext extends ParserRuleContext {
		public TerminalNode HOME() { return getToken(LynxParser.HOME, 0); }
		public HomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterHome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitHome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitHome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HomeContext home() throws RecognitionException {
		HomeContext _localctx = new HomeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_home);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(HOME);
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

	public static class PosContext extends ParserRuleContext {
		public TerminalNode POS() { return getToken(LynxParser.POS, 0); }
		public PosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterPos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitPos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitPos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosContext pos() throws RecognitionException {
		PosContext _localctx = new PosContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_pos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(POS);
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

	public static class XcorContext extends ParserRuleContext {
		public TerminalNode XCOR() { return getToken(LynxParser.XCOR, 0); }
		public XcorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xcor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterXcor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitXcor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitXcor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XcorContext xcor() throws RecognitionException {
		XcorContext _localctx = new XcorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_xcor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(XCOR);
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

	public static class YcorContext extends ParserRuleContext {
		public TerminalNode YCOR() { return getToken(LynxParser.YCOR, 0); }
		public YcorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ycor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterYcor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitYcor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitYcor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YcorContext ycor() throws RecognitionException {
		YcorContext _localctx = new YcorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ycor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(YCOR);
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

	public static class ClearnamesContext extends ParserRuleContext {
		public TerminalNode CLEARNAMES() { return getToken(LynxParser.CLEARNAMES, 0); }
		public ClearnamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clearnames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterClearnames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitClearnames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitClearnames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClearnamesContext clearnames() throws RecognitionException {
		ClearnamesContext _localctx = new ClearnamesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_clearnames);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(CLEARNAMES);
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

	public static class NamesContext extends ParserRuleContext {
		public TerminalNode NAMES() { return getToken(LynxParser.NAMES, 0); }
		public NamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamesContext names() throws RecognitionException {
		NamesContext _localctx = new NamesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_names);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(NAMES);
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

	public static class BgContext extends ParserRuleContext {
		public TerminalNode BG() { return getToken(LynxParser.BG, 0); }
		public BgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterBg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitBg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitBg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BgContext bg() throws RecognitionException {
		BgContext _localctx = new BgContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_bg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(BG);
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

	public static class CgContext extends ParserRuleContext {
		public TerminalNode CG() { return getToken(LynxParser.CG, 0); }
		public CgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterCg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitCg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitCg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CgContext cg() throws RecognitionException {
		CgContext _localctx = new CgContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(CG);
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

	public static class CleanContext extends ParserRuleContext {
		public TerminalNode CLEAN() { return getToken(LynxParser.CLEAN, 0); }
		public CleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterClean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitClean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitClean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CleanContext clean() throws RecognitionException {
		CleanContext _localctx = new CleanContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_clean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(CLEAN);
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(LynxParser.COLOR, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(COLOR);
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

	public static class ColorrunderContext extends ParserRuleContext {
		public TerminalNode COLORUNDER() { return getToken(LynxParser.COLORUNDER, 0); }
		public ColorrunderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorrunder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterColorrunder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitColorrunder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitColorrunder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorrunderContext colorrunder() throws RecognitionException {
		ColorrunderContext _localctx = new ColorrunderContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_colorrunder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(COLORUNDER);
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

	public static class FillContext extends ParserRuleContext {
		public TerminalNode FILL() { return getToken(LynxParser.FILL, 0); }
		public FillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fill; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterFill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitFill(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitFill(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FillContext fill() throws RecognitionException {
		FillContext _localctx = new FillContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fill);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(FILL);
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

	public static class FreezebgContext extends ParserRuleContext {
		public TerminalNode FREEZEBG() { return getToken(LynxParser.FREEZEBG, 0); }
		public FreezebgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freezebg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterFreezebg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitFreezebg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitFreezebg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FreezebgContext freezebg() throws RecognitionException {
		FreezebgContext _localctx = new FreezebgContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_freezebg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(FREEZEBG);
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

	public static class PdContext extends ParserRuleContext {
		public TerminalNode PD() { return getToken(LynxParser.PD, 0); }
		public PdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterPd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitPd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitPd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PdContext pd() throws RecognitionException {
		PdContext _localctx = new PdContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_pd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(PD);
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

	public static class PeContext extends ParserRuleContext {
		public TerminalNode PE() { return getToken(LynxParser.PE, 0); }
		public PeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterPe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitPe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitPe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeContext pe() throws RecognitionException {
		PeContext _localctx = new PeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_pe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(PE);
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

	public static class PensizeContext extends ParserRuleContext {
		public TerminalNode PENSIZE() { return getToken(LynxParser.PENSIZE, 0); }
		public PensizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pensize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterPensize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitPensize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitPensize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PensizeContext pensize() throws RecognitionException {
		PensizeContext _localctx = new PensizeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_pensize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(PENSIZE);
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

	public static class PuContext extends ParserRuleContext {
		public TerminalNode PU() { return getToken(LynxParser.PU, 0); }
		public PuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterPu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitPu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitPu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuContext pu() throws RecognitionException {
		PuContext _localctx = new PuContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_pu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(PU);
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

	public static class StampContext extends ParserRuleContext {
		public TerminalNode STAMP() { return getToken(LynxParser.STAMP, 0); }
		public StampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stamp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterStamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitStamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitStamp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StampContext stamp() throws RecognitionException {
		StampContext _localctx = new StampContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_stamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(STAMP);
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

	public static class UnfreezebgContext extends ParserRuleContext {
		public TerminalNode UNFREEZEBG() { return getToken(LynxParser.UNFREEZEBG, 0); }
		public UnfreezebgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unfreezebg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterUnfreezebg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitUnfreezebg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitUnfreezebg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnfreezebgContext unfreezebg() throws RecognitionException {
		UnfreezebgContext _localctx = new UnfreezebgContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_unfreezebg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(UNFREEZEBG);
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

	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(LynxParser.LET, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(LET);
			setState(480);
			brakeArg();
			setState(481);
			variableName();
			setState(482);
			brakeArg();
			setState(483);
			mathStatement();
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(484);
				brakeArg();
				}
				break;
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

	public static class MakeContext extends ParserRuleContext {
		public TerminalNode MAKE() { return getToken(LynxParser.MAKE, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public TerminalNode WORD() { return getToken(LynxParser.WORD, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MakeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_make; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterMake(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitMake(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitMake(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MakeContext make() throws RecognitionException {
		MakeContext _localctx = new MakeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_make);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(MAKE);
			setState(488);
			brakeArg();
			setState(489);
			match(T__6);
			setState(490);
			stringArg();
			setState(491);
			match(T__6);
			setState(492);
			brakeArg();
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				{
				setState(493);
				match(WORD);
				}
				break;
			case T__3:
				{
				setState(494);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SpaceArgContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(LynxParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LynxParser.WHITESPACE, i);
		}
		public SpaceArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spaceArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSpaceArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSpaceArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSpaceArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceArgContext spaceArg() throws RecognitionException {
		SpaceArgContext _localctx = new SpaceArgContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_spaceArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(498); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(497);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(500); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class NewLineArgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(LynxParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LynxParser.NEWLINE, i);
		}
		public NewLineArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newLineArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterNewLineArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitNewLineArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitNewLineArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewLineArgContext newLineArg() throws RecognitionException {
		NewLineArgContext _localctx = new NewLineArgContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_newLineArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(502);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(505); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class BrakeArgContext extends ParserRuleContext {
		public List<SpaceArgContext> spaceArg() {
			return getRuleContexts(SpaceArgContext.class);
		}
		public SpaceArgContext spaceArg(int i) {
			return getRuleContext(SpaceArgContext.class,i);
		}
		public List<NewLineArgContext> newLineArg() {
			return getRuleContexts(NewLineArgContext.class);
		}
		public NewLineArgContext newLineArg(int i) {
			return getRuleContext(NewLineArgContext.class,i);
		}
		public BrakeArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brakeArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterBrakeArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitBrakeArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitBrakeArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrakeArgContext brakeArg() throws RecognitionException {
		BrakeArgContext _localctx = new BrakeArgContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_brakeArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(509);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WHITESPACE:
						{
						setState(507);
						spaceArg();
						}
						break;
					case NEWLINE:
						{
						setState(508);
						newLineArg();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(511); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class NaturalNumberArgContext extends ParserRuleContext {
		public TerminalNode NATURALNUMBER() { return getToken(LynxParser.NATURALNUMBER, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public NaturalNumberArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naturalNumberArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterNaturalNumberArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitNaturalNumberArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitNaturalNumberArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NaturalNumberArgContext naturalNumberArg() throws RecognitionException {
		NaturalNumberArgContext _localctx = new NaturalNumberArgContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_naturalNumberArg);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NATURALNUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(NATURALNUMBER);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				variableName();
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

	public static class ListContext extends ParserRuleContext {
		public List<MathStatementContext> mathStatement() {
			return getRuleContexts(MathStatementContext.class);
		}
		public MathStatementContext mathStatement(int i) {
			return getRuleContext(MathStatementContext.class,i);
		}
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(T__3);
			setState(522); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE || _la==NEWLINE) {
						{
						setState(518);
						brakeArg();
						}
					}

					setState(521);
					mathStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(524); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(526);
				brakeArg();
				}
			}

			setState(529);
			match(T__4);
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

	public static class EndFileArgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LynxParser.EOF, 0); }
		public EndFileArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endFileArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterEndFileArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitEndFileArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitEndFileArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndFileArgContext endFileArg() throws RecognitionException {
		EndFileArgContext _localctx = new EndFileArgContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_endFileArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(EOF);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return mathSentence_sempred((MathSentenceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathSentence_sempred(MathSentenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c1\u0218\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\6\2|\n\2\r\2\16\2}\3\2\3\2\3\3\5\3\u0083\n\3\3\3\5\3\u0086\n\3\3"+
		"\3\3\3\5\3\u008a\n\3\6\3\u008c\n\3\r\3\16\3\u008d\3\3\5\3\u0091\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00bf\n\4\3\5\3\5\3\6\3\6\3\6\5"+
		"\6\u00c6\n\6\3\6\3\6\5\6\u00ca\n\6\3\6\3\6\3\6\3\6\5\6\u00d0\n\6\3\6\3"+
		"\6\3\6\5\6\u00d5\n\6\3\6\3\6\5\6\u00d9\n\6\3\6\3\6\5\6\u00dd\n\6\3\6\3"+
		"\6\7\6\u00e1\n\6\f\6\16\6\u00e4\13\6\3\7\3\7\3\7\3\7\5\7\u00ea\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00f8\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0107\n\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0115\n\f\f\f\16\f\u0118\13\f"+
		"\3\f\3\f\5\f\u011c\n\f\3\f\6\f\u011f\n\f\r\f\16\f\u0120\3\f\5\f\u0124"+
		"\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u012e\n\r\f\r\16\r\u0131\13\r"+
		"\3\r\5\r\u0134\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \5 \u019a\n \3 \3 \5 \u019e\n \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\5!\u01a8\n!\3!\3!\5!\u01ac\n!\3!\3!\3!\3!\5!\u01b2\n!\3!\3!\5!\u01b6"+
		"\n!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01e8\n\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u01f2\n\67\38\68\u01f5\n8\r8"+
		"\168\u01f6\39\69\u01fa\n9\r9\169\u01fb\3:\3:\6:\u0200\n:\r:\16:\u0201"+
		"\3;\3;\5;\u0206\n;\3<\3<\5<\u020a\n<\3<\6<\u020d\n<\r<\16<\u020e\3<\5"+
		"<\u0212\n<\3<\3<\3=\3=\3=\2\3\n>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\2\2\u0244\2"+
		"{\3\2\2\2\4\u0082\3\2\2\2\6\u00be\3\2\2\2\b\u00c0\3\2\2\2\n\u00d4\3\2"+
		"\2\2\f\u00e9\3\2\2\2\16\u00f7\3\2\2\2\20\u0106\3\2\2\2\22\u0108\3\2\2"+
		"\2\24\u010a\3\2\2\2\26\u010d\3\2\2\2\30\u0127\3\2\2\2\32\u0135\3\2\2\2"+
		"\34\u013d\3\2\2\2\36\u0141\3\2\2\2 \u0145\3\2\2\2\"\u0149\3\2\2\2$\u014d"+
		"\3\2\2\2&\u0151\3\2\2\2(\u0155\3\2\2\2*\u0159\3\2\2\2,\u015d\3\2\2\2."+
		"\u0161\3\2\2\2\60\u0165\3\2\2\2\62\u0169\3\2\2\2\64\u0175\3\2\2\2\66\u017b"+
		"\3\2\2\28\u0181\3\2\2\2:\u0187\3\2\2\2<\u018d\3\2\2\2>\u0193\3\2\2\2@"+
		"\u01a1\3\2\2\2B\u01b9\3\2\2\2D\u01bb\3\2\2\2F\u01bd\3\2\2\2H\u01bf\3\2"+
		"\2\2J\u01c1\3\2\2\2L\u01c3\3\2\2\2N\u01c5\3\2\2\2P\u01c7\3\2\2\2R\u01c9"+
		"\3\2\2\2T\u01cb\3\2\2\2V\u01cd\3\2\2\2X\u01cf\3\2\2\2Z\u01d1\3\2\2\2\\"+
		"\u01d3\3\2\2\2^\u01d5\3\2\2\2`\u01d7\3\2\2\2b\u01d9\3\2\2\2d\u01db\3\2"+
		"\2\2f\u01dd\3\2\2\2h\u01df\3\2\2\2j\u01e1\3\2\2\2l\u01e9\3\2\2\2n\u01f4"+
		"\3\2\2\2p\u01f9\3\2\2\2r\u01ff\3\2\2\2t\u0205\3\2\2\2v\u0207\3\2\2\2x"+
		"\u0215\3\2\2\2z|\5\4\3\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\5x=\2\u0080\3\3\2\2\2\u0081\u0083\5r:\2\u0082\u0081"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u008b\3\2\2\2\u0084\u0086\5n8\2\u0085"+
		"\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\5\6"+
		"\4\2\u0088\u008a\5n8\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c"+
		"\3\2\2\2\u008b\u0085\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0091\5r:\2\u0090\u008f\3\2\2"+
		"\2\u0090\u0091\3\2\2\2\u0091\5\3\2\2\2\u0092\u00bf\5\32\16\2\u0093\u00bf"+
		"\5\26\f\2\u0094\u00bf\5\30\r\2\u0095\u00bf\5\36\20\2\u0096\u00bf\5\34"+
		"\17\2\u0097\u00bf\5 \21\2\u0098\u00bf\5\"\22\2\u0099\u00bf\5$\23\2\u009a"+
		"\u00bf\5&\24\2\u009b\u00bf\5(\25\2\u009c\u00bf\5\62\32\2\u009d\u00bf\5"+
		"\64\33\2\u009e\u00bf\5\66\34\2\u009f\u00bf\5B\"\2\u00a0\u00bf\5D#\2\u00a1"+
		"\u00bf\5F$\2\u00a2\u00bf\5H%\2\u00a3\u00bf\5J&\2\u00a4\u00bf\58\35\2\u00a5"+
		"\u00bf\5:\36\2\u00a6\u00bf\5<\37\2\u00a7\u00bf\5L\'\2\u00a8\u00bf\5N("+
		"\2\u00a9\u00bf\5j\66\2\u00aa\u00bf\5l\67\2\u00ab\u00bf\5> \2\u00ac\u00bf"+
		"\5@!\2\u00ad\u00bf\5P)\2\u00ae\u00bf\5R*\2\u00af\u00bf\5T+\2\u00b0\u00bf"+
		"\5V,\2\u00b1\u00bf\5X-\2\u00b2\u00bf\5Z.\2\u00b3\u00bf\5\\/\2\u00b4\u00bf"+
		"\5*\26\2\u00b5\u00bf\5^\60\2\u00b6\u00bf\5`\61\2\u00b7\u00bf\5b\62\2\u00b8"+
		"\u00bf\5d\63\2\u00b9\u00bf\5\60\31\2\u00ba\u00bf\5,\27\2\u00bb\u00bf\5"+
		".\30\2\u00bc\u00bf\5f\64\2\u00bd\u00bf\5h\65\2\u00be\u0092\3\2\2\2\u00be"+
		"\u0093\3\2\2\2\u00be\u0094\3\2\2\2\u00be\u0095\3\2\2\2\u00be\u0096\3\2"+
		"\2\2\u00be\u0097\3\2\2\2\u00be\u0098\3\2\2\2\u00be\u0099\3\2\2\2\u00be"+
		"\u009a\3\2\2\2\u00be\u009b\3\2\2\2\u00be\u009c\3\2\2\2\u00be\u009d\3\2"+
		"\2\2\u00be\u009e\3\2\2\2\u00be\u009f\3\2\2\2\u00be\u00a0\3\2\2\2\u00be"+
		"\u00a1\3\2\2\2\u00be\u00a2\3\2\2\2\u00be\u00a3\3\2\2\2\u00be\u00a4\3\2"+
		"\2\2\u00be\u00a5\3\2\2\2\u00be\u00a6\3\2\2\2\u00be\u00a7\3\2\2\2\u00be"+
		"\u00a8\3\2\2\2\u00be\u00a9\3\2\2\2\u00be\u00aa\3\2\2\2\u00be\u00ab\3\2"+
		"\2\2\u00be\u00ac\3\2\2\2\u00be\u00ad\3\2\2\2\u00be\u00ae\3\2\2\2\u00be"+
		"\u00af\3\2\2\2\u00be\u00b0\3\2\2\2\u00be\u00b1\3\2\2\2\u00be\u00b2\3\2"+
		"\2\2\u00be\u00b3\3\2\2\2\u00be\u00b4\3\2\2\2\u00be\u00b5\3\2\2\2\u00be"+
		"\u00b6\3\2\2\2\u00be\u00b7\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00b9\3\2"+
		"\2\2\u00be\u00ba\3\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\7\3\2\2\2\u00c0\u00c1\5\n\6\2\u00c1\t\3\2\2\2\u00c2"+
		"\u00c3\b\6\1\2\u00c3\u00c5\7\3\2\2\u00c4\u00c6\5r:\2\u00c5\u00c4\3\2\2"+
		"\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\5\n\6\2\u00c8\u00ca"+
		"\5r:\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\7\4\2\2\u00cc\u00d5\3\2\2\2\u00cd\u00cf\5\16\b\2\u00ce\u00d0\5"+
		"r:\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\5\n\6\4\u00d2\u00d5\3\2\2\2\u00d3\u00d5\5\f\7\2\u00d4\u00c2\3\2"+
		"\2\2\u00d4\u00cd\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00e2\3\2\2\2\u00d6"+
		"\u00d8\f\5\2\2\u00d7\u00d9\5r:\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2"+
		"\2\u00d9\u00da\3\2\2\2\u00da\u00dc\5\20\t\2\u00db\u00dd\5r:\2\u00dc\u00db"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\5\n\6\6\u00df"+
		"\u00e1\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\13\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00ea"+
		"\7\u00bd\2\2\u00e6\u00ea\7\u00bc\2\2\u00e7\u00ea\7\u00be\2\2\u00e8\u00ea"+
		"\5\24\13\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2"+
		"\u00e9\u00e8\3\2\2\2\u00ea\r\3\2\2\2\u00eb\u00f8\7j\2\2\u00ec\u00f8\7"+
		"k\2\2\u00ed\u00f8\7l\2\2\u00ee\u00f8\7o\2\2\u00ef\u00f8\7p\2\2\u00f0\u00f8"+
		"\7r\2\2\u00f1\u00f8\7w\2\2\u00f2\u00f8\7y\2\2\u00f3\u00f8\7z\2\2\u00f4"+
		"\u00f8\7{\2\2\u00f5\u00f8\7}\2\2\u00f6\u00f8\7\u009d\2\2\u00f7\u00eb\3"+
		"\2\2\2\u00f7\u00ec\3\2\2\2\u00f7\u00ed\3\2\2\2\u00f7\u00ee\3\2\2\2\u00f7"+
		"\u00ef\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f2\3\2"+
		"\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\17\3\2\2\2\u00f9\u0107\7m\2\2\u00fa\u0107\7t\2\2"+
		"\u00fb\u0107\7v\2\2\u00fc\u0107\7x\2\2\u00fd\u0107\7|\2\2\u00fe\u0107"+
		"\7r\2\2\u00ff\u0107\7u\2\2\u0100\u0107\7\u00bb\2\2\u0101\u0107\7~\2\2"+
		"\u0102\u0107\7n\2\2\u0103\u0107\7q\2\2\u0104\u0107\7\u009e\2\2\u0105\u0107"+
		"\7\u009a\2\2\u0106\u00f9\3\2\2\2\u0106\u00fa\3\2\2\2\u0106\u00fb\3\2\2"+
		"\2\u0106\u00fc\3\2\2\2\u0106\u00fd\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u00ff"+
		"\3\2\2\2\u0106\u0100\3\2\2\2\u0106\u0101\3\2\2\2\u0106\u0102\3\2\2\2\u0106"+
		"\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\21\3\2\2"+
		"\2\u0108\u0109\7\u00bf\2\2\u0109\23\3\2\2\2\u010a\u010b\7\5\2\2\u010b"+
		"\u010c\7\u00bf\2\2\u010c\25\3\2\2\2\u010d\u010e\7\u00b9\2\2\u010e\u010f"+
		"\5r:\2\u010f\u0110\5\22\n\2\u0110\u0116\5r:\2\u0111\u0112\5\24\13\2\u0112"+
		"\u0113\5r:\2\u0113\u0115\3\2\2\2\u0114\u0111\3\2\2\2\u0115\u0118\3\2\2"+
		"\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0119\u011b\7\6\2\2\u011a\u011c\5r:\2\u011b\u011a\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011f\5\4\3\2\u011e\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0123\3\2\2\2\u0122\u0124\5r:\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2"+
		"\2\u0124\u0125\3\2\2\2\u0125\u0126\7\7\2\2\u0126\27\3\2\2\2\u0127\u0128"+
		"\7\u00ba\2\2\u0128\u0129\5r:\2\u0129\u012f\5\22\n\2\u012a\u012b\5r:\2"+
		"\u012b\u012c\5\b\5\2\u012c\u012e\3\2\2\2\u012d\u012a\3\2\2\2\u012e\u0131"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0134\5r:\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2"+
		"\2\u0134\31\3\2\2\2\u0135\u0136\7\u00b3\2\2\u0136\u0137\5r:\2\u0137\u0138"+
		"\5\b\5\2\u0138\u0139\5r:\2\u0139\u013a\7\6\2\2\u013a\u013b\5\4\3\2\u013b"+
		"\u013c\7\7\2\2\u013c\33\3\2\2\2\u013d\u013e\7\n\2\2\u013e\u013f\5r:\2"+
		"\u013f\u0140\5\b\5\2\u0140\35\3\2\2\2\u0141\u0142\7\f\2\2\u0142\u0143"+
		"\5r:\2\u0143\u0144\5\b\5\2\u0144\37\3\2\2\2\u0145\u0146\7\17\2\2\u0146"+
		"\u0147\5r:\2\u0147\u0148\5\b\5\2\u0148!\3\2\2\2\u0149\u014a\7\21\2\2\u014a"+
		"\u014b\5r:\2\u014b\u014c\5\b\5\2\u014c#\3\2\2\2\u014d\u014e\7\22\2\2\u014e"+
		"\u014f\5r:\2\u014f\u0150\5\b\5\2\u0150%\3\2\2\2\u0151\u0152\7\24\2\2\u0152"+
		"\u0153\5r:\2\u0153\u0154\5\b\5\2\u0154\'\3\2\2\2\u0155\u0156\7\25\2\2"+
		"\u0156\u0157\5r:\2\u0157\u0158\5\b\5\2\u0158)\3\2\2\2\u0159\u015a\7 \2"+
		"\2\u015a\u015b\5r:\2\u015b\u015c\5\b\5\2\u015c+\3\2\2\2\u015d\u015e\7"+
		"&\2\2\u015e\u015f\5r:\2\u015f\u0160\5\b\5\2\u0160-\3\2\2\2\u0161\u0162"+
		"\7\'\2\2\u0162\u0163\5r:\2\u0163\u0164\5\b\5\2\u0164/\3\2\2\2\u0165\u0166"+
		"\7%\2\2\u0166\u0167\5r:\2\u0167\u0168\5\b\5\2\u0168\61\3\2\2\2\u0169\u016a"+
		"\7\23\2\2\u016a\u016b\5r:\2\u016b\u016c\7\6\2\2\u016c\u016d\5r:\2\u016d"+
		"\u016e\5\b\5\2\u016e\u016f\5r:\2\u016f\u0170\7\b\2\2\u0170\u0171\5r:\2"+
		"\u0171\u0172\5\b\5\2\u0172\u0173\5r:\2\u0173\u0174\7\7\2\2\u0174\63\3"+
		"\2\2\2\u0175\u0176\7\13\2\2\u0176\u0177\5r:\2\u0177\u0178\7\t\2\2\u0178"+
		"\u0179\5\22\n\2\u0179\u017a\7\t\2\2\u017a\65\3\2\2\2\u017b\u017c\7\26"+
		"\2\2\u017c\u017d\5r:\2\u017d\u017e\7\t\2\2\u017e\u017f\5\22\n\2\u017f"+
		"\u0180\7\t\2\2\u0180\67\3\2\2\2\u0181\u0182\7\u008d\2\2\u0182\u0183\5"+
		"r:\2\u0183\u0184\7\t\2\2\u0184\u0185\5\22\n\2\u0185\u0186\7\t\2\2\u0186"+
		"9\3\2\2\2\u0187\u0188\7\u0091\2\2\u0188\u0189\5r:\2\u0189\u018a\7\t\2"+
		"\2\u018a\u018b\5\22\n\2\u018b\u018c\7\t\2\2\u018c;\3\2\2\2\u018d\u018e"+
		"\7\u0093\2\2\u018e\u018f\5r:\2\u018f\u0190\7\t\2\2\u0190\u0191\5\22\n"+
		"\2\u0191\u0192\7\t\2\2\u0192=\3\2\2\2\u0193\u0194\7\u009b\2\2\u0194\u0195"+
		"\5r:\2\u0195\u0196\5\b\5\2\u0196\u0197\5r:\2\u0197\u0199\7\6\2\2\u0198"+
		"\u019a\5r:\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2"+
		"\2\u019b\u019d\5\4\3\2\u019c\u019e\5r:\2\u019d\u019c\3\2\2\2\u019d\u019e"+
		"\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\7\7\2\2\u01a0?\3\2\2\2\u01a1"+
		"\u01a2\7\u009c\2\2\u01a2\u01a3\5r:\2\u01a3\u01a4\5\b\5\2\u01a4\u01a5\5"+
		"r:\2\u01a5\u01a7\7\6\2\2\u01a6\u01a8\5r:\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\5\4\3\2\u01aa\u01ac\5r:\2\u01ab"+
		"\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7\7"+
		"\2\2\u01ae\u01af\5r:\2\u01af\u01b1\7\6\2\2\u01b0\u01b2\5r:\2\u01b1\u01b0"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\5\4\3\2\u01b4"+
		"\u01b6\5r:\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2"+
		"\2\u01b7\u01b8\7\7\2\2\u01b8A\3\2\2\2\u01b9\u01ba\7\r\2\2\u01baC\3\2\2"+
		"\2\u01bb\u01bc\7\16\2\2\u01bcE\3\2\2\2\u01bd\u01be\7\20\2\2\u01beG\3\2"+
		"\2\2\u01bf\u01c0\7\27\2\2\u01c0I\3\2\2\2\u01c1\u01c2\7\30\2\2\u01c2K\3"+
		"\2\2\2\u01c3\u01c4\7\u008e\2\2\u01c4M\3\2\2\2\u01c5\u01c6\7\u0092\2\2"+
		"\u01c6O\3\2\2\2\u01c7\u01c8\7\31\2\2\u01c8Q\3\2\2\2\u01c9\u01ca\7\32\2"+
		"\2\u01caS\3\2\2\2\u01cb\u01cc\7\33\2\2\u01ccU\3\2\2\2\u01cd\u01ce\7\34"+
		"\2\2\u01ceW\3\2\2\2\u01cf\u01d0\7\35\2\2\u01d0Y\3\2\2\2\u01d1\u01d2\7"+
		"\36\2\2\u01d2[\3\2\2\2\u01d3\u01d4\7\37\2\2\u01d4]\3\2\2\2\u01d5\u01d6"+
		"\7!\2\2\u01d6_\3\2\2\2\u01d7\u01d8\7\"\2\2\u01d8a\3\2\2\2\u01d9\u01da"+
		"\7#\2\2\u01dac\3\2\2\2\u01db\u01dc\7$\2\2\u01dce\3\2\2\2\u01dd\u01de\7"+
		"(\2\2\u01deg\3\2\2\2\u01df\u01e0\7)\2\2\u01e0i\3\2\2\2\u01e1\u01e2\7\u008f"+
		"\2\2\u01e2\u01e3\5r:\2\u01e3\u01e4\5\24\13\2\u01e4\u01e5\5r:\2\u01e5\u01e7"+
		"\5\b\5\2\u01e6\u01e8\5r:\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"k\3\2\2\2\u01e9\u01ea\7\u0090\2\2\u01ea\u01eb\5r:\2\u01eb\u01ec\7\t\2"+
		"\2\u01ec\u01ed\5\22\n\2\u01ed\u01ee\7\t\2\2\u01ee\u01f1\5r:\2\u01ef\u01f2"+
		"\7h\2\2\u01f0\u01f2\5v<\2\u01f1\u01ef\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2"+
		"m\3\2\2\2\u01f3\u01f5\7\u00c0\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6\3\2"+
		"\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7o\3\2\2\2\u01f8\u01fa"+
		"\7\u00c1\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01f9\3\2\2"+
		"\2\u01fb\u01fc\3\2\2\2\u01fcq\3\2\2\2\u01fd\u0200\5n8\2\u01fe\u0200\5"+
		"p9\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202s\3\2\2\2\u0203\u0206\7\u00bc"+
		"\2\2\u0204\u0206\5\24\13\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206"+
		"u\3\2\2\2\u0207\u020c\7\6\2\2\u0208\u020a\5r:\2\u0209\u0208\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\5\b\5\2\u020c\u0209\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0211\3\2\2\2\u0210\u0212\5r:\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2"+
		"\2\u0212\u0213\3\2\2\2\u0213\u0214\7\7\2\2\u0214w\3\2\2\2\u0215\u0216"+
		"\7\2\2\3\u0216y\3\2\2\2)}\u0082\u0085\u0089\u008d\u0090\u00be\u00c5\u00c9"+
		"\u00cf\u00d4\u00d8\u00dc\u00e2\u00e9\u00f7\u0106\u0116\u011b\u0120\u0123"+
		"\u012f\u0133\u0199\u019d\u01a7\u01ab\u01b1\u01b5\u01e7\u01f1\u01f6\u01fb"+
		"\u01ff\u0201\u0205\u0209\u020e\u0211";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
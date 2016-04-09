/* The following code was generated by JFlex 1.6.1 */

package lexer;
import static lexer.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>./src/lexer/lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int MYSTRING = 2;
  public static final int MYCHAR = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\67\1\50\1\12\1\71\1\71\1\11\22\67\1\10\1\34\1\14"+
    "\1\13\1\67\1\32\1\45\1\24\1\37\1\40\1\30\1\26\1\6"+
    "\1\27\1\23\1\31\1\3\1\4\6\5\2\2\2\67\1\35\1\33"+
    "\1\36\2\67\1\1\1\16\14\1\1\20\10\1\1\22\2\1\1\67"+
    "\1\70\1\67\1\46\1\1\1\67\1\41\1\15\1\55\1\43\1\52"+
    "\1\7\1\64\1\66\1\57\1\1\1\54\1\56\1\63\1\42\1\17"+
    "\1\61\1\1\1\44\1\51\1\53\1\60\1\1\1\65\1\21\1\62"+
    "\1\1\1\67\1\25\1\67\1\47\6\67\1\71\32\67\1\0\u15df\67"+
    "\1\0\u097f\67\13\0\35\67\1\71\1\71\5\67\1\0\57\67\1\0"+
    "\u0fa0\67\1\0\uffff\67\uffff\67\uffff\67\uffff\67\uffff\67\uffff\67\uffff\67\uffff\67\uffff\67\uffff\67\uffff\67\uffff\67\uffff\67\uffff\67\uffff\67\uffff\67\ud00f\67";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\2\3\1\4\1\2\3\5\1\6"+
    "\2\2\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\1\1\20\1\21\1\22\1\23\4\2"+
    "\1\24\1\25\1\26\1\27\11\2\1\30\2\31\1\32"+
    "\1\30\1\33\1\34\1\35\1\0\3\35\4\2\1\0"+
    "\2\2\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\16\2"+
    "\1\54\1\55\1\56\5\2\1\57\1\60\1\61\1\62"+
    "\1\63\3\3\1\64\3\2\1\0\2\2\1\65\1\66"+
    "\1\67\1\2\1\70\1\71\7\2\1\72\4\2\1\73"+
    "\5\2\1\74\2\2\1\0\1\75\5\2\1\76\1\2"+
    "\1\77\1\100\3\2\1\101\1\2\1\102\3\2\1\103"+
    "\1\2\1\0\1\104\1\2\1\105\4\2\1\106\2\2"+
    "\1\107\1\2\1\110\1\2\1\5\1\111\1\112\1\113"+
    "\1\114\1\2\1\115\1\116\1\117\1\120\1\2\1\121";

  private static int [] zzUnpackAction() {
    int [] result = new int[192];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\72\0\164\0\256\0\350\0\u0122\0\u015c\0\256"+
    "\0\u0196\0\256\0\u01d0\0\u020a\0\u0244\0\u027e\0\u02b8\0\256"+
    "\0\256\0\256\0\u02f2\0\u032c\0\u0366\0\u03a0\0\256\0\u03da"+
    "\0\u0414\0\u044e\0\u0488\0\256\0\256\0\u04c2\0\u04fc\0\u0536"+
    "\0\u0570\0\256\0\256\0\256\0\256\0\u05aa\0\u05e4\0\u061e"+
    "\0\u0658\0\u0692\0\u06cc\0\u0706\0\u0740\0\u077a\0\256\0\u07b4"+
    "\0\256\0\256\0\u07ee\0\256\0\u0828\0\u0862\0\u089c\0\u08d6"+
    "\0\u0910\0\u094a\0\u0984\0\u09be\0\u09f8\0\u0a32\0\u0a6c\0\u0aa6"+
    "\0\u0ae0\0\350\0\256\0\256\0\u0b1a\0\256\0\u0b54\0\256"+
    "\0\256\0\256\0\256\0\256\0\256\0\256\0\256\0\u0b8e"+
    "\0\u0bc8\0\u0c02\0\u0c3c\0\u0c76\0\u0cb0\0\u0cea\0\u0d24\0\u0d5e"+
    "\0\u0d98\0\u0dd2\0\u0e0c\0\u0e46\0\u0e80\0\350\0\u0eba\0\350"+
    "\0\u0ef4\0\u0f2e\0\u0f68\0\u0fa2\0\u0fdc\0\256\0\256\0\256"+
    "\0\256\0\u089c\0\u08d6\0\u0910\0\u094a\0\350\0\u1016\0\u1050"+
    "\0\u108a\0\u10c4\0\u10fe\0\u1138\0\256\0\256\0\350\0\u1172"+
    "\0\350\0\350\0\u11ac\0\u11e6\0\u1220\0\u125a\0\u1294\0\u12ce"+
    "\0\u1308\0\350\0\u1342\0\u137c\0\u13b6\0\u13f0\0\350\0\u142a"+
    "\0\u1464\0\u149e\0\u14d8\0\u1512\0\350\0\u154c\0\u1586\0\u15c0"+
    "\0\350\0\u15fa\0\u1634\0\u166e\0\u16a8\0\u16e2\0\350\0\u171c"+
    "\0\350\0\350\0\u1756\0\u1790\0\u17ca\0\350\0\u1804\0\350"+
    "\0\u183e\0\u1878\0\u18b2\0\350\0\u18ec\0\u1926\0\350\0\u1960"+
    "\0\350\0\u199a\0\u19d4\0\u1a0e\0\u1a48\0\350\0\u1a82\0\u1abc"+
    "\0\350\0\u1af6\0\350\0\u1b30\0\u1926\0\350\0\350\0\350"+
    "\0\350\0\u1b6a\0\350\0\350\0\350\0\350\0\u1ba4\0\350";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[192];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\2\6\1\10\1\11\1\12"+
    "\1\13\1\12\1\14\1\15\1\16\1\5\1\17\3\5"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\5\1\51\1\52\1\53\1\5\1\54\2\5"+
    "\1\55\1\56\1\5\2\4\1\0\1\4\7\57\1\4"+
    "\1\60\1\61\1\57\1\62\33\57\1\4\17\57\1\63"+
    "\1\0\1\4\7\57\1\4\2\0\11\57\1\64\23\57"+
    "\1\4\20\57\73\0\1\65\5\5\1\65\1\5\1\65"+
    "\2\0\2\65\6\5\16\65\4\5\4\65\16\5\3\65"+
    "\1\0\1\66\4\6\1\0\1\66\5\0\6\66\1\67"+
    "\15\0\4\66\4\0\16\66\4\0\1\66\4\6\1\0"+
    "\1\66\5\0\2\70\2\71\2\72\1\67\15\0\4\66"+
    "\4\0\16\66\3\0\1\65\5\5\1\65\1\5\1\65"+
    "\2\0\2\65\2\5\1\73\3\5\16\65\3\5\1\74"+
    "\4\65\5\5\1\75\1\76\7\5\3\65\12\0\1\12"+
    "\57\0\11\14\1\13\1\12\57\14\14\0\1\77\55\0"+
    "\1\65\5\5\1\65\1\5\1\65\2\0\2\65\2\5"+
    "\1\100\3\5\16\65\3\5\1\101\4\65\16\5\4\65"+
    "\5\5\1\65\1\5\1\65\2\0\2\65\6\5\16\65"+
    "\3\5\1\102\4\65\16\5\3\65\33\0\1\103\71\0"+
    "\1\104\66\0\1\105\2\0\1\106\67\0\1\107\1\0"+
    "\1\110\71\0\1\111\71\0\1\112\71\0\1\113\1\0"+
    "\1\114\1\115\66\0\1\116\2\0\1\117\33\0\1\65"+
    "\5\5\1\65\1\5\1\65\2\0\2\65\6\5\16\65"+
    "\1\5\1\120\2\5\4\65\1\121\15\5\4\65\5\5"+
    "\1\65\1\5\1\65\2\0\2\65\2\5\1\122\3\5"+
    "\16\65\4\5\4\65\16\5\4\65\5\5\1\65\1\5"+
    "\1\65\2\0\2\65\6\5\16\65\4\5\4\65\1\5"+
    "\1\123\14\5\4\65\5\5\1\65\1\5\1\65\2\0"+
    "\2\65\6\5\16\65\1\124\3\5\4\65\1\5\1\125"+
    "\14\5\4\65\5\5\1\65\1\5\1\65\2\0\2\65"+
    "\6\5\16\65\4\5\4\65\2\5\1\126\13\5\4\65"+
    "\5\5\1\65\1\5\1\65\2\0\2\65\4\5\1\127"+
    "\1\5\16\65\4\5\4\65\5\5\1\130\10\5\4\65"+
    "\5\5\1\65\1\5\1\65\2\0\2\65\6\5\16\65"+
    "\3\5\1\131\4\65\16\5\4\65\5\5\1\65\1\5"+
    "\1\65\2\0\2\65\2\5\1\132\3\5\16\65\4\5"+
    "\4\65\5\5\1\133\10\5\4\65\5\5\1\65\1\5"+
    "\1\65\2\0\2\65\6\5\16\65\1\134\3\5\4\65"+
    "\6\5\1\135\7\5\4\65\5\5\1\65\1\136\1\65"+
    "\2\0\2\65\6\5\16\65\1\5\1\137\2\5\4\65"+
    "\1\140\11\5\1\141\3\5\4\65\5\5\1\65\1\5"+
    "\1\65\2\0\2\65\6\5\16\65\1\142\2\5\1\143"+
    "\4\65\16\5\4\65\5\5\1\65\1\5\1\65\2\0"+
    "\2\65\6\5\16\65\4\5\4\65\5\5\1\144\10\5"+
    "\4\65\5\5\1\65\1\5\1\65\2\0\2\65\6\5"+
    "\16\65\4\5\4\65\15\5\1\145\3\65\12\0\1\61"+
    "\73\0\1\146\25\0\1\147\1\0\1\150\6\0\1\151"+
    "\16\0\11\65\2\0\57\65\1\0\5\66\1\0\1\66"+
    "\5\0\6\66\16\0\4\66\4\0\16\66\5\0\4\152"+
    "\65\0\2\66\2\153\1\66\1\0\1\66\5\0\6\66"+
    "\16\0\4\66\4\0\16\66\4\0\2\66\3\154\1\0"+
    "\1\66\5\0\6\66\16\0\4\66\4\0\16\66\4\0"+
    "\1\66\4\155\1\0\1\155\5\0\1\155\5\66\16\0"+
    "\1\155\1\66\1\155\1\66\4\0\1\66\1\155\2\66"+
    "\1\155\11\66\3\0\1\65\5\5\1\65\1\5\1\65"+
    "\2\0\2\65\6\5\16\65\3\5\1\156\4\65\16\5"+
    "\4\65\5\5\1\65\1\5\1\65\2\0\2\65\2\5"+
    "\1\157\3\5\16\65\4\5\4\65\16\5\4\65\5\5"+
    "\1\65\1\5\1\65\2\0\2\65\2\5\1\160\3\5"+
    "\16\65\4\5\4\65\16\5\4\65\5\5\1\65\1\5"+
    "\1\65\2\0\2\65\6\5\16\65\1\5\1\161\2\5"+
    "\4\65\16\5\3\65\14\0\1\162\55\0\1\65\5\5"+
    "\1\65\1\5\1\65\2\0\2\65\2\5\1\163\3\5"+
    "\16\65\4\5\4\65\16\5\4\65\5\5\1\65\1\5"+
    "\1\65\2\0\2\65\6\5\16\65\4\5\4\65\1\5"+
    "\1\164\14\5\3\65\33\0\1\165\71\0\1\166\36\0"+
    "\1\65\5\5\1\65\1\5\1\65\2\0\2\65\6\5"+
    "\16\65\2\5\1\167\1\5\4\65\16\5\4\65\5\5"+
    "\1\65\1\5\1\65\2\0\2\65\6\5\16\65\4\5"+
    "\4\65\1\170\15\5\4\65\5\5\1\65\1\5\1\65"+
    "\2\0\2\65\6\5\16\65\3\5\1\171\4\65\16\5"+
    "\4\65\5\5\1\65\1\172\1\65\2\0\2\65\6\5"+
    "\16\65\4\5\4\65\5\5\1\172\10\5\4\65\5\5"+
    "\1\65\1\5\1\65\2\0\2\65\6\5\16\65\4\5"+
    "\4\65\6\5\1\173\7\5\4\65\5\5\1\65\1\5"+
    "\1\65\2\0\2\65\6\5\16\65\4\5\4\65\2\5"+
    "\1\174\13\5\4\65\5\5\1\65\1\5\1\65\2\0"+
    "\2\65\6\5\16\65\3\5\1\175\4\65\16\5\4\65"+
    "\5\5\1\65\1\5\1\65\2\0\2\65\6\5\16\65"+
    "\4\5\4\65\1\5\1\176\2\5\1\177\11\5\4\65"+
    "\5\5\1\65\1\5\1\65\2\0\2\65\6\5\16\65"+
    "\4\5\4\65\1\200\5\5\1\201\7\5\4\65\5\5"+
    "\1\65\1\5\1\65\2\0\2\65\6\5\16\65\4\5"+
    "\4\65\11\5\1\202\4\5\4\65\5\5\1\65\1\5"+
    "\1\65\2\0\2\65\6\5\16\65\1\5\1\203\2\5"+
    "\4\65\16\5\4\65\5\5\1\65\1\5\1\65\2\0"+
    "\2\65\6\5\16\65\1\204\3\5\4\65\16\5\4\65"+
    "\5\5\1\65\1\5\1\65\2\0\2\65\6\5\16\65"+
    "\4\5\4\65\12\5\1\205\3\5\4\65\5\5\1\65"+
    "\1\5\1\65\2\0\2\65\6\5\16\65\4\5\4\65"+
    "\1\206\15\5\4\65\5\5\1\65\1\5\1\65\2\0"+
    "\2\65\6\5\16\65\4\5\4\65\2\5\1\207\13\5"+
    "\4\65\5\5\1\65\1\5\1\65\2\0\2\65\6\5"+
    "\16\65\4\5\4\65\10\5\1\210\5\5\4\65\5\5"+
    "\1\65\1\5\1\65\2\0\2\65\6\5\16\65\4\5"+
    "\4\65\1\211\15\5\4\65\5\5\1\65\1\5\1\65"+
    "\2\0\2\65\6\5\16\65\4\5\4\65\6\5\1\212"+
    "\7\5\4\65\5\5\1\65\1\5\1\65\2\0\2\65"+
    "\2\5\1\213\3\5\16\65\4\5\4\65\16\5\4\65"+
    "\5\5\1\65\1\5\1\65\2\0\2\65\6\5\16\65"+
    "\4\5\4\65\6\5\1\214\7\5\4\65\5\5\1\65"+
    "\1\5\1\65\2\0\2\65\6\5\16\65\4\5\4\65"+
    "\12\5\1\215\3\5\4\65\5\5\1\65\1\5\1\65"+
    "\2\0\2\65\6\5\16\65\1\216\3\5\4\65\16\5"+
    "\4\65\5\5\1\65\1\5\1\65\2\0\2\65\6\5"+
    "\16\65\1\217\3\5\4\65\16\5\3\65\14\162\1\220"+
    "\55\162\1\65\5\5\1\65\1\5\1\65\2\0\2\65"+
    "\6\5\16\65\4\5\4\65\5\5\1\221\10\5\4\65"+
    "\5\5\1\65\1\5\1\65\2\0\2\65\6\5\16\65"+
    "\1\222\3\5\4\65\16\5\4\65\5\5\1\65\1\5"+
    "\1\65\2\0\2\65\6\5\16\65\4\5\4\65\1\5"+
    "\1\223\14\5\4\65\5\5\1\65\1\5\1\65\2\0"+
    "\2\65\6\5\16\65\4\5\4\65\1\224\15\5\4\65"+
    "\5\5\1\65\1\5\1\65\2\0\2\65\6\5\16\65"+
    "\4\5\4\65\7\5\1\225\6\5\4\65\5\5\1\65"+
    "\1\5\1\65\2\0\2\65\6\5\16\65\4\5\4\65"+
    "\6\5\1\226\7\5\4\65\5\5\1\65\1\5\1\65"+
    "\2\0\2\65\6\5\16\65\4\5\4\65\4\5\1\227"+
    "\11\5\4\65\5\5\1\65\1\5\1\65\2\0\2\65"+
    "\6\5\16\65\4\5\4\65\1\5\1\230\14\5\4\65"+
    "\5\5\1\65\1\5\1\65\2\0\2\65\6\5\16\65"+
    "\4\5\4\65\1\5\1\231\14\5\4\65\5\5\1\65"+
    "\1\232\1\65\2\0\2\65\6\5\16\65\4\5\4\65"+
    "\16\5\4\65\5\5\1\65\1\5\1\65\2\0\2\65"+
    "\6\5\16\65\4\5\4\65\2\5\1\233\13\5\4\65"+
    "\5\5\1\65\1\5\1\65\2\0\2\65\6\5\16\65"+
    "\4\5\4\65\1\234\15\5\4\65\5\5\1\65\1\5"+
    "\1\65\2\0\2\65\1\235\5\5\16\65\4\5\4\65"+
    "\16\5\4\65\5\5\1\65\1\5\1\65\2\0\2\65"+
    "\6\5\16\65\4\5\4\65\2\5\1\236\13\5\4\65"+
    "\5\5\1\65\1\5\1\65\2\0\2\65\2\5\1\237"+
    "\3\5\16\65\4\5\4\65\16\5\4\65\5\5\1\65"+
    "\1\5\1\65\2\0\2\65\6\5\16\65\4\5\4\65"+
    "\1\240\15\5\4\65\5\5\1\65\1\5\1\65\2\0"+
    "\2\65\6\5\16\65\1\5\1\241\2\5\4\65\16\5"+
    "\4\65\5\5\1\65\1\5\1\65\2\0\2\65\1\242"+
    "\5\5\16\65\4\5\4\65\16\5\4\65\5\5\1\65"+
    "\1\5\1\65\2\0\2\65\6\5\16\65\4\5\4\65"+
    "\5\5\1\243\10\5\4\65\5\5\1\65\1\5\1\65"+
    "\2\0\2\65\6\5\16\65\4\5\4\65\2\5\1\244"+
    "\13\5\4\65\5\5\1\65\1\5\1\65\2\0\2\65"+
    "\6\5\16\65\4\5\4\65\5\5\1\245\10\5\3\65"+
    "\14\162\1\246\55\162\1\65\5\5\1\65\1\5\1\65"+
    "\2\0\2\65\6\5\16\65\4\5\4\65\3\5\1\247"+
    "\12\5\4\65\5\5\1\65\1\5\1\65\2\0\2\65"+
    "\6\5\16\65\3\5\1\250\4\65\16\5\4\65\5\5"+
    "\1\65\1\5\1\65\2\0\2\65\6\5\16\65\4\5"+
    "\4\65\1\5\1\251\14\5\4\65\5\5\1\65\1\5"+
    "\1\65\2\0\2\65\6\5\16\65\3\5\1\252\4\65"+
    "\16\5\4\65\5\5\1\65\1\5\1\65\2\0\2\65"+
    "\6\5\16\65\1\5\1\253\2\5\4\65\16\5\4\65"+
    "\5\5\1\65\1\5\1\65\2\0\2\65\6\5\16\65"+
    "\4\5\4\65\10\5\1\254\5\5\4\65\5\5\1\65"+
    "\1\5\1\65\2\0\2\65\6\5\16\65\4\5\4\65"+
    "\6\5\1\255\7\5\4\65\5\5\1\65\1\5\1\65"+
    "\2\0\2\65\6\5\16\65\4\5\4\65\1\256\15\5"+
    "\4\65\5\5\1\65\1\5\1\65\2\0\2\65\6\5"+
    "\16\65\2\5\1\257\1\5\4\65\16\5\4\65\5\5"+
    "\1\65\1\5\1\65\2\0\2\65\6\5\16\65\3\5"+
    "\1\260\4\65\16\5\4\65\5\5\1\65\1\5\1\65"+
    "\2\0\2\65\6\5\16\65\4\5\4\65\2\5\1\261"+
    "\13\5\4\65\5\5\1\65\1\5\1\65\2\0\2\65"+
    "\6\5\16\65\1\262\3\5\4\65\16\5\4\65\5\5"+
    "\1\65\1\5\1\65\2\0\2\65\6\5\16\65\4\5"+
    "\4\65\1\5\1\263\14\5\4\65\5\5\1\65\1\5"+
    "\1\65\2\0\2\65\6\5\16\65\4\5\4\65\5\5"+
    "\1\264\10\5\3\65\14\162\1\265\55\162\1\65\5\5"+
    "\1\65\1\5\1\65\2\0\2\65\6\5\16\65\4\5"+
    "\4\65\2\5\1\266\13\5\4\65\5\5\1\65\1\5"+
    "\1\65\2\0\2\65\6\5\16\65\1\5\1\267\2\5"+
    "\4\65\16\5\4\65\5\5\1\65\1\5\1\65\2\0"+
    "\2\65\6\5\16\65\4\5\4\65\13\5\1\270\2\5"+
    "\4\65\5\5\1\65\1\5\1\65\2\0\2\65\6\5"+
    "\16\65\4\5\4\65\2\5\1\271\13\5\4\65\5\5"+
    "\1\65\1\5\1\65\2\0\2\65\6\5\16\65\1\5"+
    "\1\272\2\5\4\65\16\5\4\65\5\5\1\65\1\5"+
    "\1\65\2\0\2\65\6\5\16\65\1\273\3\5\4\65"+
    "\16\5\4\65\5\5\1\65\1\5\1\65\2\0\2\65"+
    "\6\5\16\65\4\5\4\65\2\5\1\274\13\5\4\65"+
    "\5\5\1\65\1\5\1\65\2\0\2\65\6\5\16\65"+
    "\4\5\4\65\5\5\1\275\10\5\4\65\5\5\1\65"+
    "\1\5\1\65\2\0\2\65\6\5\16\65\4\5\4\65"+
    "\11\5\1\276\4\5\4\65\5\5\1\65\1\5\1\65"+
    "\2\0\2\65\6\5\16\65\4\5\4\65\7\5\1\277"+
    "\6\5\4\65\5\5\1\65\1\5\1\65\2\0\2\65"+
    "\6\5\16\65\4\5\4\65\1\5\1\300\14\5\3\65";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7134];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\3\1\1\11\1\1\1\11\5\1\3\11"+
    "\4\1\1\11\4\1\2\11\4\1\4\11\11\1\1\11"+
    "\1\1\2\11\1\1\1\11\2\1\1\0\7\1\1\0"+
    "\3\1\2\11\1\1\1\11\1\1\10\11\26\1\4\11"+
    "\10\1\1\0\2\1\2\11\31\1\1\0\25\1\1\0"+
    "\32\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[192];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    //esto se copia directamente

    StringBuffer string = new StringBuffer();
    Boolean cambioLinea = false;

    public String lexeme;
    public int getLine(){
        return yyline;
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 218) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            switch (zzLexicalState) {
            case MYSTRING: {
              yybegin(YYINITIAL); lexeme = "String sin terminar: " + string.toString(); return ERROR;
            }
            case 193: break;
            case MYCHAR: {
              yybegin(YYINITIAL); lexeme = "Char sin terminar: " + string.toString(); return ERROR;
            }
            case 194: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { lexeme = yytext();return ERROR;
            }
          case 82: break;
          case 2: 
            { lexeme=yytext(); return Identificador;
            }
          case 83: break;
          case 3: 
            { lexeme=yytext(); return INT;
            }
          case 84: break;
          case 4: 
            { lexeme = yytext(); return opComa;
            }
          case 85: break;
          case 5: 
            { /* ignore */
            }
          case 86: break;
          case 6: 
            { string.setLength(0); cambioLinea = false; yybegin(MYSTRING);
            }
          case 87: break;
          case 7: 
            { lexeme = yytext(); return opPunto;
            }
          case 88: break;
          case 8: 
            { string.setLength(0); yybegin(MYCHAR);
            }
          case 89: break;
          case 9: 
            { lexeme=yytext(); return opORBits;
            }
          case 90: break;
          case 10: 
            { lexeme = yytext(); return opSuma;
            }
          case 91: break;
          case 11: 
            { lexeme = yytext(); return opResta;
            }
          case 92: break;
          case 12: 
            { lexeme = yytext(); return opMult;
            }
          case 93: break;
          case 13: 
            { lexeme = yytext(); return opDiv;
            }
          case 94: break;
          case 14: 
            { lexeme = yytext(); return opMod;
            }
          case 95: break;
          case 15: 
            { lexeme = yytext(); return opIgual;
            }
          case 96: break;
          case 16: 
            { lexeme = yytext(); return opMenorQue;
            }
          case 97: break;
          case 17: 
            { lexeme = yytext(); return opMayorQue;
            }
          case 98: break;
          case 18: 
            { lexeme = yytext(); return opParentesis1;
            }
          case 99: break;
          case 19: 
            { lexeme = yytext(); return opParentesis2;
            }
          case 100: break;
          case 20: 
            { lexeme = yytext(); return opANDBits;
            }
          case 101: break;
          case 21: 
            { lexeme = yytext(); return opXOR;
            }
          case 102: break;
          case 22: 
            { lexeme = yytext(); return opNOTBits;
            }
          case 103: break;
          case 23: 
            { lexeme = yytext(); return opTAB;
            }
          case 104: break;
          case 24: 
            { string.append( yytext() );
            }
          case 105: break;
          case 25: 
            { cambioLinea = true;
            }
          case 106: break;
          case 26: 
            { yybegin(YYINITIAL);
                                   lexeme = "\"" +string.toString()+"\"";
                                   if(cambioLinea){
                                        return ERROR;
                                   }else{
                                        return STRING;
                                   }
            }
          case 107: break;
          case 27: 
            { yybegin(YYINITIAL); lexeme = "'"+ string.toString()+"'"; 
                                 if(string.length()>1)
                                    return ERROR;
                                 else
                                    return CHAR;
            }
          case 108: break;
          case 28: 
            { lexeme="string"+yytext(); return ERROR;
            }
          case 109: break;
          case 29: 
            { lexeme = yytext(); return ERROR;
            }
          case 110: break;
          case 30: 
            { lexeme = yytext(); return opORLog;
            }
          case 111: break;
          case 31: 
            { lexeme = yytext(); return opMasIgual;
            }
          case 112: break;
          case 32: 
            { lexeme = yytext(); return opMenosIgual;
            }
          case 113: break;
          case 33: 
            { lexeme = yytext(); return opExponente;
            }
          case 114: break;
          case 34: 
            { lexeme = yytext(); return opMulIgual;
            }
          case 115: break;
          case 35: 
            { lexeme = yytext(); return opDivEntera;
            }
          case 116: break;
          case 36: 
            { lexeme = yytext(); return opDivIgual;
            }
          case 117: break;
          case 37: 
            { lexeme = yytext(); return opExactamenteIgual;
            }
          case 118: break;
          case 38: 
            { lexeme = yytext(); return opDiferencia;
            }
          case 119: break;
          case 39: 
            { lexeme = yytext(); return opMenorOIgual;
            }
          case 120: break;
          case 40: 
            { lexeme = yytext(); return opShiftIzquierdo;
            }
          case 121: break;
          case 41: 
            { lexeme = yytext(); return opDiferencia2;
            }
          case 122: break;
          case 42: 
            { lexeme = yytext(); return opMayorOIgual;
            }
          case 123: break;
          case 43: 
            { lexeme = yytext(); return opShiftDerecho;
            }
          case 124: break;
          case 44: 
            { lexeme = yytext(); return rIf;
            }
          case 125: break;
          case 45: 
            { lexeme = yytext(); return rIn;
            }
          case 126: break;
          case 46: 
            { lexeme = yytext(); return rIs;
            }
          case 127: break;
          case 47: 
            { string.append('\"');
            }
          case 128: break;
          case 48: 
            { string.append('\n');
            }
          case 129: break;
          case 49: 
            { string.append('\r');
            }
          case 130: break;
          case 50: 
            { string.append('\t');
            }
          case 131: break;
          case 51: 
            { lexeme=yytext(); return FLOAT;
            }
          case 132: break;
          case 52: 
            { lexeme = yytext(); return rFor;
            }
          case 133: break;
          case 53: 
            { lexeme = yytext(); return opExponenteIgual;
            }
          case 134: break;
          case 54: 
            { lexeme = yytext(); return opDivEnteraIgual;
            }
          case 135: break;
          case 55: 
            { lexeme = yytext(); return opANDLog;
            }
          case 136: break;
          case 56: 
            { lexeme = yytext(); return opNOTLog;
            }
          case 137: break;
          case 57: 
            { lexeme = yytext(); return rDel;
            }
          case 138: break;
          case 58: 
            { lexeme = yytext(); return rTry;
            }
          case 139: break;
          case 59: 
            { lexeme = yytext(); return rInt;
            }
          case 140: break;
          case 60: 
            { lexeme = yytext(); return rFrom;
            }
          case 141: break;
          case 61: 
            { lexeme = yytext(); return rBool;
            }
          case 142: break;
          case 62: 
            { lexeme = yytext(); return rExec;
            }
          case 143: break;
          case 63: 
            { lexeme = yytext(); return rElse;
            }
          case 144: break;
          case 64: 
            { lexeme = yytext(); return rElif;
            }
          case 145: break;
          case 65: 
            { lexeme = yytext(); return rList;
            }
          case 146: break;
          case 66: 
            { lexeme = yytext(); return rPass;
            }
          case 147: break;
          case 67: 
            { lexeme = yytext(); return rFloat;
            }
          case 148: break;
          case 68: 
            { lexeme = yytext(); return rBreak;
            }
          case 149: break;
          case 69: 
            { lexeme = yytext(); return rRaise;
            }
          case 150: break;
          case 70: 
            { lexeme = yytext(); return rClass;
            }
          case 151: break;
          case 71: 
            { lexeme = yytext(); return rPrint;
            }
          case 152: break;
          case 72: 
            { lexeme = yytext(); return rWhile;
            }
          case 153: break;
          case 73: 
            { lexeme = yytext(); return rAssert;
            }
          case 154: break;
          case 74: 
            { lexeme = yytext(); return rReturn;
            }
          case 155: break;
          case 75: 
            { lexeme = yytext(); return rString;
            }
          case 156: break;
          case 76: 
            { lexeme = yytext(); return rExcept;
            }
          case 157: break;
          case 77: 
            { lexeme = yytext(); return rLambda;
            }
          case 158: break;
          case 78: 
            { lexeme = yytext(); return rImport;
            }
          case 159: break;
          case 79: 
            { lexeme = yytext(); return rGlobal;
            }
          case 160: break;
          case 80: 
            { lexeme = yytext(); return rFinally;
            }
          case 161: break;
          case 81: 
            { lexeme = yytext(); return rContinue;
            }
          case 162: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}

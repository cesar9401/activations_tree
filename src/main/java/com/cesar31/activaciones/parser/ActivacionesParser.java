
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.cesar31.activaciones.parser;

import java_cup.runtime.Symbol;
import java.util.ArrayList;
import java.util.List;
import com.cesar31.activaciones.instruction.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ActivacionesParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return ActivacionesParserSym.class;
}

  /** Default constructor. */
  @Deprecated
  public ActivacionesParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public ActivacionesParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ActivacionesParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\050\000\002\014\005\000\002\002\004\000\002\013" +
    "\004\000\002\015\005\000\002\017\004\000\002\017\003" +
    "\000\002\012\004\000\002\012\004\000\002\012\004\000" +
    "\002\012\002\000\002\002\007\000\002\003\005\000\002" +
    "\003\003\000\002\004\003\000\002\004\003\000\002\004" +
    "\003\000\002\004\003\000\002\004\003\000\002\021\005" +
    "\000\002\016\012\000\002\005\003\000\002\005\002\000" +
    "\002\006\005\000\002\006\003\000\002\007\005\000\002" +
    "\022\007\000\002\010\003\000\002\010\002\000\002\011" +
    "\005\000\002\011\003\000\002\020\005\000\002\020\005" +
    "\000\002\020\005\000\002\020\005\000\002\020\004\000" +
    "\002\020\005\000\002\020\003\000\002\020\003\000\002" +
    "\020\003\000\002\020\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\110\000\004\006\005\001\002\000\004\002\112\001" +
    "\002\000\004\005\006\001\002\000\004\007\011\001\002" +
    "\000\006\007\ufffc\013\ufffc\001\002\000\004\002\001\001" +
    "\002\000\004\005\074\001\002\000\006\007\011\013\015" +
    "\001\002\000\006\007\ufffd\013\ufffd\001\002\000\004\002" +
    "\uffff\001\002\000\010\005\ufff8\010\ufff8\014\ufff8\001\002" +
    "\000\010\005\017\010\020\014\023\001\002\000\006\011" +
    "\042\016\041\001\002\000\004\005\025\001\002\000\010" +
    "\005\ufff9\010\ufff9\014\ufff9\001\002\000\010\005\ufffb\010" +
    "\ufffb\014\ufffb\001\002\000\004\002\ufffe\001\002\000\010" +
    "\005\ufffa\010\ufffa\014\ufffa\001\002\000\006\015\ufff5\034" +
    "\ufff5\001\002\000\006\015\030\034\027\001\002\000\004" +
    "\005\040\001\002\000\014\024\036\025\034\026\032\027" +
    "\035\030\031\001\002\000\010\012\ufff0\033\ufff0\034\ufff0" +
    "\001\002\000\010\012\ufff2\033\ufff2\034\ufff2\001\002\000" +
    "\004\033\037\001\002\000\010\012\ufff3\033\ufff3\034\ufff3" +
    "\001\002\000\010\012\ufff1\033\ufff1\034\ufff1\001\002\000" +
    "\010\012\ufff4\033\ufff4\034\ufff4\001\002\000\010\005\ufff7" +
    "\010\ufff7\014\ufff7\001\002\000\006\015\ufff6\034\ufff6\001" +
    "\002\000\014\004\045\005\050\011\052\020\043\031\046" +
    "\001\002\000\016\004\045\005\050\011\052\012\uffe6\020" +
    "\043\031\046\001\002\000\014\004\045\005\050\011\052" +
    "\020\043\031\046\001\002\000\004\012\070\001\002\000" +
    "\024\005\uffdd\010\uffdd\012\uffdd\014\uffdd\017\uffdd\020\uffdd" +
    "\021\uffdd\022\uffdd\034\uffdd\001\002\000\024\005\uffdc\010" +
    "\uffdc\012\uffdc\014\uffdc\017\uffdc\020\uffdc\021\uffdc\022\uffdc" +
    "\034\uffdc\001\002\000\006\012\uffe7\034\066\001\002\000" +
    "\026\005\uffdb\010\uffdb\011\042\012\uffdb\014\uffdb\017\uffdb" +
    "\020\uffdb\021\uffdb\022\uffdb\034\uffdb\001\002\000\016\012" +
    "\uffe4\017\056\020\057\021\061\022\060\034\uffe4\001\002" +
    "\000\014\004\045\005\050\011\052\020\043\031\046\001" +
    "\002\000\024\005\uffda\010\uffda\012\uffda\014\uffda\017\uffda" +
    "\020\uffda\021\uffda\022\uffda\034\uffda\001\002\000\014\012" +
    "\055\017\056\020\057\021\061\022\060\001\002\000\024" +
    "\005\uffde\010\uffde\012\uffde\014\uffde\017\uffde\020\uffde\021" +
    "\uffde\022\uffde\034\uffde\001\002\000\014\004\045\005\050" +
    "\011\052\020\043\031\046\001\002\000\014\004\045\005" +
    "\050\011\052\020\043\031\046\001\002\000\014\004\045" +
    "\005\050\011\052\020\043\031\046\001\002\000\014\004" +
    "\045\005\050\011\052\020\043\031\046\001\002\000\024" +
    "\005\uffe1\010\uffe1\012\uffe1\014\uffe1\017\uffe1\020\uffe1\021" +
    "\uffe1\022\uffe1\034\uffe1\001\002\000\024\005\uffe0\010\uffe0" +
    "\012\uffe0\014\uffe0\017\uffe0\020\uffe0\021\uffe0\022\uffe0\034" +
    "\uffe0\001\002\000\024\005\uffe2\010\uffe2\012\uffe2\014\uffe2" +
    "\017\uffe2\020\uffe2\021\061\022\060\034\uffe2\001\002\000" +
    "\024\005\uffe3\010\uffe3\012\uffe3\014\uffe3\017\uffe3\020\uffe3" +
    "\021\061\022\060\034\uffe3\001\002\000\014\004\045\005" +
    "\050\011\052\020\043\031\046\001\002\000\016\012\uffe5" +
    "\017\056\020\057\021\061\022\060\034\uffe5\001\002\000" +
    "\004\033\071\001\002\000\024\005\uffe8\010\uffe8\012\uffe8" +
    "\014\uffe8\017\uffe8\020\uffe8\021\uffe8\022\uffe8\034\uffe8\001" +
    "\002\000\024\005\uffdf\010\uffdf\012\uffdf\014\uffdf\017\uffdf" +
    "\020\uffdf\021\uffdf\022\uffdf\034\uffdf\001\002\000\020\005" +
    "\uffef\010\uffef\014\uffef\017\056\020\057\021\061\022\060" +
    "\001\002\000\004\011\075\001\002\000\006\005\077\012" +
    "\uffec\001\002\000\006\012\uffea\034\uffea\001\002\000\004" +
    "\015\110\001\002\000\006\012\uffed\034\106\001\002\000" +
    "\004\012\102\001\002\000\004\013\103\001\002\000\010" +
    "\005\ufff8\010\ufff8\014\ufff8\001\002\000\010\005\017\010" +
    "\020\014\105\001\002\000\006\007\uffee\013\uffee\001\002" +
    "\000\004\005\077\001\002\000\006\012\uffeb\034\uffeb\001" +
    "\002\000\014\024\036\025\034\026\032\027\035\030\031" +
    "\001\002\000\006\012\uffe9\034\uffe9\001\002\000\004\002" +
    "\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\110\000\004\014\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\013\007\016\006\017\011\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\015\013\016\012\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\012\015\001\001\000\010\002\021\021" +
    "\023\022\020\001\001\000\002\001\001\000\004\003\025" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\004\032\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\020\072\022\052\001\001\000\012" +
    "\010\043\011\046\020\050\022\052\001\001\000\006\020" +
    "\071\022\052\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\020\053\022\052\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\020" +
    "\064\022\052\001\001\000\006\020\063\022\052\001\001" +
    "\000\006\020\062\022\052\001\001\000\006\020\061\022" +
    "\052\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\020\066\022\052\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\005\100\006\077\007\075\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\012\103\001\001\000\010\002\021" +
    "\021\023\022\020\001\001\000\002\001\001\000\004\007" +
    "\106\001\001\000\002\001\001\000\004\004\110\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ActivacionesParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ActivacionesParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ActivacionesParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	public ActivacionesParser(ActivacionesLex lex) {
		super(lex);
	}

	public void syntax_error(Symbol cur_token) {
		List<String> expected = new ArrayList<>();
		List<Integer> tokens = expected_token_ids();

		System.out.printf("Se encontro: %s -> (%s), linea %d columna %d, se esperaba -> ", cur_token.value, symbl_name_from_id(cur_token.sym), cur_token.left, cur_token.right);
		for(Integer i : tokens) {
			// expected.add(symbl_name_from_id(i));
			System.out.printf("%s, ", symbl_name_from_id(i));
		}
		System.out.println("");
	}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ActivacionesParser$actions {
  private final ActivacionesParser parser;

  /** Constructor */
  CUP$ActivacionesParser$actions(ActivacionesParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ActivacionesParser$do_action_part00000000(
    int                        CUP$ActivacionesParser$act_num,
    java_cup.runtime.lr_parser CUP$ActivacionesParser$parser,
    java.util.Stack            CUP$ActivacionesParser$stack,
    int                        CUP$ActivacionesParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ActivacionesParser$result;

      /* select the action based on the action number */
      switch (CUP$ActivacionesParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= PROGRAM ID structure 
            {
              List<Instruction> RESULT =null;
		int structureleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()).left;
		int structureright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()).right;
		List<Instruction> structure = (List<Instruction>)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.peek()).value;
		 RESULT = structure; 
              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("program",10, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-2)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).right;
		List<Instruction> start_val = (List<Instruction>)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).value;
		RESULT = start_val;
              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ActivacionesParser$parser.done_parsing();
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // structure ::= def_functions body 
            {
              List<Instruction> RESULT =null;
		int list_fleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).left;
		int list_fright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).right;
		List<Function> list_f = (List<Function>)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).value;
		int bodyleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()).left;
		int bodyright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()).right;
		List<Instruction> body = (List<Instruction>)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.peek()).value;
		
					RESULT = new ArrayList<Instruction>();
					RESULT.addAll(list_f);
					RESULT.addAll(body);
				
              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("structure",9, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // body ::= BEGIN instructions END 
            {
              List<Instruction> RESULT =null;
		int insleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).left;
		int insright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).right;
		List<Instruction> ins = (List<Instruction>)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).value;
		 RESULT = ins; 
              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("body",11, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-2)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // def_functions ::= def_functions function 
            {
              List<Function> RESULT =null;
		int list_fleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).left;
		int list_fright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).right;
		List<Function> list_f = (List<Function>)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).value;
		int funleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()).left;
		int funright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()).right;
		Function fun = (Function)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.peek()).value;
		
					RESULT = list_f;
					RESULT.add(fun);
				
              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("def_functions",13, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // def_functions ::= function 
            {
              List<Function> RESULT =null;
		int funleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()).left;
		int funright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()).right;
		Function fun = (Function)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.peek()).value;
		
					RESULT = new ArrayList<>();
					RESULT.add(fun);
				
              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("def_functions",13, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // instructions ::= instructions statement 
            {
              List<Instruction> RESULT =null;
		int listleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).right;
		List<Instruction> list = (List<Instruction>)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).value;
		 RESULT = list; 
              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("instructions",8, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // instructions ::= instructions assignment 
            {
              List<Instruction> RESULT =null;
		int listleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).right;
		List<Instruction> list = (List<Instruction>)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).value;
		int assignleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()).left;
		int assignright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()).right;
		Operation assign = (Operation)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.peek()).value;
		 RESULT = list;  RESULT.add(assign); 
              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("instructions",8, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // instructions ::= instructions call 
            {
              List<Instruction> RESULT =null;
		int listleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).right;
		List<Instruction> list = (List<Instruction>)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).value;
		int function_callleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()).left;
		int function_callright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()).right;
		FunctionCall function_call = (FunctionCall)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.peek()).value;
		
					RESULT = list;
					RESULT.add(function_call);
				
              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("instructions",8, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // instructions ::= 
            {
              List<Instruction> RESULT =null;
		 RESULT = new ArrayList<Instruction>(); 
              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("instructions",8, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // statement ::= VAR id_list COLON type SEMI 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("statement",0, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-4)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // id_list ::= id_list COMMA ID 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("id_list",1, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-2)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // id_list ::= ID 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("id_list",1, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // type ::= INT 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("type",2, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // type ::= CHAR 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("type",2, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // type ::= REAL 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("type",2, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // type ::= BOOLEAN 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("type",2, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // type ::= STRING 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("type",2, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // assignment ::= ID EQUAL expr 
            {
              Operation RESULT =null;
		int exprleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()).right;
		Operation expr = (Operation)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.peek()).value;
		 RESULT = expr; 
              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("assignment",15, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-2)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // function ::= PROCESS ID LPAREN args_list RPAREN BEGIN instructions END 
            {
              Function RESULT =null;
		int nameleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-6)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-6)).right;
		Object name = (Object)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-6)).value;
		int insleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).left;
		int insright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).right;
		List<Instruction> ins = (List<Instruction>)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)).value;
		 RESULT = new Function(name.toString(), ins); 
              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("function",12, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-7)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // args_list ::= args 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("args_list",3, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // args_list ::= 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("args_list",3, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // args ::= args COMMA arg 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("args",4, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-2)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // args ::= arg 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("args",4, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // arg ::= ID COLON type 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("arg",5, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-2)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // call ::= ID LPAREN params_list RPAREN SEMI 
            {
              FunctionCall RESULT =null;
		int nameleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-4)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-4)).right;
		Object name = (Object)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-4)).value;
		 RESULT = new FunctionCall(name.toString()); 
              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("call",16, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-4)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // params_list ::= params 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("params_list",6, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // params_list ::= 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("params_list",6, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // params ::= params COMMA expr 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("params",7, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-2)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // params ::= expr 
            {
              Object RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("params",7, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // expr ::= expr PLUS expr 
            {
              Operation RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("expr",14, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-2)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // expr ::= expr MINUS expr 
            {
              Operation RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("expr",14, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-2)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // expr ::= expr TIMES expr 
            {
              Operation RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("expr",14, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-2)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // expr ::= expr DIVIDE expr 
            {
              Operation RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("expr",14, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-2)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // expr ::= MINUS expr 
            {
              Operation RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("expr",14, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-1)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // expr ::= LPAREN expr RPAREN 
            {
              Operation RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("expr",14, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.elementAt(CUP$ActivacionesParser$top-2)), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // expr ::= INTEGER 
            {
              Operation RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("expr",14, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // expr ::= BOOL 
            {
              Operation RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("expr",14, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // expr ::= ID 
            {
              Operation RESULT =null;

              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("expr",14, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // expr ::= call 
            {
              Operation RESULT =null;
		int function_callleft = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()).left;
		int function_callright = ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()).right;
		FunctionCall function_call = (FunctionCall)((java_cup.runtime.Symbol) CUP$ActivacionesParser$stack.peek()).value;
		 RESULT = new Operation(function_call); 
              CUP$ActivacionesParser$result = parser.getSymbolFactory().newSymbol("expr",14, ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ActivacionesParser$stack.peek()), RESULT);
            }
          return CUP$ActivacionesParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ActivacionesParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ActivacionesParser$do_action(
    int                        CUP$ActivacionesParser$act_num,
    java_cup.runtime.lr_parser CUP$ActivacionesParser$parser,
    java.util.Stack            CUP$ActivacionesParser$stack,
    int                        CUP$ActivacionesParser$top)
    throws java.lang.Exception
    {
              return CUP$ActivacionesParser$do_action_part00000000(
                               CUP$ActivacionesParser$act_num,
                               CUP$ActivacionesParser$parser,
                               CUP$ActivacionesParser$stack,
                               CUP$ActivacionesParser$top);
    }
}

}
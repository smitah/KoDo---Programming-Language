package Compiler;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.io.*;
import java.util.ArrayList;
/**
 * This class provides an empty implementation of {@link KodoGrammarListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */

public class KodoGrammarBaseListener implements KodoGrammarListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	//static StringBuffer File =new StringBuffer("");
	//File file = new File("Prog.kin");
	static ArrayList<String> File = new ArrayList<String>();
   
	@Override public void enterEntryPoint(KodoGrammarParser.EntryPointContext ctx) {

		//File.add("PRG SRT \n");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEntryPoint(KodoGrammarParser.EntryPointContext ctx) { 
		
		//File.add("PRG END \n");
        //System.out.println(File);
		/*
        FileWriter writer;
		try {
			writer = new FileWriter(file);
			writer.write(File.toString());
	        writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
        // Writes the content to the file
        */
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProgram(KodoGrammarParser.ProgramContext ctx) {
		Utilities utilobj = new Utilities();
		
		if(ctx.parent.getClass().toString().contains("$IfstatementContext") && ctx.parent.getChild(1).getChildCount() != 1)
		{
			
		    File.add("If" + " " + utilobj.getTemp() + "\n");
		}
		else if(ctx.parent.getClass().toString().contains("$IfstatementContext") && ctx.parent.getChild(1).getChild(0).getChildCount() == 1)
		{
			
		    File.add("If"  + ctx.parent.getChild(1).getChild(0).getChild(0).toString() + "\n");
		}
		else if(ctx.parent.getClass().toString().contains("$IfstatementContext") && ctx.parent.getChild(1).getChildCount() == 1)
		{
			
			File.add("If"  + ctx.parent.getChild(1).getChild(0).toString() + "\n");
		}
		if(ctx.parent.getClass().toString().contains("$ElseifstatementContext") && ctx.parent.getChild(1).getChildCount() != 1)
		{
			
			File.add("Elseif" + " " + utilobj.getTemp() + "\n");
			
		}	
		else if(ctx.parent.getClass().toString().contains("$ElseifstatementContext") && ctx.parent.getChild(1).getChild(0).getChildCount() == 1)
		{
			
			File.add("Elseif "  + ctx.parent.getChild(1).getChild(0).getChild(0).toString() + "\n");
		}
			
		else if(ctx.parent.getClass().toString().contains("$ElseifstatementContext") && ctx.parent.getChild(1).getChildCount() == 1)
		{
	
			File.add("Elseif "  + ctx.parent.getChild(1).getChild(0).toString() + "\n");
		}
			
		
		
		if(ctx.parent.getClass().toString().contains("$WhileblockstatementContext") && ctx.parent.getChild(1).getChildCount() != 1)
		{
			
			File.add("WH" + " " + utilobj.getTemp() + "\n");
		}
			
		else if(ctx.parent.getClass().toString().contains("$WhileblockstatementContext") && ctx.parent.getChild(1).getChild(0).getChildCount() == 1)
		{ 
			
			File.add("WH "  + ctx.parent.getChild(1).getChild(0).getChild(0).toString() + "\n");
		}
			
		else if(ctx.parent.getClass().toString().contains("$WhileblockstatementContext") && ctx.parent.getChild(1).getChildCount() == 1)
		{
			
			File.add("WH "  + ctx.parent.getChild(1).getChild(0).toString() + "\n");
			
		}
			
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(KodoGrammarParser.ProgramContext ctx) {
		
		if(ctx.parent.getClass().toString().contains("$WhileblockstatementContext"))
		{
			
			File.add("GOTO: wh \n");
			
		}
		//System.out.println(File);
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(KodoGrammarParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(KodoGrammarParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignment(KodoGrammarParser.AssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignment(KodoGrammarParser.AssignmentContext ctx) { 
		Utilities utilObj = new Utilities();
		int complexchild = ctx.getChild(2).getChildCount()>1 ? 1:0;
		switch(complexchild) {
		case 0:
			if(ctx.getChild(2).getChild(0).getChildCount() == 0)
				File.add("ASN " + ctx.getChild(0).toString() + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			else
				File.add("ASN " + ctx.getChild(0).toString() + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
			break;
		case 1:
			File.add("ASN " + ctx.getChild(0).toString() + " " + utilObj.getTemp() + "\n");
			break;
		}				
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDisplay(KodoGrammarParser.DisplayContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDisplay(KodoGrammarParser.DisplayContext ctx) {
		Utilities utilObj = new Utilities();
		int complexchild = ctx.getChild(1).getChildCount()>1 ? 1:0;
		switch(complexchild) {
		case 0:
			if(ctx.getChild(1).getChild(0).getChildCount() == 0)
				File.add("DIS "  + ctx.getChild(1).getChild(0).toString() + "\n");
			else
				File.add("DIS " + ctx.getChild(1).getChild(0).getChild(0).toString() + "\n");
			break;
		case 1:
			File.add("DIS " + utilObj.getTemp() + "\n");
			break;
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNumvariable(KodoGrammarParser.NumvariableContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNumvariable(KodoGrammarParser.NumvariableContext ctx) {
		
		File.add("DEC" + " " +  ctx.getChild(1) + " " + "int" + "\n");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBinvariable(KodoGrammarParser.BinvariableContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBinvariable(KodoGrammarParser.BinvariableContext ctx) {
		File.add("DEC" + " " + ctx.getChild(1) + " " + "bin" + "\n");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStrvariable(KodoGrammarParser.StrvariableContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStrvariable(KodoGrammarParser.StrvariableContext ctx) { 
		File.add("DEC" + " " + ctx.getChild(1) + " " + "str" + "\n");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhileblockstatement(KodoGrammarParser.WhileblockstatementContext ctx) { 
		
		
		File.add("LABEL: wh \n");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhileblockstatement(KodoGrammarParser.WhileblockstatementContext ctx) { 
		
		File.add("ENDwh\n");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfblockstatement(KodoGrammarParser.IfblockstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfblockstatement(KodoGrammarParser.IfblockstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElseifstatement(KodoGrammarParser.ElseifstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElseifstatement(KodoGrammarParser.ElseifstatementContext ctx) { 
		File.add("ENDelseif" + "\n");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElsestatement(KodoGrammarParser.ElsestatementContext ctx) {
		File.add("Else" + "\n");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElsestatement(KodoGrammarParser.ElsestatementContext ctx) {
		File.add("ENDelse" + "\n");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfstatement(KodoGrammarParser.IfstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfstatement(KodoGrammarParser.IfstatementContext ctx) {
		File.add("ENDif" + "\n");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLtexpr(KodoGrammarParser.LtexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLtexpr(KodoGrammarParser.LtexprContext ctx) {
		Utilities UtilObj = new Utilities();
		String leftTemp = null, rightTemp = null;
		int complexchild = 0; 
		if(ctx.getChild(0).getChildCount()>1)
			complexchild++;
		if(ctx.getChild(2).getChildCount()>1)
			complexchild++;
		
		switch(complexchild) {
		case 0: 
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() +"\n");
			if(ctx.getChild(2).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() +"\n");
			else
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() +"\n");
			break;
		case 1:	
			String tempVar = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp +"\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChildCount()>1) {
				File.add("ASN" + " " + leftTemp + " " + tempVar + "\n");
				if(ctx.getChild(2).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			}
			else {
				File.add("ASN" + " " + rightTemp + " " + tempVar + "\n");
				if(ctx.getChild(0).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			}
			break;
		case 2: 
			String tempVar1 = UtilObj.getTemp();
			String tempVar2 = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("ASN" + " " + rightTemp + " " + tempVar1 + "\n");
			File.add("ASN" + " " + leftTemp + " " + tempVar2 + "\n");
			break;
		}
		File.add("LT" + " "+ leftTemp + " " + rightTemp + "\n");
		UtilObj.removeTemp(rightTemp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLteexpr(KodoGrammarParser.LteexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLteexpr(KodoGrammarParser.LteexprContext ctx) {
		Utilities UtilObj = new Utilities();
		String leftTemp = null, rightTemp = null;
		int complexchild = 0; 
		if(ctx.getChild(0).getChildCount()>1)
			complexchild++;
		if(ctx.getChild(2).getChildCount()>1)
			complexchild++;
		
		switch(complexchild) {
		case 0: 
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			if(ctx.getChild(2).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			break;
		case 1:	
			String tempVar = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChildCount()>1) {
				File.add("ASN" + " " + leftTemp + " " + tempVar+ "\n");
				if(ctx.getChild(2).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString()+ "\n");
				else
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString()+ "\n");
			}
			else {
				File.add("ASN" + " " + rightTemp + " " + tempVar+ "\n");
				if(ctx.getChild(0).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString()+ "\n");
				else
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString()+ "\n");
			}
			break;
		case 2: 
			String tempVar1 = UtilObj.getTemp();
			String tempVar2 = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("ASN" + " " + rightTemp + " " + tempVar1+ "\n");
			File.add("ASN" + " " + leftTemp + " " + tempVar2+ "\n");
			break;
		}
		File.add("LTE" + " "+ leftTemp + " " + rightTemp+ "\n");
		UtilObj.removeTemp(rightTemp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEqexpr(KodoGrammarParser.EqexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEqexpr(KodoGrammarParser.EqexprContext ctx) {
		Utilities UtilObj = new Utilities();
		String leftTemp = null, rightTemp = null;
		int complexchild = 0; 
		if(ctx.getChild(0).getChildCount()>1)
			complexchild++;
		if(ctx.getChild(2).getChildCount()>1)
			complexchild++;
		
		switch(complexchild) {
		case 0: 
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp+ "\n");
			File.add("Dec " + rightTemp+ "\n");
			if(ctx.getChild(0).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString()+ "\n");
			else
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString()+ "\n");
			if(ctx.getChild(2).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString()+ "\n");
			else
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString()+ "\n");
			break;
		case 1:	
			String tempVar = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp+ "\n");
			File.add("Dec " + rightTemp+ "\n");
			if(ctx.getChild(0).getChildCount()>1) {
				File.add("ASN" + " " + leftTemp + " " + tempVar+ "\n");
				if(ctx.getChild(2).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString()+ "\n");
				else
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString()+ "\n");
			}
			else {
				File.add("ASN" + " " + rightTemp + " " + tempVar + "\n");
				if(ctx.getChild(0).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString()+ "\n");
				else
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString()+ "\n");
			}
			break;
		case 2: 
			String tempVar1 = UtilObj.getTemp();
			String tempVar2 = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("ASN" + " " + rightTemp + " " + tempVar1+ "\n");
			File.add("ASN" + " " + leftTemp + " " + tempVar2+ "\n");
			break;
		}
		File.add("EQ" + " "+ leftTemp + " " + rightTemp+ "\n");
		UtilObj.removeTemp(rightTemp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNeqexpr(KodoGrammarParser.NeqexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNeqexpr(KodoGrammarParser.NeqexprContext ctx) { 
		Utilities UtilObj = new Utilities();
		String leftTemp = null, rightTemp = null;
		int complexchild = 0; 
		if(ctx.getChild(0).getChildCount()>1)
			complexchild++;
		if(ctx.getChild(2).getChildCount()>1)
			complexchild++;
		
		switch(complexchild) {
		case 0: 
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp+ "\n");
			File.add("Dec " + rightTemp+ "\n");
			if(ctx.getChild(0).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString()+ "\n");
			else
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString()+ "\n");
			if(ctx.getChild(2).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString()+ "\n");
			else
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString()+ "\n");
			break;
		case 1:	
			String tempVar = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp+ "\n");
			File.add("Dec " + rightTemp+ "\n");
			if(ctx.getChild(0).getChildCount()>1) {
				File.add("ASN" + " " + leftTemp + " " + tempVar+ "\n");
				if(ctx.getChild(2).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString()+ "\n");
				else
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString()+ "\n");
			}
			else {
				File.add("ASN" + " " + rightTemp + " " + tempVar+ "\n");
				if(ctx.getChild(0).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString()+ "\n");
				else
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			}
			break;
		case 2: 
			String tempVar1 = UtilObj.getTemp();
			String tempVar2 = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("ASN" + " " + rightTemp + " " + tempVar1 + "\n");
			File.add("ASN" + " " + leftTemp + " " + tempVar2 + "\n");
			break;
		}
		File.add("NEQ" + " "+ leftTemp + " " + rightTemp + "\n");
		UtilObj.removeTemp(rightTemp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNotexpr(KodoGrammarParser.NotexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNotexpr(KodoGrammarParser.NotexprContext ctx) { 
		Utilities utilObj = new Utilities();
		String temp = utilObj.getNewTemp();
		File.add("DEC " + temp + "\n");
		File.add("ASN " + temp + " " + ctx.getChild(1).getChild(0) + "\n");
		File.add("NOT " + temp + "\n");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVarexpr(KodoGrammarParser.VarexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVarexpr(KodoGrammarParser.VarexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAddexpr(KodoGrammarParser.AddexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAddexpr(KodoGrammarParser.AddexprContext ctx) {
		
		Utilities UtilObj = new Utilities();
		String leftTemp = null, rightTemp = null;
		int complexchild = 0; 
		if(ctx.getChild(0).getChildCount()>1)
			complexchild++;
		if(ctx.getChild(2).getChildCount()>1)
			complexchild++;
		
		switch(complexchild) {
		case 0: 
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			if(ctx.getChild(2).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			break;
		case 1:	
			String tempVar = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChildCount()>1) {
				File.add("ASN" + " " + leftTemp + " " + tempVar + "\n");
				if(ctx.getChild(2).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			}
			else {
				File.add("ASN" + " " + rightTemp + " " + tempVar + "\n");
				if(ctx.getChild(0).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			}
			break;
		case 2: 
			String tempVar1 = UtilObj.getTemp();
			String tempVar2 = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("ASN" + " " + rightTemp + " " + tempVar1 + "\n");
			File.add("ASN" + " " + leftTemp + " " + tempVar2 + "\n");
			break;
		}
		File.add("ADD" + " "+ leftTemp + " " + rightTemp + "\n");
		UtilObj.removeTemp(rightTemp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDivexpr(KodoGrammarParser.DivexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDivexpr(KodoGrammarParser.DivexprContext ctx) { 
		Utilities UtilObj = new Utilities();
		String leftTemp = null, rightTemp = null;
		int complexchild = 0; 
		if(ctx.getChild(0).getChildCount()>1)
			complexchild++;
		if(ctx.getChild(2).getChildCount()>1)
			complexchild++;
		
		switch(complexchild) {
		case 0: 
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			if(ctx.getChild(2).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			break;
		case 1:	
			String tempVar = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChildCount()>1) {
				File.add("ASN" + " " + leftTemp + " " + tempVar + "\n");
				if(ctx.getChild(2).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			}
			else {
				File.add("ASN" + " " + rightTemp + " " + tempVar + "\n");
				if(ctx.getChild(0).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			}
			break;
		case 2: 
			String tempVar1 = UtilObj.getTemp();
			String tempVar2 = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("ASN" + " " + rightTemp + " " + tempVar1 + "\n");
			File.add("ASN" + " " + leftTemp + " " + tempVar2 + "\n");
			break;
		}
		File.add("DIV" + " "+ leftTemp + " " + rightTemp + "\n");
		UtilObj.removeTemp(rightTemp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAndexpr(KodoGrammarParser.AndexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAndexpr(KodoGrammarParser.AndexprContext ctx) { 
		Utilities UtilObj = new Utilities();
		String leftTemp = null, rightTemp = null;
		int complexchild = 0; 
		if(ctx.getChild(0).getChildCount()>1)
			complexchild++;
		if(ctx.getChild(2).getChildCount()>1)
			complexchild++;
		
		switch(complexchild) {
		case 0: 
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + '\n');
			else
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			if(ctx.getChild(2).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			break;
		case 1:	
			String tempVar = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChildCount()>1) {
				File.add("ASN" + " " + leftTemp + " " + tempVar + "\n");
				if(ctx.getChild(2).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			}
			else {
				File.add("ASN" + " " + rightTemp + " " + tempVar + "\n");
				if(ctx.getChild(0).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			}
			break;
		case 2: 
			String tempVar1 = UtilObj.getTemp();
			String tempVar2 = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("ASN" + " " + rightTemp + " " + tempVar1 + "\n");
			File.add("ASN" + " " + leftTemp + " " + tempVar2 + "\n");
			break;
		}
		File.add("AND" + " "+ leftTemp + " " + rightTemp + "\n");
		UtilObj.removeTemp(rightTemp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIntexpr(KodoGrammarParser.IntexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIntexpr(KodoGrammarParser.IntexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStrexpr(KodoGrammarParser.StrexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStrexpr(KodoGrammarParser.StrexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOrpexpr(KodoGrammarParser.OrpexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOrpexpr(KodoGrammarParser.OrpexprContext ctx) { 
		Utilities UtilObj = new Utilities();
		String leftTemp = null, rightTemp = null;
		int complexchild = 0; 
		if(ctx.getChild(0).getChildCount()>1)
			complexchild++;
		if(ctx.getChild(2).getChildCount()>1)
			complexchild++;
		
		switch(complexchild) {
		case 0: 
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			if(ctx.getChild(2).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			break;
		case 1:	
			String tempVar = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp);
			File.add("Dec " + rightTemp);
			if(ctx.getChild(0).getChildCount()>1) {
				File.add("ASN" + " " + leftTemp + " " + tempVar + "\n");
				if(ctx.getChild(2).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			}
			else {
				File.add("ASN" + " " + rightTemp + " " + tempVar + "\n");
				if(ctx.getChild(0).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			}
			break;
		case 2: 
			String tempVar1 = UtilObj.getTemp();
			String tempVar2 = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("ASN" + " " + rightTemp + " " + tempVar1 + "\n");
			File.add("ASN" + " " + leftTemp + " " + tempVar2 + "\n");
			break;
		}
		File.add("OR" + " "+ leftTemp + " " + rightTemp + "\n");
		UtilObj.removeTemp(rightTemp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterModexpr(KodoGrammarParser.ModexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitModexpr(KodoGrammarParser.ModexprContext ctx) { 
		Utilities UtilObj = new Utilities();
		String leftTemp = null, rightTemp = null;
		int complexchild = 0; 
		if(ctx.getChild(0).getChildCount()>1)
			complexchild++;
		if(ctx.getChild(2).getChildCount()>1)
			complexchild++;
		
		switch(complexchild) {
		case 0: 
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			if(ctx.getChild(2).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			break;
		case 1:	
			String tempVar = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChildCount()>1) {
				File.add("ASN" + " " + leftTemp + " " + tempVar + "\n");
				if(ctx.getChild(2).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			}
			else {
				File.add("ASN" + " " + rightTemp + " " + tempVar + "\n");
				if(ctx.getChild(0).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			}
			break;
		case 2: 
			String tempVar1 = UtilObj.getTemp();
			String tempVar2 = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("ASN" + " " + rightTemp + " " + tempVar1 + "\n");
			File.add("ASN" + " " + leftTemp + " " + tempVar2 + "\n");
			break;
		}
		File.add("MOD" + " "+ leftTemp + " " + rightTemp + "\n");
		UtilObj.removeTemp(rightTemp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMulexpr(KodoGrammarParser.MulexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMulexpr(KodoGrammarParser.MulexprContext ctx) { 
		Utilities UtilObj = new Utilities();
		String leftTemp = null, rightTemp = null;
		int complexchild = 0; 
		if(ctx.getChild(0).getChildCount()>1)
			complexchild++;
		if(ctx.getChild(2).getChildCount()>1)
			complexchild++;
		
		switch(complexchild) {
		case 0: 
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			if(ctx.getChild(2).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			break;
		case 1:	
			String tempVar = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChildCount()>1) {
				File.add("ASN" + " " + leftTemp + " " + tempVar + "\n");
				if(ctx.getChild(2).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			}
			else {
				File.add("ASN" + " " + rightTemp + " " + tempVar + "\n");
				if(ctx.getChild(0).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			}
			break;
		case 2: 
			String tempVar1 = UtilObj.getTemp();
			String tempVar2 = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("ASN" + " " + rightTemp + " " + tempVar1 + "\n");
			File.add("ASN" + " " + leftTemp + " " + tempVar2 + "\n");
			break;
		}
		File.add("MUL" + " "+ leftTemp + " " + rightTemp + "\n");
		UtilObj.removeTemp(rightTemp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterGtexpr(KodoGrammarParser.GtexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitGtexpr(KodoGrammarParser.GtexprContext ctx) { 
		Utilities UtilObj = new Utilities();
		String leftTemp = null, rightTemp = null;
		int complexchild = 0; 
		if(ctx.getChild(0).getChildCount()>1)
			complexchild++;
		if(ctx.getChild(2).getChildCount()>1)
			complexchild++;
		
		switch(complexchild) {
		case 0: 
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			if(ctx.getChild(2).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			break;
		case 1:	
			String tempVar = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChildCount()>1) {
				File.add("ASN" + " " + leftTemp + " " + tempVar + "\n");
				if(ctx.getChild(2).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			}
			else {
				File.add("ASN" + " " + rightTemp + " " + tempVar + "\n");
				if(ctx.getChild(0).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			}
			break;
		case 2: 
			String tempVar1 = UtilObj.getTemp();
			String tempVar2 = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("ASN" + " " + rightTemp + " " + tempVar1 + "\n");
			File.add("ASN" + " " + leftTemp + " " + tempVar2 + "\n");
			break;
		}
		File.add("GT" + " "+ leftTemp + " " + rightTemp + "\n");
		UtilObj.removeTemp(rightTemp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBinaryexpr(KodoGrammarParser.BinaryexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBinaryexpr(KodoGrammarParser.BinaryexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSubexpr(KodoGrammarParser.SubexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSubexpr(KodoGrammarParser.SubexprContext ctx) { 
		Utilities UtilObj = new Utilities();
		String leftTemp = null, rightTemp = null;
		int complexchild = 0; 
		if(ctx.getChild(0).getChildCount()>1)
			complexchild++;
		if(ctx.getChild(2).getChildCount()>1)
			complexchild++;
		
		switch(complexchild) {
		case 0: 
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			if(ctx.getChild(2).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			break;
		case 1:	
			String tempVar = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChildCount()>1) {
				File.add("ASN" + " " + leftTemp + " " + tempVar + "\n");
				if(ctx.getChild(2).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			}
			else {
				File.add("ASN" + " " + rightTemp + " " + tempVar +"\n");
				if(ctx.getChild(0).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			}
			break;
		case 2: 
			String tempVar1 = UtilObj.getTemp();
			String tempVar2 = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("ASN" + " " + rightTemp + " " + tempVar1 + "\n");
			File.add("ASN" + " " + leftTemp + " " + tempVar2 + "\n");
			break;
		}
		File.add("SUB" + " "+ leftTemp + " " + rightTemp + "\n");
		UtilObj.removeTemp(rightTemp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterGteexpr(KodoGrammarParser.GteexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitGteexpr(KodoGrammarParser.GteexprContext ctx) {
		Utilities UtilObj = new Utilities();
		String leftTemp = null, rightTemp = null;
		int complexchild = 0; 
		if(ctx.getChild(0).getChildCount()>1)
			complexchild++;
		if(ctx.getChild(2).getChildCount()>1)
			complexchild++;
		
		switch(complexchild) {
		case 0: 
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp + "\n");
			File.add("Dec " + rightTemp + "\n");
			if(ctx.getChild(0).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			if(ctx.getChild(2).getChild(0).getChildCount() > 0)
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
			else
				File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			break;
		case 1:	
			String tempVar = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("Dec " + leftTemp);
			File.add("Dec " + rightTemp);
			if(ctx.getChild(0).getChildCount()>1) {
				File.add("ASN" + " " + leftTemp + " " + tempVar + "\n");
				if(ctx.getChild(2).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + rightTemp + " " + ctx.getChild(2).getChild(0).toString() + "\n");
			}
			else {
				File.add("ASN" + " " + rightTemp + " " + tempVar + "\n");
				if(ctx.getChild(0).getChild(0).getChildCount() > 0)
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).getChild(0).toString() + "\n");
				else
					File.add("ASN" + " " + leftTemp + " " + ctx.getChild(0).getChild(0).toString() + "\n");
			}
			break;
		case 2: 
			String tempVar1 = UtilObj.getTemp();
			String tempVar2 = UtilObj.getTemp();
			leftTemp = UtilObj.getNewTemp();
			rightTemp = UtilObj.getNewTemp();
			File.add("ASN" + " " + rightTemp + " " + tempVar1 + "\n");
			File.add("ASN" + " " + leftTemp + " " + tempVar2 + "\n");
			break;
		}
		File.add("ADD" + " "+ leftTemp + " " + rightTemp + "\n");
		UtilObj.removeTemp(rightTemp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBinary(KodoGrammarParser.BinaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBinary(KodoGrammarParser.BinaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInteger(KodoGrammarParser.IntegerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInteger(KodoGrammarParser.IntegerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterString(KodoGrammarParser.StringContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitString(KodoGrammarParser.StringContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}
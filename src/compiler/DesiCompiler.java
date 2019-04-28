package compiler;

import desi.DesiGrammarParser.AssignmentBooleanContext;
import desi.DesiGrammarParser.AssignmentIntegerContext;
import desi.DesiGrammarParser.BlockContext;
import desi.DesiGrammarParser.CommandContext;
import desi.DesiGrammarParser.Cond_expressnContext;
import desi.DesiGrammarParser.ElseExpressnContext;
import desi.DesiGrammarParser.ElseIfExpressnContext;
import desi.DesiGrammarParser.ExpressionBooleanConnectorContext;
import desi.DesiGrammarParser.ExpressionNumberComparisonContext;
import desi.DesiGrammarParser.ExpressionBooleanComparisonContext;
import desi.DesiGrammarParser.ExpressionBooleanContext;
import desi.DesiGrammarParser.ExpressionBooleanParenthesesContext;
import desi.DesiGrammarParser.ExpressionNumberIdentifierOnlyContext;
import desi.DesiGrammarParser.ExpressionNumberMultiplyDivideContext;
import desi.DesiGrammarParser.ExpressionNumberOnlyContext;
import desi.DesiGrammarParser.ExpressionNumberParenthesesContext;
import desi.DesiGrammarParser.ExpressionNumberPlusMinusContext;
import desi.DesiGrammarParser.IfExpressnContext;
import desi.DesiGrammarParser.PrintContext;
import desi.DesiGrammarParser.ProgramContext;
import desi.DesiGrammarParser.WhileExpressnContext;
import runtime.DesiRuntimeConstants;

import java.util.ArrayList;

import desi.DesiGrammarBaseVisitor;
import desi.DesiGrammarParser;

public class DesiCompiler extends DesiGrammarBaseVisitor{

	ArrayList<String> varList = new ArrayList<String>();
	
	private class IntermediateCodeGenerator {
        private String IntermediateOutput = "";
        private void addIntermediateOutput(String output) {
            this.IntermediateOutput += output + "\n";
        }
    }
	
	private IntermediateCodeGenerator intermediateCodeGenerator = new IntermediateCodeGenerator();
	
	public String getOutput() {
		return intermediateCodeGenerator.IntermediateOutput;
	}
	
	@Override
	public Object visitProgram(ProgramContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Object visitBlock(BlockContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Object visitCommand(CommandContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public Object visitAssignmentInteger(AssignmentIntegerContext ctx) {
		
		String identifier = ctx.IDENTIFIER().getText();
		
		if(ctx.getText().contains("int"))
		{
			addVariable(identifier);
		}
		else
		{
			if(!checkVariableExist(identifier))
			{
				System.err.println("Compile time error : Variable " +identifier+ " not defined");
	            System.exit(1);
			}
		}
		
		
		if(ctx.EQUALSto()!= null)
		{
			//if initialization and assignment done in the same statement
			visit(ctx.num_expressn());
			intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION +" " +
					identifier + " " + DesiRuntimeConstants.ACCUMULATOR_REGISTER);
		}
		else {
			//if no assignment to the variable is done. Default value is can be 0
			intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION +" " +
					DesiRuntimeConstants.ACCUMULATOR_REGISTER + " " + DesiRuntimeConstants.DEFAULT_INT);
			
			intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION +" " +
					identifier + " " + DesiRuntimeConstants.ACCUMULATOR_REGISTER);
		}
		return null;
	}
	

	@Override
	public Object visitExpressionNumberParentheses(ExpressionNumberParenthesesContext ctx) {
		visit(ctx.num_expressn());
		return null;
	}
	
	
	@Override
	public Object visitExpressionNumberPlusMinus(ExpressionNumberPlusMinusContext ctx) {
		
		int tree_one = 1;
		int tree_two = 0;
		
		String reg1 = "";
		String reg2 = "";
		
		if(!(ctx.num_expressn(1).getChildCount() > ctx.num_expressn(0).getChildCount()))
		{
			tree_one = 0;
			tree_two = 1;
		}
		
		
		if(!((ctx.num_expressn(1).getChildCount() > 2) && (ctx.num_expressn(0).getChildCount() > 2)))
		{
			reg1 = DesiRuntimeConstants.REGISTER_THREE;
			reg2 = DesiRuntimeConstants.REGISTER_FOUR;
		}
		else
		{
			reg1 = DesiRuntimeConstants.REGISTER_TWO;
			reg2 = DesiRuntimeConstants.REGISTER_THREE;
		}
		
		visit(ctx.num_expressn(tree_one));
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION +" " +
				reg1 + " " + DesiRuntimeConstants.ACCUMULATOR_REGISTER);
		
		visit(ctx.num_expressn(tree_two));
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION +" " +
				reg2 + " " + DesiRuntimeConstants.ACCUMULATOR_REGISTER);
		
		switch(ctx.op.getType()) {
			case DesiGrammarParser.ADD:
				intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.ADDITION +" " +
						DesiRuntimeConstants.ACCUMULATOR_REGISTER + " " +
						reg1 + " " + reg2);
				break;
			case DesiGrammarParser.SUB:
				intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.SUBTRACTION +" " +
						DesiRuntimeConstants.ACCUMULATOR_REGISTER + " " +
						reg1 + " " + reg2);
				break;
		}
		return null; 
	}
	
	
	@Override
	public Object visitExpressionNumberMultiplyDivide(ExpressionNumberMultiplyDivideContext ctx) {
//		System.out.println(ctx.getText());

		String reg1 = "";
		String reg2 = "";
		
		int tree_one = 1;
		int tree_two = 0;
		
		if(!(ctx.num_expressn(1).getChildCount() > ctx.num_expressn(0).getChildCount()))
		{
			tree_one = 0;
			tree_two = 1;
		}
		
		if(!((ctx.num_expressn(1).getChildCount() > 2) && (ctx.num_expressn(0).getChildCount() > 2)))
		{
			reg1 = DesiRuntimeConstants.REGISTER_THREE;
			reg2 = DesiRuntimeConstants.REGISTER_FOUR;
		}
		else
		{
			reg1 = DesiRuntimeConstants.REGISTER_TWO;
			reg2 = DesiRuntimeConstants.REGISTER_THREE;
		}
	
		
		visit(ctx.num_expressn(tree_one));
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION +" " +
				reg1 + " " + DesiRuntimeConstants.ACCUMULATOR_REGISTER);
		
		visit(ctx.num_expressn(tree_two));
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION +" " +
				reg2 + " " +DesiRuntimeConstants.ACCUMULATOR_REGISTER);
		
		switch(ctx.op.getType()) {
			case DesiGrammarParser.MUL:
				intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.MULTIPLICATION +" " +
						DesiRuntimeConstants.ACCUMULATOR_REGISTER + " " +
						reg1 + " " + reg2);
				break;
			case DesiGrammarParser.DIV:
				intermediateCodeGenerator.addIntermediateOutput( DesiRuntimeConstants.DIVISION +" " +
						DesiRuntimeConstants.ACCUMULATOR_REGISTER + " " +
						reg1 + " " + reg2);
				break;
		}

		return null;
	}
	
	@Override
	public Object visitExpressionNumberIdentifierOnly(ExpressionNumberIdentifierOnlyContext ctx) {
		String identifier = ctx.IDENTIFIER().getText();
		if(checkVariableExist(identifier))
		{
			intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION + " " + DesiRuntimeConstants.ACCUMULATOR_REGISTER + " "  + identifier);
			if(ctx.SUB() != null)
			{
				intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.UNARY_MINUS + " " + DesiRuntimeConstants.ACCUMULATOR_REGISTER);
			}
		}
		else
		{
			System.err.println("Compile time error : Variable " +identifier+ " not defined");
            System.exit(1);
		}
		return null;
	}
	
	@Override
	public Object visitExpressionNumberOnly(ExpressionNumberOnlyContext ctx) {
		String value = ctx.DIGITS().getText();
		Integer integerValue = Integer.parseInt(value);
		if(ctx.SUB() != null) {
			integerValue = -integerValue;
		}
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION + " " + DesiRuntimeConstants.ACCUMULATOR_REGISTER +" "+ integerValue);
		return null; 
	}
	
	@Override
	public Object visitWhileExpressn(WhileExpressnContext ctx) {
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.WHILE_SHURU);
		visit(ctx.cond_expressn());
        visit(ctx.block());
        intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.WHILE_KHATAM);
		return null; 
	}
	
	
	@Override
	public Object visitCond_expressn(Cond_expressnContext ctx) {
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.CONDITION_SHURU);
		visit(ctx.bool_expressn());
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.CONDITION_KHATAM);
		return null; 
		
	}
	
	@Override
	public Object visitIfExpressn(IfExpressnContext ctx) {
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.IF_ELSE_SHURU);
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.IF_SHURU);
		visit(ctx.cond_expressn());
		visit(ctx.block());
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.IF_KHATAM);
		for(int i=0; i < ctx.elseIfExpressn().size(); i++) {
			visit(ctx.elseIfExpressn(i));
		}
		if(ctx.elseExpressn() != null) {
			visit(ctx.elseExpressn());
		}
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.IF_ELSE_KHATAM);
		return null; 
	}
	
	@Override
	public Object visitElseExpressn(ElseExpressnContext ctx) {
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.ELSE_SHURU);
		visit(ctx.block());
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.ELSE_KHATAM);
		return null; 
	}
	
	@Override
	public Object visitElseIfExpressn(ElseIfExpressnContext ctx) {
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.ELSE_IF_SHURU);
		visit(ctx.cond_expressn());
		visit(ctx.block());
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.ELSE_IF_KHATAM);
		return null; 
	}
	

	@Override
	public Object visitAssignmentBoolean(AssignmentBooleanContext ctx) {
		String identifier = ctx.IDENTIFIER().getText();
		
		if(ctx.getText().contains("bool"))
		{
			addVariable(identifier);
		}
		else
		{
			if(!checkVariableExist(identifier))
			{
				System.err.println("Compile time error : Variable " +identifier+ " not defined");
	            System.exit(1);
			}
		}
		
		if(ctx.EQUALSto() != null) {
            visit(ctx.bool_expressn());
            intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION + " " 
            		+ identifier + " " 
            		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER);
        }
        else {
        	
        	intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION +" " +
					DesiRuntimeConstants.ACCUMULATOR_REGISTER + " " + DesiRuntimeConstants.DEFAULT_BOOL);
			
			intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION +" " +
					identifier + " " + DesiRuntimeConstants.ACCUMULATOR_REGISTER);
        	
        }
        return null;
	}
	

	@Override
	public Object visitExpressionBooleanConnector(ExpressionBooleanConnectorContext ctx) {
		visit(ctx.bool_expressn(0));
		intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION + " " 
        		+ DesiRuntimeConstants.REGISTER_TWO + " " 
        		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER);
        visit(ctx.bool_expressn(1));
        intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION + " " 
        		+ DesiRuntimeConstants.REGISTER_THREE + " " 
        		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER);

        switch(ctx.op.getType()) {
            case DesiGrammarParser.AND:
            	intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.AND + " " 
                		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER + " " 
                		+ DesiRuntimeConstants.REGISTER_TWO + " " 
                		+ DesiRuntimeConstants.REGISTER_THREE);
                break;
            case DesiGrammarParser.OR:
            	intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.OR + " " 
                		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER + " " 
                		+ DesiRuntimeConstants.REGISTER_TWO + " " 
                		+ DesiRuntimeConstants.REGISTER_THREE);
                break;
        }
		return null; 
	}
	
	
	@Override
	public Object visitExpressionNumberComparison(ExpressionNumberComparisonContext ctx) {
		visit(ctx.num_expressn(0));
        intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION + " " 
        		+ DesiRuntimeConstants.REGISTER_TWO + " " 
        		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER);
		visit(ctx.num_expressn(1));
        intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION + " " 
        		+ DesiRuntimeConstants.REGISTER_THREE + " " 
        		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER);
		
		switch(ctx.op.getType()) {
			case DesiGrammarParser.GREATER:
				intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.GT + " " 
                		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER + " " 
                		+ DesiRuntimeConstants.REGISTER_TWO + " " 
                		+ DesiRuntimeConstants.REGISTER_THREE);
				break;
			case DesiGrammarParser.MORE_or_EQU:
				intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.GTE + " " 
                		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER + " " 
                		+ DesiRuntimeConstants.REGISTER_TWO + " " 
                		+ DesiRuntimeConstants.REGISTER_THREE);
				break;
			case DesiGrammarParser.LESSER:
				intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.LT + " " 
                		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER + " " 
                		+ DesiRuntimeConstants.REGISTER_TWO + " " 
                		+ DesiRuntimeConstants.REGISTER_THREE);
				break;
			case DesiGrammarParser.LESS_or_EQU:
				intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.LTE + " " 
                		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER + " " 
                		+ DesiRuntimeConstants.REGISTER_TWO + " " 
                		+ DesiRuntimeConstants.REGISTER_THREE);
				break;
			case DesiGrammarParser.ISEquals:
				intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.EQUAL_EQUAL + " " 
                		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER + " " 
                		+ DesiRuntimeConstants.REGISTER_TWO + " " 
                		+ DesiRuntimeConstants.REGISTER_THREE);
				break;
			case DesiGrammarParser.NotEquals:
				intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.NOT_EQUAL + " " 
                		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER + " " 
                		+ DesiRuntimeConstants.REGISTER_TWO + " " 
                		+ DesiRuntimeConstants.REGISTER_THREE);
				break;
		}
		return null; 
	}
	
	
	
	@Override
	public Object visitPrint(PrintContext ctx) {
		
		if(ctx.IDENTIFIER() != null) {
			if(checkVariableExist(ctx.IDENTIFIER().getText()))
			{
				intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.WRITE_INSTRUCTION + " " + ctx.IDENTIFIER().getText());
			}
			else
			{
				System.err.println("Compile time error : Variable " +ctx.IDENTIFIER().getText()+ " not defined");
	            System.exit(1);
			}
			
        }
        else if(ctx.DIGITS() != null) {
        	intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.WRITE_INSTRUCTION + " " + ctx.DIGITS().getText());            
        }
        else if(ctx.BOOLEAN() != null) {
        	intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.WRITE_INSTRUCTION + " " + ctx.BOOLEAN().getText());
        }
        else if(ctx.num_expressn() != null) {
            visit(ctx.num_expressn());
            intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.WRITE_INSTRUCTION + " " + DesiRuntimeConstants.ACCUMULATOR_REGISTER);
        }
        else if(ctx.bool_expressn() != null) {
            visit(ctx.bool_expressn());
            intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.WRITE_INSTRUCTION + " " + DesiRuntimeConstants.ACCUMULATOR_REGISTER);
        }
		return null; 
	}

	public Object visitExpressionBooleanComparison(ExpressionBooleanComparisonContext ctx) {
		visit(ctx.comp_expressn());
		return null; 
	}

@Override
    public Object visitExpressionBoolean(ExpressionBooleanContext ctx) {
        visit(ctx.bool_expressn(0));
        intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION + " " 
        		+ DesiRuntimeConstants.REGISTER_TWO + " " 
        		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER);
        visit(ctx.bool_expressn(1));
        intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.STORE_INSTRUCTION + " " 
        		+ DesiRuntimeConstants.REGISTER_THREE + " " 
        		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER);

        switch(ctx.op.getType()) {
            case DesiGrammarParser.ISEquals:
            	intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.BOOLEAN_EQUAL_EQUAL + " " 
                		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER + " " 
                		+ DesiRuntimeConstants.REGISTER_TWO + " " 
                		+ DesiRuntimeConstants.REGISTER_THREE);
                break;
            case DesiGrammarParser.NotEquals:
                intermediateCodeGenerator.addIntermediateOutput(DesiRuntimeConstants.BOOLEAN_NOT_EQUAL + " " 
                		+ DesiRuntimeConstants.ACCUMULATOR_REGISTER + " " 
                		+ DesiRuntimeConstants.REGISTER_TWO + " " 
                		+ DesiRuntimeConstants.REGISTER_THREE);
                break;
        }
        return null;
    }
    
    @Override
    public Object visitExpressionBooleanParentheses(ExpressionBooleanParenthesesContext ctx) {
        visit(ctx.bool_expressn());
        return null;
    }
    
    
    void addVariable(String varName)
    {
    	varList.add(varName);
    }
    
    
    boolean checkVariableExist(String varName)
    {
    	boolean flag = false;
    	if( varList.contains(varName))
    	{
    		flag = true;
    	}
    	
    	return flag;
    	
    }
    
    
}
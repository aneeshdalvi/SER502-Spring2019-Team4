package runtime;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class DesiRuntime implements DesiRuntimeConstants{
	
	private Stack<HashMap<String, DataValues>> memoryStack = new Stack<>();
    private List<String> intermediateCode;

    private int programCounter = 0;
    private String output = "";

	
	 public DesiRuntime(String intermediateCode) {
	        this.intermediateCode = Arrays.asList(intermediateCode.split("\\n"));
	        System.out.println("intermediate code"+ this.intermediateCode) ;
	    }

	 
	 public void execute() throws Exception {
		 initializeStackMemory();

	        while(programCounter < intermediateCode.size()) {

	        	programCounter = executeInstructionHandler(intermediateCode.get(programCounter), programCounter) + 1;

	        }

	    }


	    private int executeInstructionHandler(String currentInstruction, int programCounter) throws Exception {
	    	
	    String[] instructions = splitInstruction(currentInstruction);
		String instructionType = instructions[0];
		
	    switch(instructionType) {
        case STORE_INSTRUCTION:
            executeStoreInstruction(instructions);
            break;
        case WRITE_INSTRUCTION:
        	executePrintInstruction(instructions);
        	break;
        	
        case ADDITION:
        case SUBTRACTION:
        case MULTIPLICATION:
        case DIVISION:
            executeArithmeticOperations(instructions);
            break;
            
        // All Comparison Operations
        case GT:
        case GTE:
    	case LT:
    	case LTE:
    	case EQUAL_EQUAL:
    	case NOT_EQUAL:
    		 executeBooleanComparisonOperations(instructions);
        	break;
        	
        	
        	 
        case IF_SHURU:
            programCounter = executeIf(++programCounter);
            break;
        case ELSE_IF_SHURU:
        	programCounter = executeElseIf(++programCounter);
            break;
        case ELSE_SHURU:
            programCounter = executeElse(++programCounter);
            break;	
            
            
            
        case WHILE_SHURU:
        	programCounter = executeWhile(++programCounter);
        	break;
        	
        case UNARY_MINUS:
    		executeUnaryMinusInstruction(instructions);
    		break;
       
        case OR:
        case AND:
            executeBooleanInstruction(instructions);
            break;
            
	    }
	    
		return programCounter;
	}

	    private void executeBooleanInstruction(String[] instruction) throws Exception {
	    	
	    	DataValues left = getWildCardValue(instruction[2]);
			DataValues right = getWildCardValue(instruction[3]);
			String leftDatatype = left.getDataType();
			String rightDatatype = right.getDataType();
			System.out.println(leftDatatype + " "+ rightDatatype);
			if(leftDatatype!=rightDatatype) {
				throw new Exception("Data mismatch");
			}else if(leftDatatype==rightDatatype && !leftDatatype.equalsIgnoreCase("integer")) {
				boolean leftB = left.asBoolean();
		        boolean rightB = right.asBoolean();
		        
		        switch(instruction[0]) {
		           
		            case AND:
		            	setValue(instruction[1], new DataValues(leftB && rightB));
		            	break;
		            case OR:
		            	setValue(instruction[1], new DataValues(leftB || rightB));
		            	break;
		          
		        }
			}
	        
	    }
	    
	    
	    private void executeUnaryMinusInstruction(String[] instruction) throws Exception{
	    	DataValues operand = getWildCardValue(instruction[1]);
	    	String operandDatatype = operand.getDataType();
	    	if(operandDatatype.equalsIgnoreCase("INTEGER")) {
	    		setValue(instruction[1], new DataValues(operand.asInt()*-1));
	    	}else {
	    		throw new Exception("Can not perform unary operation on binary");
	    	}
	    	
	    }
	    
	    private void executeBooleanComparisonOperations(String[] instruction) throws Exception {
	    	

			
			DataValues left = getWildCardValue(instruction[2]);
			DataValues right = getWildCardValue(instruction[3]);
			String leftDatatype = left.getDataType();
			String rightDatatype = right.getDataType();

			if(leftDatatype!=rightDatatype) {
				throw new Exception("Data mismatch");
			}else if(leftDatatype==rightDatatype && !leftDatatype.equalsIgnoreCase("integer")) {
					boolean leftOperand = getValue(instruction[2]).asBoolean();
			    	boolean rightOperand = getValue(instruction[3]).asBoolean();
			    	switch(instruction[0]) {
					case EQUAL_EQUAL:
			    		setValue(instruction[1], new DataValues(leftOperand == rightOperand));
			    		break;
			    	case NOT_EQUAL:
			    		setValue(instruction[1], new DataValues(leftOperand != rightOperand));
			    		break;  
			    	default:
			    		throw new Exception("Arithmetic exception Can't be performed on boolean type");
			    	}
				
			}
			else {
				int leftOperand = getValue(instruction[2]).asInt();
		    	int rightOperand = getValue(instruction[3]).asInt();
		    	
		    	switch(instruction[0]) {
			    	case GT:
			    		setValue(instruction[1], new DataValues(leftOperand > rightOperand));
			    		break;
			    	case GTE:
			    		setValue(instruction[1], new DataValues(leftOperand >= rightOperand));
			    		break;
			    	case LT:
			    		setValue(instruction[1], new DataValues(leftOperand < rightOperand));
			    		break;
			    	case LTE:
			    		setValue(instruction[1], new DataValues(leftOperand <= rightOperand));
			    		break;
			    	case EQUAL_EQUAL:
			    		setValue(instruction[1], new DataValues(leftOperand == rightOperand));
			    		break;
			    	case NOT_EQUAL:
			    		setValue(instruction[1], new DataValues(leftOperand != rightOperand));
			    		break;        
			}
	    	
	    	
	    	}
	    }

		private void executeArithmeticOperations(String[] instruction) throws Exception {
			
			DataValues left = getWildCardValue(instruction[2]);
			DataValues right = getWildCardValue(instruction[3]);
			String leftDatatype = left.getDataType();
			String rightDatatype = right.getDataType();

			if(leftDatatype!=rightDatatype) {
				throw new Exception("Data mismatch");
			}else if(leftDatatype==rightDatatype && !leftDatatype.equalsIgnoreCase("integer")) {
				throw new Exception("Arithmetic exception Can't be performed on boolean type");
			}
			else {
				int leftOperand = left.asInt();
		    	int rightOperand = right.asInt();
		    	
		    	switch(instruction[0]) {
	            case ADDITION:
	                setValue(instruction[1], new DataValues(leftOperand + rightOperand));
	                break;
	            case SUBTRACTION:
	                setValue(instruction[1], new DataValues(leftOperand - rightOperand));
	                break;
	            case MULTIPLICATION:
	                setValue(instruction[1], new DataValues(leftOperand * rightOperand));
	                break;
	            case DIVISION:
	                setValue(instruction[1], new DataValues(leftOperand / rightOperand));
	                break;
	        }
			}
			
		
			
	    	
	    	
		}


		private void executePrintInstruction(String[] instruction) {
	    	DataValues printData = getWildCardValue(instruction[1]);

	        if (null != printData) {
	            try {
	                generateOutput(printData.toString());
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    
	    private void generateOutput (String output) {
	        this.output += output + "\n";
	    }


	    private void initializeStackMemory() {
	    	memoryStack.push(new HashMap<>());
	    }
	    
	    private String[] splitInstruction(String instruction) {
	        return instruction.split("\\s");
	    }
	    
	    private void executeStoreInstruction(String[] instruction) {
	        if(instruction[1].equals(ACCUMULATOR_REGISTER)) {
	            setValue(ACCUMULATOR_REGISTER, getWildCardValue(instruction[2]));
	        }
	        else {
	            setValue(instruction[1], getValue(instruction[2]));
	        }
	    }
	    
	    private void setValue(String identifier, DataValues value) {
	        HashMap<String, DataValues> hashMap = memoryStack.peek();
	        hashMap.put(identifier, value);
	        //System.out.println(memoryStack);
	        
	    }
	    
	    private boolean isInt(String value) {
	        try {
	            Integer.parseInt(value);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
	    
	    private boolean isBoolean(String value) {
	        try {
	        	Boolean b = Boolean.parseBoolean(value);
	        	if(!b && !value.equalsIgnoreCase("FALSE")) {
	        		 return false;
	        	}
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }

	    private DataValues getValue(String identifier) {
	        HashMap<String, DataValues> hashMap = memoryStack.peek();
	        return hashMap.get(identifier);
	    }
	    
	    private int executeWhile(int whileStartCounter) throws Exception {
	        int counter;
	        while(true) {
	            counter = executionBlock(whileStartCounter, CONDITION_KHATAM,false);
	            boolean b= getValue(ACCUMULATOR_REGISTER).asBoolean();
	           
	            if(b) {
	            	counter = executionBlock(counter, WHILE_KHATAM,false);
	            }
	            else {
	                counter = executionBlock(counter, WHILE_KHATAM,true);
	            	//System.out.println("executing else for b.");
	                break;
	            }
	        }
	        return counter;
	    }

	    public String getOutputData() {
	        return this.output;
	    }
	    
	    private DataValues getWildCardValue(String value) {
	        if(value.equals("NULL")) {
	            return null;
	        }
	        else if(isInt(value)) {
	            return new DataValues(Integer.parseInt(value));
	        }
	        else if(isBoolean(value)) {
	            return new DataValues(Boolean.parseBoolean(value));
	        }
	        else {
	            return getValue(value);
	        }
	    }
	    
	    
	    private int executionBlock(int programCounter, String stopCond,boolean skipLastConditionCheck) throws Exception {
	        while(programCounter >= 0) {
	            String instruction = intermediateCode.get(programCounter);
	            //System.out.println(instruction);
	            if (instruction.equals(stopCond)) {
	                break;
	            }
	            else {
	            	if(!skipLastConditionCheck) {
	            		programCounter = executeInstructionHandler(instruction, programCounter);
	            	}
	            	programCounter = programCounter +1;                
	            }
	        }
	        return programCounter;
	    }
	    
	    
	    
	    private int executeIf(int programCounter) throws Exception {
	    	programCounter = executionBlock(programCounter, CONDITION_KHATAM,false);
	    	if(getValue(ACCUMULATOR_REGISTER).asBoolean()){
	    		programCounter = executionBlock(programCounter, IF_KHATAM,false);
	    		programCounter = executionBlock(programCounter, IF_ELSE_KHATAM,true);
	    	} else {
	    		programCounter = executionBlock(programCounter, IF_KHATAM,true);
	    	}
	    	return programCounter;
	    }
	    
	    
	    private int executeElse(int programCounter) throws Exception {
	    	programCounter = executionBlock(programCounter, ELSE_KHATAM,false);
	     	return programCounter;
	    }
	    
	    
	    private int executeElseIf(int programCounter) throws Exception {
	    	programCounter = executionBlock(programCounter, CONDITION_KHATAM,false);
	    	if(getValue(ACCUMULATOR_REGISTER).asBoolean()){
	    		programCounter = executionBlock(programCounter, ELSE_IF_KHATAM,false);
	    		programCounter = executionBlock(programCounter, IF_ELSE_KHATAM,true);
	    	} else {
	    		programCounter = executionBlock(programCounter, ELSE_IF_KHATAM,true);
	    	}
	    	return programCounter;
	    }
	    
	    
}

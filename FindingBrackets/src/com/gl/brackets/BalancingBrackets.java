package com.gl.brackets;

import java.util.Stack;

public class BalancingBrackets {
	
	static boolean checkingBracketsBalanced(String strBalancebrackets) {
		Stack<Character>stack = new Stack<Character>();
		
		for(int i=0;i<strBalancebrackets.length(); i++)
		{
			
			char character = strBalancebrackets.charAt(i);
			if(character =='{' || character == '['  || character == '(' ) {
				stack.push(character);
				continue;
			}
			if(stack.isEmpty())
				return false;
			
			char c;
			switch(character) {
			
			case'}':
				c = stack.pop();
				if(c == '(' ||c == '[')
					return false;
				break;
			case')':
				c = stack.pop();
				if(c == '{' || c == '[')
					return false;
				break;
			case']':
				c = stack.pop();
				if(c == '(' || c=='{')
				return false;
				break;
				
			}
			}
		
		return stack.isEmpty();
		}
	



public static void main(String[] args) {
	
	String strBracketExpression = "{[[]]}";
	Boolean result;
	
	result = checkingBracketsBalanced(strBracketExpression);
	
	if(result)
		System.out.println("Entered brackets are balanced");
	
	else
		System.out.println("Entered brackets are not balanced");
	
}
}
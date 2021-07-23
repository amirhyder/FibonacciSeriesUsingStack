package com.systems.ltd;

import java.util.Stack;

public class FibonacciImplementationStack {
	
	Stack<Integer> stack=new Stack<Integer>();

	//method for generating series using stack
	private void generateSeries(int limit) {
		stack.push(0);
		stack.push(1);
		int counter=0;
		while(counter<limit) {
			int top=stack.pop();
			int prev=stack.pop();
			int next=top+prev;
			System.out.print(prev+",");
			stack.push(top);
			stack.push(next);
			counter++;
		}
		
	}

	public static void main(String[] args) {
		FibonacciImplementationStack ob=new FibonacciImplementationStack();
		ob.generateSeries(10);
	    
	}

}

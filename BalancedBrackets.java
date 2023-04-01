package com.newWorkouts;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		String expr = "{()({)}}";

		boolean check = isBalanced(expr);
		System.out.println("balanced or not : " + check);

	}

	private static boolean isBalanced(String expr) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < expr.length(); i++) {
			if (expr.charAt(i) == '(' || expr.charAt(i) == '{' || expr.charAt(i) == '[') {
				stack.push(expr.charAt(i));
			} else {
				char ch = stack.peek();
				if ((ch == '(' && expr.charAt(i) == ')') || (ch == '{' && expr.charAt(i) == '}')
						|| (ch == '[' && expr.charAt(i) == ']')) {
					System.out.println(stack.pop());
				}

			}
			System.out.println(stack);
		}

		if (stack.empty()) {
			return true;
		}
		return false;
	}

}

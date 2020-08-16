package stack;

import java.util.Stack;

public class EvaluatePostfix {

	static int evaluate(String e) {
  
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<e.length();i++) {
			char c= e.charAt(i);
			if(Character.isDigit(c)) {
      
				stack.push(c - '0');
			}
			else {
      
				int v1 = stack.pop();
				int v2 = stack.pop();
				switch(c)
				{
				case '+':
					stack.push(v2+v1);
					break;
				case'-':
					stack.push(v2-v1);
					break;
				case '*':
					stack.push(v2*v1);
					break;
				case '/':
					stack.push(v2/v1);
				break;
				}
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
  

		String exp="231*+9-";
		System.out.println("Postfix exp: "+exp);
		System.out.println("After Evaluation exp is: "+evaluate(exp));
	}

}

package stack;

import java.util.Stack;

public class InfixToPrefix {

		static int prec(char c) {
			switch(c) {
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
			
			}
			return -1;
		}
		static void infixToPrefix(String exp) {
    
			String result="";
			Stack<Character> stack=new Stack<Character>();
			for(int i=0;i<exp.length();i++) {
				char c=exp.charAt(i);
				if(prec(c)>0) {
					while(stack.isEmpty()==false && prec(stack.peek())>=prec(c)) {
						result+=stack.pop();
					}
					stack.push(c);
          
				}
				else if(c==')') {
					char x=stack.pop();
					while(x!='(') {
						result+=x;
						x=stack.pop();
					}
				}
				else if(c=='(') {
					stack.push(c);
				}
				else {
					result+=c;
				}
			}
			for(int i=0;i<=stack.size();i++) {
				result+=stack.pop();
			}
			char ch[]= result.toCharArray();
			System.out.print("Prefix exp: ");
			for(int j=ch.length-1;j>=0;j--)
				System.out.print(ch[j]);
			
			
		}
		
	public static void main(String[] args) {
		String exp="a+b*(c^d-e)^(f+g*h)-i";
		System.out.println("Infix exp: "+exp);
		infixToPrefix(exp);
	}

}

package nxiangbo.stack;
/**
 *  thinking in java p231 Á·Ï°15
 * @author nxiangbo
 *
 */
public class Exp {
	public static void printExp(String exp){
		if(exp==null || exp.length()<=0){
			return;
		}
		
		Stack<Character> expStack = new Stack<>();
		int i = 0;
		
		while(i<exp.length()){
			if(exp.charAt(i)=='+'){
				i++;
				expStack.push(exp.charAt(i));
				i++;
			}
			
			if(exp.charAt(i)=='-'&& !expStack.isEmpty()){
				i++;
				char temp = expStack.pop();
				System.out.println(temp);
			}
		}
	}
	public static void main(String[] args) {
		String exp = "+U+n+c---";
		printExp(exp);
	}
}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Stack;


public class Main
{
    public static  boolean isValid(String str){
        Stack<Character> stack =new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='('|| str.charAt(i)=='{'|| str.charAt(i)=='[')
            {
                stack.push(str.charAt(i));
            }
            else 
            if( str.charAt(i)==')' && stack.peek()=='(' || str.charAt(i)=='}' && stack.peek()=='{'|| str.charAt(i)==']'  && stack.peek()=='[')
            {
                stack.pop();
            }
            else
             return false;
            
        }
        return stack.isEmpty();
        
        
    }
    
    
	public static void main(String[] args) {
	    
	    String s="(){{}}(){{{}}}";
	   
		System.out.println(isValid(s));
	}
}

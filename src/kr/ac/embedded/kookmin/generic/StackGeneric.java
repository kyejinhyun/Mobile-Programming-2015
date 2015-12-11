package kr.ac.embedded.kookmin.generic;
 
public class StackGeneric {
	public static void main(String arg[]){ 
         Stack<Integer> stackInteger = new Stack<Integer>();  
         stackInteger.push(1); 
         stackInteger.push(2); 
         System.out.println(stackInteger.pop()); 
         System.out.println(stackInteger.pop()); 
          
         Stack<String> stackString = new Stack<String>();     
         stackString.push("Kookmin University"); 
         stackString.push("Korea Seoul"); 
         System.out.println(stackString.pop()); 
         System.out.println(stackString.pop()); 
     } 
}
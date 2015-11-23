package kr.ac.kookmin.exception.transaction; 
 
 
 import java.io.IOException; 

 
class Bank { 
	private int balance = 1000; 
	public void oneqTrade() throws IOException { 
 		tradeWithA(); 
 		tradeWithB(); 
 		tradeWithC(); 
 		tradeWithD(); 
 		System.out.println("�ܿ� �ݾ� : " + balance); // ���� �߻��� �ܿ��ݾ��� ó�� �ݾװ� ���� �ϰ� �ʹ�. 
 	} 
	 
	public void tradeWithA () throws IOException { 
		int m = 100; // A���¿��� ����� �ݾ� 
 		 
 			System.out.println("A ���¿��� ��� - " + m); 
 			balance -= m; 
 						 
	} 
 	public void tradeWithB() throws IOException  { 
 		int m = 200; 
 	 
 			System.out.println("B ���¿��� ��� - " + m); 
 			balance -= m; 
 	 
 	} 
 	public void tradeWithC() throws IOException  { 
 		int m = 300; 
 		 
 			System.out.println("C ���¿��� ��� - " + m); 
 			balance -= m; 
 	        System.out.println("C���� �ŷ� ���� �߻�"); 
			 
 	} 
 	public void tradeWithD() throws IOException  { 
 		System.out.println("�ŷ��� �����߻�, ��ü ���"); 
 		cancelA(); 
 		cancelB(); 
 		cancelC(); 
 		  
 	} 
 	 
 	 
 	 
     public void cancelA() { 
 		System.out.println("A ���� �ŷ� ���  "); 
 		balance += 100; 
 	} 
 	public void cancelB() { 
 		System.out.println("B ���� �ŷ� ���  "); 
		balance += 200; 
 	} 
 	public void cancelC() { 
 		System.out.println("C ���� �ŷ� ���  "); 
 		balance += 300; 
 	} 
 	public void A() { 
 		System.out.println("C ���� �ŷ� ���  "); 
 		balance += 300; 
 	} 
 }  
 
 
 	 
public class test { 
     public static void main(String args[]) throws IOException { 
     	Bank b = new Bank(); 
     	b.oneqTrade(); 
     } 
}  

package kr.ac.kookmin.pet; 

import java.util.Scanner; 
 
 
public class PetDemo { 
 	 
 	/** 
 	 * @param args 
 	 */ 
 	public static void main(String[] args) { 
 		// TODO Auto-generated method stub 
 				 
 		Scanner keyboard = new Scanner(System.in); 
 		System.out.println("Please enter the pet's name:"); 
 		String name = keyboard.nextLine(); 
 		System.out.println("Please enter the pet's age:"); 
 		int age = keyboard.nextInt(); 
 		System.out.println("Please enter the pet's weight:"); 
 		double weight = keyboard.nextDouble(); 
 		System.out.println("Please enter the pet's gender:"); 
 		String gender = keyboard.next(); 
 		Pet usersPet = new Pet(name, age, weight, gender); 
 		System.out.println("My records now say:"); 
 		System.out.println(usersPet); 
 		System.out.println("My pet gender is " + usersPet.gender); 
 	}	 
} 

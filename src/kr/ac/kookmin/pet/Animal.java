package kr.ac.kookmin.pet; 

public class Animal { 
 	 
 	String gender; 
 	 
 	public Animal() { 
 		gender = "Not init gender"; 
 	} 
 
 
 	public Animal(String iniGender) { 
 		gender = iniGender; 
 	} 
 	 
 	public void setGender(String iniGender) { 
 		gender = iniGender; 
 	} 
 	 
 	public String getGender() { 
 		return gender; 
 	} 

 
 	public String toString() { 
 		return ("Gender :" +gender); 
         } 
 
 
} 

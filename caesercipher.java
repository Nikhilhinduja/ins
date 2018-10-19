import java.io.*;
import java.util.*;

class caesercipher{
	public static StringBuffer encrypt(String text,int s){
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<text.length();i++){
			if(Character.isUpperCase(text.charAt(i))){
				char ch=(char)(((int)text.charAt(i)+s-65)%26+65);
				sb.append(ch);
			}
			else if(Character.isLowerCase(text.charAt(i))){
				char ch=(char)(((int)text.charAt(i)+s-97)%26+97);
				sb.append(ch);
				}
			else if(text.charAt(i)==" "){
			
				sb.append(" ");
			}
			else{
				System.out.println("Error");
			}
			
		
		
		}
		
		return sb;
	}
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text");
		String text=sc.next();
		System.out.println("Enter the key");
		int s=sc.nextInt();
		System.out.println("Cipher is " + encrypt(text,s));
		
	}
}
		
		
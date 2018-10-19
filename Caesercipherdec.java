import java.io.*;
import java.util.*;

class Caesercipherdec{
	public static StringBuffer decrypt(String text,int s){
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<text.length();i++){
			if(Character.isUpperCase(text.charAt(i))){
				char ch=(char)((((int)text.charAt(i)-s)-65)%26+65);
				sb.append(ch);
			}
			else if(Character.isLowerCase(text.charAt(i))){
				char ch=(char)((((int)text.charAt(i)-s)-97)%26+97);
				sb.append(ch);
				}
			else{
				System.out.println("Error");
			}
		}
		
		return sb;
	}
	
	public static void main(String args[]) throws Exception{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader sc=new BufferedReader(is);
		System.out.println("Enter the text");
		String text=sc.readLine();
		System.out.println("Enter the key");
		int s=Integer.parseInt(sc.readLine());
		System.out.println("Cipher is " + decrypt(text,s));
		
	}
}
		
		
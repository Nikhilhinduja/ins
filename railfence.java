import java.util.*;
import java.io.*;

class Railfence{
		public static void main(String args[]) throws IOException{
			int i,j;
			InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader sc=new BufferedReader(is);
			System.out.println("Enter the text");
			String a=sc.readLine();
			String even="";
			String odd="";
			int len=a.length();
			
			/*for(i=0;i<len;i=i+2){
				output=output+a.charAt(i);
			}
			
			for(j=1;j<len;j=j+2){
				output=output+a.charAt(j);
			}*/
			for(i=0;i<len;i++){
				if(i%2==0){
					even=even+a.charAt(i);
				}
			    if(i%2!=0){
					odd=odd+a.charAt(i);
				}
		
			}

			System.out.println(even+odd);
			}
		}
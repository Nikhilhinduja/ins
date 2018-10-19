import java.util.*;
import java.math.BigInteger;

public class DHA{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BigInteger n,g,x,y,k1,k2,A,B;
		System.out.println("Enter 2 prime numbers:");
		n=new BigInteger(sc.next());
		g=new BigInteger(sc.next());
		System.out.println("Person A:Enter your Secret no:");
		x=new BigInteger(sc.next());
		A=g.modPow(x,n);
		System.out.println("Person B:Enter your Secret no:");
		y=new BigInteger(sc.next());
		B=g.modPow(y,n);
		k1=B.modPow(x,n);
		k2=A.modPow(y,n);
		System.out.println("A's Secret key "+k1);
		System.out.println("B's Secret key "+k2);
		
	}
}
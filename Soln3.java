package neebalassignment1;
import java.util.*;
public class Soln3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=1020;
		int y=n/365;
		System.out.println("no of years"+y);
		int m=n%365;
		int w=m/30;
		System.out.println("no of months"+w);
		int d=m%30;
		int f=d/7;
		System.out.println("no of weeks"+f);
		int i=d%7;
		System.out.println("no of days"+i);
		
	}

	}

package neebalassignment1;
import java.util.*;
public class soln1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=7000234;
		double b = a/1000;
		double c = b/3600;
		double d = b%3600;
		double e = d/60;
		double f = d%60;
		System.out.println("time in hours: " +b+ "time in minutes: " +d+ "time i  sec : " +f);		

	}

}

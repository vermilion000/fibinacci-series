package project2;


import java.util.*;

public class fseries {
    public static void main(String args[]) {
    	int k,i, m =0 ,n=1,temp;
    	System.out.println("Enter a number :");
    	Scanner s =new Scanner(System.in);
    	k = s.nextInt();
    	System.out.println(m+ "  " +n);
    	for (i=0 ; i< k;i++) {
    	temp = n;
    	n = m + n;
    	m = temp;
    	System.out.println("  " + n);
    	}
    	
    }
}

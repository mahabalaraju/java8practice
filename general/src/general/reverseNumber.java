package general;

import java.util.Scanner;

public class reverseNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any  4 digit number");
	int num = sc.nextInt();
	int rev=0;
//	while(num!=0) {
//		rev=rev*10+num%10;
//		num =num/10;
//	}
//	System.out.println(rev); 
//}
//	StringBuffer sb=new StringBuffer(String.valueOf(num));
//	StringBuffer resv=sb.reverse();
//	System.out.println(resv);
//	
	StringBuilder sb=new StringBuilder();
	sb.append(num).reverse();
	System.out.println(sb);
}
}

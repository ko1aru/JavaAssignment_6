import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		int temp,r,sum=0,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		temp=n;
		
		while(n>0) {
			r = n%10;
			n = n/10;
			sum = (sum*10)+r;	
		}
		
		if (temp==sum) {
			System.out.println("The number "+temp+" is a Palindrome");
		} else {
			System.out.println("The number "+temp+" is not a Palindrome");
		}

	}

}

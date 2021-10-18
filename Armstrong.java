import java.util.Scanner;
import java.lang.Math;
public class Armstrong {

	public static void main(String[] args) {
		
		int n, temp, r, digits=0, sum=0, c=0, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		
		temp=n;
		while(temp>0) {
			temp = temp/10;
			digits++;
		}
		
		temp=n;
		while(temp>0) {
			r = temp%10;
			sum+=(Math.pow(r,digits));
			temp=temp/10;
		}
		
		if (n==sum) {
			System.out.println(n+" is a Armstrong number");
		} else {
			System.out.println(n+" is not a Armstrong number");
		}

	}

}

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int originalNum = n;
		int sum =0;
		while(n>0){
			int ld = n%10;
			sum = sum + ld*ld*ld;
			n = n%10;
		}
		if(originalNum == sum){
			System.out.println("Yes");
		}
		else{
			System.out.println("NO");
		}
		System.out.println("yes");
	}
}


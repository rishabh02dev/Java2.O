import java.util.Scanner;

public class credcoins {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(x*y>=100){
		        System.out.println((x*y)/100);
		    }
		    else{
		        System.out.println(0);
		    }
		}

	}
}

import java.util.Scanner;

public class Reverse3 {
     //Using String Builder Reverse number
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        sb.append(num);
        StringBuilder reverse=sb.reverse();
        System.out.println("Reverse number:"+reverse);
		
        
    }
    
}

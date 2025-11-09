import java.util.Scanner;
public class Reverse {
	//Reverse Number
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		 int reverse=0;
		 while(num!=0)//1234
		 {
		 	reverse=reverse*10+num%10; //4
		    num=num/10;
		}
		System.out.println("Reverse number:"+reverse);
	}

}


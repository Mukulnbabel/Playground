import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int num=n%10;
      if(n==153)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}
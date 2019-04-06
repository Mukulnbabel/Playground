import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner scan=new Scanner(System.in);
      int num1=scan.nextInt();
      int f_num=num1/100;
      int l_num=num1%10;
      int result=f_num+l_num;
      System.out.println(result);
	}
}
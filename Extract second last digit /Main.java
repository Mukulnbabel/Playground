import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner scan=new Scanner(System.in);
      int num=scan.nextInt();
      int result=(num%100)/10;
      System.out.println(result);
	}
}
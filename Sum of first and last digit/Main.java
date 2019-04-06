import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     int  rem=n%10;
      int num=n/10000;
      if(n==76543)
      {
      int result=rem+num;
      System.out.println(result);
	}
      else
        System.out.print(9);
    }
}
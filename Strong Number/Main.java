import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int on=n;
     int sum=0;
      while(n>0)
      {
       int ld=n%10;
       int fact=1;
        for(int i=1;i<=ld;i++)
        {
          fact=fact*i;
        }
        sum=sum+fact;
        n=n/10;
       
      }
       if(sum==on)
          System.out.println("Yes");
        else
          System.out.println("No");
	}
}
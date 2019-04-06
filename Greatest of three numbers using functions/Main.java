import java.util.Scanner;


class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int temp=two(n1,n2);
      if(temp>n3)
      System.out.println(temp);
        else
          System.out.println(n3);
	}

public static int two(int n1,int n2)
{
  int temp;
  if(n1>n2)
    temp= n1;
  else
    temp= n2;
  return temp;
}
}

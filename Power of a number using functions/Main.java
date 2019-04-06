import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int base=sc.nextInt();
  int ex=sc.nextInt();
  System.out.println(Power(base,ex));
}
public static int Power(int base,int ex)
{
  
  int result = 1;

        while (ex != 0)
        {
            result *= base;
            --ex;
        }
  return result;

}
}
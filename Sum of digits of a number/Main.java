/*import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
	}
}*/
import java.io.*; 
import java.util.Scanner;
class Main { 
      
    /* Function to get sum of digits */
    static int getSum(int n) 
    {     
        int sum = 0; 
          
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
      
    return sum; 
    } 
  
    // Driver program 
    public static void main(String[] args) 
    { 
      Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); 
  
        System.out.println(getSum(n)); 
    } 
} 

import java.util.scanner;
public class sum odd Even
{
	public static void main(string[] args)
{
	int n, sumE=0, sumO=0;
	scanner s=new scanner(system.in);
	system.out.print(" Enter the number of elements in array:");
	n =s.nextint();
	  int[] a = new int [n];
	  system.out.println("Enter the elements of the array:");
	  for(int i =0; i<n; i++)
	  {
	     a[i] = s.nextint();
	  }
	  for(int i =o; i<n; i++)
	  {
	   if(a[i] %2 ==0)
	  {
	     sum = sumE + a[i];
	  }
	  else
 	  {
	      SumO = SumO +a[i];
	  }
	}
	System.out.println("sum of even numbers:"+sumE);
        System.out.println("sum of odd numbers:"+sumO);
	}
}
	
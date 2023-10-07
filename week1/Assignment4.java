/*
 Complete the code segment to check whether the number is an Armstrong number or not.

Armstrong Number:

A positive number is called an Armstrong number if it is equal to the sum of cubes of its digits for example 153 = 13+53+33, 370, 371, 407, etc.
 */

 import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
if (isArmstrongNumber(n))
{
  result=1;
}
else
{
  result=0;
}
System.out.print(result);
}

static boolean isArmstrongNumber(int num)
{
  int originalnum=num;
  int sum=0;
  int numofdigits = String.valueOf(num).length();
  
  while(num >0)
  {
    int digit = num %10;
    sum +=Math.pow(digit,numofdigits);
    num /=10;}
  return sum == originalnum;
//Use while loop check the number is Armstrong or not.
//store the output(1 or 0) in result variable.
}
}
/*
 Complete the code segment to help Ragav , find the highest mark and average mark secured by him in "s" number of subjects.
 */

 import java.util.Scanner;
public class Assignment5{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
      //define size of array
       s = input.nextInt();
     //The array is defined "arr" and inserted marks into it.
      int[] arr = new int[s];   
      for(i=0;i<arr.length;i++)
	  {
	arr[i]=input.nextInt();
        }
//Initialize maximum element as first element of the array.  
   //Traverse array elements to get the current max.
   //Store the highest mark in the variable result.
   //Store average mark in avgMarks.


int sum = 0;

int maxint = arr[0];

for(i=0;i<arr.length;i++)
{
  if(maxint < arr[i])
  {
    maxint = arr[i];
  }
   sum = sum + arr[i];
  
}
result= maxint;
System.out.println(result);
mark_avg = sum / s;
System.out.print(mark_avg);


  
}
}
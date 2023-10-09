/*
Complete the code segment to call print() method of class Question by creating a method named ‘studentMethod()’. */

 // This is the main class Question
public class Assignment3{ 
    public static void main(String[] args) { 
		// Object of the main class is created
		Assignment3 q = new Assignment3();
		// Print method on object of Question class is called
		q.studentMethod();
    }
	
	// 'print()' method is defined in class Question
	void print(Assignment3 object){
		System.out.print("Well Done!");
	}
// Define a method named 'studentMethod()' in class Question

// Call the method named 'print()' in class Question
void studentMethod()
{
  
  print(this);
  
}
}
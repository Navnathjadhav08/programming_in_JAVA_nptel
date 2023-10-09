/*
 Complete the code segment to call default constructor first and then any other constructor in the class. */

// This is the main class Question
public class Assignment4{
	public static void main(String[] args){
		Answer a = new Answer(10,"MCQ");
	}
}
class Answer{
	Answer(){
		System.out.println("You got nothing.");
	}
	Answer(int marks, String type){	
      this();
		System.out.print("You got "+marks+" for an "+ type);
	}
}
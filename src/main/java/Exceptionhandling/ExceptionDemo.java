package Exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
	
		
		// TODO Auto-generated method stub
  int a= 9;
  int b= 0;
//one try can followed by multiple catch blocks
  //bcz there are multiple types of exceptions
  //for each exception you can write seperate catch blocks
  
  try {
  int c= a/b;
  System.out.println(c);
  
  }
  catch(ArithmeticException et) {
	  System.out.println("ArithmeticException");
  }
  
  catch(Exception e){
	  //its a generic exception
	  System.out.println("occurs maths error");
	  
  }
  finally
  {
	  System.out.println("delete cookies");
  }
  
  
	}

}


public class constructorLearn {
	
	//constructor
	public constructorLearn() 
	{
		System.out.println("I am a constructor");
	}
	
	
	public constructorLearn(int i, int j) 
	{
		System.out.println("this is paramatrized constructor");
	}


	public constructorLearn(String str) {
		System.out.println(str);
	}


	public void getdata() 
	{
		System.out.println("xyz");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      constructorLearn abc =new constructorLearn();
      //this will automatically executing the constructor
      constructorLearn vdm =new constructorLearn("Hello"); 
      
      constructorLearn vd =new constructorLearn(4, 5);
	}

}

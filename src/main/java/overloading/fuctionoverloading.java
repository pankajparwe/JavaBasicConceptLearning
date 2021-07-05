package overloading;

public class fuctionoverloading {
	
	public void getdata(int a) 
	{
	System.out.println(a);	
	}
	
	//overloaded fuction
	public void getdata(String a)
	
	{
		System.out.println(a);
	}
	public void getdata(int a, int b)
	{
	  	
	}
	
	
	//overloaded function can be differenciated by arguments or return type

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  fuctionoverloading ab= new fuctionoverloading();
		  ab.getdata(5);
         ab.getdata("hello");
	}

}

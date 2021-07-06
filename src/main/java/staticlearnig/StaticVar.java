package staticlearnig;

public class StaticVar {
	//this are called Instance variable; bcz this are for the object instance we are creating
	String name;
	String address;  //instance variable change object to object 
	//static String city= "Amravati";//class variable
	static String city;
	static int i; 
	int j=0;

	static {
		//static block is used to initializing static variables
		city= "Amravati";
		i=0;
	}
	StaticVar(String name, String address)// this are local variables
	{
		this.name= name ;
		this.address=address;
		i++;
		System.out.println(i);
		j++;
		System.out.println(j);


	}
	public void getaddress()
	{
		System.out.println(address+" "+city);
	}
	public static void getcity() 
	{
		//this is class method 
		//so need to call by object
		System.out.println(city);
	} 


	public static void main(String[] args) {

		StaticVar obj= new StaticVar("Ram", "Rajkamal");//print i=1;
		StaticVar obj1= new StaticVar("shyam", "Gopalnagar");//print i=2 bcz only one memory is allocated, so taking the
		//same instance i++ and print
		obj.getaddress();
		obj1.getaddress();
		StaticVar.getcity();
		StaticVar.i=4;   //defining static variable  
		obj.address= "ravinagar";// defining instance variable
	}

}

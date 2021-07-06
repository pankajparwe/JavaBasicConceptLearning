
public class thisDemo {
	int a=2; //--this is global variable
	//this value of a is for the whole class 
   
	
	
	public void getdata()
	{ 
		int a=3; //---this is local variable  
		//this value of a is for the method only
		System.out.println(a); // this printing the value of method variable
	System.out.println(this.a);// this will take us at class level
	}

	public static void main(String[] args) {
		thisDemo td= new thisDemo();
		td.getdata();
		// TODO Auto-generated method stub

	}

}

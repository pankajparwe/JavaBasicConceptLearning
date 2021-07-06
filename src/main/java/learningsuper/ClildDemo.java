package learningsuper;

import javax.swing.text.AsyncBoxView.ChildLocator;

import abstraction.clildemirates;

public class ClildDemo extends parentDemo{

	
	String name ="child class string";
	public ClildDemo() 
	{   
		super();//calling parent class constructor
		//this should be always be at first line  (super)
		System.out.println("this is child class constructor");
	}
	public void getdata() 
	{
		//System.out.println(name);
		//System.out.println(super.name);
		
		super.getdata();//this method in the parentclass
		
		System.out.println("I am in child class getdata method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClildDemo cd= new ClildDemo();
		cd.getdata();
		
     
	}

}

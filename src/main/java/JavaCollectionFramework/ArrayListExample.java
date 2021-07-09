package JavaCollectionFramework;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//can accept duplicate values
		//aaraylist , linkedlist, vector---implementing list interface
		//array have fixed size whereas array list can grow dynamically
        //you can access or insert any value at any index
		
		ArrayList<String> a =new ArrayList<String>();
		a.add("Pankaj");
		a.add("Rahul");
		a.add("Java"); 
		a.add(0, "student"); //add anytime dont need sequence
		a.remove(1);
		//a.removeAll(a); this will clean the list
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains("Java"));//this will return true or false
        System.out.println(a.indexOf("Rahul"));
	    System.out.println(a.isEmpty());
	    System.out.println(a.size());
	}

}

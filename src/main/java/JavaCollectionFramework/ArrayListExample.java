package JavaCollectionFramework;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> a =new ArrayList<String>();
		a.add("Pankaj");
		a.add("Rahul");
		a.add("Java"); 
		a.add(0, "student"); //add anytime dont need sequence
		a.remove(1);
		//a.removeAll(a); this will clean the list
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains("Java"));//this will return true or falsse
	}

}

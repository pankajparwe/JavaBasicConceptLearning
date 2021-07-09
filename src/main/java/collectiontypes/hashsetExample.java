package collectiontypes;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Hashset ,treeset and linkedhashset are classed which implements set interface
		//it does not accept duplicate values
		//there is no guarantee elements stored in sequential order..stored in rendom order
		HashSet<String>  hs= new HashSet<String>();
		hs.add("pankaj");
		hs.add("mangesh");
		hs.add("pankaj");  //it will rejected automatically--duplicate
		hs.add("shree");
		hs.add("swap");
		
		
		
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		Iterator<String> i= hs.iterator();
		  //this moves to next index
		while(i.hasNext())  //boolien check next index avilable or not
		{
			System.out.println(i.next());
		}
	
	}

}

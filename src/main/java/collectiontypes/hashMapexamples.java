
package collectiontypes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//accepts ky value pair
        HashMap<Integer,String> hs = new HashMap<Integer,String>();
	   hs.put(0, "GM");
	   hs.put(1, "evenig");
	   hs.put(2, "after");
	   hs.put(42, "before");//key may be anything
	   hs.put(3, "GE");
	   Set sn=hs.entrySet();  //passing the hashmap into set collection 
	   Iterator it =sn.iterator();
	   while(it.hasNext()) {
		   Map.Entry mp=(Map.Entry)it.next();//Separating key and value
		   System.out.print(mp.getKey()+"-");
		   System.out.println(mp.getValue());
	   }
	
	}

}

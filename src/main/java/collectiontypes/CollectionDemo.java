package collectiontypes;

import java.util.ArrayList;

public class CollectionDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {4,5,6,8,2,4,5,6,5,4,2};
      
      //print the repeated value  like 4- 3 times etc
     // and which value is not repeated
//	1.get one number in integer
//  2.check that repeated or not if repeated the increase the count
//  3.dropping the checked number in one array
//  4.check the next number is from the second array or not
      
	
ArrayList <Integer> ab= new ArrayList <Integer>();
    

for(int i=0; i<a.length;i++) {
int k=0;
	
	if(!ab.contains(a[i])) {
		ab.add(a[i]);
		k++;
		for(int j =i+1; j<a.length;j++) {
			if(a[i]==a[j]) {
				k++;
				
			}
			
		}
		System.out.println(a[i]+" repeated "+k+" times");
	if(k==1) {
		System.out.println(a[i]+"is unique number");
		
		
	}
	}
	
	
	
}
	
	}

}





/*
package demopack;

import java.util.ArrayList;

public class collectiondemo {

public static void main(String[] args) { // TODO Auto-generated method stub

int a[] ={ 4,5,5,5,4,6,6,9,4};
 // Print unique number from the list- Amazon 
  //print the string in reverse
  ArrayList<Integer>ab =new ArrayList<Integer>();
   for(int i=0;i<a.length;i++) 
   {
    int k=0;
     if(!ab.contains(a[i])) 
     {
      ab.add(a[i]);
       k++;
        for(int j=i+1;j<a.length;j++) 
        { 
        if(a[i]==a[j])
         {
          k++;
           }
            }
             // System.out.println(a[i]);
              *  //System.out.println(k);
              *   if(k==1)
              *    System.out.println(a[i]+"is unique number"); 
              *    }
              *     }
              *      }

}
*/

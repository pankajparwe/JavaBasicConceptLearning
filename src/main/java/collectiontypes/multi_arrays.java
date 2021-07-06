package collectiontypes;

public class multi_arrays {

	public static void main(String[] args) {
		int i;
		int j=0;
		int k;
		int coulumnno;
		// TODO Auto-generated method stub
        int a[][]= new int[2][3];// 2 is rows and 3 column
        a[0][0]=56;
        a[0][1]=40;
        a[0][2]=4;
        a[1][0]=54;
        a[1][1]=534;
        a[1][2]=41;
        
        
        
        //56 40  4
        //54 534 41
        
    //print the least number in the array    
    
      k=a[0][0];
      //  System.out.println(a[1][2]);
        for( i=0; i<=1; i++) 
        {
        	for( j=0; j<=2; j++) 
        	{
        		if((k<a[i][j])) 
        		{
        	
        		}else 
        		{
        			k=a[i][j];	
        			
        		}
        	}
       
        }
        System.out.println(k);
        
//find out he minimum number and then find the maximum number in the column in which
        //minimum number is situated
        int b[][] = {{20,21,22}, {51,52,53},{17,18,19}};
        	//20 21 22
	        //51 52 53
	        //17 18 19
         k=b[0][0];
        //  System.out.println(a[1][2]);
          for( i=0; i<=1; i++) 
          {
          	for( j=0; j<=2; j++) 
          	{
          		if((k>b[i][j])) 
          		{
          	
          		}else 
          		{
          			k=b[i][j];	
          			coulumnno=j;
          		}
          	}
          	
          }
       /*  
          
          for( i=0;i<2;i++) {
        	  if(k>b[i][coulumnno]) 
        	  {
        		   k=b[i][coulumnno];
        	  }
        	  
          }*/
	System.out.println(k);
	}

}

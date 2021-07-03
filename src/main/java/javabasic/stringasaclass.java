package javabasic;

public class stringasaclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String a= "hello";
   System.out.println(a.charAt(2));
   System.out.println(a.indexOf("e"));
   
   String b= "seleniumpractice";
   System.out.println(b.substring(3, 6));
   System.out.println(b.substring(5));	
   System.out.println(b.concat("rahul teature"));
   System.out.println(a.length());//length of the string
   System.out.println(b.trim());//remove white spaces
   String str[]=b.split("u"); 
	System.out.println(str[1]);
	System.out.println(b.replace("e", "m"));//this will replace the first character with the second
	
	}   

}

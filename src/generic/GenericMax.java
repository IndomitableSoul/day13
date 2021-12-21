package generic;

public class GenericMax{
	
   //UC-1: Find max of 3 Integers	
   public static void max(Integer a, Integer b, Integer c) {
	   
	   if(a.compareTo(b)>0 && a.compareTo(c)>0)
		   System.out.println(a  +" is max");
	   else if(b.compareTo(c)>0)
		   System.out.println(b + " is max");
	   else
		   System.out.println(c + " is max");
	   
   }
   
 //UC-1: Find max of 3 Floats	
   public static void max(Float a, Float b, Float c) {
	   
	   if(a.compareTo(b)>0 && a.compareTo(c)>0)
		   System.out.println(a  +" is max");
	   else if(b.compareTo(c)>0)
		   System.out.println(b + " is max");
	   else
		   System.out.println(c + " is max");
	   
    }
   
 //UC-1: Find max of 3 Strings	
   public static void max(String a, String b, String c) {
	   
	   if(a.compareTo(b)>0 && a.compareTo(c)>0)
		   System.out.println(a  +" is max");
	   else if(b.compareTo(c)>0)
		   System.out.println(b + " is max");
	   else
		   System.out.println(c + " is max");
	   
    }
	
   public static void main(String[] args) {
	System.out.println("_____________");
	max(33, 14, 5);
	max(33, 44, 5);
	max(33, 44, 55);
	System.out.println("_____________");
	max(3.3f, 1.4f, 0.5f);
	max(3.3f, 4.4f, 0.5f);
	max(3.3f, 4.4f, 5.5f);
	System.out.println("_____________");
	max("Welcome", "Hello", "World");
	max("Welcome", "World", "Hello");
	max("World", "Welcome", "Hello");
	System.out.println("_____________");
}
}

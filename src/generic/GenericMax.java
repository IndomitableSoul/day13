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
	
   public static void main(String[] args) {
	max(33, 14, 5);
	max(33, 44, 5);
	max(33, 44, 55);
	
}
}
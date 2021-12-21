package generic;

public class GenericMax{
	/*
	 * Re-factored all the 3 to One Generic Method to
	 *  find the maximum
	 */
   public static <E extends Comparable> void maxGeneric(E a, E b, E c) {
	   E max;
	   if(a.compareTo(b)>0 && a.compareTo(c)>0) 
		   max = a;
	   else if(b.compareTo(c)>0)
		   max = b;
	   else
		   max = c;
	   System.out.println("Maximum is: " + max);   
   }
	
   public static void main(String[] args) {
	   maxGeneric(1, 2, 3);
	   maxGeneric(1.2, 3.4, 1.1);
	   maxGeneric("Welcome", "Hello", "World");
}
}

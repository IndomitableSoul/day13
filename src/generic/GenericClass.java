package generic;

/*
Re-factored to create Generic
Class to take in 3 variables of
Generic Type*/

public class GenericClass<E extends Comparable>{
	
	E a, b, c;
	
	public GenericClass(E a, E b, E c) {
		this.a = a;
		this.b = b;
		this.c = c;
	 }
	
	public <E extends Comparable> void max() {
		maxGeneric(a, b, c);
	 }
	
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
	   new GenericClass<Integer>(10, 20, 30).max();
	   new GenericClass<Double>(1.0, 2.3, 3.4).max();
	   new GenericClass<String>("Apple", "Banana", "Peach").max();
	}
}
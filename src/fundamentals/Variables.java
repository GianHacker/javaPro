package fundamentals;
import java.util.*;

public class Variables {
	
	int age = 35; // instance variable
	static int year = 1988; // static variable
	
	public static void main(String[] args){
		/* A variable which holds the value while the java program is executed.
		 * A variable is assigned with a data type.
		 * Variable is a name of memory location.
		 * There are three types of variables in java: local, instance & static */
		Variables v1 = new Variables(); // instantiating an object
		System.out.println(v1.age); 
		System.out.println(year);
		System.out.println(height());
	}
	public static float height() {
		float height = 172.5f; // instance variable
		return(height);
	}

}

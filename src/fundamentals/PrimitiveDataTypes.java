package fundamentals;

public class PrimitiveDataTypes {
	
	public static void main(String[] args) {
		byte b = 127; // value range is -128 to 127
		short s = -32768; // value range is -32768 to 32767
		int i = 2147483647; // value range is -2147483648 to 2147483647
		long l = 9223372036854775807L; // value range is -9223372036854775808 to 9223372036854775807
		float f = 12.43f; // value range varies based on the value
		double d = 922337203.6854775807d; // value range varies based on the value
		boolean bool = true; // values are either true or false
		char c = 's'; // value range is 0 to 65535
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bool);
		System.out.println(c);
		
		
	}
	
}

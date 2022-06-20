package java_basics;

public class VariablesContinued {

	public static void main(String[] args) {
		int var = 1000000;
//		to save a large number use the data type long with and L on the other side of the equal sign
//		long bigNumber = 10000000000L;
		
//		short can store data up to 32767
		short shortNumber = 32767;
		
//		really small numbers max = 127
		byte reallySmallNumber = 127;
		
//		for decimals you must use doubles
		double decimalVariable = 394.003;
		
//		true or false is a boolean type
		boolean decision = false;
		
//		to save only characters, i.e single character
		char letter = 'e' ;
		
		System.out.println(var + shortNumber + reallySmallNumber);
		System.out.println(decimalVariable);
		System.out.println(decision);
		System.out.println(letter);
	}

}

public class VariableTypeCasting {
	
	//Widening Casting (automatically)-onverting a smaller type to a larger type size//
	//-----byte -> short -> char -> int -> long -> float -> double//
	public static void main(String[] args) {
	byte a=65;
    System.out.println("Byte value: "+a);
    System.out.println("------------Widening Casting/Automatic Casting---------------------");
	short b=a;
	System.out.println("Byte value coversion to Short : "+b);
	char c=(char) b;
	System.out.println("\nCharter print value: "+c);
	int d=c;
	System.out.println("\nCharacter to Integer: "+d);
	long e=d;
	System.out.println("\nInteger to Long conversion: "+e);
	float f=e;
	System.out.println("\nLong to Float conversion: "+f);
	double g=f;
	System.out.println("\nFloat to Double conversion: "+g);
	
	//Narrowing Casting (manually) - converting a larger type to a smaller size type//
	//double -> float -> long -> int -> char -> short -> byte//
	
	System.out.println("\n------------Narrowing Casting/Manual Casting---------------------\n");
	float aa=(float)g;
	System.out.println("\ndouble to float conversion: "+aa);
	long bb=(long)aa;
	System.out.println("\nfloat to long conversion: "+bb);
	int cc=(int)bb;
	System.out.println("\nlong to integer conversion: "+cc);
	char dd=(char)cc;
	System.out.println("\nInteger to Character conversion: "+dd);
	short ee=(short)dd;
	System.out.println("\nCharacter to short conversion: "+ee);
	byte ff=(byte)ee;
	System.out.println("\nShort to byte conversion: "+ff);
	
	
	}
}

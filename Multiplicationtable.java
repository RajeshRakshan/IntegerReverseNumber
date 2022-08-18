public class Multiplicationtable {
	public static void main(String[] args) {
	int a=0;
	for (int i = 1; i < 20; i++) {
		System.out.println("Number "+i+" Multiplication Table is as below");
		for (int j = 1; j <=12; j++) {
			a=i*j;
			System.out.println(""+i+" X "+j+" = "+a);
			
		}
		System.out.println("===============================================");
	}
	}

}
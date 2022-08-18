public class MirrorDiamondImage {
	public static void main(String[] args) {
		int j=0,k,i,l,m,n=20,o,p=0,q=0,r=0,s=10;
		int value=65;
		for ( i =0; i<=10; i++) {
			
			for ( j = 0; j <=i; j++) {
				System.out.print((char)value+" ");
				}
			System.out.print("  ");
			
			for ( m = n; m>=0; m--) {
				System.out.print((char)value+" ");
				}
	
			System.out.print("  ");
			for( q=0;q<=i;q++) {
				
				System.out.print((char)value+" ");
				
				
			}
			
			
			
			
			
			n--;
			n--;
			value++;
			System.out.println();
			
			
			
			}
		for ( k = j; k>=0; k--) {
			for ( l = 0; l <=k-2; l++) {
				System.out.print((char)value+" ");
			}
			System.out.print("  ");
			for ( o =-2; o<=p; o++) {
				System.out.print((char)value+" ");
				}
			System.out.print("  ");
			for(r=s;r>0;r--) {
				
				
				System.out.print((char)value+" ");
				
			}
			s--;
			p++;
			p++;
			if(k>=20) {break;}
			value--;
			System.out.println();
			
			}
		
		
		
		
	}
	

}
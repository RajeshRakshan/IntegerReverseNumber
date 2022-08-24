import java.util.Scanner;

public class DesendingAscending {
	public static void main(String[] args) {
	System.out.println("Enter the array size");
	Scanner sc=new Scanner(System.in);
	int i = sc.nextInt();
	int a[]=new int[i];
for (int j=0;  j< a.length; j++) {
	a[j] = sc.nextInt();
                                                      }
System.out.println("Desending order:");
for (int k = 0; k < a.length; k++) {
	for (int l =k+1; l < a.length; l++) {
		if(a[k]<a[l]) {//23653
			int tem=a[k];
			a[k]=a[l];
			a[l]=tem;
		                        }
		
	                                                            }
	System.out.println(a[k]);
	
                                                       }
System.out.println("Ascending order:");
for (int k = 0; k < a.length; k++) {
	for (int l =k+1; l < a.length; l++) {
		if(a[k]>a[l]) {//23653
			int tem=a[k];
			a[k]=a[l];
			a[l]=tem;
		                        }
		
	                                                        }
	System.out.println(a[k]);
	
                                                 }


	
	}
}

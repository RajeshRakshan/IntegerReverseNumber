import java.util.Scanner;

public class StringMatch {
	
	public void stringMatch(String i, String j) {
		int c=i.length();
		int d=j.length();
            j=" "+j+" ";
		if(c<d){
		String k=i;
		i=j;
		j=" "+k+" ";
		}
		
	boolean con = i.contains(j);
	if(con==true) {
		System.out.println("String are same");	
	}
	else {System.out.println("String are not a same");
	}
	
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first string");
			String a=sc.nextLine();
	System.out.println("Enter the first string");
	        String b=sc.nextLine();
	StringMatch sm=new StringMatch();
	        sm.stringMatch(a,b);
	
}
}
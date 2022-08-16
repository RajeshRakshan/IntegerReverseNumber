
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUserNamePassWordd {
	private String USERNAME;
	private String PASSWORD;
	public  void setUSERNAME(String userName) {
		this.USERNAME=userName;
		
		}
	public  void setPASSWORD(String passWord) {
		this.PASSWORD=passWord;
		}
	public  String getUSERNAME() {
		return USERNAME;
		}
	public  String getPASSWORD() {
		return PASSWORD;
		}
}

class MainMethodUserNamePassWord {

	public static void main(String[] args) {
		boolean find1=false,find2=false,find3=false,find4=false;
		boolean FIND1=false,FIND2=false;
		Scanner sc =new Scanner(System.in);
		System.out.println(" Creat Valid E-mainl ID ");
		String userName = sc.nextLine();
		Pattern P1= Pattern.compile("@");
		Matcher M1=P1.matcher(userName);
		 FIND1 = M1.find();//true
		Pattern P2= Pattern.compile(".com$|.in$|.co.in$|.co$|.net$|.org$|.uk$|.nz$");
		Matcher M2=P2.matcher(userName);
		 FIND2 = M2.find();//false
		if (FIND1==true&&FIND2==true) {
			System.out.println("The Entered E-mail ID  is available to create");
		}
	    else if(FIND1==false||FIND2==false||(FIND1==false&&FIND2==false)) {
	    	do {
	    		System.out.println("The Entered E-mail ID is not valid ,please do recreate valid E-mail ID");
				userName = sc.nextLine();
				Pattern PP1= Pattern.compile("@");
				Matcher MM1=PP1.matcher(userName);
				FIND1 = MM1.find();//true
				Pattern PP2= Pattern.compile(".com$|.in$|.co.in$|.co$|.net$|.org|.uk|.nz");
				Matcher MM2=PP2.matcher(userName);
				 FIND2 = MM2.find();//false
				
			} while (FIND1==false||FIND2==false||(FIND1==false&&FIND2==false));
			
		}
		//-----------------------------------------------------------
		System.out.println(" Create Valid PassWord ");//8char,L,i,9,)
		String passWord = sc.nextLine();
		Pattern p1= Pattern.compile("[A-Z]");
		Pattern p2= Pattern.compile("[a-z]");
		Pattern p4= Pattern.compile("[0-9]");
		Pattern p3= Pattern.compile("[^A-Za-z0-9]");
		Matcher m1=p1.matcher(passWord);
		Matcher m2=p2.matcher(passWord);
		Matcher m3=p3.matcher(passWord);
		Matcher m4=p4.matcher(passWord);
		 find1 = m1.find();
		 find2 = m2.find();
		 find3 = m3.find();
		 find4 = m4.find();
	    
		if(((passWord.length())>=8)&&find1==true&&find2==true&&find3==true&&find4==true) {
			
		System.out.println("You have created password successfully");
		                              }
	    else {    
	    	do{
	    		System.out.println("Recreate strong password using more than 8 character ");
	    	     passWord=sc.nextLine();
	    		Pattern pp1= Pattern.compile("[A-Z]");
	    		Pattern pp2= Pattern.compile("[a-z]");
	    		Pattern pp3= Pattern.compile("[^A-Za-z0-9]");
	    		Pattern pp4= Pattern.compile("[0-9]");
	    		Matcher mm1=pp1.matcher(passWord);
	    		Matcher mm2=pp2.matcher(passWord);
	    		Matcher mm3=pp3.matcher(passWord);
	    		Matcher mm4=pp4.matcher(passWord);
	    		 find1 = mm1.find();
	    		 find2 = mm2.find();
	    		 find3 = mm3.find();
	    		 find4 = mm4.find();
	    		 }
	    			while(((passWord.length())<8)||find1==false||find2==false||find3==false||find4==false);
	    	System.out.println("You have created password successfully");
	    	
	    }
	
		ValidUserNamePassWordd obj=new ValidUserNamePassWordd();
		obj.setUSERNAME(userName);
		obj.setPASSWORD(passWord);
		String USER = obj.getUSERNAME();
		String PASS = obj.getPASSWORD();
			System.out.println("Your new Email-ID is   " +USER);
			System.out.println("Your Secret Password is " +PASS);
			
			
	}
}
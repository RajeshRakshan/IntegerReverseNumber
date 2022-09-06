import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//----------------------------Banking Service Methods------------------------------------------------------------//
 class BankingServiceMethods extends NumberToWord {
	static Scanner ssc=new  Scanner(System.in);
	static int Balance=50000;
	public static void  withDrawal() throws InterruptedException {
     System.out.println("Plese Enter the withdrawal amount interms of 500 rupees ");
     int b=ssc.nextInt();
     if(((b%500)==0)&&((500>=b)||(b<=13000))) {
    	    pinSelection();
     }
     else {
		System.out.println("Invalid amount selection");
		withDrawal();
		
	}
	
	
	}
	public static void  pinSelection() throws InterruptedException {
		System.out.println("Enter the secret number");
	    int c =ssc.nextInt();
	    String b=Integer.toString(c);
	    int d=b.length();
	    System.out.println(d);
	    if(d==4) {
	    System.out.println("----------------------------------------------------------Please wait!!!--------------------------------------------------------");
	    System.out.println("---------------------------------------------------Your Transaction is processing------------------------------------------------");
		Thread.sleep(5000);
		System.out.println();
		System.out.println("Please take your cash");
		System.out.println("Thank you for banking with us");

	}
	    else {
	    	System.out.println("You have entered invalid secret number");
	    	pinSelection();
	    }
			
		}
	
	public static void logInInfo() throws InterruptedException {
System.out.println("Please Enter your USERNAME");
String user= ssc.next();
System.out.println("Please Enter your PASSWORD");
String pass=ssc.next();
System.out.println();
System.out.println("Please wait fetching your details");
System.out.println();System.out.println();
Thread.sleep(5000);
System.out.println("Account Holder Name   :Mr." +AtmProgram.WelName+"\nYour AccountNumber is :" +AtmProgram.acc+"\nAccountType           : "+AtmProgram.Actype+ "\nBranch                : " +AtmProgram.Branch+"\n");

System.out.println("Please Choose below options \nPress 1 for Account Balance \nPress 2 for Fund Transfer \nPress 3 for quite ");
int press=ssc.nextInt();
if (press==1) {System.out.println("Your Account Balance is : " +Balance);} 
else if (press==2){System.out.println("Your Account Balance is : " +Balance);fundTransfer();}
else if (press==3){System.out.println("hank You For Banking With US");}

	}
	
public static void fundTransfer() throws InterruptedException {
System.out.println("Please Enter Reciepient account number");
int racc=ssc.nextInt();
System.out.println("Please Enter your Amount to transfer");
System.out.println("Minimum Amount is Rs:500/- to Maximum Amount is Rs:13000");
System.out.print("Rs: ");
int amount=ssc.nextInt();
System.out.println("----------------------------------------------------------------------------YOUR FOUND IS BEING TRANSFERED------------------------------------------------------------------------------------");
Thread.sleep(3000);
System.out.println("The amount "+amount+ "rupees have been credited  to your Recipient Account");
System.out.println("Your revised Account Balance is :Rs "+(Balance-amount));
int xx=Balance-amount;
NumberToWord.wordNumber(xx);
System.out.println("Account Balance in Word: " +NumberToWord.V);
System.out.println("Thank You For Banking With US");
}
public static void forgotPassWord() {
System.out.println("Please Enter valid mobile number to send OTP");
long phone=ssc.nextLong();
int count=0;
while (phone>0) {
count++;
phone=phone/10;
}
	if (count==10) {System.out.println("Please Enter OTP ");
	int otp=ssc.nextInt();
		validPassword();}
	else {System.out.println("You have entered invalid mobile number");forgotPassWord();}
	
	
}
public static void validPassword() {
System.out.println(" Create Valid PassWord ");//8char,L,i,9,)
String pass=ssc.nextLine();
Pattern p1= Pattern.compile("[A-Z]");
Pattern p2= Pattern.compile("[a-z]");
Pattern p4= Pattern.compile("[0-9]");
Pattern p3= Pattern.compile("[^A-Za-z0-9]");
Matcher m1=p1.matcher(pass);
Matcher m2=p2.matcher(pass);
Matcher m3=p3.matcher(pass);
Matcher m4=p4.matcher(pass);
boolean find1=false,find2=false,find3=false,find4=false;
 find1 = m1.find();
 find2 = m2.find();
 find3 = m3.find();
 find4 = m4.find();

if(((pass.length())>=8)&&find1==true&&find2==true&&find3==true&&find4==true) {
	
System.out.println("You have created password successfully");
                              }
else {System.out.println("Invalid password should contains [ $% A-Za-z0-9]");validPassword();
}
	
}}
//----------This class is for to change the Numbers into word-------------------------------//
class NumberToWord {
	static int R;
	static String V,v;
	static Scanner cc=new Scanner(System.in);// R=123
//	public static void main(String[] args) {
//		System.out.println("Please enter the number");
//		 R = cc.nextInt();
//		 NumberToWord nn=new NumberToWord();
//		 nn.wordNumber(R);
//		 }
		 public static void wordNumber(int R) {
		String dig1="",dig2="",dig3="",dig4="",dig5="",dig6="",dig7="",dig8="";
		String[] a= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
		String[] aa= {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety",};//2
		String[] aaa= {" Hundred "," Thousand "," Lakhs "," Crore ",};
		int count=0;
		int R1=0;
		
		int r=R; //r=123
		int rh=R; // rh=123
		while(r>0) {
			r=r/10;//12
			count++;//1
		}
		//System.out.println(count);
		for(int i=count;i>0;i--) { //3,2,1
			switch (i) {
			case 1: {//less than 19  R=3//////////dig1=three
				if(R<=19) {
				dig1=a[R];}
				break;
			}
			case 2:{//20 to 99///23
				
				if (R>=20&&R<=99) {
					R1=R;
					R=(R/10);
					dig2=aa[R];///////////// dig2=twenty
					R=R1%10;//////R=3;
				
				}
				break;	
			}
            case 3:{//100to999 100,101.......123
				
				if (R>=100&&R<=999) {
					R1=R;//R1=123
					R=(R/100);//R=1
					dig3=a[R]+aaa[0];///////////////////////99999////dig3=one+hundred
					
					R=R1%100;/////////R=23
				}
				break;	
			}
               case 4:{//1000 to 9999
				
				if (R>=1000&&R<=9999) {
					R1=R;
					R=(R/1000);
					dig4=a[R]+aaa[1];
					R=R1%1000;
				}
				break;	
			}
               case 5:{//10000 to 99999
   				
   				if (R>=10000&&R<=99999) {//10000-20000
   					int R2=R/1000;
   		         	if(R2>=10&&R2<=20) {
   					R1=R;
   					R=(R/1000);
   					dig5=a[R]+aaa[1];
   					R=R1%1000;}
   		         	else if(R2>=21&&R2<=99) {
   		         	R1=R;
   					R=(R/10000);
   					int RR=R2%10;
   					dig5=aa[R]+a[RR]+aaa[1];
   					R=R1%1000;
   		         		
   		         	}
   		         	
   					i--;
   				}
   				break;	
   			}
               case 6:{//10000 to 99999
     				
     				if (R>=100000&&R<=999999) {//100000,999999,1025555 Ten Lakh twenty five thousand five hundred fifty five
     					int R2=R/100000;
     		         	if(R2>=1&&R2<=9) {
     					R1=R;
     					R=(R/100000);
     					dig6=a[R]+aaa[2];
     					R=R1%100000;}
     		   
     		         	
     				}
     				break;	
     			}
               
               case 7:{//10000 to 99999
      				
      				if (R>=1000000&&R<=9999999) {//100000,999999,1025555 Ten Lakh twenty five thousand five hundred fifty five
      					int R2=R/100000;
      		         	if(R2>=10&&R2<=20) {
      		          
      					R1=(R/100000);
      					dig6=a[R1]+aaa[2];
      					R=R%100000;}
      		         	else if(R2>=21&&R2<=99) {
      		         	int RR=R/100000;
      		         	int RR1=RR/10;
      		         	int RR2=RR%10;//2165231 twenty one lakhs sixty five thousand two hundred thirty one
      					dig6=aa[RR1]+a[RR2]+aaa[2];
      					R=R%100000;
      		         		
      		         	}
      		         i--;	
      				}
      			
      				break;	
      			}
               case 8:{//10000 to 99999
    				
    				if (R>=10000000&&R<=99999999) {//12552366//one cror twenty five lakh fifty two thousand three hundred sixty six
    					int R2=R/10000000;
    		         	if(R2>=1&&R2<=9) {
    					dig7=a[R2]+aaa[3];
    					R=R%10000000;}//0366585
    		         	
    				}
    				break;	
    			}
               case 9:{//100000000--
     				
     				if (R>=100000000&&R<=999999999) {//223564856,999999,1025555 Ten Lakh twenty five thousand five hundred fifty five
     					int R2=R/10000000;
     		         	if(R2>=10&&R2<=20) {
     					dig7=a[R2]+aaa[3];
     					R=R%10000000;}
     		         	else if(R2>=21&&R2<=99) {
     		         	int RR=R/10000000;
     		         	int RR1=RR/10;
     		         	int RR2=RR%10;//2165231 twenty one lakhs sixty five thousand two hundred thirty one
     					dig7=aa[RR1]+a[RR2]+aaa[3];
     					R=R%10000000;
     		         		
     		         	}
     		         	i--;
     				}
    
     				break;	
     			}
               case 10:{//10000 to 99999
   				
   				if (R>=1000000000&&R<=2147483647) {//1252366565//one cror twenty five lakh fifty two thousand three hundred sixty six
   					int RR=R/10000000;//214 one hundred thirteen crore//
   					int RRR=RR/10;//21
   					int RR1=RR/100;//2
   					int RR2=RRR%10;//1
   					int RR3=RR%10;///4
   					int Rr=RR%100;//14
   					if(Rr<=20) {
   					dig7=a[RR1]+aaa[0]+a[Rr]+aaa[3];
   		         	
   					}
   					else if(Rr>=21&&Rr<99) {
   						int rr=Rr/10;
   						int rrr=Rr%10;
   						dig7=a[RR1]+aaa[0]+aa[rr]+a[rrr]+aaa[3];
   						
   					}
   					R=R%10000000;
   	   				i--;
   	   				i--;
   					
   				}
   				
   				break;	
               
               
               
               
               //------------------------------------------------
               
               }
			
			}
		}
		v="The Enter number " +rh+ " in word is=" +dig7 + dig6 + dig5 + dig4 + dig3 + dig2 + dig1+ " only ";
		V= dig7 + dig6 + dig5 + dig4 + dig3 + dig2 + dig1+ " Rupees Only ";
		//System.out.println(V);
	}
}
//------------------------------Main Function class------------------------------------//
public class AtmProgram extends BankingServiceMethods 
{
	static String WelName; 
	static long acc; 
	static String Actype; 
	static String Branch;
	
	public AtmProgram() throws InterruptedException 
	{
		
		System.out.println();
		System.out.println();
		System.out.println("----------------------------------------------WECOME TO RESERVE BANK OF INDIA BANKING SERVICE-------------------------------------------");
		System.out.println();
	//	System.out.println("(IMPORTANT NOTE: Banking Service---> CashWithdrawal service only available currently)");
		System.out.println("Please Insert you card");
		Thread.sleep(5000);
		System.out.println();
		System.out.println();
		System.out.println("YOUR CARD IS GETTING PROCESSED PLEASE WAIT FOR A MOMENT");
		Thread.sleep(5000);
		System.out.println();
		System.out.println();
		}
		public AtmProgram(String WelName, long acc, String Actype, String Branch) 
		{
			this.WelName=WelName;
			this.acc=acc;
			this.Actype=Actype;
			this.Branch=Branch;
		System.out.println("Hi Mr." +WelName+"\nYour AccountNumber is :" +acc+"\nAccountType: "+Actype+ "\nBranch: " +Branch);
		System.out.println();
		System.out.println("PLEASE ENTER THE TYPE OF SERVICE");
		System.out.println();
		System.out.println("Choose 1----Banking Service");
		System.out.println("Choose 2----Net Banking Service");
		System.out.println("Choose 3----Other Banking Service");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		AtmProgram atm= new AtmProgram();
		AtmProgram info= new AtmProgram("Rajesh Jayabal",1099959595,"Savings", "Cuddalore");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		switch (a) 
		{
		
		
		case 1:{System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("----------------------------------------------WELCOME TO RBI BANKING SERVICE----------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("PLEASE ENTER THE TYPE ACTION TO BE PERFORMED");
		System.out.println();
		System.out.println("Choose 1----CashWithdrawal");
		System.out.println("Choose 2----CashDeposit");
		System.out.println("Choose 3----PIN Creation or Modification");
		System.out.println("Choose 4----Ministatement");
		System.out.println("Choose 5----Balance Enquery");
		int b=sc.nextInt();
		if(b==1) {BankingServiceMethods.withDrawal();}
		else if(b==2) {}
		else if (b==3) {}
		else if(b==4) {}
		else if(b==5) {}
		else  {System.out.println("Please Choose Valid Option");}break;
		       }
		
			
        
		case 2:{System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("----------------------------------------------WELCOME TO RBI NET BANKING SERVICE----------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("PLEASE ENTER THE TYPE ACTION TO BE PERFORMED");
		System.out.println();
		System.out.println("Choose 1----UserLog-in");
		System.out.println("Choose 2----Fundtransfering");
		System.out.println("Choose 3----Forgot PassWord or Change PassWord");
		System.out.println("Choose 4----Transactions ");
		System.out.println("Choose 5----Online Bill Payment");
		int b=sc.nextInt();
		if(b==1) {BankingServiceMethods.logInInfo();}
		else if(b==2) {BankingServiceMethods.fundTransfer();}
		else if (b==3) {BankingServiceMethods.forgotPassWord();}
		else if(b==4) {}
		else if(b==5) {}
		else  {System.out.println("Please Choose Valid Option");}
		break;}
		case 3:{System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("----------------------------------------------WELCOME TO RBI OTHER BANKING SERVICE----------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("PLEASE ENTER THE TYPE ACTION TO BE PERFORMED");
		System.out.println();
		System.out.println("Choose 1----PassBook Entry");
		System.out.println("Choose 2----ATM Card Bocking");
		System.out.println("Choose 3----ATM Card Apply");
		System.out.println("Choose 4----Credit card ");
		System.out.println("Choose 5----Exit");
		int b=sc.nextInt();
		       }
		}
	}
	}




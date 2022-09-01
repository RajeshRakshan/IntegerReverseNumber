import java.util.Scanner;

public class AtmProgram extends BankingServiceMethods 
{
	public AtmProgram() 
	{
		
		System.out.println();
		System.out.println();
		System.out.println("----------------------------------------------WECOME TO RESERVE BANK OF INDIA BANKING SERVICE------------------------------");
		System.out.println();
		System.out.println("(IMPORTANT NOTE: Banking Service---> CashWithdrawal service only available currently)");
		System.out.println();
		System.out.println();
		System.out.println("PLEASE ENTER THE TYPE OF SERVICE");
		System.out.println();
		System.out.println("Choose 1----Banking Service");
		System.out.println("Choose 2----Net Banking Service");
		System.out.println("Choose 3----To exit form the Service");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		AtmProgram atm= new AtmProgram();
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
		switch (b) 
		{
		case 1: 
		{atm.withDrawal();break;
		}
		default:{System.out.println("This features are currently not available please contact RBI BANK Branch");
		break;
		}
		}
		       }
		
			
        
		default:{System.out.println("This features are currently not available please contact RBI BANK Branch");
			break;}
		}
	}
	}


 class BankingServiceMethods {
	
	int Balance;
	public void withDrawal() throws InterruptedException {
     System.out.println("Plese Enter the withdrawal amount interms of 500rupees");
     Scanner ssc=new  Scanner(System.in);
     int b=ssc.nextInt();
     System.out.println("Enter the secret number");
    int c =ssc.nextInt();
    System.out.println("----------------------------------------------------------Please wait!!!--------------------------------------------------------");
    System.out.println("---------------------------------------------------Your Transaction is processing------------------------------------------------");
	Thread.sleep(5000);
	System.out.println();
	System.out.println("Please take your cash");
	System.out.println("Thank you for banking with us");
	
	
	}

}
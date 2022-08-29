
import java.text.SimpleDateFormat;  
import java.util.Date; 
public class RandomNumber 
{
	
	public static void main(String[] args) 
        {  
	    SimpleDateFormat sec = new SimpleDateFormat("ss");  
	    Date ss = new Date();  
	    int parseIntt = Integer.parseInt(sec.format(ss));
	    int parseInt=parseIntt+2;
	    if(parseInt>10) 
             {
	    int a=10000/parseInt;
	    System.out.println("Your 3 digit OTP is:  "+a);
             }
	    else if(parseInt<=10) 
             {
		    int a=1000/parseInt+495;
		    System.out.println("Your 3 digit OTP is:  "+a);
             }
	}  
} 
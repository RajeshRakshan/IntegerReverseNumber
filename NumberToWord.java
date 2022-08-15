import java.util.Scanner;

public class NumberToWord {
	    public static void main(String[] args) {
int count=0;
System.out.println("Enter the Value that need to change as Word");
Scanner sc=new Scanner(System.in);//1232635894
int R = sc.nextInt(),R1=0;

String dig1="",dig2="",dig3="",dig4="",dig5="",dig6="",dig7="",dig8="";

String[]a={""," One "," Two "," Three "," Four "," Five "," Six "," Seven "," Eight "," Nine "," Ten "," Eleven "," Twelve "," Thirteen "," Fourteen "," Fifteen "," Sixteen "," Seventeen "," Eighteen "," Nineteen "," Twenty "};

String[] aa= {"",""," Twenty "," Thirty "," Fourty "," Fifty "," Sixty "," Seventy "," Eighty "," Ninety ",};
String[] aaa= {" Hundred "," Thousand "," Lakhs "," Crore ",};
if(R!=0){
int r=R;
int rh=R;
while(r>0) {
r=r/10;
count++;
		     }
System.out.println(count);

for(int i=count;i>0;i--) {
switch (i) {
			
case 1: {//less than 19
				if(R<=19) {
				dig1=a[R];}
				break;
	          }

case 2:{//20 to 99
				
				if (R>=20&&R<=99) {
					R1=R;
					R=(R/10);
					dig2=aa[R];
					R=R1%10;
				
				                                       }
				break;	
               }

case 3:{//100to999 100,101
				
				if (R>=100&&R<=999) {
					R1=R;
					R=(R/100);
					dig3=a[R]+aaa[0];///////////////////////99999
					R=R1%100;
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
   					R=R1%1000;         }
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
    					R=R%10000000;}
    	
    		         	
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
               
                 
               }
			
			}
		}
		System.out.println(" The Entered number " +rh+ " in word is= " +dig7 + dig6 + dig5 + dig4 + dig3 + dig2+ dig1+ "  only ");}
else{
System.out.println(" The Entered number " +R+ " in word is= Zero " );

}
	}

}
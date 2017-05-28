import java.util.*;
import java.lang.*;
public class conversion
{  static int counter;
 static String in1;
	static int num;
	static int[] q= new int[10];
	static int x=0;
	static int flag;
	
	static int [] arr3;

	public static void main(String arg[])
	{
	
	
	
	
	Scanner keybd=new Scanner(System.in);
	conversion lb=new conversion();
	
	int op=lb.option();
	              switch (op){
		case 1:
			{  num =lb.number();		
			 	lb.seperate(num);		
				lb.con1();
						
			
			
			if (flag==1)
			return;
			System.out.println("Octal number " +num + " in decimal is: "+x);
			break;
			}//case 1 ends
			
		case 2:
			{	num =lb.number();		
			 	lb.seperate(num);
				lb.con2();

				
			if (flag==1)
			return;
			System.out.println("Binary number " +num + " in decimal is: "+x);
			break;
			}//case ends
		case 3:
			{   lb.string();
				lb.con3();
				if (flag==1)
				return;
				System.out.println("Hexadecimal number " +in1 + " in decimal is: "+x);
				break;
			}//case ends
			
			}//switch ends
			}//main ends
		int option(){
				System.out.println("Enter 1: octal to decimal");
				System.out.println("Enter 2: binary to decimal");
				System.out.println("Enter 3: hexadecimal to decimal");
				Scanner keybd=new Scanner(System.in);
				int option=keybd.nextInt();	
				return option;
			}//input ends
		int number(){
				System.out.println("Enter the number");
				Scanner keybd=new Scanner(System.in);
				int number=keybd.nextInt();	
				return number;
				}// ends number
		void string(){
				System.out.println("Enter the number ");
				Scanner keybd=new Scanner(System.in);
				String in1=keybd.nextLine();
				char[] arr=in1.toCharArray();
				int [] arr3=new int[arr.length+1];	
				
					
				for (int i=0;i<arr.length;i++){
				if (arr3[i]>='0'|| arr3[i]<='9')
					arr3[i]=arr[i]-'0';
				if (arr3[i]=='a'|| arr3[i]=='A')
					arr3[i]=10;
				if (arr3[i]=='b'|| arr3[i]=='B')
					arr3[i]=11;
				if (arr3[i]=='c'|| arr3[i]=='C')
					arr3[i]=12;
				if (arr3[i]=='d'|| arr3[i]=='D')
					arr3[i]=13;
				if (arr3[i]=='e'|| arr3[i]=='E')
					arr3[i]=14;
				if (arr3[i]=='f'|| arr3[i]=='F')
					arr3[i]=15;
				}//for ends
				}// ends string
		void seperate(int num){
			
			int r=1;
			int i=1000000000;
			int a=num/i;
			while (a==0){
			i=i/10;
			a=num/i;}//while ends
			q[0]=num/i;
			r=num%i;
			i=i/10;
			for(int j=1;j<10;j++)
			{
			
			q[j]=r/i;
			r= r%i;
			if(r==0) 
			break;
			i=i/10;
			counter++;
			}//for ends
			}//ends seperate
		void con1(){
			int power=counter+1;
			for(int k=0;k<counter+2;k++)
			{			
			if(q[k]<8)
			while (power!=-1){
				 x+=q[k]*(int)Math.pow(8,power);
				 power--;
			
			}//while ends
			
				else if (q[k]>=8){
				System.out.println("Your input " +num+ " has an invalid digit " +q[k]);
				flag=1;
				return;
				}//else ends
				}//for ends
			}//ends con
		void con2(){
				int power=counter+1;
				for(int k=0;k<counter+2;k++)
			{			
				if(q[k]<2)
				while (power!=-1){
				 x+=q[k]*(int)Math.pow(2,power);
				 power--;
				}//while ends
			
				else if (q[k]>=2){
				System.out.println("Your input " +num+ " has an invalid digit " +q[k]);
				flag=1;
				return;
				}//else ends
				}//for ends
				}//ends con2
		
		void con3(){
				int power=arr3.length-1;
				for(int k=0;k<counter+2;k++)
			{			
				if(arr3[k]<16)
				while (power!=-1){
				 x+=arr3[k]*(int)Math.pow(16,power);
				 power--;
				}//while ends
			
				else if (arr3[k]>=16){
				System.out.println("Your input " +num+ " has an invalid digit " +arr3[k]);
				flag=1;
				return;
				}//else ends
				}//for ends
				}//ends con3
				}// ends class
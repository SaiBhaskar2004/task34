import java.util.*;
public class task3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO CURRENCY CONVERTER");
		System.out.println("SELECT YOUR FROM CURRENCY CONVERTER");
		System.out.println("1.US  2.INDIA  3.AUSTRALIAN  4.CHINA");
		int x= sc.nextInt();
		if(x==1){
			System.out.println("1.US  2.INDIA  3.AUSTRALIAN  4.CHINA");
			System.out.println("SELECT YOUR TO CURRENCY CONVERTER");
			int y=sc.nextInt();
			switch(y){
				case 1:
				System.out.println("Enter Amount");
				double a= sc.nextInt();
				System.out.println("Your Amount is:== "+a);
				break;
				case 2:
				System.out.println("Enter Amount");
				double c= sc.nextInt();
				double d= c*83.30;
				System.out.println("Your Amount is:== "+d);
				break;
				case 3:
				System.out.println("Enter Amount");
				double e= sc.nextInt();
				double f= e*1.57;
				System.out.println("Your Amount is:== "+f);
				break;
				case 4:
				System.out.println("Enter Amount");
				double g= sc.nextInt();
				double h= g*7.29;
				System.out.println("Your Amount is:== "+h);
				break;
				default:
				System.out.println("Invalid");
			}
		}
		else if(x==2){
			System.out.println("1.us  2.india\n3.uk\n4.arab");
			System.out.println("Select to convereter ");
			int y2=sc.nextInt();
			switch(y2){
				case 1:
				System.out.println("Enter Amount");
				double i= sc.nextInt();
				double j= i*0.012;
				System.out.println("Your Amount is:== "+j);
				break;
				case 2:
				System.out.println("Enter Amount");
				double k= sc.nextInt();
				System.out.println("Your Amount is:== "+k);
				break;
				case 3:
				System.out.println("Enter Amount");
				double m= sc.nextInt();
				double n= m*0.019;
				System.out.println("Your Amount is:== "+n);
				break;
				case 4:
				System.out.println("Enter Amount");
				double o= sc.nextInt();
				double p= o*0.088;
				System.out.println("Your Amount is:== "+p);
				break;
				default:
				System.out.println("Invalid");
			}
		}
		else if(x==3){
			System.out.println("1.us\n2.india  .uk\n4.arab");
			System.out.println("Select to convereter ");
			int y3=sc.nextInt();
			switch(y3){
				case 1:
				System.out.println("Enter Amount");
				double q= sc.nextInt();
				double r= q*0.64;
				System.out.println("Your Amount is:== "+r);
				break;
				case 2:
				System.out.println("Enter Amount");
				double r2= sc.nextInt();
				double s= r2*52.99;
				System.out.println("Your Amount is:== "+s);
				break;
				case 3:
				System.out.println("Enter Amount");
				double t= sc.nextInt();
				System.out.println("Your Amount is:== "+t);
				break;
				case 4:
				System.out.println("Enter Amount");
				double u2= sc.nextInt();
				double v= u2*4.64;
				System.out.println("Your Amount is:== "+v);
				break;
				default:
				System.out.println("Invalid");
			}
		}
		else{
			System.out.println("1.us  2.india  3.uk\n4.arab");
			System.out.println("Select to convereter ");
			int y4=sc.nextInt();
			switch(y4){
				case 1:
				System.out.println("Enter Amount");
				double w= sc.nextInt();
				double a1= w*0.14;
				System.out.println("Your Amount is:== "+a1);
				break;
				case 2:
				System.out.println("Enter Amount");
				double z= sc.nextInt();
				double a2= z*11.43;
				System.out.println("Your Amount is:== "+a2);
				break;
				case 3:
				System.out.println("Enter Amount");
				double a3= sc.nextInt();
				double a4= a3*0.22;
				System.out.println("Your Amount is:== "+a4);
				break;
				case 4:
				System.out.println("Enter Amount");
				double a5= sc.nextInt();
				System.out.println("Your Amount is:== "+a5);
				break;
				default:
				System.out.println("Invalid");
			}
		}
	}
}

				
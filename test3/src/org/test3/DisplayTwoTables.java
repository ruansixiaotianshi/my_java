package org.test3;
public class DisplayTwoTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Ç§¿Ë          °õ         |    °õ         Ç§¿Ë\n");
		int kilograms1=1;
		int pounds2=20;
       
		do
		{
			double pounds1=kilograms1*2.2;
			pounds1=(double)Math.round(pounds1*10)/10;
			double kilograms2=pounds2/2.2;
			kilograms2=(double)Math.round(kilograms2*100)/100;
			System.out.print("  "+kilograms1+"   "+pounds1+"    |    "+pounds2+"      "+kilograms2);
			System.out.print("\n");
			kilograms1=kilograms1+2;
			pounds2=pounds2+5;
		}while(kilograms1<=199&&pounds2<=515);

			}

		}


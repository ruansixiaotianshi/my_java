package org.test3;

public class Divsible5or6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
int number =100;
for(number= 100;number<=200;number++)
{
	if(number%5==0^number%6==0)
	{
		System.out.print(number+" ");
		count++;
		if(count%10==0)
			System.out.print("\n");
	}
}
	}

}

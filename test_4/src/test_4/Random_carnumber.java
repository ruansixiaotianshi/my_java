package test_4;
import java.util.Random;
public class Random_carnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  

for(int i=0;i<3;i++)
{
	char RandomCharacter = (char)('A' + Math.random() * ('Z' - 'A' + 1));
	System.out.print(" "+RandomCharacter);
	}
for(int i=0;i<4;i++)
{
	int Randomnumber=(int)(Math.random()*10);
	System.out.print(" "+Randomnumber);
}


	}

}

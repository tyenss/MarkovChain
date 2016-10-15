import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Chain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		//System.out.println("Please type in how big you want the matrix")
		//int x=input.nextInt();
		//int[][] matrix=new int[2][2];
		int[] counter=new int[2];
		int n=0;
		int location=0;
		Random rand=new Random();
		for (int f=0;f<50;f++)
		{
			counter[0]=0;
			counter[1]=1;
		for (int i=0;i<1000;i++)
		{
			n=rand.nextInt(100)+1;
			if (n>90)
			{
				if (location==0)
				{
					location++;
				} else if (location==1)
				{
				location--;	
				}
			}
			counter[location]++;
		}
		System.out.println(Arrays.toString(counter));
		}
		
		
		
		
	}

}

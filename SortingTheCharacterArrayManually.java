import java.util.Arrays;
import java.util.Scanner;

public class SortingTheCharacterArrayManually {

	public static void main(String[] args) 
	{
		String s="";
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string from user");
		s=sc.nextLine();
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=(char)temp;
					
				}
			}
		}
		System.out.println("Character after sorting is :"+Arrays.toString(ch));

	}

}

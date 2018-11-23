import java.util.Scanner;

public class RevNSortStr {

	String str[];
	
	public void GetStr(int size)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String:");
		str=new String[size];
		for(int i=0;i<size;i++)
		{
			str[i]=sc.nextLine();
		}
		
		sc.close();		
	}
	public void RevStr()
	{
		System.out.println("Reverse String:");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+",");
		}
		System.out.println();
	}
	
	public void SortStr()
	{
		for (int i = 0; i < str.length; i++)
		{
			for (int j = i + 1; j < str.length; j++)
			{
				if (str[i].compareTo(str[j])>0)
				{
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}
	public static void main(String[] args)
	{
		RevNSortStr obj=new RevNSortStr();
		obj.GetStr(5);
		obj.RevStr();
		obj.SortStr();

	}

}

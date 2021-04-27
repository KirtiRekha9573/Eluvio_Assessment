import java.util.Scanner;

//Java Program that demonstrates Longest Byte Strand//
class strandByte
{
	//Declaring a method//
	public String longestSubString(String a, String b)
	{
		//Declaring an empty string//
		String out = " ";
		
		//If the string lengths are zero, then it will just return an empty string//
		if(a.length() == 0 || b.length() == 0)
		{
			return out;
		}
		
		int len = 0;
		//If the strings are not the empty string//
		//Declaring a 2d array//
		int cache[][] = new int[a.length()][b.length()];
		
		//Traversing through the characters of the strings//
		for(int i=0 ; i<a.length(); i++)
		{
			for(int j=0; j<b.length(); j++)
			{
				if(a.charAt(i) == b.charAt(j))
				{
					if(i == 0 || j == 0)
					{
						cache[i][j] = 1;
					}
					else
					{
						cache[i][j] = cache[i-1][j-1]+1;
					}
					if(cache[i][j]>len)
					{
						len = cache[i][j];
						out = a.substring(i-len+1, i+1);
					}
				}
				
			}
		}
		System.out.println("Length: "+len);
		return out;	
	}
}
public class longestByte {

	public static void main(String[] args) {
		System.out.println("****** Java Program - Longest Byte Strand ********");
		
		//Taking input from user//
		String a, b;
		System.out.println("Enter String a: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		
		System.out.println("Enter String b: ");
		b = sc.nextLine();
		
		//Printing both the strings//
		System.out.println("Entered Strings: ");
		System.out.println(a);
		System.out.println(b);
		
		//Creating the object of the above class//
		strandByte st = new strandByte();
		st.longestSubString(a, b);
		System.out.println(st.longestSubString(a, b));
		

	}

}

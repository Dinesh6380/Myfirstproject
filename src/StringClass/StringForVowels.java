package StringClass;

public class StringForVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Edubridge";
		int x=0,y=0;
		char[] s = s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			if(s[i]== 'A'||s[i]== 'a'||s[i]=='E'||s[i]=='e'||s[i]=='i'||s[i]=='I'||s[i]=='O'||s[i]=='o'||s[i]=='u'||s[i]=='U')
			{
				x++;
			}
			else
			{
				y++;
			}
		}
		System.out.println("number of vowels"+x);
		System.out.println("number of consonants"+y);
	}

}

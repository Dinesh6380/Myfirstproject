package Demo_Loop;

public class LettersTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alpha = 65;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++) {
				char a = (char)alpha;
				System.out.print(" "+a+" ");
				alpha++;
			}
			System.out.println(" ");
			
		}
	}

}

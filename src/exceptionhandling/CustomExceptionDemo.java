package exceptionhandling;

public class CustomExceptionDemo {
	public static void validForVote(int age) throws MyException
	{
		if(age<18)
		{
			throw new MyException("Not valid for vote");
		}
	}
	public static void main(String[] args) throws MyException {
		validForVote(14);
	}

}

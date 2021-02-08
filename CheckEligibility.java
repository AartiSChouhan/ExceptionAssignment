package exceptionAssignment;


public class CheckEligibility extends Exception{
	void checkAge(int age) throws AgeException
	{
		if(age>18)
		{
			throw new AgeException("You are eligible");
		}else{
			System.out.println("You are not eligible");
			
		}
	}


}

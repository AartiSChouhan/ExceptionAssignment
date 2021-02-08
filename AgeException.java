package exceptionAssignment;

public class AgeException extends Exception{
	
		String msg;

		public AgeException(String msg) {
			super(msg);
			this.msg = msg;
			System.out.println("This is a constructor in Age Exception class");
		}
		
		
	


}

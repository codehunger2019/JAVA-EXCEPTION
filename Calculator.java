//Methods used to debug an Exception

package exceptionHandling;

public class Calculator {
	public void divide(int fn,int sn) {
		try {
			int res=fn/sn;
			System.out.println("division result is:"+res);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
			String msg=ae.getMessage();
			System.out.println(msg);
			ae.printStackTrace();
		}
	}

}

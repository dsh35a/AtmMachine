package atm;

public class AtmMachine implements Runnable 
{
	public synchronized void run()
	{
		try 
		{
			System.out.println();
			
//		    Thread t = Thread.currentThread();
//		    String str = t.getName();
			//static method of thread class is currentThread() : 
			//it will return object of current thread
			
			//same task we'll do it by method chaining
			String thread_name = Thread.currentThread().getName();
			System.out.println("***************************Welcome , "+thread_name+
					"**************************");
	        Thread.sleep(500);
			System.out.println(thread_name+" , enter in atm cabin");
			Thread.sleep(500);
			System.out.println(thread_name+" , swipes your debit card");
			Thread.sleep(500);
			System.out.println(thread_name+ " , provides atm pin");
			Thread.sleep(500);
			System.out.println(thread_name+" , cash withdraw");
			Thread.sleep(500);
			System.out.println(thread_name+" , completed transaction");
			Thread.sleep(500);
			System.out.println(thread_name+" , leaves atm cabin");
			Thread.sleep(500);
			System.out.println("***************************"+thread_name+
					" , Thankyou for visited!**************************");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

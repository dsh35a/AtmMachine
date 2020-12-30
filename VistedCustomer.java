package atm;

public class VistedCustomer 
{
	public static void main(String[] args) 
	{
		//create an atm
		AtmMachine atm =  new AtmMachine();
		
		//make threads that will work as customers
		//instance of atm
		Thread thread1 = new Thread(atm,"Daljeet");
		Thread thread2 = new Thread(atm,"Manjeet");
		Thread thread3 = new Thread(atm,"Ranjeet");
		
		//start the thread
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

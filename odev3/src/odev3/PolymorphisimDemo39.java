package odev3;

public class PolymorphisimDemo39 {

	public static void main(String[] args) {
		/* BaseLogger39[] loggers = new BaseLogger39[] {new FileLogger39(), new EmailLogger39(), new DatabaseLogger39(), new ConsoleLogger() };
		 for (BaseLogger39 logger: loggers) {
			 logger.Log("Log mesajı");
		 }*/
		CustomerManager39 customerManager = new CustomerManager39(new FileLogger39());
		customerManager.add();
		
		
		
	}

}

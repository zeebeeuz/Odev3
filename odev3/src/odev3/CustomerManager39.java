package odev3;

public class CustomerManager39 {
	
	private BaseLogger39 logger;
	
	public CustomerManager39(BaseLogger39 logger) {
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("Müşteri eklendi");
		this.logger.log("Log mesajı");

	}
}
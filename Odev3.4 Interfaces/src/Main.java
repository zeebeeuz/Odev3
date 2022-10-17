import java.beans.beancontext.BeanContextChildSupport;

public class Main {

	public static void main(String[] args) {
		CustomerDal customerDal = new OracleCustomer();
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
	}

}

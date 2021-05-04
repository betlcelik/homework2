

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapters;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("BETÜL");
		customer.setLastName("ÇELÝK");
		customer.setDateOfBirth(1987);
		customer.setNationalityId("12345678910");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		customerManager.save(customer);
		
        BaseCustomerManager customerManager1 = new NeroCustomerManager();
        customerManager1.save(customer);
        
	}

}

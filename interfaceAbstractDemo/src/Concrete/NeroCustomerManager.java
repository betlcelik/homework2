package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager implements CustomerService  {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to : Nero");
		
	}

}

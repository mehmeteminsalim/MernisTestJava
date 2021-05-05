package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarBucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService  customerCheckService;
	
	public StarBucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		
		try {
			if (customerCheckService.CheckIfRealPerson(customer)) {
				super.Save(customer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}

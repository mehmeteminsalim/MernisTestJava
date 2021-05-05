import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarBucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarBucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.Save(new Customer(1, "MEHMET EMÝN", "SALÝM", new GregorianCalendar(1999,07,29).getTime(), "30778252486"));
		

	}

}

package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerChechkService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerChechkService{
	

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result;
		result=false;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getYearOfBirth());
		}catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
		
	}

}

package Adapters;

import java.rmi.RemoteException;

import Abstract.IPlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService{
	private boolean result;
	@Override
	public boolean checkIfRealPerson(Player player) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		result = false;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName(), player.getLastName(), player.getDateOfBirth());			
		}catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}

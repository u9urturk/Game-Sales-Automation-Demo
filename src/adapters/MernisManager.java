package adapters;

import java.rmi.RemoteException;

import business.abstracts.CheckIfRealPersonService;
import entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager implements CheckIfRealPersonService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId())
				, gamer.getFirstName()
				, gamer.getLastName(),
				gamer.getDateOfBirth().getYear());
	}

}

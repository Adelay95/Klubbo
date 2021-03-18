package aiss.client;



import aiss.shared.domain.hs.Cartum;
import aiss.shared.domain.lol.Champion;
import aiss.shared.domain.magic.Card;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("mashup")
public interface MashupService extends RemoteService {
	Cartum[] getCarta(String nombre);
	Champion getChampion(String champ);
	String getTodasLasCartas(Integer ataque, Integer coste, Integer salud);
	Card getCard(String nombre);
	
}
	
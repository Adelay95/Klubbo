package aiss.client;




import aiss.shared.domain.hs.Cartum;
import aiss.shared.domain.lol.Champion;
import aiss.shared.domain.magic.Card;



import com.google.gwt.user.client.rpc.AsyncCallback;


public interface MashupServiceAsync {
	void getCarta(String nombre, AsyncCallback<Cartum[]> callback);
	void getChampion(String champ, AsyncCallback<Champion> callback);
	void getCard(String nombre, AsyncCallback<Card> callback);
	void getTodasLasCartas(Integer ataque, Integer coste, Integer salud, AsyncCallback<String> callback);
}

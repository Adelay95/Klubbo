package aiss.server;


import org.restlet.engine.header.Header;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;
import org.restlet.util.Series;

import aiss.client.MashupService;
import aiss.shared.domain.hs.Cartum;
import aiss.shared.domain.lol.Champion;









import aiss.shared.domain.magic.Card;



import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class MashupServiceImpl extends RemoteServiceServlet implements MashupService {
	
	//LOL

	private static final String LOL_API_KEY = "2738486f-bf19-4d2a-9efa-bff2ae7a2074";

	public Champion getChampion(String champ) {
		Champion campeon=null;
		ClientResource cr=new ClientResource("https://global.api.pvp.net/api/lol/static-data/euw/v1.2/champion/"+champ+"?locale=es_ES&champData=stats&api_key="+LOL_API_KEY);
		try {
		campeon=cr.get(Champion.class);
		} catch (ResourceException re) {
			System.err.println("Error: " + cr.getResponse().getStatus());
		}
		return campeon;
	}
	//hs
		public Cartum[] getCarta(String nombre) {
			Cartum[] carta=null;
			ClientResource cr=new ClientResource("https://omgvamp-hearthstone-v1.p.mashape.com/cards/"+nombre);
			
			@SuppressWarnings("unchecked")
			
			/*Series<Header> headers = (Series<Header>) cr.getRequestAttributes().get("org.restlet.http.headers");
			headers.set("X-Mashape-Key", "MuHO9YFE0Wmsh4aP0jMNAuRzIxyXp1kjjxjjsnYynHLnCGW4Vy");*/
		
			
			
			
			Series<Header> headers = (Series<Header>) cr.getRequestAttributes().get("org.restlet.http.headers");
	        if (headers == null) {
	            headers = new Series<Header>(Header.class);
	            cr.getRequestAttributes().put("org.restlet.http.headers", headers);
	        }
	        headers.add("X-Mashape-Key", "MuHO9YFE0Wmsh4aP0jMNAuRzIxyXp1kjjxjjsnYynHLnCGW4Vy");
			
		
	      
			/*Form headers=(Form) cr.getRequestAttributes().get(HeaderConstants.ATTRIBUTE_HEADERS);
			if(headers==null){
				headers= new Form();
				cr.getRequestAttributes().put("org.restlet.http.headers",ResponseHeader);
			}
			headers.add(value);*/
			//HttpResponse response = Unirest.get("https://omgvamp-hearthstone-v1.p.mashape.com/cards/"+nombre).header()
			
			
			try {
			
				//System.out.println(cr.get().getText());
				carta=cr.get(Cartum[].class);
			
			} catch (Exception re) {
				System.err.println("Error: " + cr.getResponse().getStatus());
			}
			return carta;
		}
		
		public Card getCard(String nombre) {
			Card magic=null;
			ClientResource cr=new ClientResource("http://api.deckbrew.com/mtg/cards/"+nombre);
			try {
				magic=cr.get(Card.class);
			} catch (ResourceException re) {
				System.err.println("Error: " + cr.getResponse().getStatus());
			}
			return magic;
		}
		public String getTodasLasCartas(Integer ataque, Integer coste, Integer salud) {
			String carta=null;
			String url="https://omgvamp-hearthstone-v1.p.mashape.com/cards";
			if(ataque!=null && coste!=null && salud!=null){
				url+="?attack=" + ataque +"&cost=" + coste + "&health=" + salud;
			}
			else if(ataque==null && coste!=null && salud!=null){
				url+="?cost=" + coste + "&health=" + salud;
			}
			else if(ataque!=null && coste==null && salud!=null){
				url+="?attack=" + ataque + "&health=" + salud;
			}
			else if(ataque==null && coste==null && salud!=null){
				url+="?health=" + salud;
			}
			else if(ataque!=null && coste!=null && salud==null){
				url+="?attack=" + ataque + "&coste=" + coste;
			}
			else if(ataque==null && coste!=null && salud==null){
				url+="?cost=" + coste;
			}
			else if(ataque!=null && coste==null && salud==null){
				url+="?attack=" + ataque;
			}
			ClientResource cr=new ClientResource(url);
			
			
			@SuppressWarnings("unchecked")
			
			/*Series<Header> headers = (Series<Header>) cr.getRequestAttributes().get("org.restlet.http.headers");
			headers.set("X-Mashape-Key", "MuHO9YFE0Wmsh4aP0jMNAuRzIxyXp1kjjxjjsnYynHLnCGW4Vy");*/
		
			
			
			
			Series<Header> headers = (Series<Header>) cr.getRequestAttributes().get("org.restlet.http.headers");
	        if (headers == null) {
	            headers = new Series<Header>(Header.class);
	            cr.getRequestAttributes().put("org.restlet.http.headers", headers);
	        }
	        headers.add("X-Mashape-Key", "MuHO9YFE0Wmsh4aP0jMNAuRzIxyXp1kjjxjjsnYynHLnCGW4Vy");
			
			try {
			
				System.out.println(cr.get().getText());
				
				carta=cr.get(String.class);
				
			
			} catch (Exception re) {
				System.err.println("Error: " + cr.getResponse().getStatus());
			}
			return carta;
		}
			
		
	
}

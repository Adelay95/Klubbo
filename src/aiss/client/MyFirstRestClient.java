package aiss.client;


import java.util.logging.Level;
import java.util.logging.Logger;

import aiss.shared.domain.hs.Cartum;
import aiss.shared.domain.lol.Champion;





import aiss.shared.domain.magic.Card;




import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MyFirstRestClient implements EntryPoint {

	private Button searchButton = new Button("Buscar lol");
	private Button searchButton2 = new Button("Buscar hs");
	private Button searchButton5 = new Button("Buscar magic");
	private Button searchButton4 = new Button("Descripci\u00F3n");
	private Button searchButton3 = new Button("Search all hs cards");
	
	private TextBox searchField = new TextBox();
	private TextBox searchField3 = new TextBox();
	private TextBox searchField4 = new TextBox();
	private TextBox searchField5 = new TextBox();
	private HorizontalPanel searchPanel = new HorizontalPanel();
	private HorizontalPanel searchPanelAllHS = new HorizontalPanel();
	private Label statusLabel = new Label();

	
	private final MashupServiceAsync mashupService = GWT.create(MashupService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		searchField.setText("266");
		searchField3.setText("Ataque");
		searchField4.setText("Salud");
		searchField5.setText("Coste");
		searchPanel.add(searchField);
		searchPanel.add(searchButton);
		searchPanel.add(searchButton2);
		searchPanel.add(searchButton3);
		searchPanel.add(searchButton4);
		searchPanel.add(searchButton5);
		searchPanelAllHS.add(searchField3);
		searchPanelAllHS.add(searchField4);
		searchPanelAllHS.add(searchField5);
		searchPanelAllHS.add(searchButton3);
	
		
		
		searchPanel.add(statusLabel);
	
		// Add panel to the page
		RootPanel.get("form").add(searchPanel);
		RootPanel.get("form").add(searchPanelAllHS);
		
		// Focus the cursor on the name field when the app loads
		searchField.setFocus(true);
		searchField.selectAll();
		searchField3.selectAll();
		searchField4.selectAll();
		searchField5.selectAll();
		
		
		searchButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				statusLabel.setText("Buscando...");
				
				final String champ = searchField.getText();
			    RootPanel.get("lol").clear();
			    //RootPanel.get("musicgraph").clear();


				mashupService.getChampion(champ, new AsyncCallback<Champion>() {
					
					@Override
					public void onSuccess(Champion result) {
						showSummoner(champ, result);
						statusLabel.setText("");
						
					}

					@Override
					public void onFailure(Throwable caught) {
						statusLabel.setText("No encontrado");
						
					}
				});
				

			}
		});
		
	
	
	searchButton2.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			
			statusLabel.setText("Searching...");
			
			final String Carta = searchField.getText();
		    RootPanel.get("lol").clear();
		    //RootPanel.get("musicgraph").clear();


			mashupService.getCarta(Carta, new AsyncCallback<Cartum[]>() {
				
				@Override
				public void onSuccess(Cartum[] result) {
					//showSummoner(Carta, result.getSummoner());
					showCarta(Carta,result[0]);
					statusLabel.setText("");
					
				}

				

				@Override
				public void onFailure(Throwable caught) {
					statusLabel.setText("No encontrado");
					
				}
			});
			

		}
	});
	searchButton3.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			
			statusLabel.setText("Searching...");
			final Integer Ataque;
			final Integer Salud;
			final Integer Coste;
			if(!searchField3.getText().equals("")){
			Ataque = new Integer(searchField3.getText());
			}else{
				Ataque=null;
			}
			if(!searchField4.getText().equals("")){
				Salud = new Integer(searchField4.getText());
				}else{
				Salud=null;
				}
			if(!searchField5.getText().equals("")){
			Coste = new Integer(searchField5.getText());
			}else{
				Coste=null;
			}
		    RootPanel.get("lol").clear();
		    
		    //RootPanel.get("musicgraph").clear();


			mashupService.getTodasLasCartas(Ataque,Coste,Salud, new AsyncCallback<String>() {
				
				@Override
				public void onSuccess(String result) {
					//showSummoner(Carta, result.getSummoner());
					System.out.println(result.toString());					
					showAllCards(Ataque,Salud,Coste,result);
					statusLabel.setText("");
					
				}

				

				@Override
				public void onFailure(Throwable caught) {
					statusLabel.setText("No encontrado");
					
				}
			});
			

		}
	});
	searchButton4.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			String msg="A d\u00EDa de hoy, el mercado de los videojuegos est\u00E1 en expansi\u00F3n,"
					+ " gracias a esta aplicaci\u00F3n, los usuarios podr\u00E1n consultar las "
					+ "estad\u00EDsticas de 3 de los juegos m\u00E1s influyentes de la actualidad: "
					+ "Dota 2, League of Legends y Hearthstone."+ 
"Estas estad\u00EDsticas no se incluyen en el propio juego y si alguien se quiere dedicar a ser "
+ "jugador profesional en un futuro le ser\u00E1 de gran utilidad que objeto o personaje gana m\u00E1s "
+ "partidas, por ejemplo.";
			Window.alert(msg);
		}
	});
	searchButton5.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			
			statusLabel.setText("Buscando...");
			
			final String magic = searchField.getText();
		    RootPanel.get("lol").clear();
			mashupService.getCard(magic, new AsyncCallback<Card>() {
				
				@Override
				public void onSuccess(Card result) {
					showMagic(magic, result);
					statusLabel.setText("");
					
				}

				@Override
				public void onFailure(Throwable caught) {
					statusLabel.setText("No encontrado");
					
				}
			});
			

		}
	});
	
	}
	private void showSummoner(String camp,Champion champ) {
		// TODO Auto-generated method stub
		String output="<fieldset>";
		if (champ != null) {
			output += "<legend>" + champ.getName()+": "+champ.getTitle() + "</legend>";
			output +="<div id=\"img\"><img src=\"http://ddragon.leagueoflegends.com/cdn/img/champion/loading/"
			+champ.getKey()+"_0.jpg\"></div>";
			output +="<div id=\"des\"><table><tr><th>Vida:</th><td>"+champ.getStats().getHp()+" (+"
			+champ.getStats().getHpperlevel()+" por nivel)</td><td></td></tr>";
			output +="<tr><th>Armadura:</th><td>"+champ.getStats().getArmor()+" (+"
			+champ.getStats().getArmorperlevel()+" por nivel)</td><td></td></tr>";
			output +="<tr><th>Resistencia M&aacute;gica:</th><td>"+champ.getStats().getSpellblockperlevel()+" (+"
			+champ.getStats().getSpellblockperlevel()+" por nivel)</td><td></td></tr>";
			output +="<tr><th>Da&ntilde;o de ataque:</th><td>"+champ.getStats().getAttackdamage()+" (+"
			+champ.getStats().getAttackdamageperlevel()+" por nivel)</td><td></td></tr>";
			output +="<tr><th>Velocidad de ataque:</th><td>"+champ.getStats().getAttackspeedoffset()+" (+"
			+champ.getStats().getAttackspeedperlevel()+" por nivel)</td><td></td></tr>";
			output +="<tr><th>Velocidad de movimiento: </th><td>"
			+champ.getStats().getMovespeed()+"</td><td></td></tr>";
			output +="</table></div>";
		}else
        output="<span> No se encuentra el campe&oacute;n "+camp+" </span>";
        output +="</fieldset>";
        HTML lol = new HTML(output);
        RootPanel.get("lol").add(lol);
	}
	
	private void showCarta(String carta, Cartum cartaServ) {
		// TODO Auto-generated method stub
				String output="<fieldset>";
				output += "<legend>" + carta + "</legend>";
		        if (cartaServ != null) {
		        	output+="<table><tr><td>";
		            output+="<img src=\""+cartaServ.getImg()+"\"></img></td><td></td>";
		        	output+="<td><img src=\""+cartaServ.getImgGold()+"\"></img></td></tr></table>";
		        	output+="<br><span><b>Colecci&oacute;n : </b>"+cartaServ.getCardSet()+"</span>";
		        	output+="<br><span><b>Rareza : </b>"+cartaServ.getRarity()+"</span>";
		        	output+="<br><span><b>Artista : </b>"+cartaServ.getArtist()+"</span>";
		        	output+="<br><span><b>Tipo : </b>"+cartaServ.getType()+"</span>";
		        	output+="<br><span><b>Clase :</b>"+cartaServ.getPlayerClass()+"</span>";
		        	
		        }else
		        output="<span> No results </span>";
		        
			
		        output +="</fieldset>";
		        
		        HTML hs = new HTML(output);
		        
		        RootPanel.get("lol").add(hs);
			}		
	
	private void showMagic(String nombre,Card magic) {
		// TODO Auto-generated method stub
		String output="<fieldset>";
		if (magic != null) {
			output += "<legend>" + magic.getName()+"</legend>";
			output +="<div id=\"img\"><img src=\""+magic.getEditions().get(0).getImage_url()+"\"></img></div>";
			output +="<div id=\"des\"><table><tr><th>Colecci&oacute;n :</th><td>"
			+magic.getEditions().get(0).getSet()+"</td><td></td></tr>";
			output +="<tr><th>Rareza:</th><td>"+magic.getEditions().get(0).getRarity()+"</td><td></td></tr>";
			output +="<tr><th>Artista:</th><td>"+magic.getEditions().get(0).getArtist()+"</td><td></td></tr>";
			output +="<tr><th>Rareza:</th><td>"+magic.getEditions().get(0).getSet_id()+"</td><td></td></tr>";
		
		
			output +="</table></div>";
		}else
        output="<span> No se encuentra la carta "+nombre+" </span>";
        
	
        output +="</fieldset>";
        
        HTML m = new HTML(output);
        
        RootPanel.get("lol").add(m);
	}
	
	private void showAllCards(Integer Ataque,Integer Salud,Integer Coste,String result) {
		// TODO Auto-generated method stub
		String outputImg="";
		String outputImgG="";
		String outputRar="";
		String outputArt="";
		String outputType="";
		String outputPlay=null;
				String output="<fieldset>";
				String a=result.replaceAll("\"", "");
				String s=a.substring(1, a.length()-1);
				//s=s.replaceAll("[","");
				String colecciones[]=s.split("],");
				output += "<legend>Todas las cartas";
				if(Ataque!=null){
					output += " con ataque : " + Ataque;
				}
				if(Salud!=null){
					output += " con salud : " + Salud;
				}
				if(Coste!=null){
					output += " con coste : " + Coste;
				}
				output +="</legend>";
				String nombreExpansion;
				for(int i=0;i<colecciones.length;i++){
					if(i==0){nombreExpansion="Set Básico";
					}else if(i==1){nombreExpansion="Set Clásico";
					}else if(i==2){nombreExpansion="Set Créditos";
					}else if(i==3){nombreExpansion="Set Naxxramas";
					}else if(i==4){nombreExpansion="Set Debug";
					}else if(i==5){nombreExpansion="Set GVG";
					}else if(i==6){nombreExpansion="Set Misiones";
					}else if(i==7){nombreExpansion="Set Promoción";
					}else if(i==8){nombreExpansion="Set Recompensa";
					}else if(i==9){nombreExpansion="Set Sistema";
					}else if(i==10){nombreExpansion="Set Montaña Rocanegra";
					}else if(i==11){nombreExpansion="Set Skins de Héroes";
					}else if(i==12){nombreExpansion="Set Taberna";
					}else if(i==13){nombreExpansion="Set Gran Torneo";
					}else if(i==14){nombreExpansion="Set Liga de Exploradores";
					}else if(i==15){nombreExpansion="Set Susurros de los Dioses Antiguos";
					}else{nombreExpansion=null;
					}if(colecciones[i].contains("{")){
						output+="<fieldset><legend>"+nombreExpansion+"</legend>";
						String coleccionFor[]=colecciones[i].split("{cardId:");
						for(int j=1;j<coleccionFor.length;j++){
							String ColeccionForInterna[]=coleccionFor[j].split(",");
							for(int z=0;z<ColeccionForInterna.length;z++){
								if(ColeccionForInterna[z].contains("img:")){
									outputImg=ColeccionForInterna[z].trim().substring(4);
								}
								if(ColeccionForInterna[z].contains("imgGold")){
									outputImgG=ColeccionForInterna[z].trim().substring(8);
								}
								if(ColeccionForInterna[z].contains("rarity")){
									outputRar=ColeccionForInterna[z].trim().substring(7);
								}
								if(ColeccionForInterna[z].contains("artist")){
									outputArt=ColeccionForInterna[z].trim().substring(7);
								}
								if(ColeccionForInterna[z].contains("type")){
									outputType=ColeccionForInterna[z].trim().substring(5);
								}
								if(ColeccionForInterna[z].contains("playerClass")){
									outputPlay=ColeccionForInterna[z].trim().substring(12);
								}
							}output+="<table><tr><td><img src=\""+outputImg+"\"></td><td></td><img src=\""
								+outputImgG+"\"></td></tr>"+ "<tr><td><br><span>Rareza : "
									+outputRar+"</td></tr></span><br><tr><td><span>Artista : "
								+outputArt+"</span></td></tr><br><tr><td><span>Tipo : "
									+outputType+"</span></td></tr>"
											+ "<br><tr><td><span>Clase : "
									+outputPlay+"</span></tr></td></table>";
							outputPlay="";
						}
						output+="</fieldset>";
					}
				}
				System.out.println(result.toString());
				output +="</fieldset>";
		        HTML hs = new HTML(output);
		        RootPanel.get("lol").add(hs);
	}
	
}
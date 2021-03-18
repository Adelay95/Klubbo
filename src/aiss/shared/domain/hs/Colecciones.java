package aiss.shared.domain.hs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Colecciones implements Serializable{


/**
	 * 
	 */
private static final long serialVersionUID = 4603195135122224220L;
private List<Cartum> Basic = new ArrayList<Cartum>();
private List<Cartum> Classic = new ArrayList<Cartum>();
private List<Cartum> Credits = new ArrayList<Cartum>();
private List<Cartum> Naxxramas = new ArrayList<Cartum>();
private List<Cartum> Debug = new ArrayList<Cartum>();
private List<Cartum> GoblinsVsGnomes = new ArrayList<Cartum>();
private List<Cartum> Missions = new ArrayList<Cartum>();
private List<Cartum> Promotion = new ArrayList<Cartum>();
private List<Cartum> Reward = new ArrayList<Cartum>();
private List<Cartum> System = new ArrayList<Cartum>();
private List<Cartum> BlackrockMountain = new ArrayList<Cartum>();
private List<Cartum> HeroSkins = new ArrayList<Cartum>();
private List<Cartum> TavernBrawl = new ArrayList<Cartum>();
private List<Cartum> TheGrandTournament = new ArrayList<Cartum>();
private List<Cartum> TheLeagueOfExplorers = new ArrayList<Cartum>();
private List<Cartum> WhispersOfTheOldGods = new ArrayList<Cartum>();

/**
* 
* @return
* The Basic
*/
public List<Cartum> getBasic() {
return Basic;
}

/**
* 
* @param Basic
* The Basic
*/
public void setBasic(List<Cartum> Basic) {
this.Basic = Basic;
}

/**
* 
* @return
* The Classic
*/
public List<Cartum> getClassic() {
return Classic;
}

/**
* 
* @param Classic
* The Classic
*/
public void setClassic(List<Cartum> Classic) {
this.Classic = Classic;
}

/**
* 
* @return
* The Credits
*/
public List<Cartum> getCredits() {
return Credits;
}

/**
* 
* @param Credits
* The Credits
*/
public void setCredits(List<Cartum> Credits) {
this.Credits = Credits;
}

/**
* 
* @return
* The Naxxramas
*/
public List<Cartum> getNaxxramas() {
return Naxxramas;
}

/**
* 
* @param Naxxramas
* The Naxxramas
*/
public void setNaxxramas(List<Cartum> Naxxramas) {
this.Naxxramas = Naxxramas;
}

/**
* 
* @return
* The Debug
*/
public List<Cartum> getDebug() {
return Debug;
}

/**
* 
* @param Debug
* The Debug
*/
public void setDebug(List<Cartum> Debug) {
this.Debug = Debug;
}

/**
* 
* @return
* The GoblinsVsGnomes
*/
public List<Cartum> getGoblinsVsGnomes() {
return GoblinsVsGnomes;
}

/**
* 
* @param GoblinsVsGnomes
* The Goblins vs Gnomes
*/
public void setGoblinsVsGnomes(List<Cartum> GoblinsVsGnomes) {
this.GoblinsVsGnomes = GoblinsVsGnomes;
}

/**
* 
* @return
* The Missions
*/
public List<Cartum> getMissions() {
return Missions;
}

/**
* 
* @param Missions
* The Missions
*/
public void setMissions(List<Cartum> Missions) {
this.Missions = Missions;
}

/**
* 
* @return
* The Promotion
*/
public List<Cartum> getPromotion() {
return Promotion;
}

/**
* 
* @param Promotion
* The Promotion
*/
public void setPromotion(List<Cartum> Promotion) {
this.Promotion = Promotion;
}

/**
* 
* @return
* The Reward
*/
public List<Cartum> getReward() {
return Reward;
}

/**
* 
* @param Reward
* The Reward
*/
public void setReward(List<Cartum> Reward) {
this.Reward = Reward;
}

/**
* 
* @return
* The System
*/
public List<Cartum> getSystem() {
return System;
}

/**
* 
* @param System
* The System
*/
public void setSystem(List<Cartum> System) {
this.System = System;
}

/**
* 
* @return
* The BlackrockMountain
*/
public List<Cartum> getBlackrockMountain() {
return BlackrockMountain;
}

/**
* 
* @param BlackrockMountain
* The Blackrock Mountain
*/
public void setBlackrockMountain(List<Cartum> BlackrockMountain) {
this.BlackrockMountain = BlackrockMountain;
}

/**
* 
* @return
* The HeroSkins
*/
public List<Cartum> getHeroSkins() {
return HeroSkins;
}

/**
* 
* @param HeroSkins
* The Hero Skins
*/
public void setHeroSkins(List<Cartum> HeroSkins) {
this.HeroSkins = HeroSkins;
}

/**
* 
* @return
* The TavernBrawl
*/
public List<Cartum> getTavernBrawl() {
return TavernBrawl;
}

/**
* 
* @param TavernBrawl
* The Tavern Brawl
*/
public void setTavernBrawl(List<Cartum> TavernBrawl) {
this.TavernBrawl = TavernBrawl;
}

/**
* 
* @return
* The TheGrandTournament
*/
public List<Cartum> getTheGrandTournament() {
return TheGrandTournament;
}

/**
* 
* @param TheGrandTournament
* The The Grand Tournament
*/
public void setTheGrandTournament(List<Cartum> TheGrandTournament) {
this.TheGrandTournament = TheGrandTournament;
}

/**
* 
* @return
* The TheLeagueOfExplorers
*/
public List<Cartum> getTheLeagueOfExplorers() {
return TheLeagueOfExplorers;
}

/**
* 
* @param TheLeagueOfExplorers
* The The League of Explorers
*/
public void setTheLeagueOfExplorers(List<Cartum> TheLeagueOfExplorers) {
this.TheLeagueOfExplorers = TheLeagueOfExplorers;
}

/**
* 
* @return
* The WhispersOfTheOldGods
*/
public List<Cartum> getWhispersOfTheOldGods() {
return WhispersOfTheOldGods;
}

/**
* 
* @param WhispersOfTheOldGods
* The Whispers of the Old Gods
*/
public void setWhispersOfTheOldGods(List<Cartum> WhispersOfTheOldGods) {
this.WhispersOfTheOldGods = WhispersOfTheOldGods;
}

}
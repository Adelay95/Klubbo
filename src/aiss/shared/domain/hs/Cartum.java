package aiss.shared.domain.hs;

import java.io.Serializable;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Cartum implements Serializable{

/**
 ** 
*/
private static final long serialVersionUID = 3337669171117943241L;


private String cardId;
private String name;
private String cardSet;
private String type;
private String faction;
private String rarity;
private Integer cost;
private String text;
private String flavor;
private String artist;
private Boolean collectible;
private String playerClass;
private String img;
private String imgGold;
private String locale;

/**
* 
* @return
* The cardId
*/
public String getCardId() {
return cardId;
}

/**
* 
* @param cardId
* The cardId
*/
public void setCardId(String cardId) {
this.cardId = cardId;
}

/**
* 
* @return
* The name
*/
public String getName() {
return name;
}

/**
* 
* @param name
* The name
*/
public void setName(String name) {
this.name = name;
}

/**
* 
* @return
* The cardSet
*/
public String getCardSet() {
return cardSet;
}

/**
* 
* @param cardSet
* The cardSet
*/
public void setCardSet(String cardSet) {
this.cardSet = cardSet;
}

/**
* 
* @return
* The type
*/
public String getType() {
return type;
}

/**
* 
* @param type
* The type
*/
public void setType(String type) {
this.type = type;
}

/**
* 
* @return
* The faction
*/
public String getFaction() {
return faction;
}

/**
* 
* @param faction
* The faction
*/
public void setFaction(String faction) {
this.faction = faction;
}

/**
* 
* @return
* The rarity
*/
public String getRarity() {
return rarity;
}

/**
* 
* @param rarity
* The rarity
*/
public void setRarity(String rarity) {
this.rarity = rarity;
}

/**
* 
* @return
* The cost
*/
public Integer getCost() {
return cost;
}

/**
* 
* @param cost
* The cost
*/
public void setCost(Integer cost) {
this.cost = cost;
}

/**
* 
* @return
* The text
*/
public String getText() {
return text;
}

/**
* 
* @param text
* The text
*/
public void setText(String text) {
this.text = text;
}

/**
* 
* @return
* The flavor
*/
public String getFlavor() {
return flavor;
}

/**
* 
* @param flavor
* The flavor
*/
public void setFlavor(String flavor) {
this.flavor = flavor;
}

/**
* 
* @return
* The artist
*/
public String getArtist() {
return artist;
}

/**
* 
* @param artist
* The artist
*/
public void setArtist(String artist) {
this.artist = artist;
}

/**
* 
* @return
* The collectible
*/
public Boolean getCollectible() {
return collectible;
}

/**
* 
* @param collectible
* The collectible
*/
public void setCollectible(Boolean collectible) {
this.collectible = collectible;
}

/**
* 
* @return
* The playerClass
*/
public String getPlayerClass() {
return playerClass;
}

/**
* 
* @param playerClass
* The playerClass
*/
public void setPlayerClass(String playerClass) {
this.playerClass = playerClass;
}

/**
* 
* @return
* The img
*/
public String getImg() {
return img;
}

/**
* 
* @param img
* The img
*/
public void setImg(String img) {
this.img = img;
}

/**
* 
* @return
* The imgGold
*/
public String getImgGold() {
return imgGold;
}

/**
* 
* @param imgGold
* The imgGold
*/
public void setImgGold(String imgGold) {
this.imgGold = imgGold;
}

/**
* 
* @return
* The locale
*/
public String getLocale() {
return locale;
}

/**
* 
* @param locale
* The locale
*/
public void setLocale(String locale) {
this.locale = locale;
}

}
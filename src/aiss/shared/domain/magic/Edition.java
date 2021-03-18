package aiss.shared.domain.magic;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Edition implements Serializable{
	private static final long serialVersionUID = 2241573113706562345L;

	private String set;
	private String set_id;
	private String rarity;
	private String artist;
	private Integer multiverse_id;
	private String number;
	private String layout;
	private String image_url;

	/**
	* 
	* @return
	* The set
	*/
	public String getSet() {
	return set;
	}

	/**
	* 
	* @param set
	* The set
	*/
	public void setSet(String set) {
	this.set = set;
	}

	/**
	* 
	* @return
	* The set_id
	*/
	public String getSet_id() {
	return set_id;
	}

	/**
	* 
	* @param set_id
	* The set_id
	*/
	public void setSet_id(String set_id) {
	this.set_id = set_id;
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
	* The multiverse_id
	*/
	public Integer getMultiverse_id() {
	return multiverse_id;
	}

	/**
	* 
	* @param multiverse_id
	* The multiverse_id
	*/
	public void setMultiverse_id(Integer multiverse_id) {
	this.multiverse_id = multiverse_id;
	}

	/**
	* 
	* @return
	* The number
	*/
	public String getNumber() {
	return number;
	}

	/**
	* 
	* @param number
	* The number
	*/
	public void setNumber(String number) {
	this.number = number;
	}

	/**
	* 
	* @return
	* The layout
	*/
	public String getLayout() {
	return layout;
	}

	/**
	* 
	* @param layout
	* The layout
	*/
	public void setLayout(String layout) {
	this.layout = layout;
	}

	/**
	* 
	* @return
	* The image_url
	*/
	public String getImage_url() {
	return image_url;
	}

	/**
	* 
	* @param image_url
	* The image_url
	*/
	public void setImage_url(String image_url) {
	this.image_url = image_url;
	}

	}
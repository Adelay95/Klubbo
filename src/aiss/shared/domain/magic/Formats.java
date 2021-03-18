package aiss.shared.domain.magic;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Formats implements Serializable{
	private static final long serialVersionUID = 22415732106562345L;

private String commander;
private String legacy;
private String modern;
private String vintage;

/**
* 
* @return
* The commander
*/
public String getCommander() {
return commander;
}

/**
* 
* @param commander
* The commander
*/
public void setCommander(String commander) {
this.commander = commander;
}

/**
* 
* @return
* The legacy
*/
public String getLegacy() {
return legacy;
}

/**
* 
* @param legacy
* The legacy
*/
public void setLegacy(String legacy) {
this.legacy = legacy;
}

/**
* 
* @return
* The modern
*/
public String getModern() {
return modern;
}

/**
* 
* @param modern
* The modern
*/
public void setModern(String modern) {
this.modern = modern;
}

/**
* 
* @return
* The vintage
*/
public String getVintage() {
return vintage;
}

/**
* 
* @param vintage
* The vintage
*/
public void setVintage(String vintage) {
this.vintage = vintage;
}

}
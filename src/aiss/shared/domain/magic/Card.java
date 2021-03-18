package aiss.shared.domain.magic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import aiss.shared.domain.magic.Formats;
import aiss.shared.domain.magic.Edition;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Card implements Serializable{
	private static final long serialVersionUID = 5241376113706562345L;

private String name;
private String id;
private Integer cmc;
private String cost;
private String text;
private Formats formats;
private List<Edition> editions = new ArrayList<Edition>();

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
* The id
*/
public String getId() {
return id;
}

/**
* 
* @param id
* The id
*/
public void setId(String id) {
this.id = id;
}

/**
* 
* @return
* The cmc
*/
public Integer getCmc() {
return cmc;
}

/**
* 
* @param cmc
* The cmc
*/
public void setCmc(Integer cmc) {
this.cmc = cmc;
}

/**
* 
* @return
* The cost
*/
public String getCost() {
return cost;
}

/**
* 
* @param cost
* The cost
*/
public void setCost(String cost) {
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
* The formats
*/
public Formats getFormats() {
return formats;
}

/**
* 
* @param formats
* The formats
*/
public void setFormats(Formats formats) {
this.formats = formats;
}

/**
* 
* @return
* The editions
*/
public List<Edition> getEditions() {
return editions;
}

/**
* 
* @param editions
* The editions
*/
public void setEditions(List<Edition> editions) {
this.editions = editions;
}

}
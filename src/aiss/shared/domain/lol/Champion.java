package aiss.shared.domain.lol;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Champion implements Serializable{
	private static final long serialVersionUID = 1252573113706564421L;

private Integer id;
private String key;
private String name;
private String title;
private Stats stats;

/**
* 
* @return
* The id
*/
public Integer getId() {
return id;
}

/**
* 
* @param id
* The id
*/
public void setId(Integer id) {
this.id = id;
}

/**
* 
* @return
* The key
*/
public String getKey() {
return key;
}

/**
* 
* @param key
* The key
*/
public void setKey(String key) {
this.key = key;
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
* The title
*/
public String getTitle() {
return title;
}

/**
* 
* @param title
* The title
*/
public void setTitle(String title) {
this.title = title;
}

/**
* 
* @return
* The stats
*/
public Stats getStats() {
return stats;
}

/**
* 
* @param stats
* The stats
*/
public void setStats(Stats stats) {
this.stats = stats;
}

}
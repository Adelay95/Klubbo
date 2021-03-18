package aiss.shared.domain.lol;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Summoner implements Serializable{
private static final long serialVersionUID = 3301373113706564631L;

private Integer id;
private String name;
private Integer profileIconId;
private Long revisionDate;
private Integer summonerLevel;

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
* The profileIconId
*/
public Integer getProfileIconId() {
return profileIconId;
}

/**
* 
* @param profileIconId
* The profileIconId
*/
public void setProfileIconId(Integer profileIconId) {
this.profileIconId = profileIconId;
}

/**
* 
* @return
* The revisionDate
*/
public Long getRevisionDate() {
return revisionDate;
}

/**
* 
* @param revisionDate
* The revisionDate
*/
public void setRevisionDate(Long revisionDate) {
this.revisionDate = revisionDate;
}

/**
* 
* @return
* The summonerLevel
*/
public Integer getSummonerLevel() {
return summonerLevel;
}

/**
* 
* @param summonerLevel
* The summonerLevel
*/
public void setSummonerLevel(Integer summonerLevel) {
this.summonerLevel = summonerLevel;
}

}
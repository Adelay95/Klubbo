package aiss.shared.domain.lol;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class User implements Serializable{
private static final long serialVersionUID = 2686704549319794401L;
private Summoner summoner;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
/**
* 
* @return
* The summoner
*/
public Summoner getSummoner() {
return summoner;
}

/**
* 
* @param summoner
* The summoner
*/
public void setSummoner(Summoner summoner) {
this.summoner = summoner;
}
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}
}
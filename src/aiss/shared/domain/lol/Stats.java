package aiss.shared.domain.lol;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Stats implements Serializable{
	private static final long serialVersionUID = 1241373113706562345L;

private Double armor;
private Double armorperlevel;
private Double attackdamage;
private Double attackdamageperlevel;
private Integer attackrange;
private Double attackspeedoffset;
private Integer attackspeedperlevel;
private Integer crit;
private Integer critperlevel;
private Double hp;
private Integer hpperlevel;
private Double hpregen;
private Double hpregenperlevel;
private Integer movespeed;
private Double mp;
private Integer mpperlevel;
private Integer mpregen;
private Integer mpregenperlevel;
private Double spellblock;
private Double spellblockperlevel;

/**
* 
* @return
* The armor
*/
public Double getArmor() {
return armor;
}

/**
* 
* @param armor
* The armor
*/
public void setArmor(Double armor) {
this.armor = armor;
}

/**
* 
* @return
* The armorperlevel
*/
public Double getArmorperlevel() {
return armorperlevel;
}

/**
* 
* @param armorperlevel
* The armorperlevel
*/
public void setArmorperlevel(Double armorperlevel) {
this.armorperlevel = armorperlevel;
}

/**
* 
* @return
* The attackdamage
*/
public Double getAttackdamage() {
return attackdamage;
}

/**
* 
* @param attackdamage
* The attackdamage
*/
public void setAttackdamage(Double attackdamage) {
this.attackdamage = attackdamage;
}

/**
* 
* @return
* The attackdamageperlevel
*/
public Double getAttackdamageperlevel() {
return attackdamageperlevel;
}

/**
* 
* @param attackdamageperlevel
* The attackdamageperlevel
*/
public void setAttackdamageperlevel(Double attackdamageperlevel) {
this.attackdamageperlevel = attackdamageperlevel;
}

/**
* 
* @return
* The attackrange
*/
public Integer getAttackrange() {
return attackrange;
}

/**
* 
* @param attackrange
* The attackrange
*/
public void setAttackrange(Integer attackrange) {
this.attackrange = attackrange;
}

/**
* 
* @return
* The attackspeedoffset
*/
public Double getAttackspeedoffset() {
return attackspeedoffset;
}

/**
* 
* @param attackspeedoffset
* The attackspeedoffset
*/
public void setAttackspeedoffset(Double attackspeedoffset) {
this.attackspeedoffset = attackspeedoffset;
}

/**
* 
* @return
* The attackspeedperlevel
*/
public Integer getAttackspeedperlevel() {
return attackspeedperlevel;
}

/**
* 
* @param attackspeedperlevel
* The attackspeedperlevel
*/
public void setAttackspeedperlevel(Integer attackspeedperlevel) {
this.attackspeedperlevel = attackspeedperlevel;
}

/**
* 
* @return
* The crit
*/
public Integer getCrit() {
return crit;
}

/**
* 
* @param crit
* The crit
*/
public void setCrit(Integer crit) {
this.crit = crit;
}

/**
* 
* @return
* The critperlevel
*/
public Integer getCritperlevel() {
return critperlevel;
}

/**
* 
* @param critperlevel
* The critperlevel
*/
public void setCritperlevel(Integer critperlevel) {
this.critperlevel = critperlevel;
}

/**
* 
* @return
* The hp
*/
public Double getHp() {
return hp;
}

/**
* 
* @param hp
* The hp
*/
public void setHp(Double hp) {
this.hp = hp;
}

/**
* 
* @return
* The hpperlevel
*/
public Integer getHpperlevel() {
return hpperlevel;
}

/**
* 
* @param hpperlevel
* The hpperlevel
*/
public void setHpperlevel(Integer hpperlevel) {
this.hpperlevel = hpperlevel;
}

/**
* 
* @return
* The hpregen
*/
public Double getHpregen() {
return hpregen;
}

/**
* 
* @param hpregen
* The hpregen
*/
public void setHpregen(Double hpregen) {
this.hpregen = hpregen;
}

/**
* 
* @return
* The hpregenperlevel
*/
public Double getHpregenperlevel() {
return hpregenperlevel;
}

/**
* 
* @param hpregenperlevel
* The hpregenperlevel
*/
public void setHpregenperlevel(Double hpregenperlevel) {
this.hpregenperlevel = hpregenperlevel;
}

/**
* 
* @return
* The movespeed
*/
public Integer getMovespeed() {
return movespeed;
}

/**
* 
* @param movespeed
* The movespeed
*/
public void setMovespeed(Integer movespeed) {
this.movespeed = movespeed;
}

/**
* 
* @return
* The mp
*/
public Double getMp() {
return mp;
}

/**
* 
* @param mp
* The mp
*/
public void setMp(Double mp) {
this.mp = mp;
}

/**
* 
* @return
* The mpperlevel
*/
public Integer getMpperlevel() {
return mpperlevel;
}

/**
* 
* @param mpperlevel
* The mpperlevel
*/
public void setMpperlevel(Integer mpperlevel) {
this.mpperlevel = mpperlevel;
}

/**
* 
* @return
* The mpregen
*/
public Integer getMpregen() {
return mpregen;
}

/**
* 
* @param mpregen
* The mpregen
*/
public void setMpregen(Integer mpregen) {
this.mpregen = mpregen;
}

/**
* 
* @return
* The mpregenperlevel
*/
public Integer getMpregenperlevel() {
return mpregenperlevel;
}

/**
* 
* @param mpregenperlevel
* The mpregenperlevel
*/
public void setMpregenperlevel(Integer mpregenperlevel) {
this.mpregenperlevel = mpregenperlevel;
}

/**
* 
* @return
* The spellblock
*/
public Double getSpellblock() {
return spellblock;
}

/**
* 
* @param spellblock
* The spellblock
*/
public void setSpellblock(Double spellblock) {
this.spellblock = spellblock;
}

/**
* 
* @return
* The spellblockperlevel
*/
public Double getSpellblockperlevel() {
return spellblockperlevel;
}

/**
* 
* @param spellblockperlevel
* The spellblockperlevel
*/
public void setSpellblockperlevel(Double spellblockperlevel) {
this.spellblockperlevel = spellblockperlevel;
}

}
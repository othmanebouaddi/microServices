package com.mproduits.config;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mes-config")
public class Config {
	
	private int listeProduits;

	public int getListeProduits() {
		return listeProduits;
	}

	public void setListeProduits(int listeProduits) {
		this.listeProduits = listeProduits;
	}
	
	

}


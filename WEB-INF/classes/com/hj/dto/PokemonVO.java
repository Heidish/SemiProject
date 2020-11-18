package com.hj.dto;

public class PokemonVO {
	private String pokemonname;
	private String weight;
	private String height;
	private String Classification;
	private String infomation;
	
	public String getPokemonname() {
		return pokemonname;
	}
	public void setPokemonname(String pokemonname) {
		this.pokemonname = pokemonname;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getClassification() {
		return Classification;
	}
	public void setClassification(String classification) {
		Classification = classification;
	}
	public String getInfomation() {
		return infomation;
	}
	public void setInfomation(String infomation) {
		this.infomation = infomation;
	}
	
}

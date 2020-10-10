package model;

import java.util.Date;
import model.enums.Estado;
import model.enums.Municipio;
import model.enums.Satelite;

public class Imagem {
	
	private Date data;
	//Hora?
	private Satelite satelite;
	private Estado estado;
	private Municipio municipio;
	private double latitude;
	private double longitude;
	
	private int diasSemChuva;
	private double precipitacao;
	private double riscoFogo;
	
	public Imagem(Date data, Satelite satelite, Estado estado, Municipio municipio, double latitude, double longitude,
				  int diasSemChuva, double precipitacao, double riscoFogo) {
		this.data = data;
		this.satelite = satelite;
		this.estado = estado;
		this.municipio = municipio;
		this.latitude = latitude;
		this.longitude = longitude;
		this.diasSemChuva = diasSemChuva;
		this.precipitacao = precipitacao;
		this.riscoFogo = riscoFogo;
	}
	public Imagem() {}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public Satelite getSatelite() {
		return satelite;
	}
	
	public void setSatelite(Satelite satelite) {
		this.satelite = satelite;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public Municipio getMunicipio() {
		return municipio;
	}
	
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public int getDiasSemChuva() {
		return diasSemChuva;
	}
	
	public void setDiasSemChuva(int diasSemChuva) {
		this.diasSemChuva = diasSemChuva;
	}
	
	public double getPrecipitacao() {
		return precipitacao;
	}
	
	public void setPrecipitacao(double precipitacao) {
		this.precipitacao = precipitacao;
	}
	
	public double getRiscoFogo() {
		return riscoFogo;
	}
	
	public void setRiscoFogo(double riscoFogo) {
		this.riscoFogo = riscoFogo;
	}
}

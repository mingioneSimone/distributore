package org.generation.italy;

public class Bevanda {

	
	private Integer codice;
	private String nome;
	private Float prezzo;
	private int quantitàDisponibile;
	
	
	public Bevanda(Integer codice, String nome, Float prezzo) {
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
		quantitàDisponibile=5;
	}
	
	public void eroga()
	{
		if (quantitàDisponibile>0)
			quantitàDisponibile-=1;
	}
	
	public void carica(int quantità)
	{
		if(quantità>0 && quantità<50-quantitàDisponibile)
		quantitàDisponibile+=quantità;
	}

	public Integer getCodice() {
		return codice;
	}

	public void setCodice(Integer codice) {
		if(codice>0 && codice<6)
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(!nome.isEmpty())
		this.nome = nome;
	}

	public Float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Float prezzo) {
		if(prezzo>0 && prezzo<100)
		this.prezzo = prezzo;
	}

	public int getQuantitàDisponibile() {
		return quantitàDisponibile;
	}

	public void setQuantitàDisponibile(int quantitàDisponibile) {
		if(quantitàDisponibile>0 && quantitàDisponibile<50)
		this.quantitàDisponibile = quantitàDisponibile;
		
	}
	
}
package org.generation.italy;

public class Bevanda {
/*Versione 2:

Aggiungere una classe Bevanda con i seguenti attributi:

codice (Integer)
nome (String)
prezzo (float)
quantitàDisponibile (int)
Scrivere per la classe Bevanda un costruttore parametrico con i parametri: codice, nome, prezzo. 
La quantitàDisponibile sarà sempre 5 per tutte le nuove bevande.

Gli attributi di Bevanda sono tutti public (per il momento).

I metodi della classe Bevanda sono:

eroga():   decrementa la quantità disponibile di 1
carica(int quantità): incrementa la quantità disponibile del valore quantità
Nella classe distributore modificare l'hashmap bevande in un HashMap<Integer, Bevande>  (chiave: codice della bevanda; valore: tutto l'oggetto bevanda), e modificare la classe Distributore di conseguenza, gestendo anche la quantità disponibile*/
	
	
	Integer codice;
	String nome;
	Float prezzo;
	int quantitàDisponibile;
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
		quantitàDisponibile+=quantità;
	}
}
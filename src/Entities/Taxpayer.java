package Entities;

import javax.swing.AbstractAction;

public abstract class Taxpayer {
	private String nome;
	private Double anualIncome;

	public Taxpayer() {
	}

	public Taxpayer(String nome, Double anualIncome) {
		this.nome = nome;
		this.anualIncome = anualIncome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public abstract Double tax();

}

package Entities;

public class Individual extends Taxpayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String nome, Double anualIncome, Double healthExpenditures) {
		super(nome, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		if (getAnualIncome() <= 20000) {
			return getAnualIncome() * 0.15;
		} else {
			return (getAnualIncome() * 0.25) - (healthExpenditures * 0.50);

		}

	}

}

package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Company;
import Entities.Individual;
import Entities.Taxpayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Taxpayer> Lista = new ArrayList<>();
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Individual or company (i/c)? :");
			char op = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Anual income:");
			Double AnualIncome = sc.nextDouble();
			if (op == 'i' || op == 'I') {
				System.out.println("Health expenditures:");
				Double Healthexpenditures = sc.nextDouble();
				Taxpayer Pessoa = new Individual(nome, AnualIncome, Healthexpenditures);
				Lista.add(Pessoa);
			} else if (op == 'c' || op == 'C') {
				System.out.print("Number of employees: ");
				int x = sc.nextInt();
				Taxpayer Pessoa = new Company(nome, AnualIncome, n);
				Lista.add(Pessoa);
			}
		}
		double total = 0;

		System.out.println();
		System.out.println("Tax Paid");
		for (Taxpayer lista : Lista) {
			System.out.println("Nome: " + lista.getNome() + "- Taxes: " + String.format("%.2f", lista.tax()));
			total += lista.tax();
		}

		System.out.println("Total Taxes: " + String.format("%.2f", total));

	}

}

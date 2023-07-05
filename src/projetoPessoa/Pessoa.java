package projetoPessoa;

import java.text.DecimalFormat;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void crescer(double cm) {
		this.altura += cm/100; //ajuste das unidades: a altura é espressa em metros e o crescimento em centímetros
	}
	public void emagrecer(double kg) {
		this.peso -= kg;
	}
	public void engordar(double kg) {
		this.peso += kg;
	}
	public void envelhercer(int anos) {
		int idadeAnt = this.idade; //verificar quantos a pessoa deverá crescer
		double cresc = 0.0; //calcular o valor de crescimento da pessoa
		this.idade += anos;
		if (this.idade <= 21) { //todos os anos envelhecidos irão gerar crescimento
			cresc = 0.5 * anos;
		} else if (idadeAnt < 21) { //só os anos envelhecidos até completar 21 anos irão gerar crescimento
			cresc = 0.5 * (21 - idadeAnt);
		}
		this.crescer(cresc);
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00"); //formatar a altura com duas casas decimais
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + df.format(altura) + "]";
	}
	
}

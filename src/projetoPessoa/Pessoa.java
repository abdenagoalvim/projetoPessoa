package projetoPessoa;

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
}

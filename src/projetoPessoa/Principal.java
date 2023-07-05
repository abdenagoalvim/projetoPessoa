package projetoPessoa;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Marcolino", 17);
		p1.setAltura(1.7);
		p1.setPeso(70);
		System.out.println(p1);
		p1.crescer(2);
		System.out.println(p1);
		p1.engordar(5);
		System.out.println(p1);
		p1.emagrecer(3);
		System.out.println(p1);
		p1.envelhercer(2); //envelhece 2 anos e cresce 1cm
		System.out.println(p1);
		p1.envelhercer(4); //envelhece 4 anos e cresce 1cm - só até completar 21 anos
		System.out.println(p1);
		p1.envelhercer(2); //envelhece 2 anos e não cresce - já ultrapassou os 21 anos
		System.out.println(p1);
	}

}

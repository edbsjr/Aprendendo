import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String nome, sobrenome;
		double salario;

		// while (nome != "") {
		System.out.println("Digite o nome do Empregado:");
		nome = input.nextLine();

		System.out.println("Digite o sobrenome do Empregado:");// PRIMEIRO EMPREGADO
		sobrenome = input.nextLine();

		System.out.println("Digite o salario mensal do Empregado:");
		salario = input.nextDouble();

		Empregado primeiroEmpregado = new Empregado(nome, sobrenome, salario);

		input = new Scanner(System.in);

		System.out.println("Digite o nome do Empregado:");
		nome = input.nextLine();

		System.out.println("Digite o sobrenome do Empregado:");// PRIMEIRO EMPREGADO
		sobrenome = input.nextLine();

		System.out.println("Digite o salario anual do Empregado:");
		salario = input.nextDouble();

		Empregado segundoEmpregado = new Empregado(nome, sobrenome, salario);
		
		//IMPRESSOES

		System.out.println(primeiroEmpregado.getNome() + " " + primeiroEmpregado.getSobrenome() + " recebe"
											+ " o salario anual de R$" + primeiroEmpregado.getSalario()*12);
		System.out.println(segundoEmpregado.getNome() + " " + segundoEmpregado.getSobrenome() + " recebe"
											+ " o salario anual de R$" + segundoEmpregado.getSalario()*12);
		// Atualizacao do salario
		
		System.out.println("De quanto sera o aumento(%) do primeiro empregado:");
		double aumento1 = input.nextDouble();
		primeiroEmpregado.setSalario(primeiroEmpregado.getSalario()*(1+(100/aumento1)));
		System.out.println("De quanto sera o aumento(%) do segundo empregado:");
		double aumento2 = input.nextDouble();
		segundoEmpregado.setSalario(segundoEmpregado.getSalario()*(1+(100/aumento2)));
		
		System.out.println(primeiroEmpregado.getNome() + " " + primeiroEmpregado.getSobrenome() + " recebe"
											+ " o salario anual de R$" + primeiroEmpregado.getSalario()*12);
		System.out.println(segundoEmpregado.getNome() + " " + segundoEmpregado.getSobrenome() + " recebe"
											+ " o salario anual de R$" + segundoEmpregado.getSalario()*12);

	}

}

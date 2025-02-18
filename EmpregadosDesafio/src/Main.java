import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String nome, sobrenome;
		double salario;

		//while (nome != "") {
			System.out.println("Digite o nome do Empregado:");
			nome = input.nextLine();
			
			System.out.println("Digite o sobrenome do Empregado:");// PRIMEIRO EMPREGADO
			sobrenome= input.nextLine();
			
			System.out.println("Digite o salario anual do Empregado:");
			salario= input.nextDouble();
			
			Empregado primeiroEmpregado = new Empregado(nome, sobrenome, salario);
			
			
			System.out.println("Digite o nome do Empregado:");
			nome = input.nextLine();
			
			System.out.println("Digite o sobrenome do Empregado:");// PRIMEIRO EMPREGADO
			sobrenome= input.nextLine();
			
			System.out.println("Digite o salario anual do Empregado:");
			salario= input.nextDouble();
			
			Empregado segundoEmpregado = new Empregado(nome, sobrenome, salario);
			
			
			System.out.println(primeiroEmpregado.getNome()+" "+primeiroEmpregado.getSobrenome()+" recebe"
					+ " o salario anual de R$"+primeiroEmpregado.getSalario());
			primeiroEmpregado.aumento();
			System.out.println(primeiroEmpregado.getNome()+" "+primeiroEmpregado.getSobrenome()+" vai receber"
					+ " um aumento de 10% indo paraR$"+primeiroEmpregado.getSalario());
			
			System.out.println(segundoEmpregado.getNome()+" "+segundoEmpregado.getSobrenome()+" recebe"
					+ " o salario anual de R$"+segundoEmpregado.getSalario());
			segundoEmpregado.aumento();
			System.out.println(segundoEmpregado.getNome()+" "+segundoEmpregado.getSobrenome()+" vai receber"
					+ " um aumento de 10% indo paraR$"+segundoEmpregado.getSalario());
		//}

	}

}

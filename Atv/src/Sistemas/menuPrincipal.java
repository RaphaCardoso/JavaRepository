package Sistemas;

import java.util.ArrayList;
import java.util.Scanner;

import Functions.funcoes;
import modeloObt.Person;

public class menuPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		ArrayList <Person> funcionarios = new ArrayList<Person>();	
		
		boolean loop = true;
		
		try {
			
	
		do {
			
			System.out.println("Bem vindo git");
			/*saasfasfd*/
			funcoes.menu();
			int opcao = sc.nextInt();
			
			
			

			
			switch (opcao) {
			case 1:
					
				funcoes.Cadastro(sc, funcionarios);

				break;
			case 2: 
				
				int verification = funcionarios.size();
				
				if (verification == 0) {
						
					System.err.println("Não há nenhum Funcionário na lista!");
					System.out.println("");
					break;
				}
				
				funcoes.Listar(sc, funcionarios);
				
				break;
				
			case 3: 
				
				int tamanho = funcionarios.size();
				
				if (tamanho <= 0) {
					System.err.println("Não há funcionários para modificar");
				}
				
				System.out.println("-----------------------------");
				System.out.println("");
				System.out.println("Perfil do funcionário:");
				System.out.println("");
				System.out.println("-----------------------------");
				
				funcionarios.forEach(Func -> {
					System.out.print("ID: ");
					System.out.println(funcionarios.indexOf(Func));
					System.out.println("");
					System.out.print("nome: ");
					System.out.println(Func.getNome());
					System.out.println("");
					System.out.println("-----------------------------");
					});
				
			System.out.println("Qual Perfil você quer modificar? [ID]  ");
			int id = sc.nextInt();
			
			if (tamanho <= id) {
				System.err.println("Esse Perfil não existe!");
				System.out.println("");
				break;
			}
				
			
			funcoes.Modificar(sc, funcionarios, id);
				
			
				break;
				
			case 4:
				
				int tamanho2 = funcionarios.size();
				
				if (tamanho2 <= 0) {
					System.err.println("Não há funcionários para Deletar");
					break;
				}
				
				System.out.println("-----------------------------");
				System.out.println("");
				System.out.println("Perfil do funcionário:");
				System.out.println("");
				System.out.println("-----------------------------");
				
				funcionarios.forEach(Func -> {
					System.out.print("ID: ");
					System.out.println(funcionarios.indexOf(Func));
					System.out.println("");
					System.out.print("nome: ");
					System.out.println(Func.getNome());
					System.out.println("");
					System.out.println("-----------------------------");
					});
				
			System.out.println("Qual Perfil você quer Deletar? [ID]  ");
			int id1 = sc.nextInt();
			
			if (tamanho2 <= id1) {
				System.err.println("Esse Perfil não existe!");
				System.out.println("");
				break;
			}
				
				
			funcoes.Deletar(sc, funcionarios, id1);
				
			
				
				break;
				
			case 5: 
				
				int verificacao22 = funcionarios.size();
				
				if (verificacao22 == 0) {
						
					System.err.println("Não há nenhum Funcionário na lista!");
					System.out.println("");
					break;
				}
				
				
				System.out.println("-----------------------------");
				System.out.println("");
				System.out.println("Perfil do funcionário:");
				System.out.println("");
				System.out.println("-----------------------------");
				
				funcionarios.forEach(Func -> {
					System.out.print("ID: ");
					System.out.println(funcionarios.indexOf(Func));
					System.out.println("");
					System.out.print("nome: ");
					System.out.println(Func.getNome());
					System.out.println("");
					System.out.println("-----------------------------");
					});
				
			System.out.println("Qual Perfil você quer Visualizar os Detalhes? [ID]  ");
			int id2 = sc.nextInt();
			
			if (verificacao22 <= id2) {
				System.err.println("Esse Perfil não existe!");
				System.out.println("");
				break;
			}
				
			funcoes.Detalhe(sc, funcionarios, id2);
			
				
				break;
				
			case 6:
				
				int verificacao23 = funcionarios.size();
				
				if (verificacao23 == 0) {
						
					System.err.println("Não há nenhum Funcionário na lista!");
					System.out.println("");
					break;
				}
				
				
				System.out.println("-----------------------------");
				System.out.println("");
				System.out.println("Perfil do funcionário:");
				System.out.println("");
				System.out.println("-----------------------------");
				
				funcionarios.forEach(Func -> {
					System.out.println("");
					System.out.print("ID: ");
					System.out.println(funcionarios.indexOf(Func));
					System.out.println("");
					System.out.print("nome: ");
					System.out.println(Func.getNome());
					System.out.println("");
					System.out.println("-----------------------------");
					});
				
			System.out.println("Qual Perfil você quer Calcular? [ID]  ");
			int id3 = sc.nextInt();
			
			if (verificacao23 <= id3) {
				System.err.println("Esse Perfil não existe!");
				System.out.println("");
				break;
			};
			
			
			
			double salarioLiquido =	funcoes.SalarioLiq(sc, funcionarios, id3);
			
			System.out.println(salarioLiquido);
				
				break;
				
			case 9:
				
				break;
			default:
				
				System.out.println("");
				System.err.println("Opção inválida!");
				System.out.println("------------------------");
				
				break;
			}
			
			
			

		} while (loop == true);
		
		
		} catch (Exception e) {
			
		System.err.println("Processo inválido");
			System.exit(0);
		}
		
		
		sc.close();
	}

	
}

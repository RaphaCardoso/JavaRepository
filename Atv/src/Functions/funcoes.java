package Functions;

import java.util.ArrayList;
import java.util.Scanner;



import modeloObt.Person;

public class funcoes {

	static public void menu () {
		System.out.println("-----------------------------");
		System.out.println("");
		System.out.println("Bem vindo - Sistema RH");
		System.out.println("");
		System.out.println("-----------------------------");
		System.out.println("1 - Criar Funcionário");
		System.out.println("2 - Listar Funcionários");
		System.out.println("3 - Modificar Perfis de Funcionários");
		System.out.println("4 - Deletar Perfil do Funcionário");
		System.out.println("5 - Detalhes de Perfil");
		System.out.println("6 - Cálcular Salário Liquído");
		System.out.println("9 - Sair");
		System.out.println("");
		System.out.println("------------------------------");
	}
	
	static public void Cadastro(Scanner sc, ArrayList<Person> funcionarios) {
		
		Person funcionarioNew = new Person (null, 0, 0, true, true, true, null);
		sc.nextLine();
		
		try {
			
		
		
		
		System.out.println("Nome: ");
		String name = sc.nextLine();

		double salarioBruto = 0;
		
		try {
		do {
		System.out.println("Salário Bruto: ");
		salarioBruto = sc.nextDouble();
		
		if(salarioBruto <= 0) {
			System.out.println("");
			System.err.println("Salário inválido! digite novamente");
			System.out.println("");	
			}
		} while (salarioBruto <= 0);
		
		} catch (Exception e) {
			System.err.println("Salário inválido!");
			System.exit(0);
		}
		sc.nextLine();
		
		int dependente = 0;
		boolean validacao4 = true;
			
			
		System.out.println("Número de Dependentes: ");
			
		do {

			dependente = sc.nextInt();
			
		if (dependente < 0) {
			System.err.println("Opção inválida! Digite Novamente");
			System.out.println("");
		} else {
			validacao4 = false;
		}
		
		
		} while (validacao4 == true);
		
		

		
		
		
		sc.nextLine();
		boolean Vr = false;
		boolean verificador3 = false;
		
		
		do {
			System.out.println("VR: S/N");
			String newVR = sc.next();
			
			if (newVR.equalsIgnoreCase("S")) {
				Vr = true;
				verificador3 = true;
			} else if (newVR.equalsIgnoreCase("N")) {
				
				Vr = false;
				verificador3 = true;
			} else {
				System.out.println("");
				System.err.println("Opção inválida!");
				System.out.println("");
				
			}
			
		} while(verificador3 == false);
		
		sc.nextLine();

		
		boolean va = false;
		boolean verificador2 = false;
		
		do {
			
			System.out.println("VA: S/N" ); 
			String beneficioVA = sc.next();
			
			if(beneficioVA.equalsIgnoreCase("s")) {
			
			va = true;
			verificador2 = true;
					
			} else if (beneficioVA.equalsIgnoreCase("n")) {
				verificador2 = true;
			} else {
				System.out.println("");
				System.err.println("Opção inválida!");
				System.out.println("");
				
			}
			
		} while (verificador2 == false);
				
		sc.nextLine();
		
		boolean vt = false;
		boolean verificador1 = false;
		
		do {
			
			System.out.println("");
			System.out.println("Funcionário terá direito à Vale Transporte? S/N");
			String beneficioVT = sc.next();
			
			if(beneficioVT.equalsIgnoreCase("s")) {
			
			vt = true;
			verificador1 = true;
					
			} else if (beneficioVT.equalsIgnoreCase("n")) {
				verificador1 = true;
			} else {
				System.out.println("");
				System.err.println("Opção inválida!");
				System.out.println("");
				
			}
			
		} while (verificador1 == false);
		
		
		
		sc.nextLine();
		

		boolean verificador = true;
		String saude = "";
		
		do {
			System.out.println("");
			System.out.println("Funcionário terá direito à Plano de Saúde? S/N");
			String beneficioPS = sc.next();
			
			if(beneficioPS.equalsIgnoreCase("s")) {
				try {
					System.out.println("Plano de Saúde: ");
					System.out.println("[1] Básico [2] Premium [3] Platinum Premium Plus");
					int Newsaude = sc.nextInt();
					
					if(Newsaude == 1) {
						saude = "Básico ";
						verificador = false;
					}else if (Newsaude == 2) {
						saude = "Premium ";
						verificador = false;
					} else if(Newsaude == 3) {
						saude = "Platinum Premium Plus ";
						verificador = false;
					} else {
						System.out.println("");
						System.err.println("Opção inválida!");
						System.out.println("");
						
					}
					
				} catch (Exception e) {
					System.out.println("");
					System.err.println("Opção inválida! Escreva um número");
					System.out.println("");
				}
			} else if (beneficioPS.equalsIgnoreCase("n")) {
				saude = "Sem Plano";
				verificador = false;
			} else {
				System.out.println("");
				System.err.println("Opção inválida! Escreva uma das opções corretamente!");
				System.out.println("");
			}
			
			
		} while (verificador == true);
		

		
		
		funcionarioNew.setNome(name);
		funcionarioNew.setSalarioBruto(salarioBruto);
		funcionarioNew.setNumeroDependentes(dependente);
		funcionarioNew.setVa(va);
		funcionarioNew.setVr(Vr);
		funcionarioNew.setVt(vt);
		funcionarioNew.setPlanoDeSaude(saude);
		funcionarios.add(funcionarioNew);
		
		} catch (Exception e) {
			System.err.println("Erro no Sistema");
			System.exit(0);
		}
		
		
	}
		
	static public void Listar (Scanner sc, ArrayList<Person> funcionarios) {
		
		
		System.out.println("-----------------------------");
		System.out.println("");
		System.out.println("Lista de funcionários:");
		System.out.println("");
		System.out.println("-----------------------------");
		
		funcionarios.forEach(Func -> {
			System.out.print("ID: ");
			System.out.println(funcionarios.indexOf(Func));
			System.out.println("");
			System.out.print("nome: ");
			System.out.println(Func.getNome());
			System.out.print("Salário Bruto: ");
			System.out.println(Func.getSalarioBruto());
			System.out.println("");
			System.out.println("-----------------------------");
		});
	}
	
	static public void Modificar (Scanner sc, ArrayList<Person> funcionarios, int id) {

	
	boolean loops = true;
	
	do {
		
		System.out.println("");
		System.out.println("Modificar: ");
		System.out.println("");
		System.out.println("1 - Nome");
		System.out.println("2 - Dependentes");
		System.out.println("3 - Salário Bruto");
		System.out.println("4 - VA");
		System.out.println("5 - VT");
		System.out.println("6 - VR");
		System.out.println("7 - Plano Saúde");
		System.out.println("");
		
		int update = 0;
						
		 update = sc.nextInt();

		switch (update) {

		case 1:
			
		System.out.println("Nome Atual: " );
		System.out.println(funcionarios.get(id).getNome());
		System.out.println(""); 
		System.out.println("Novo nome: " );	
		String newName = sc.next();
		funcionarios.get(id).setNome(newName);
			
		System.out.println("Concluído com Sucesso!");
			break;
			
			
		case 2:	
			
			System.out.println("Dependentes Atual: " );
			System.out.println(funcionarios.get(id).getNumeroDependentes());
			System.out.println(""); 
			System.out.println("Novo n° de Dependentes: " );
			
			int newDependentes = 0;		
			boolean validacao41 = true;
			
			do {

				newDependentes = sc.nextInt();
				
			if (newDependentes < 0) {
				System.err.println("Opção inválida! Digite Novamente");
				System.out.println("");
			} else {
				validacao41 = false;
			}
			
			} while (validacao41 == true);
				
			
			funcionarios.get(id).setNumeroDependentes(newDependentes);
				
			System.out.println("Concluído com Sucesso!");
			
			break;	
			
			
		case 3:
			
			System.out.println("Salário Atual: " );
			System.out.println(funcionarios.get(id).getSalarioBruto());
			System.out.println(""); 
			System.out.println("Novo Salário: " );
			
			double newSalario = sc.nextDouble();
			
			try {
			do {
				newSalario = sc.nextDouble();
			
			if(newSalario <= 0) {
				System.out.println("");
				System.err.println("Salário inválido! digite novamente");
				System.out.println("");	
				}
			} while (newSalario <= 0);
			
			} catch (Exception e) {
				System.err.println("Salário inválido!");
				System.exit(0);
			}
			
			funcionarios.get(id).setSalarioBruto(newSalario);
				
			System.out.println("Concluído com Sucesso!");
			
			break;
			
		case 4:
			
			System.out.println("VA Atual: " );
			System.out.println(funcionarios.get(id).isVa());
			System.out.println(""); 
			System.out.println("Novo VA: " );
			
			boolean Va = false;
			boolean verificador2 = false;
			
			do {	
				System.out.println("VA: S/N" ); 
				String newVA1 = sc.next();
				
				if(newVA1.equalsIgnoreCase("s")) {
				
				Va = true;
				verificador2 = true;
						
				} else if (newVA1.equalsIgnoreCase("n")) {
					verificador2 = true;
				} else {
					System.out.println("");
					System.err.println("Opção inválida!");
					System.out.println("");
					
				}
				
			} while (verificador2 == false);

			
			funcionarios.get(id).setVa(Va);
				
			System.out.println("Concluído com Sucesso!");
			
			
			break;

			
		case 5:
			
			System.out.println("VT Atual: " );
			System.out.println(funcionarios.get(id).isVt());
			System.out.println(""); 
			System.out.println("Novo VT: " ); 
			System.out.println("[S] Aceito [N] Não Aceito"); 

			String beneficioVT = "";
			boolean Vt1 = false;
			boolean verificador10 = false;
			
			do {

				beneficioVT = sc.next();
				
				if(beneficioVT.equalsIgnoreCase("s")) {
				
					Vt1  = true;
				verificador10 = true;
						
				} else if (beneficioVT.equalsIgnoreCase("n")) {
					verificador10 = true;
				} else {
					System.out.println("");
					System.err.println("Opção inválida!");
					System.out.println("");
					
				}
				
			} while (verificador10 == false);
			
			
			
			funcionarios.get(id).setVt(Vt1);
				
			System.out.println("Concluído com Sucesso!");
			
			break;
			
		case 6:
			
			System.out.println("VR Atual: " );
			System.out.println(funcionarios.get(id).isVr());
			System.out.println(""); 
			System.out.println("Novo VR: " );
			System.out.println("[S] Aceito [N] Não Aceito"); 
			
			boolean Vr1 = false;
			boolean verificador20 = false;
			
			do {	
				String newVr1 = sc.next();
				
				if(newVr1.equalsIgnoreCase("s")) {
				
				Va = true;
				verificador20 = true;
						
				} else if (newVr1.equalsIgnoreCase("n")) {
					verificador20 = true;
				} else {
					System.out.println("");
					System.err.println("Opção inválida!");
					System.out.println("");
					
				}
				
			} while (verificador20 == false);
			
			
			funcionarios.get(id).setVr(Vr1);
				
			System.out.println("Concluído com Sucesso!");
			
			break;
			
			
		case 7:
			
			System.out.println("Plano de Saúde Atual: " );
			System.out.println(funcionarios.get(id).getPlanoDeSaude());
			System.out.println(""); 
			boolean verificador = true;
			String resposta = "";
			
			do {
				System.out.println("");
				System.out.println("Funcionário terá direito à Plano de Saúde? S/N");
				String beneficioPS = sc.next();
				
				if(beneficioPS.equalsIgnoreCase("s")) {
					try {
						System.out.println("Plano de Saúde: ");
						System.out.println("[1] Básico [2] Premium [3] Platinum Premium Plus");
						int Newsaude = sc.nextInt();
						
						if(Newsaude == 1) {
							resposta = "Básico ";
							verificador = false;
						}else if (Newsaude == 2) {
							resposta = "Premium ";
							verificador = false;
						} else if(Newsaude == 3) {
							resposta = "Platinum Premium Plus ";
							verificador = false;
						} else {
							System.out.println("");
							System.err.println("Opção inválida!");
							System.out.println("");
							
						}
						
					} catch (Exception e) {
						System.out.println("");
						System.err.println("Opção inválida! Escreva um número");
						System.out.println("");
					}
				} else if (beneficioPS.equalsIgnoreCase("n")) {
					resposta = "Sem Plano";
					verificador = false;
				} else {
					System.out.println("");
					System.err.println("Opção inválida! Escreva uma das opções corretamente!");
					System.out.println("");
				}
				
				
			} while (verificador == true);
			
			
			
			funcionarios.get(id).setPlanoDeSaude(resposta);
			
			break;
			
		default: 
			
			System.err.println("Opção inválida!");
			System.out.println("");	
			
			break;
			
		}
		
		System.out.println("------------------------");
		System.out.println("Deseja fazer mais alterações?");
		System.out.println("[1] Sim [2] Não");
		System.out.println("------------------------");
		
		int escolha = sc.nextInt();
		
		if (escolha == 1) {
			continue;
		} else if (escolha == 2) {
			loops = false;
		} else {
			System.out.println("");
			System.err.println("Opção inválida!");
			System.out.println("------------------------");
		}
		
	} while (loops == true);
	
		
		
	}


	public static void Deletar(Scanner sc, ArrayList<Person> funcionarios, int id1) {
		// TODO Auto-generated method stub
		
		 funcionarios.remove(id1);
		 
		System.out.println("Deletado com Sucesso");
		
	}


	public static void Detalhe (Scanner sc, ArrayList<Person> funcionarios, int id2) {
	
			
			System.out.print("ID: ");
			System.out.println(id2);
			System.out.println("");
			System.out.print("nome: ");
			System.out.println(funcionarios.get(id2).getNome());
			System.out.print("Salário Bruto: ");
			System.out.println(funcionarios.get(id2).getSalarioBruto());
			System.out.println("");
			System.out.println("-----------------------------");
			System.out.print("Dependentes: ");
			System.out.println(funcionarios.get(id2).getNumeroDependentes());
			System.out.print("Plano de Saúde: ");
			System.out.println(funcionarios.get(id2).getPlanoDeSaude());
			System.out.print("VR: ");
			System.out.println(funcionarios.get(id2).isVr());
			System.out.print("VA: ");
			System.out.println(funcionarios.get(id2).isVa());
			System.out.print("VT: ");
			System.out.println(funcionarios.get(id2).isVt());
			
	}
		
	
	public static double SalarioLiq (Scanner sc, ArrayList<Person> funcionarios, int id3) {
			
		double porcentagem = 0;
		double inss = 0.11;
		double irrf = 0.15;
		int valorDependente = 0;
		int gastoSaude = 0;
		
	double	Salario = funcionarios.get(id3).getSalarioBruto();
	boolean beneficioVr = funcionarios.get(id3).isVr();
	boolean beneficioVa = funcionarios.get(id3).isVa();
	boolean beneficioVt = funcionarios.get(id3).isVt();
	int nDependentes = funcionarios.get(id3).getNumeroDependentes();
	String beneficioPlano = funcionarios.get(id3).getPlanoDeSaude();

	
	if (beneficioVr == true) {
		porcentagem += 0.03;
	}
	
	if (beneficioVa == true) {
		porcentagem += 0.05;
	}
	

	if (beneficioVt == true) {
		porcentagem += 0.06;
	}
	
	if (nDependentes > 0) {
		valorDependente = nDependentes * 50;
	}
	
	if(beneficioPlano.equalsIgnoreCase("Sem Plano")) {
		System.out.println(" ");
	} else if (beneficioPlano.equalsIgnoreCase("Básico")) {
		gastoSaude = 100;
	} else if (beneficioPlano.equalsIgnoreCase("Premium")) {
		gastoSaude = 250;
	} else if (beneficioPlano.equalsIgnoreCase("Platinum Premium Plus")) {
		gastoSaude = 500;
	} else {
		gastoSaude = 0;
	}
	
	Salario = Salario + valorDependente;
	
	porcentagem = inss + irrf + porcentagem;
	
	Salario = Salario - (Salario * porcentagem);
	
	Salario = Salario - gastoSaude;
	

	
	return Salario;
	}
	
}






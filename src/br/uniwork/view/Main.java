package br.uniwork.view;
/**
 * Classe de teste para a l�gica das classes.
 * @author mateus-cabral
 * @version 1.0
 * @deprecated
 */

import java.util.ArrayList;
import java.util.Scanner;

import br.uniwork.controller.SistemaLogin;
import br.uniwork.model.Candidato;
import br.uniwork.model.Conta;
import br.uniwork.model.Curriculo;
import br.uniwork.model.Empresa;
import br.uniwork.model.Habilidade;
import br.uniwork.model.VagaEmprego;


public class Main {
	public static void main(String[] args) {
		SistemaLogin loginS = new SistemaLogin();
		Scanner input = new Scanner(System.in);
		int opcao;
		boolean sair = true;
		int id = 5;
		int idP = 5;
		
		//Cria��o de habilidades provis�rias para uso no curr�culo e proposta
		Habilidade pInter = new Habilidade(1, "Python intermedi�rio", "Habilidade de utilizar a linguagem Python em um n�vel intermedi�rio", "Linguagens de programa��o");
		Habilidade pAvan = new Habilidade(2, "Python avan�ado", "Habilidade de utilizar a linguagem Python em um n�vel avan�ado", "Linguagens de programa��o");
		Habilidade js = new Habilidade(3, "JavaScript iniciante", "Conhecimento b�sico da linguagem JavaScript", "Linguagens de programa��o");
		Habilidade bd = new Habilidade(4, "SQL iniciante", "Conhecimento b�sico de banco de dados relacional", "Banco de dados");
		ArrayList<Habilidade> hb = new ArrayList<Habilidade>();
		hb.add(pInter);
		hb.add(pAvan);
		hb.add(js);
		hb.add(bd);
		
		//Cria��o de vagas provis�rias para acesso do candidato
		ArrayList<Integer> sk = new ArrayList<Integer>();
		sk.add(pInter.getId());
		sk.add(js.getId());
		sk.add(bd.getId());
		
		VagaEmprego p1 = new VagaEmprego(1, 1, "Desenvolvedor Jr.", "Desenvolvimento de sites e portais internos da empresa", 2500, "Coca", sk);
		VagaEmprego p2 = new VagaEmprego(2, 2, "Cientista de Dados", "Administra��o e an�lise dos dados da empresa", 2500, "IBM", sk);
		VagaEmprego p3 = new VagaEmprego(3, 3, "Analista Jr.", "An�lista de requisitos dos projetos da empresa", 2500, "Loreal", sk);
		VagaEmprego p4 = new VagaEmprego(4, 4, "Desenvolvedor Sr.", "Desenvolvimento de sites e portais internos da empresa", 5500, "Samsung", sk);
		
		//Instanciando listas para armazenar as contas criadas
		ArrayList<Candidato> c = new ArrayList<Candidato>();
		ArrayList<Curriculo> cv = new ArrayList<Curriculo>();
		ArrayList<Empresa> e = new ArrayList<Empresa>();		
		ArrayList<VagaEmprego> pe = new ArrayList<VagaEmprego>();
		pe.add(p1);
		pe.add(p2);
		pe.add(p3);
		pe.add(p4);
		
		while(sair) {
			System.out.println("----UNIWORK----");
			System.out.println("Op��es: \n1.Registrar \n2.Fazer Login \n3.Sair");
			opcao = input.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Bem vindo a area de cadastro! \n1.Para candidatos \n2.Para empresas");
				opcao = input.nextInt();
				switch(opcao) {
				case 1:
					System.out.println("Vamos come�ar o processo de cadastro! \nDigite seu nome: ");
					String nome = input.next();
					
					System.out.println("Digite seu email: ");
					String email = input.next();
					
					System.out.println("Digite sua idade: ");
					int idade = input.nextInt();
					
					System.out.println("Digite seu celular: ");
					String celular = input.next();
					
					System.out.println("Digite seu CPF: ");
					String cpf = input.next();
					
					System.out.println("Pronto! Seus dados pessoais foram armazenados, por favor digite o login desejado:");
					String login = input.next();
					System.out.println("Agora digite a senha desejada: ");
					String pwd = input.next();
					
//					Candidato cc = new Candidato(nome, id, login, pwd, email, celular, idade, cpf, cpf);
					id += 1;
//					c.add(cc);
					break;
				case 2:
					System.out.println("Vamos come�ar o processo de cadastro! \nDigite o nome da Empresa: ");
					String nomeE = input.next();
					
					System.out.println("Digite o email empresarial: ");
					String emailE = input.next();
					
					
					System.out.println("Digite o celular para contato: ");
					String celularE = input.next();
					
					System.out.println("Digite o CNPJ da empresa: ");
					String cnpj = input.next();
					
					System.out.println("Pronto! Seus dados pessoais foram armazenados, por favor digite o login desejado:");
					String loginE = input.next();
					System.out.println("Agora digite a senha desejada: ");
					String pwdE = input.next();
					
//					Empresa ee = new Empresa(nomeE, id, loginE, pwdE, emailE, celularE, cnpj);
					id += 1;
//					e.add(ee);
					System.out.println();
					break;
				default:
					System.out.println("Op��o inv�lida...");
				}
				
				break;
				
			case 2:
				//login
				boolean v = false;
				System.out.println("1. �rea candidato \n2. �rea empresa");
				opcao = input.nextInt();
				
				switch(opcao) {
				case 1:
					System.out.println("Por favor, digite o login cadastrado: ");
					String l = input.next();
					//Checa para ver se o login � v�lido
					for(Candidato i : c) {
						if(i.getLogin().equals(l)) {
							v = true;
							if(v) {
								loginS.setLogin(i.getLogin());
								loginS.setPwd(i.getPwd());
							}
						}
						loginS.setId(i.getId());
					}
					if(v) {
						System.out.println("Agora digite sua senha: ");
						String s = input.next();
						if(loginS.getPwd().equals(s)) {
							loginS.login(l, s);
						}
						if(!loginS.isStatus()) {
							System.out.println("Senha inv�lida, tente novamente.");
						}
					}	else {
						System.out.println("Login n�o encontrado em nosso sistema.");
					}
					
					while(loginS.isStatus()) {
						System.out.println("1.Criar curr�culo \n2.Ver curr�culo \n3.Procurar vagas \n4.Op��es de conta \n5.Sair");
						int o = input.nextInt();
						switch(o) {
						case 1:
							Curriculo cvv = new Curriculo(loginS.getId());
							System.out.println("Vamos criar seu curr�culo!");
							
							for(Habilidade h : hb) {
								System.out.println(h.getId() + " " + h.getNome());
								System.out.println(h.getDescricao());
							}
							
							System.out.println("Digite o n�mero das habilidades que voc� possui (0 caso nenhuma se aplique)");

							int skill = input.nextInt();
							while(true) {
								if(skill == 0) {
									break;
								}	else {
									cvv.addHabilidade(skill);
								}
								System.out.println("Deseja continuar? s/S para sim e n/N para n�o");
								String o2 = input.next();
								if(o2.equals("n") || o2.equals("N")) {
									break;
								}
								System.out.println("Digite o n�mero da pr�xima habilidade: ");
								skill = input.nextInt();
							}
							
							cv.add(cvv);
							break;
						case 2:
							//Procura pelo curr�culo correto e mostra suas skills
							for(Curriculo i : cv) {
								if(i.getId() == loginS.getId()) {
									for(Habilidade h: hb) {
										for(int i2 : i.getHabilidades()) {
											if(h.getId() == i2) {
												System.out.println("Nome: " + h.getNome() + "\nDescri��o: " + h.getDescricao());
											}
										}
									}
								}
							}
							break;
						case 3:
							for(VagaEmprego pp : pe) {
								System.out.println(pp.getIdProposta() + " Cargo: " + pp.getNomeCargo() + "\nDescri��o: " + pp.getDescritivo());
								for(int i: pp.getIdCandidatos()) {
									if(i == loginS.getId()) {
										System.out.println("Status: Inscrito");
									}	else {
										System.out.println("Status: N�o cadastrado");
									}
								}
							}
							System.out.println("Digite o n�mero de alguma das vagas para se inscrever (0 para voltar)");
							opcao = input.nextInt();
							if(opcao == 0) {
								break;
							} else {
								pe.get(opcao - 1).candidatar(loginS.getId());
							}
							break;
						case 4:
							System.out.println("1.Resetar a senha \n2.Alterar a senha\n3.Ver dados da conta");
							int o2 = input.nextInt();
							switch(o2) {
							case 1:
								//Procura pelo candidato dentro da lista
								for(Candidato i : c) {
									if(i.getId() == loginS.getId()) {
										i.resetSenha();
										System.out.println("A senha foi alterada para 'Padrao'.");
									}
								}
								break;
							case 2:
								for(Candidato i : c) {
									if(i.getId() == loginS.getId()) {
										System.out.println("Digite nova senha:");
										String nPwd = input.next();
										i.alterarSenha(nPwd);
									}
								}
								break;
							case 3:
								for(Candidato i: c) {
									if(i.getId() == loginS.getId()) {
										System.out.println(i.toString());
									}
								}
								break;
							default:
								System.out.println("Op��o inv�lida");
								break;
							}
							break;
						case 5:
							loginS.logout();
							break;
						default:
							System.out.println("Op��o inv�lida.");
							break;
						}
					}
					break;
				case 2:
					v = false;
					System.out.println("Por favor, digite o login cadastrado: ");
					String l2 = input.next();
					//Checa para ver se o login � v�lido
					for(Empresa i2 : e) {
						if(i2.getLogin().equals(l2)) {
							v = true;
							if(v) {
								loginS.setLogin(i2.getLogin());
								loginS.setPwd(i2.getPwd());
							}
						}
						loginS.setId(i2.getId());
					}
					if(v) {
						System.out.println("Agora digite sua senha: ");
						String s = input.next();
						if(loginS.getPwd().equals(s)) {
							loginS.login(l2, s);
						}
						if(!loginS.isStatus()) {
							System.out.println("Senha inv�lida, tente novamente.");
						}
					}	else {
						System.out.println("Login n�o encontrado em nosso sistema.");
					}
					
					if(loginS.isStatus()) {
						while(loginS.isStatus()) {
							System.out.println("1.Adicionar vagas \n2.Op��es da conta \n3.Sair");
							opcao = input.nextInt();
							switch(opcao) {
							case 1:
								System.out.println("Digite o nome do cargo: ");
								String nomeP = input.next();
								System.out.println("Descreva as op��es necess�rias para a vaga: ");
								String descritivo = input.next();
								System.out.println("Digite o sal�rio: ");
								double sal = input.nextDouble();
								System.out.println("Digite o endere�o do trabalho: ");
								String local = input.next();
								
								//Coletando as habilidades desejadas em um array
								ArrayList<Integer> hd = new ArrayList<Integer>();
								for(Habilidade h : hb) {
									System.out.println(h.getId() + " " + h.getNome());
									System.out.println(h.getDescricao());
								}
								System.out.println("Digite o n�mero da(s) habilidades necess�rias (0 para caso nenhuma se encaixe): ");
								int skill = input.nextInt();
								
								while(true) {
									if(skill == 0) {
										break;
									}	else {
										hd.add(skill);
									}
									System.out.println("Deseja continuar? s/S para sim e n/N para n�o");
									String o = input.next();
									if(o.equals("n") || o.equals("N")) {
										break;
									}
									System.out.println("Digite o n�mero da pr�xima habilidade: ");
									skill = input.nextInt();
								}
								
								VagaEmprego p = new VagaEmprego(idP, loginS.getId(), nomeP, descritivo, sal, local, hd);
								pe.add(p);
								idP += 1;
								break;
							case 2:
								System.out.println("1.Resetar a senha \n2.Alterar a senha\n3.Ver dados da conta");
								int o2 = input.nextInt();
								switch(o2) {
								case 1:
									//Procura pelo candidato dentro da lista
									for(Empresa i : e) {
										if(i.getId() == loginS.getId()) {
											i.resetSenha();
											System.out.println("A senha foi alterada para 'Padrao'.");
										}
									}
									break;
								case 2:
									for(Empresa i : e) {
										if(i.getId() == loginS.getId()) {
											System.out.println("Digite nova senha:");
											String nPwd = input.next();
											i.alterarSenha(nPwd);
										}
									}
									break;
								case 3:
									for(Empresa i: e) {
										if(i.getId() == loginS.getId()) {
											System.out.println(i.toString());
										}
									}
									break;
								default:
									System.out.println("Op��o inv�lida");
									break;
								}
								break;
							case 3:
								loginS.logout();
								break;						
							default:
								System.out.println("Op��o inv�lida");

							}
						}
					}
					break;
				default:
					System.out.println("Op��o inv�lida, tente novamente...");
				}
				break;
			case 3:
				sair = false;
				input.close();
				break;
			default:
				System.out.println("Op��o inv�lida, digite novamente");
			
			}
		}
		System.out.println("Sess�o finalizada, obrigado pelo seu tempo!");
	}
}
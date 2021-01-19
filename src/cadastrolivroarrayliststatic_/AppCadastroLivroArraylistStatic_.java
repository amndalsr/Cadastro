package cadastrolivroarrayliststatic_;
import java.util.Scanner;
public class AppCadastroLivroArraylistStatic_ {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        String titulo, autor, genero;
        CadastroLivro objLivro;
        double preco;
        double pInicial, pFinal;
        int menu;
        
        do{
            exibirMenu();
            menu = in.nextInt();
                    in.nextLine();
            
            switch (menu){
                case 1:
                    System.out.println("Informe o título do livro: ");
                    titulo = in.nextLine();
                                
                    System.out.println("Informe o nome do autor: ");
                    autor = in.nextLine();
                                
                    System.out.println("Informe o gênero do livro: ");
                    genero = in.nextLine();
                                
                    System.out.println("Informe o preço: ");
                    preco = in.nextDouble();
                                in.nextLine();
                    
                    objLivro = new CadastroLivro(titulo, autor, genero, preco);
                    Controle.adicionar(objLivro);
                    
                    break;
                    
                case 2:
                    System.out.println(Controle.listar() + "\n");
                    break;
                    
                case 3:
                    System.out.println("Informe o gênero que deseja: ");
                    genero = in.nextLine();
                               
                    System.out.println("Há: " + Controle.pesquisarGenero(genero)+ " livro(s) do gênero " + genero);
                    break;
                  
                case 4:
                    System.out.println("Informe a faixa de preço que você deseja: ");
                    pInicial = in.nextDouble();
                                in.nextLine();
                    pFinal = in.nextDouble();
                                in.nextLine();
                    System.out.print("Há " + Controle.pesquisarPreco (pInicial, pFinal) + " livro(s) com preço entre " + String.format("R$ %.2f e R$ %.2f", pInicial, pFinal));                                
                    break;
                    
                case 5: 
                    System.out.println("Informe o título do livro para exclusão: ");
                    titulo = in.nextLine();
                                
                    
                    if(! (Controle.getListaLivros().isEmpty())){
                        if(Controle.remover(titulo)){
                            System.out.println("Livro Removido!");
                        } else {
                            System.out.println("Livro não encontrado!");
                        } 
                    } else {
                        System.out.println("Estoque vazio!");
                    }
                    break;
                    
                case 6:
                    
                    break;
                    
                case 7:
                    System.out.println("Encerrando...");
                    
                    break;
                    
                    
                default:
                    System.out.println("Opção inválida!");
                
            }            
                    
            
            
        }while (menu != 7);
       
    }
        
    public static void exibirMenu(){ // cadastrar, exibir, aualizar, e remover.
        
        System.out.println("......CADASTRO DE LIVROS......");
        System.out.println("Cadastrar - 1");
        System.out.println("Listar- 2");
        System.out.println("Consultar por gênero - 3");
        System.out.println("Consultar por preço - 4");
        System.out.println("Remover um livro - 5");
        System.out.println("Atualizar - 6 ");
        System.out.println("SAIR - 7");
        System.out.println("Digite sua opção: ");
    }
}

package cadastrolivroarrayliststatic_;
import java.util.ArrayList;

public class Controle {
    private static ArrayList<CadastroLivro> ListaLivros = new ArrayList<> ();

    public static ArrayList<CadastroLivro> getListaLivros() {
        return ListaLivros;
    }
    
    public static void adicionar (CadastroLivro l){
        ListaLivros.add(l);
    }
    
    public static String listar(){
        String saida  = "";
        int i = 1;
        for (CadastroLivro l : ListaLivros){
            saida += "\n----LIVRO " + (i++) + "----\n";
            saida += l.imprimir() + "\n";
        }
        return saida;
    }
    public static int pesquisarGenero (String genero){ 
        int qtd = 0;
        for (CadastroLivro l : ListaLivros){
            if(l.getGenero().equalsIgnoreCase(genero)){
                qtd++;
            }
        }
        return qtd;


    }   
    
    public static int pesquisarPreco (double pInicial, double pFinal){
        int qtd = 0;
        for (CadastroLivro l : ListaLivros) {
            if(l.getPreco() >= pInicial && l.getPreco() <= pFinal){
              
            }
        }
        return qtd++;
    }
    
    public static boolean remover (String titulo){
        for (CadastroLivro l : ListaLivros){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                ListaLivros.remove(l);
                return true;
            }
        }
        return false;
    }
    
}

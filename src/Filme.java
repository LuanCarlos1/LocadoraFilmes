import java.util.ArrayList;
import java.util.Scanner;

public class Filme {

    String nome;
    String status;
    static int quantidadeFilmesAlugados;

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Filme> listaFilmes = new ArrayList<>();

    public Filme(String nome, String status) {
        this.nome = nome;
        this.status = status;
    }

    static public void adicionarFilme(Filme filme) {
        listaFilmes.add(filme);
    }

    static public void informacaoFilmes() {
        int cont = 1;
        System.out.println("=================================================");
        for (Filme filme : listaFilmes){
            System.out.print(cont + " - Filme: " + filme.nome);
            System.out.println(" - Status: " + filme.status);
            System.out.println("================================================= ");
            cont++;
        }
            System.out.println("Quantidade de filmes alugados: " + quantidadeFilmesAlugados);
            System.out.println("================================================= ");
    }

    static public void alugarFilme() {
        System.out.println("Digite o número do filme que deseja alugar:");
        int numFilme = sc.nextInt();
        if (numFilme > listaFilmes.size()){
            System.out.println("Numéro inválido!");
            alugarFilme();
        }else {
            String status = listaFilmes.get(numFilme-1).status;
            String filme = listaFilmes.get(numFilme-1).nome;
            if (status.equals("Devolver")) {
                System.out.println("O filme " + filme + " já está alugado!");
                System.out.println("Deseja devolver o filme? 1 - SIM / 2 - NÃO");
                int devolver = sc.nextInt();
                if (devolver == 1) {
                    listaFilmes.get(numFilme-1).status = "Alugar";
                    quantidadeFilmesAlugados--;
                }
            } else {
                listaFilmes.get(numFilme-1).status = "Devolver";
                quantidadeFilmesAlugados++;
            }
            System.out.println("Desejar alugar outro filme? 1 - SIM / 2 - NÃO");
            int continuar = sc.nextInt();
            if (continuar == 1){
                alugarFilme();
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Filme filme1 = new Filme("Jogos Vorazes", "Alugar");
        Filme filme2 = new Filme("Táxi", "Alugar");
        Filme filme3 = new Filme("João e Maria", "Alugar");
        Filme filme4 = new Filme("Velozes e Furiosos", "Alugar");

        Filme.adicionarFilme(filme1);
        Filme.adicionarFilme(filme2);
        Filme.adicionarFilme(filme3);
        Filme.adicionarFilme(filme4);

        Filme.informacaoFilmes();
        Filme.alugarFilme();
        Filme.informacaoFilmes();

    }
}
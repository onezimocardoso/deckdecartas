package arrayemetodos;

public class Teste {

    public static void exibirCartas (DeckDeCartas m){
        for(int i = 0 ; i<52 ; i++){
            System.out.printf("%s, ",m.distribuirCarta().descricao());

            if((i+1)%4 == 0)
                System.out.println();
        }
    }

    public static void main(String[] args) {
        DeckDeCartas meudeck = new DeckDeCartas();

        // Exibição das cartas em ordem
        exibirCartas(meudeck);

        //Exibição das cartas embaralhadas

        meudeck.embaralharCartas();
        System.out.println("CARTAS EMBARALHADAS:");
        exibirCartas(meudeck);

    }

}

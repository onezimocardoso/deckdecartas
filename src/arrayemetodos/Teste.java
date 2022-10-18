package arrayemetodos;

public class Teste {
    public static void main(String[] args) {
        DeckDeCartas meudeck = new DeckDeCartas();

        for(int i = 0 ; i<52 ; i++){
            System.out.printf("%s, ",meudeck.distribuirCarta().descricao());

            if(i%4 == 0)
                System.out.println();
        }
    }

}

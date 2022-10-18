package arrayemetodos;

import java.security.SecureRandom;

public class DeckDeCartas {

    private Carta[] deck;
    private int indiceCarta;
    private static final int NUMERO_DE_CARTAS = 52;

    //gerador de números aleatórios
    private static final SecureRandom numerosAleatorios = new SecureRandom();

    //construtor

    public DeckDeCartas() {
        String[] faces = {"As", "Dois", "Tres",
                "Quatro", "Cinco", "Seis", "Sete",
                "Oito", "Nove", "Dez", "Valete",
                "Dama", "Rei"};
        String[] naipes = {"Copas", "Ouro",
                "Espada", "Paus"};

        deck = new Carta[NUMERO_DE_CARTAS];
        indiceCarta = 0;

        //preeche o baralho com as cartas
        for (int i = 0; i < deck.length; i++)
            deck[i] = new Carta(faces[i % 13], naipes[i / 13]);

    }
        //distribui as cartas

        public Carta distribuirCarta () {

            if (indiceCarta < deck.length)
                return deck[indiceCarta++];
            else
                return null;
        }
}


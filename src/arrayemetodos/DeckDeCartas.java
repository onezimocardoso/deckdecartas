package arrayemetodos;

import java.security.SecureRandom;

public class DeckDeCartas {


    protected int indiceCarta;
    protected static final int NUMERO_DE_CARTAS = 52;

    protected Carta[] deck = new Carta[NUMERO_DE_CARTAS];

    //gerador de números aleatórios
    protected static final SecureRandom numerosAleatorios = new SecureRandom();

    //construtor

    public DeckDeCartas() {
        //String[] faces = new String[13];
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

    public void embaralharCartas(){

        indiceCarta = 0;

        for(int i=0; i < deck.length ; i++){

            //cria um número aleatório entre 0 e 51
            int proximoIndice = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
            Carta temp = deck[i];
            deck[i]=deck[proximoIndice];
            deck[proximoIndice]=temp;
        }



    }
}


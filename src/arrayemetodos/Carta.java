package arrayemetodos;

public class Carta {
    private final String face;
    private final String naipe;

    public Carta(String face, String naipe){
        this.face=face;
        this.naipe=naipe;
    }

    public String descricao(){
        return face + " de " + naipe;
    }
}

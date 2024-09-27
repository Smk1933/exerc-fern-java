package LivroNinja;

public class Main {
    public static void main(String[] args) {

        NinjaAvancado na1 = new NinjaAvancado("Rock Lee", 18, "soco na cara", "Portões", TipoHabilidade.TAIJUTSU);

        na1.executarHabilidade();
        na1.mostrarinformacoesa();

    }
}

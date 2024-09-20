package Ternarios;

public class Main {
    public static void main(String[] args) {

        // variavel = (condição) ? valorSeVerdadeira : valorSeFalso;

        int idade = 19;
        int missoes = 20;

        String feedback = (idade >= 18 && missoes >= 20) ? "Pronto pra matar o sasuke" : "Vai treinar";

        System.out.println(feedback);
    }
}

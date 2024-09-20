package DesafioCadNinj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Escolha um dos 4 ninjas secretos");

        String[] cadastroNinja = new String[4];
        cadastroNinja[0] = "Orochimaru";
        cadastroNinja[1] = "Deidara";
        cadastroNinja[2] = "Rock Lee";
        cadastroNinja[3] = "Kakashi";

        Scanner scanner = new Scanner(System.in);
        int escolhaOpcao = scanner.nextInt();


        switch (escolhaOpcao) {
            case 1:
                System.out.println("Você escolheu Orochimaru, O maior pnc de todos");
                break;
            case 2:
                System.out.println("Você escolheu o Deidara, O maior psicopata de todos");
                break;
            case 3:
                System.out.println("Você escolheu o Rock Lee, O maior resiliente de todos");
                break;
            case 4:
                System.out.println("Voce escolheu Kakashi, O maior copiador de todos");
                break;
            default:
                System.out.println("Escolheu errado, otário");
                break;
        }

        if (escolhaOpcao == 1) {
            System.out.println("Pessima escolha");
        } else if (escolhaOpcao == 2) {
            System.out.println("Dedo pobre pra escolher ninja pqp");
        } else if (escolhaOpcao == 3) {
            System.out.println("Excelente escolha, bora treinar");
        } else if (escolhaOpcao == 4) {
            System.out.println("Tu gosta de um tarado ne kkkkkk");
        } else {
            System.out.println("Fez merda, volta tudo ");
        }

    }


    }


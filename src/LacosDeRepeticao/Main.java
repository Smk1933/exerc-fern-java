package LacosDeRepeticao;

public class Main {
    public static void main(String[] args) {


 // fori --> gera automaticamente a estrutura do for
// Usando o laço for para treinar habilidades de drible 5 vezes
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Treinamento de drible número: " + i);
                }


// Usando o laço do-while para simular o controle de energia durante o treino
                int energia = 100;
                do {
                    System.out.println("Controlando a energia, energia restante: " + energia);
                    energia -= 20; // Reduzindo a energia em 20 a cada iteração
                } while (energia > 0);


                System.out.println("Treinamento concluído. A energia foi completamente utilizada.");


           int soco = 0;

         while (soco <= 10) {
            System.out.println("Toma soco na cara " + soco + " vez");
            soco++;
        }
         int chute = 100;

         do {
            System.out.println("Chute na cara numero " + chute);
            chute -= 10;
        } while (chute > 0);
    }
        }


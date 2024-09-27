    package LivroNinja;

    public class NinjaAvancado implements Ninja {

        public String name;
        public int age;
        public String ability;
        public String specialty;
        public TipoHabilidade tipoHabilidade;

        public NinjaAvancado() {
        }

        public NinjaAvancado(String name, int age, String ability, String specialty, TipoHabilidade tipoHabilidade) {
            this.name = name;
            this.age = age;
            this.ability = ability;
            this.specialty = specialty;
            this.tipoHabilidade = tipoHabilidade;
        }

        @Override
        public void mostrarinformacoesa() {
            System.out.println("O ninja " + name + " tem " + age + " anos e possui a habilidade " + ability + " especializado em " + specialty + " e tipo de habilidade " + tipoHabilidade);

        }

        @Override
        public void executarHabilidade() {
            System.out.println(name + " usou seu " + ability);

        }

    }
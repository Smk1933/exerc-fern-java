package TesteAula;

public class Engenheiro extends Pessoa{

    public Engenheiro() {
    }

    public Engenheiro(String name, int age, String cpf) {
        super();
    }

    public Engenheiro(String name, int age, String cpf, boolean vivoOuMorto) {
        super(name, age, cpf, vivoOuMorto);
    }

    @Override
    public void capinarLote() {

    }
}

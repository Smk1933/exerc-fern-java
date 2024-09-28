package TesteAula;

public abstract class Pessoa {

    String name;
    int age;
    String cpf;
    boolean vivoOuMorto;

    public Pessoa() {
    }

    public Pessoa(String name, int age, String cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    public Pessoa(String name, int age, String cpf, boolean vivoOuMorto) {
        this(name, age, cpf);
        this.vivoOuMorto = vivoOuMorto;   //SOBRECARGA DE METODOS
    }

    public abstract void capinarLote(); // metodo abstract deixa obrigatorio a implementação nas classes filhos
}

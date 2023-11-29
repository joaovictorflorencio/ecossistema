package Projeto;

class Mamifero extends Animal {
    public Mamifero(String nome, Especie especie) {
        super(nome, especie);
    }

    public void amamentar() {
        System.out.println(nome + " é um mamífero e está amamentando seus filhotes.");
    }
}

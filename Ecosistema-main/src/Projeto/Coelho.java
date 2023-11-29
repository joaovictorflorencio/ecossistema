package Projeto;

class Coelho extends Animal {
    public Coelho(String nome) {
        super(nome, Especie.COELHO);
    }

    @Override
    public void movimentar() {
        System.out.println(nome + " se move como um coelho.");
    }
}

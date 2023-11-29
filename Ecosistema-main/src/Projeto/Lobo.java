package Projeto;
class Lobo extends Animal {
    public Lobo(String nome) {
        super(nome, Especie.LOBO);
    }

    @Override
    public void movimentar() {
        System.out.println(nome + " se move como um lobo.");
    }
}

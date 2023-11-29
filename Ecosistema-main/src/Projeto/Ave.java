package Projeto;

class Ave extends Animal {
    public Ave(String nome, Especie especie) {
        super(nome, especie);
    }

    public void voar() {
        System.out.println(nome + " é uma ave e pode voar.");
    }
}

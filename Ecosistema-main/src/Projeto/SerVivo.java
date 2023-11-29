// Coloque aqui tudo relacionado a SerVivo
package Projeto;
class SerVivo {
    protected String nome;
    protected int idade;

    public SerVivo(String nome) {
        this.nome = nome;
        this.idade = 0;
    }

    public void envelhecer() {
        idade++;
    }

    @Override
    public String toString() {
        return "Eu sou um ser vivo chamado " + nome + " com " + idade + " anos de idade.";
    }
}

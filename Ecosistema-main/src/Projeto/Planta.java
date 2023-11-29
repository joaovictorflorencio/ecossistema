// Coloque aqui tudo relacionado a Planta
package Projeto;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class Planta extends SerVivo {
    protected String tipo;
    protected List<Animal> polinizadores;

    public Planta(String nome, String tipo) {
        super(nome);
        this.tipo = tipo;
        this.polinizadores = new ArrayList<>();
    }

    public void adicionarPolinizador(Animal animal) {
        polinizadores.add(animal);
    }

    public void crescer() {
        System.out.println(nome + " é uma planta do tipo " + tipo + " e está crescendo.");
    }

    public void polinizar() {
        if (!polinizadores.isEmpty()) {
            Random rand = new Random();
            int index = rand.nextInt(polinizadores.size());
            Animal polinizador = polinizadores.get(index);
            System.out.println(polinizador.nome + " polinizou " + nome + " (" + tipo + ").");
        } else {
            System.out.println(nome + " não foi polinizada, pois não há polinizadores por perto.");
        }
    }
}

class Arvore extends Planta {
    public Arvore(String nome, String tipo) {
        super(nome, tipo);
    }

    public void darFrutos() {
        System.out.println(nome + " é uma árvore e está dando frutos.");
    }
}

class Arbusto extends Planta {
    public Arbusto(String nome, String tipo) {
        super(nome, tipo);
    }

    public void florescer() {
        System.out.println(nome + " é um arbusto e está florescendo.");
    }
}

package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


enum Especie {
    LOBO, COELHO, URSO, AGUIA
}

class Animal extends SerVivo {
    protected Especie especie;
    protected List<SerVivo> presas;

    public Animal(String nome, Especie especie) {
        super(nome);
        this.especie = especie;
        this.presas = new ArrayList<>();
    }

    public void adicionarPresa(SerVivo presa) {
        presas.add(presa);
    }

    public void movimentar() {
        System.out.println(nome + " se move de forma genérica.");
    }

    public void comer() {
        if (!presas.isEmpty()) {
            Random rand = new Random();
            int index = rand.nextInt(presas.size());
            SerVivo presa = presas.get(index);
            System.out.println(nome + " comeu " + presa.nome + " (" + presa.getClass().getSimpleName() + ").");
            presas.remove(presa);
        } else {
            System.out.println(nome + " não encontrou nenhuma presa para comer.");
        }
    }

    public void reproduzir() {
        System.out.println(nome + " está se reproduzindo.");
    }
}

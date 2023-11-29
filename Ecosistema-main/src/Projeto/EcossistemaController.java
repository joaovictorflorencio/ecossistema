package Projeto;

import java.util.ArrayList;
import java.util.List;

class EcossistemaController {
    private List<SerVivo> seresVivos;

    public EcossistemaController() {
        seresVivos = new ArrayList<>();
    }

    public void adicionarSerVivo(SerVivo serVivo) {
        seresVivos.add(serVivo);
    }

    public void simularAno() {
        System.out.println("---- Novo Ano no Ecossistema ----");
        for (SerVivo serVivo : new ArrayList<>(seresVivos)) {
            serVivo.envelhecer();
            System.out.println(serVivo);
            if (serVivo instanceof Animal) {
                Animal animal = (Animal) serVivo;
                animal.movimentar();
                animal.comer();
                animal.reproduzir();
                if (animal instanceof Mamifero) {
                    ((Mamifero) animal).amamentar();
                } else if (animal instanceof Ave) {
                    ((Ave) animal).voar();
                }
            } else if (serVivo instanceof Planta) {
                Planta planta = (Planta) serVivo;
                planta.crescer();
                planta.polinizar();
                if (planta instanceof Arvore) {
                    ((Arvore) planta).darFrutos();
                } else if (planta instanceof Arbusto) {
                    ((Arbusto) planta).florescer();
                }
            }
        }
    }

    public boolean temAnimais() {
        return !seresVivos.isEmpty() && seresVivos.stream().anyMatch(serVivo -> serVivo instanceof Animal);
    }
}

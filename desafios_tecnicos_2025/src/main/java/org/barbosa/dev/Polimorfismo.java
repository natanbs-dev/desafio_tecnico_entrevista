package org.barbosa.dev;

class Animal {
    void emitirSom() {
        System.out.println("O animal emite um som.");
    }
}


class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("O cachorro late.");
    }
}

class Gato extends Animal {
    @Override
    void emitirSom() {
        System.out.println("O gato mia.");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        // Polimorfismo em ação
        Animal meuAnimal;

        meuAnimal = new Cachorro();
        meuAnimal.emitirSom();

        meuAnimal = new Gato();
        meuAnimal.emitirSom();
    }
}

//Explicação do Exemplo
//
//Classe Base (Animal):
//Define o comportamento padrão emitirSom().
//
//Classes Filhas (Cachorro e Gato):
//Sobrescrevem o método emitirSom() para implementar sons específicos.
//
//Polimorfismo em Ação:
//Na classe principal, a variável meuAnimal é do tipo Animal, mas pode referenciar objetos de qualquer classe que herde de Animal.
//O método chamado em tempo de execução é aquele correspondente ao tipo real do objeto (Cachorro ou Gato).
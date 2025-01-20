# objeto_classe

## Classe

A classe é um **modelo ou estrutura** que define os atributos e comportamentos comuns de objetos do mesmo tipo. Em outras palavras, ela é como uma planta baixa para criar objetos. Uma classe contém:

- **Atributos (ou campos)**: Variáveis que representam o estado do objeto.
- **Métodos**: Funções que definem os comportamentos ou operações que os objetos dessa classe podem executar.
  
Exemplo:

```java
class Carro {
    String modelo;
    int ano;

    void ligar() {
        System.out.println("O carro está ligado.");
    }
}
```

## Objeto

Um objeto é uma **instância concreta de uma classe**. Quando você cria um objeto, você está criando uma instância de uma classe, com um estado específico, baseado na estrutura definida pela classe. O objeto possui:

- Seus próprios valores para os atributos definidos na classe.
- A capacidade de executar métodos da classe.

Exemplo de criação de objeto:

```java
Carro meuCarro = new Carro();
meuCarro.modelo = "Fusca";
meuCarro.ano = 1978;
meuCarro.ligar();
```

### Resumo

- **Classe** é a definição abstrata ou blueprint, enquanto **objeto** é a instância concreta que existe em memória, baseada nessa definição.
- **Classe** define o estado e os comportamentos; **objeto** armazena o estado específico e pode executar os comportamentos.

Ambos são conceitos-chave para entender a modelagem de dados e a organização do código em Java.


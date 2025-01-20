### Pergunta 1: O que é Polimorfismo?

**Polimorfismo** é um dos pilares da programação orientada a objetos e permite que um objeto de uma classe seja tratado como um objeto de uma classe base, mas com comportamentos específicos da classe derivada. Existem dois tipos principais de polimorfismo:

1. **Polimorfismo de Sobrecarga (Compile-time)**: Refere-se à criação de múltiplos métodos com o mesmo nome, mas com parâmetros diferentes (assinaturas distintas).

2. **Polimorfismo de Sobrescrita (Runtime)**: Permite que um método da classe base seja substituído por uma implementação diferente em uma classe filha. Isso é útil para garantir que o comportamento de um método seja ajustado conforme o tipo real do objeto.

Em resumo, o polimorfismo oferece flexibilidade, permitindo que métodos ou classes compartilhem a mesma interface, mas se comportem de maneira diferente dependendo do contexto.

---

### Pergunta 2: Qual a diferença entre Classe e Objeto?

- **Classe**: É uma estrutura ou **modelo** que define as propriedades e comportamentos de um tipo de objeto. Ela serve como um **blueprint** e não ocupa memória até ser instanciada. A classe especifica quais atributos e métodos um objeto desse tipo terá.

- **Objeto**: É uma **instância concreta** de uma classe. Ao criar um objeto, você está reservando memória e permitindo que ele tenha valores específicos para os atributos definidos pela classe. Em outras palavras, um objeto é uma versão concreta de uma classe, com um estado individual e capaz de executar os métodos definidos pela classe.

Por exemplo, se você tem uma classe `Carro`, ela define as características (atributos) como `modelo` e `ano`, e métodos como `ligar()`. Quando cria um objeto `meuCarro` dessa classe, você tem uma instância específica com valores para `modelo` e `ano` e pode chamar o método `ligar()` para esse objeto.

---

### Pergunta 3: Explique de maneira geral o que é o SOLID e os seus conceitos

**SOLID** é um conjunto de princípios de design de software que visa tornar o código mais modular, fácil de entender, manter e estender. Ele foi popularizado por Robert C. Martin e é um acrônimo para cinco princípios fundamentais:

1. **S - Single Responsibility Principle (SRP)**:
    - Cada classe deve ter **uma única responsabilidade**. Isso significa que uma classe deve ter apenas um motivo para mudar, o que melhora a coesão e facilita a manutenção.

2. **O - Open/Closed Principle (OCP)**:
    - As classes devem ser **abertas para extensão** mas **fechadas para modificação**. Ou seja, você deve ser capaz de adicionar novas funcionalidades sem alterar o código existente, usando a herança ou composição, o que facilita a evolução do sistema.

3. **L - Liskov Substitution Principle (LSP)**:
    - Os objetos de uma classe derivada devem ser substituíveis por objetos da classe base sem alterar a corretude do programa. Isso garante que a herança seja usada de forma apropriada e que o comportamento de uma classe filha seja compatível com a classe pai.

4. **I - Interface Segregation Principle (ISP)**:
    - **Clientes não devem ser forçados a depender de interfaces que não utilizam**. Ou seja, em vez de ter interfaces grandes e genéricas, é melhor dividir as interfaces em partes menores e mais específicas, de modo que os clientes implementem apenas as partes de que realmente necessitam.

5. **D - Dependency Inversion Principle (DIP)**:
    - As classes de alto nível não devem depender das classes de baixo nível; ambas devem depender de abstrações. Além disso, as abstrações não devem depender de detalhes, mas os detalhes devem depender das abstrações. Isso favorece a inversão de dependências, melhorando a flexibilidade e testabilidade do código.

### Resumo do SOLID:
- **SRP**: Cada classe tem uma única razão para mudar.
- **OCP**: Modifique o sistema com extensões, não com modificações diretas.
- **LSP**: Classes derivadas devem ser substituíveis por suas classes base.
- **ISP**: Interfaces pequenas e específicas para não forçar implementações desnecessárias.
- **DIP**: Dependa de abstrações, não de implementações concretas.

Esses princípios tornam o design de sistemas mais modular e resiliente a mudanças, facilitando a escalabilidade e a manutenção de sistemas grandes e complexos.

---
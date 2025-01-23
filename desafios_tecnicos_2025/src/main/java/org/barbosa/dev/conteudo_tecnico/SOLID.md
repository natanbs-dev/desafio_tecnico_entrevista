### Conceito de SOLID para Entrevista

**O que é SOLID?**

O SOLID é um conjunto de **cinco princípios fundamentais da programação orientada a objetos** que ajudam a criar sistemas mais bem estruturados, modulares, fáceis de manter e escaláveis. Esses princípios foram introduzidos por Robert C. Martin (também conhecido como Uncle Bob) e são amplamente utilizados para orientar boas práticas no design de software.

Cada princípio do SOLID aborda um aspecto específico de como o código deve ser projetado para facilitar alterações, reduzir o acoplamento e melhorar a reutilização. A seguir, uma explicação clara e prática de cada princípio, no contexto de uma entrevista:

---

#### **S - Single Responsibility Principle (SRP)**
"Uma classe deve ter **uma única responsabilidade** e apenas **um motivo para mudar**."

- **O que significa?**
  Cada classe deve ser responsável por uma única parte da funcionalidade do sistema, e essa responsabilidade deve estar bem definida.

- **Por que é importante?**
  Isso aumenta a coesão do código e facilita a manutenção. Se uma classe tem muitas responsabilidades, qualquer alteração em uma funcionalidade pode impactar outras de forma imprevisível.

- **Exemplo prático:**
    - Errado: Uma classe `RelatorioService` que gere relatórios e também envie e-mails.
    - Certo: Uma classe `RelatorioService` para gerar relatórios e outra classe `EmailService` para envio de e-mails.

---

#### **O - Open/Closed Principle (OCP)**
"Uma classe deve estar **aberta para extensão**, mas **fechada para modificação**."

- **O que significa?**
  Você deve ser capaz de adicionar novas funcionalidades ao sistema sem modificar o código existente, usando herança ou composição.

- **Por que é importante?**
  Reduz o risco de introduzir bugs ao modificar código existente e facilita a adição de novas funcionalidades.

- **Exemplo prático:**
    - Um sistema de pagamento que inicialmente só suporta cartão de crédito. Em vez de modificar a classe original para incluir boleto, criamos uma nova classe implementando a mesma interface.

---

#### **L - Liskov Substitution Principle (LSP)**
"Objetos de uma classe derivada devem poder substituir objetos da classe base sem alterar o comportamento esperado do sistema."

- **O que significa?**
  Uma subclasse deve ser capaz de ser usada no lugar de sua superclasse sem quebrar o sistema. Isso garante que a herança seja usada corretamente.

- **Por que é importante?**
  Evita surpresas no comportamento ao substituir classes, melhorando a previsibilidade e robustez do código.

- **Exemplo prático:**
    - Errado: Uma subclasse que sobrescreve métodos da classe base de forma que eles violam o contrato original.
    - Certo: Uma subclasse `Quadrado` que herda de `Retangulo` e respeita a lógica de comprimento e largura, sem alterar o comportamento esperado.

---

#### **I - Interface Segregation Principle (ISP)**
"Os clientes não devem ser forçados a depender de interfaces que não utilizam."

- **O que significa?**
  É melhor criar interfaces menores e mais específicas do que ter uma interface única e abrangente com métodos desnecessários para alguns clientes.

- **Por que é importante?**
  Facilita a implementação de interfaces e evita a criação de métodos que não fazem sentido para determinadas classes.

- **Exemplo prático:**
    - Errado: Uma interface `Impressora` com métodos `imprimir` e `digitalizar`, mas uma classe `ImpressoraSomenteImpressao` implementa ambos, mesmo que só imprima.
    - Certo: Separar as interfaces em `Impressora` e `Digitalizadora`.

---

#### **D - Dependency Inversion Principle (DIP)**
"Dependa de abstrações, não de implementações."

- **O que significa?**
  Classes de alto nível não devem depender de classes de baixo nível; ambas devem depender de abstrações (interfaces ou classes abstratas).

- **Por que é importante?**
  Torna o código mais flexível e fácil de testar, permitindo que dependências sejam trocadas sem impacto significativo.

- **Exemplo prático:**
    - Errado: Uma classe `PedidoService` que depende diretamente de uma classe concreta `EmailService`.
    - Certo: A `PedidoService` depende de uma interface `Notificador`, que pode ter implementações diferentes (`EmailNotificador`, `SMSNotificador`, etc.).

---

### Resumo do SOLID

- **S (SRP)**: Cada classe deve ter uma única responsabilidade bem definida.
- **O (OCP)**: Adicione funcionalidades sem modificar código existente.
- **L (LSP)**: Subclasses devem ser substituíveis por suas superclasses sem alterar o comportamento.
- **I (ISP)**: Prefira interfaces pequenas e específicas em vez de uma interface genérica.
- **D (DIP)**: Dependa de abstrações, não de implementações concretas.

---

### Como aplicar na prática?

Explique que, em projetos reais, você aplica SOLID para reduzir o acoplamento, criar sistemas mais modulares e facilitar a manutenção e a escalabilidade do código. Por exemplo, ao projetar um sistema de e-commerce, você pode usar interfaces para meios de pagamento, aplicar SRP para separar responsabilidades em serviços distintos e usar DIP para permitir fácil troca de implementações.

Dessa forma, o SOLID se torna um guia essencial para entregar código de qualidade em qualquer projeto backend.
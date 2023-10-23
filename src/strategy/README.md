# Strategy

O *Strategy* é um padrão que deve ser utilizado quando uma classe possuir diversos algoritmos que possam ser utilizados de forma intercambiável. 

A principal consequência positiva é justamente o fato de o algortimo poder ser alterado sem a modificação da classe. A partir dessa estrutura, novas implementações dele podem ser criadas e introduzidas posteriormente.

Outro ponto interessante, é a redução da lógica condicional na classe principal. Como a escolha do algoritmo está na implementação do objeto que está compondo a classe, isso elimina a necessidade de ter condicionais para selecionar a lógica a ser executada. Com isso, 
a implementação pode ser trocada em tempo de execução, deixando essa troca bem mais dinâmica. O padrão Strategy promove a flexibilidade e a extensibilidade do código, tornando-o mais fácil de manter e evoluir. 

O padrão Strategy envolve três principais componentes:

1. Contexto: É a classe que contém a estratégia e a utiliza para realizar uma operação específica.

2. Interface Estratégia: Define a interface comum para todas as estratégias concretas. Geralmente, é uma interface ou classe abstrata comum a todas as estratégias.

3. Estratégias Concretas: São as implementações específicas dos algoritmos. Cada estratégia concreta implementa a interface estratégia e fornece sua própria implementação para o algoritmo.

Um ponto negativo está no aumento da complexidade na criação do objeto, já que a instância da dependência precisa ser criada e configurada. Isso acaba gerando também um aumento do número de classes (uma para cada algoritmo), impactando negativamente no gerenciamento. 

> Explicações retiradas do livro Design Patterns com Java - projeto orientado a objetos guiado por padrões e de consultas ao ChatGPT
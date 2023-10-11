# Null Object

O padrão Null Object propôe a criação de uma classe para representar objetos nulos de uma aplicação. Essa classe deve estender a classe original e implementar seus métodos de forma a executar o comportamento esperado da aplicação quando um valor nulo for recebido. Dessa forma, em vez de se retornar um valor nulo, retorna-se uma instância dessa nova classe, ou seja, em vez de verificar constantemente se uma referência é nula antes de usá-la, o padrão Null Object introduz objetos que representam um valor nulo, mas implementam uma interface ou herdam de uma classe, permitindo assim a chamada de métodos nesses objetos sem risco de NullPointerException.

Aqui está como o padrão Null Object funciona:

1. Defina uma interface comum que descreva o comportamento que você espera das classes concretas.

2. Crie uma classe concreta que implementa essa interface e representa o comportamento "nulo". Essa classe deve fornecer implementações vazias ou valores padrão para os métodos da interface.

3. Use essa classe "nula" em vez de valores nulos reais em seu código.

> Explicações retiradas do livro Design Patterns com Java - projeto orientado a objetos guiado por padrões e de consultas ao ChatGPT
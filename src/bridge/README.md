# Bridge

O padrão *Bridge* é um padrão de projeto estrutural que separa uma abstração de sua implementação, permitindo que ambas possam variar independentemente. Isso significa que você pode criar hierarquias de abstração e implementação e, em seguida, conectar as abstrações às implementações em tempo de execução. O padrão Bridge é útil quando você deseja evitar uma classe de crescimento exponencial devido a múltiplas dimensões de variação.

O padrão Bridge é composto por quatro principais elementos:

1. Abstração (Abstraction): Define a interface abstrata e mantém uma referência a um objeto da implementação.
2. Implementação (Implementor): Define uma interface para as classes de implementação concretas.
3. Abstração Refinada (Refined Abstraction): Estende a interface da abstração e faz uso da implementação.
4. Implementação Concreta (Concrete Implementor): Fornece a implementação real da interface da implementação.



A principal ideia por trás do padrão Bridge é permitir que você altere tanto a abstração quanto a implementação independentemente, sem afetar a outra. Isso promove a flexibilidade e extensibilidade do código.

> Explicações retiradas do livro Design Patterns com Java - projeto orientado a objetos guiado por padrões e de consultas ao ChatGPT
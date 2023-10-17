package factorymethod;

interface Product {
    void create();
}

class ConcreteProductA implements Product{
    @Override
    public void create(){
        System.out.println("Produto A criado");
    }
}

class ConcreteProductB implements Product{
    @Override
    public void create(){
        System.out.println("Produto B criado");
    }
}

// Classe criadora com o Factory Method
abstract class Creator {
    public void anOperation(){
        // Realiza outras operações
        System.out.println("Realizando outras operações");

        // Chama o Factory Method para criar um produto
        Product product = factoryMethod();
        product.create();

        // Realiza outras operações
        System.out.println("Realizando outras operações");
    }

    // Factory Method abstrato
    protected abstract Product factoryMethod();
}

class ConcreteCreatorA extends Creator{
    @Override
    protected Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator{
    @Override
    protected Product factoryMethod() {
        return new ConcreteProductB();
    }
}

public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.anOperation();
        
        Creator creatorB = new ConcreteCreatorB();
        creatorB.anOperation();

    }
}

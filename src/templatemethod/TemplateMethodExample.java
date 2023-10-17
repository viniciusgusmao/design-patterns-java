
abstract class CaffeineBeverage {
    // Este é o TemplateMethod
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("Fervendo água");
    }

    void pourInCup(){
        System.out.println("Despejando na xícara");
    }
}

class Coffee extends CaffeineBeverage {
    @Override
    void brew(){
        System.out.println("Passando café moído");
    }

    @Override
    void addCondiments(){
        System.out.println("Adicionando açúcar e leite");
    }
}

class Tea extends CaffeineBeverage {
    @Override
    void brew(){
        System.out.println("Mergulhando o saquinho de chá");
    }

    @Override
    void addCondiments(){
        System.out.println("Adicionando limão");
    }
}

public class TemplateMethodExample {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        System.out.println("Preparando café:");
        coffee.prepareRecipe();

        System.out.println("Preparando chá:");
        tea.prepareRecipe();
    }
}

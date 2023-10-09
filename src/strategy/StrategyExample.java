package strategy;

interface Estrategia{
    void executarOperacao(int num1, int num2);
}

class Soma implements Estrategia {
    @Override
    public void executarOperacao(int num1, int num2){
        System.out.println("Soma dos números " + num1 + " e " + num2 + " : " + (num1 + num2));
    }
}

class Subtracao implements Estrategia {
    @Override
    public void executarOperacao(int num1, int num2){
        System.out.println("Subtração dos números " + num1 + " e " + num2 + " : " + (num1 - num2));
    }
}

class Multiplicacao implements Estrategia {
    @Override
    public void executarOperacao(int num1, int num2){
        System.out.println("Multiplicacao dos números " + num1 + " e " + num2 + " : " + num1*num2);
    }
}

class Calculadora {
    private Estrategia estrategia;

    public Calculadora(Estrategia estrategia){
        this.estrategia = estrategia;
    }

    public void realizarOperacao(int num1, int num2){
        estrategia.executarOperacao(num1, num2);
    }
}

public class StrategyExample {
    public static void main(String[] args) {
        Calculadora calcSoma = new Calculadora(new Soma());
        calcSoma.realizarOperacao(2,3);

        Calculadora calcSub = new Calculadora(new Subtracao());
        calcSub.realizarOperacao(2,3);

        Calculadora calcMult = new Calculadora(new Multiplicacao());
        calcMult.realizarOperacao(2,3);
    }
}

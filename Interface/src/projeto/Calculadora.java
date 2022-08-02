package projeto;

public class Calculadora implements Operacoes {


    public void soma(double num1, double num2) {
        double total = num1 + num2;

        System.out.println("Soma " + total);
    }


    public void subtracao(double num1, double num2) {
        double total = num1 - num2;

        System.out.println("Subtração " + total);
    }


    public void multiplicacao(double num1, double num2) {
        double total = num1 * num2;

        System.out.println("Multiplicação " + total);
    }


    public void divisao(double num1, double num2) {

        double total;

        if(num1 == 0 || num2 == 0){
            total = 0;
        }else{
            total = num1 / num2;
            System.out.println("Divisão " + total);
        }



    }
}

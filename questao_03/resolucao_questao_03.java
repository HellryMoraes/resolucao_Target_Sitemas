package questao_03;

public class ResolucaoQuestao03 {

    public static void main(String[] args) {
        System.out.println("O resultado das questões lógicas são: ");
        System.out.println("a) " + calcularProximoElementoA(7));
        System.out.println("b) " + calcularProximoElementoB(64));
        System.out.println("c) " + calcularProximoElementoC(36));
        System.out.println("d) " + calcularProximoElementoD(64));
        System.out.println("e) " + calcularProximoElementoE(8));
        System.out.println("f) " + calcularProximoElementoF(19));
    }

    public static int calcularProximoElementoA(int ultimoElemento) {
        return ultimoElemento + 2;
    }

    public static int calcularProximoElementoB(int ultimoElemento) {
        return ultimoElemento * 2;
    }

    public static int calcularProximoElementoC(int ultimoElemento) {
        return ultimoElemento + 11;
    }

    public static int calcularProximoElementoD(int ultimoElemento) {
        return ultimoElemento + 20;
    }

    public static int calcularProximoElementoE(int ultimoElemento) {
        return 13; // seguindo a sequência de Fibonacci
    }

    public static int calcularProximoElementoF(int ultimoElemento) {
        return ultimoElemento + 1;
    }
}

//4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.

//Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

package questao_04;

public class resolucao_questao_04 {
        public static void main(String[] args) {
            boolean[] interruptores = {false, false, false};
            boolean[] lampadas = {false, false, false};
    
            // Primeira visita à sala
            ligarInterruptor(interruptores, 0); // ligar o primeiro interruptor
    
            // segunda visita à sala
            for (int i = 0; i < interruptores.length; i++) {
                if (lampadaAcesa(lampadas, i)) {
                    System.out.println("O interruptor " + (i + 1) + " controla a lâmpada que está acesa.");
                } else if (lampadaQuente(lampadas, i)) {
                    System.out.println("O interruptor " + (i + 1) + " controla a lâmpada que está quente.");
                } else {
                    System.out.println("O interruptor " + (i + 1) + " controla a lâmpada que está apagada e fria.");
                }
            }
        }
    
        public static void ligarInterruptor(boolean[] interruptores, int indice) {
            interruptores[indice] = true;
        }
    
        public static boolean lampadaAcesa(boolean[] lampadas, int indice) {
            return lampadas[indice];
        }
    
        public static boolean lampadaQuente(boolean[] lampadas, int indice) {
            return !lampadaAcesa(lampadas, indice);
        }
    }

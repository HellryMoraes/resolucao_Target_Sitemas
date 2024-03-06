package questao_05;

import java.util.Scanner;

public class resolucao_questao_05 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite uma string para inverter: ");
            String input = scanner.nextLine();
    
            String reversedString = inverterString(input);
    
            System.out.println("String invertida: " + reversedString);
    
            scanner.close();
        }
    
        public static String inverterString(String str) {
            char[] caracteres = str.toCharArray();
            int inicio = 0;
            int fim = caracteres.length - 1;
    
            while (inicio < fim) {
                // Troca os caracteres no início e no fim da string
                char temp = caracteres[inicio];
                caracteres[inicio] = caracteres[fim];
                caracteres[fim] = temp;
    
                // move os índices para o próximo par de caracteres
                inicio++;
                fim--;
            }
    
            // Cria uma nova string com os caracteres invertidos
            return new String(caracteres);
        }
    }
     

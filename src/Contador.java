import java.util.Scanner;
public class Contador {
    public static void main (String[] args){

        // Criando novo escaner:
        Scanner scanner = new Scanner(System.in);

        // Printando as instruções e coletando parâmetros:
        System.out.println("Digite um número:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite outro número:");
        int segundoNumero = scanner.nextInt();

        try{

            // Colocando o método dentro de um bloco try:
            contar(primeiroNumero, segundoNumero);

        } catch (PrimeiroMaiorException exception) { 
            
            // Imprimindo a mensagem de erro no bloco catch:
           System.out.println("Erro: o primeiro número deve ser maior que o segundo :(");
        }
 
    }

    // Criando o método contar:
    static void contar(int primeiroNumero , int segundoNumero) throws PrimeiroMaiorException {

        int contagem = primeiroNumero - segundoNumero;
        if (primeiroNumero < segundoNumero){
        throw new PrimeiroMaiorException();
        }
        
        // Construindo o laço:
        for (int indice = 1; indice <= contagem; indice++){;
        System.out.println("Imprimindo o número "+ indice);
        
        }
    }

}

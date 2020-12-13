import java.util.Scanner; // Biblioteca para utilizar entrada de dados

public class App {
    public static void main(String[] args) throws Exception { //comando de início do programa
        double Num1, Num2, Mult;
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //comando "LimpaTela" limpa a tela do monitor de vídeo
        //{Entrada de dados}
        System.out.print("Digite o primeiro número: "); //mensagem para digitar o primeiro número
        Num1 = new Scanner(System.in).nextDouble(); //leitura do primeiro número para a memória
        System.out.print("Digite o segundo número: "); //mensagem para digitar o segundo número
        Num2 = new Scanner(System.in).nextDouble(); //leitura do segundo número para a memória
        //{Processamento}
        Mult = Num1 * Num2;//calcula o produto e armazena o resultado na variável Mult
        //{Saída da informação}
        System.out.println(""); //apenas salta uma linha na tela do monitor de vídeo
        System.out.println("A multiplicação de " + Num1 + " por " + Num2 + " é " + Mult);
    }//comando de fim do programa
}

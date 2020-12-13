import java.util.Scanner; // Biblioteca para utilizar entrada de dados

public class App {
    public static void main(String[] args) throws Exception { //comando de in�cio do programa
        double Num1, Num2, Mult;
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //comando "LimpaTela" limpa a tela do monitor de v�deo
        //{Entrada de dados}
        System.out.print("Digite o primeiro n�mero: "); //mensagem para digitar o primeiro n�mero
        Num1 = new Scanner(System.in).nextDouble(); //leitura do primeiro n�mero para a mem�ria
        System.out.print("Digite o segundo n�mero: "); //mensagem para digitar o segundo n�mero
        Num2 = new Scanner(System.in).nextDouble(); //leitura do segundo n�mero para a mem�ria
        //{Processamento}
        Mult = Num1 * Num2;//calcula o produto e armazena o resultado na vari�vel Mult
        //{Sa�da da informa��o}
        System.out.println(""); //apenas salta uma linha na tela do monitor de v�deo
        System.out.println("A multiplica��o de " + Num1 + " por " + Num2 + " � " + Mult);
    }//comando de fim do programa
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Kayque da Silva Oliveira
 */

public class ExerciciosP {

    public static void main(String args[]) {
        System.out.println("Hello World!");
    }
}

class Idade {

    public static void main(String[] args) {
        // SCANNER PARA LER ENTRADA DE DADOS DO USUARIO
        Scanner scanner = new Scanner(System.in);

        // SOLICITA O USUARIO UM VALOR
        System.out.print("Digite a idade em ANOS: ");

        // LE O VALOR INSERIDO PELO USUARIO
        int anos = scanner.nextInt();
        
        System.out.print("Digite a idade em MESES: ");
        int meses = scanner.nextInt();
        
        System.out.print("Digite a idade em DIAS: ");
        int dias = scanner.nextInt();

        // IMPRIME O VALOR DIGITADO PELO USUARIO
        System.out.println("Você tem: " + anos + " anos, " + meses + " meses, e " + dias + " dias de idade.");
        
        
        int diasTotais = (anos * 365) + (meses * 30) + dias;
        
        System.out.println("Total da sua idade em dias: " + diasTotais);

        // FECHA O SCANNER
        scanner.close();
    }
}

class Media {
    
    public static void main(String[] args) {
        
        int soma1 = 8 + 9 + 7;       // SOMA NUM 8,9 E 7
        int media1 = soma1 / 3;    // MEDIA NUM 8,9 E 7
        
        int soma2 = 4 + 5 + 6;      // SOMA NUM 4,5  E 6
        int media2 = soma2 / 3;   // MEDIA NUM 4,5 E 6
        
        int media3 = (media1 + media2) / 2;  // MEDIA DAS MEDIAS
        
        System.out.println("A Média Aritmética dos números 8,9 e 7 é: " + media1);
        
        System.out.println("A Soma Total dos números 8,9 e 7 é: " + soma1);
        
        System.out.println("A Média Aritmética dos números 4,5 e 6 é: " + media2);
        
        System.out.println("A Soma Total dos números 4,5 e 6 é: " + soma2);
        
        System.out.println("A Soma Total das duas médias é: " + media1 + media2); // SOMA TOTAL DAS MEDIAS
        
        System.out.println("A Média das médias é: " + media3);
        
    }
}

class Saldo {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do seu saldo bancário: "); 
        int saldo = scanner.nextInt();
       
       int saldo_corrigido = (int) (saldo * 0.01) + saldo;
               
        System.out.println("Seu saldo é: R$ " + saldo);
        System.out.println("Seu saldo com o valor corrigido de 1% é: R$ " + saldo_corrigido);
                
        scanner.close();
                
    }
}

class IPI {
    public static void main(String[] args){
        
        System.out.println("----- CADASTRO DE PEÇAS -----");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o código da peça nº 01: "); 
        int cod1 = scanner.nextInt();
        
        System.out.print("Digite o valor unitário da peça nº 01: "); 
        int valor1 = scanner.nextInt();
        
        System.out.print("Digite a quantidade de peças nº 01: "); 
        int quant1 = scanner.nextInt();
        
        System.out.print("Digite o código da peça nº 02: ");
        int cod2 = scanner.nextInt();
                
        System.out.print("Digite o valor unitário das peças nº 02: ");
        int valor2 = scanner.nextInt();
                
        System.out.print("Digite a quantidade de peças nº 02: ");
        int quant2 = scanner.nextInt();
                
        System.out.print("Qual o valor a ser acrecido de porcentagem de IPI? ");
        int IPI = scanner.nextInt();      
                
         System.out.println("------------------------------------------------------- ");       
                
        int total_IPI =  (int) ((valor1 * quant1 + valor2 * quant2) * (1+ IPI / 100.0));
        
        System.out.println("O valor total a ser pago é: R$ " + total_IPI);
        
        System.out.println("------------------------------------------------------- ");  
        
        System.out.println("---------- VALOR TOTAL PEÇAS COD Nº: " + cod1 + "----------");
        System.out.println("Valor Total = R$ " + (valor1 * quant1));
        System.out.println("Valor Reajustado = R$ " + (valor1 * quant1) * (1+ IPI / 100.0));
        
        System.out.println("------------------------------------------------------- ");  
        
        System.out.println("---------- VALOR TOTAL PEÇAS COD Nº: " + cod2 + "----------");
        System.out.println("Valor Total = R$ " + (valor2 * quant2));
        System.out.println("Valor Reajustado = R$ " + (valor2 * quant2) * (1+ IPI / 100.0));
        
        System.out.println("------------------------------------------------------- ");  
        
        scanner.close();
        
        
    }
}


class Salario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite qual o valor do seu salario: "); 
        float sal = scanner.nextInt();
        
        float salario = sal / 788;
                
        System.out.println("Você recebe  " + salario + " salário(s) mínimo(s).");
        
        scanner.close();
                
    }
}

class Number {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        
        int antecessor = num - 1;
        int sucessor = num + 1;
                
        System.out.println("O número digitado foi: " + num + " , e seu antecessor é: " + antecessor + " e seu sucessor é: " + sucessor);
        
         scanner.close();
    }
}


class Ex07 {
    public static void main(String[] args) {
        
            for (int i = 1; i <= 20; i++){
                System.out.println(i + ".Eu gosto de estudar Algoritmos! ");
            }
            
        }
}

class Ex08 {
    public static void main(String[] args) {
        int soma = 0; // ARMAZENAR O VALOR INICIAL
        
        for (int i = 1; i <= 15; i++) {
            soma += i; // ADICIONA CADA NUMERO A VARIAVEL SOMA
        }
        
        System.out.println("A soma dos números de 1 a 15 é: " + soma);
    }
}

class Ex09 {
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

         System.out.print("Digite seu nome de usuário: ");
         String nome = scanner.nextLine();
        
            for (int i = 1; i <= 10; i++){
                
                System.out.println(i+ ".Usuário: " + nome);

            }

            scanner.close();
            
        }
}

class Ex10 {
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

         System.out.print("Digite seu nome de usuário: ");
         String nome = scanner.nextLine();
         
         System.out.print("Digite quantas vezes deseja repetir o nome de usuário: ");
         int repetir = scanner.nextInt();
        
            for (int i = 1; i <= repetir; i++){
                
                System.out.println(i+ ".Usuário: " + nome);

            }

            scanner.close();
            
        }
}

class Ex11 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int total = 0; // ARMAZENAR O VALOR INICIAL
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            
            // ADICIONA O NUMERO A CADA INSERCAO DO USUARIO
            total += numero;
        }
        
        // RESULTADO
        System.out.println("A soma dos 10 números é: " + total);
        
        scanner.close();
    }
}

class Ex12 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int total = 0; // ARMAZENAR O VALOR INICIAL SOMA E MEDIA IDADES
        int maior = 0; // ARMAZENAR O VALOR INICIAL MAIOR DE IDADES
        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da " + i + "º pessoa: ");
            int numero = scanner.nextInt();
            
            // ARMAZENA OS VALORES A CADA INSERCAO
            total += numero;
            
            
            // IF SE MAIOR DE IDADE FAZER A CONTAGEM
            if (numero >= 18) {
            maior += 1;
        }
        }
        
        // RESULTADO SOMA
        System.out.println("A soma das idades das 20 pessoas é de :  " + total + " anos de idade.");
        
        // RESULTADO MÉDIA
        int media = total / 20;
        System.out.println("A média das idades das 20 pessoas é de :  " + media + " anos de idade.");
        
        // RESULTADO MAIORES DE IDADE
        System.out.println("São maiores de idades " + maior + " pessoas.");
        
        
        scanner.close();
    }
}

class Multiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para gerar sua tabuada de multiplicação: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de multiplicação número " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}

class  Ex17{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int maior = 0; // ARMAZENAR O VALOR INICIAL MAIOR QUE NUMERO 8
        int pares = 0 ; // ARMAZENAR O VALOR INICIAL DOS NUMEROS PARES
        int total = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da " + i + "º pessoa: ");
            int numero = scanner.nextInt();
            
            // ARMAZENA OS VALORES A CADA INSERCAO
            total += numero;
            
            
            // IF SE NUM MAIOR QUE 08
            if (numero >= 8) {
            maior += 1;
        }
             // IF SE NUM É PAR
            if (numero % 2 == 0) {
                pares++;
            }
        }
        
        
        // RESULTADO PARES
         System.out.println(pares + " números são pares.");
        
        // RESULTADO MAIORES QUE 08
        System.out.println(maior + " números são maiores que 08.");
        
        
        scanner.close();
    }
}

class  Ex19{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int num = 0; // ARMAZENAR O VALOR INICIAL NUMEROS ENTRE 0 E 100
        int total = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            
            // ARMAZENA OS VALORES A CADA INSERCAO
            total += numero;
            
            // IF SE NUM MAIOR QUE 08
            if (numero >= 0 && numero <= 100){
            num += 1;
        }

        }
        
        
        // RESULTADO
         System.out.println(num + " números estão entre 0 e 100.");

        scanner.close();
    }
}

class  Ex20{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int num0 = 0; // ARMAZENAR O VALOR INICIAL NUMEROS ENTRE 0 E 100
        int num101 = 0; // ARMAZENAR O VALOR INICIAL NUMEROS ENTRE 101 E 200
        int num200 = 0; // ARMAZENAR O VALOR INICIAL NUMEROS MAIOR QUE 200
        int total = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            
            // ARMAZENA OS VALORES A CADA INSERCAO
            total += numero;
            
            // IF SE NUM MAIOR QUE 08
            if (numero >= 0 && numero <= 100){
            num0 += 1;
            } else if (numero >= 101 && numero <= 200) {
            num101 += 1;
            } else if (numero > 200){
            num200 += 1;
            }

        }
        
        
        // RESULTADO
         System.out.println(num0 + " números estão entre 0 e 100.");
         System.out.println(num101 + " números estão entre 101 e 200.");
         System.out.println(num200 + " números são maiores que 200.");

        scanner.close();
    }
}

class Ex21 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int soma = 0; // ARMAZENAR O VALOR INICIAL 

        while (true) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            // IF SE NUM É NEGATIVO
            if (numero < 0) {
                break; // ENCERRA O LOOP A REPETICAO
            }

            soma += numero;
        }

        // RESULTADO
        System.out.println("A soma dos números digitados pelo usúario é: " + soma);

        scanner.close();
    }
}

class Ex22 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(10) + 1; // GERAR NUMERO ALEATORIO
        int tentativas = 0;
        int tentativa;

        System.out.println("-------- Bem-vindo ao Jogo de Adivinhação! --------");
        System.out.println("-------- Tente adivinhar o número entre 1 e 10. --------");

        while (true) {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa != numeroAleatorio) {
                System.out.println("Você errou! Tente novamente.");
            }  else {
                System.out.println("Parabéns! Você adivinhou o número " + numeroAleatorio + " em " + tentativas + " tentativas.");
                break; // ENCERRAR O JOGO
            }
        }

        scanner.close();
    }
}


class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número máximo na sequência de Fibonacci para calcular: ");
        int numeroMaximo = scanner.nextInt();

        int primeiroTermo = 0;   // PRIMEIRO TERMO DA SEQUENCIA
        int segundoTermo = 1; // SEGUNDO TERMO DA SEQUENCIA

        System.out.println("Sequência de Fibonacci até " + numeroMaximo + ":");
        
        while (primeiroTermo <= numeroMaximo) {
            System.out.print(primeiroTermo + " ");

            int proximoTermo = primeiroTermo + segundoTermo; // FAZ O CALCULO DO PROXIMO TERMO
            primeiroTermo = segundoTermo; 
            segundoTermo = proximoTermo;
        }

        scanner.close();
    }
}




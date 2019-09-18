//Thálisson Moreira Sinézio - Bloco III

package aulaprogramacao;

import java.util.Scanner;

public class AulaProgramacao {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        q26();
    }
    static void q1(){
       System.out.println("Digite o Primeiro Valor: ");
       double primeiroValor = sc.nextDouble();
       
       System.out.println("Digite o Segundo Valor: ");
       double segundoValor = sc.nextDouble();
       
       
       double soma  = primeiroValor + segundoValor;
       double sub   = primeiroValor - segundoValor;
       double multi = primeiroValor * segundoValor;
       double divi  = primeiroValor / segundoValor;
      
       
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + multi);
        System.out.println("Divisão: " + divi);
       
    }
    static void q2(){
        System.out.println("Digite a Distância Total Percorrida(Km): ");
        double distanciaTotal = sc.nextDouble();
        
        System.out.println("Digite o Combustivel Total(Litros):");
        double combustivelTotal = sc.nextDouble(); 
        
        double consumoMedio = distanciaTotal / combustivelTotal;
        System.out.println("Consumo Médio: " + consumoMedio);
        
    }
    static void q3(){
        System.out.println("Digite o Nome do Vendedor: ");
        String nome = sc.nextLine();
        
        System.out.println("Digite o Salário Fixo: ");
        double salarioFixo = sc.nextDouble();
        
        System.out.println("Digite o Total de Vendas(R$): ");
        double vendasTotal = sc.nextDouble();
        
        double salarioFinal = salarioFixo + (vendasTotal * 0.15);
        
        System.out.println("Nome do Vendedor: " + nome);
        System.out.println("Salário Fixo: " + salarioFixo);
        System.out.println("Salário Final: " + salarioFinal);
    }
    static void q4(){
        System.out.println("Digite a Temperatura em Celsius: ");
        float celsius = sc.nextFloat();
        
        float fahrenheit = ((celsius * 9)+160)/5;
        
        System.out.println("A temperatura Em Fahrenheit é: " + fahrenheit);
        
    }
    static void q5(){
        System.out.println("Digite Quantos Dollares Tem: ");
        double quantidadeDollar = sc.nextDouble();
        
        System.out.println("Digite a Cotação do Dollar: ");
        double cotacaoDollar = sc.nextDouble();
        
        double quantidadeReal = quantidadeDollar * cotacaoDollar;
        System.out.println("Convertendo Para Reais Fica: " + quantidadeReal);
    }
    static void q6(){
        System.out.println("Digite Quanto Foi Depositado: ");
        double depositado = sc.nextDouble();
        
        double rendimento = depositado + (depositado * 0.7);
        System.out.println("Deposito Com o Rendimento: " + rendimento);
    }
    static void q7(){
        System.out.println("Informe o Valor Final: ");
        double valorFinal = sc.nextDouble();
        
        double prestacoes = valorFinal/5;
        System.out.println("Dividido Em 5 Parcelas de: " + prestacoes);
        
        
    }
    static void q8(){
        System.out.println("Digite o Custo do Produto: ");
        double custoProduto = sc.nextDouble();
        
        System.out.println("Digite o Percentual de Acrescimo(%): ");
        double acrescimo = sc.nextDouble();
        
        double valorFinal = custoProduto + (custoProduto * (acrescimo/100));
        System.out.println("Valor Final: " + valorFinal);
    }
    static void q9(){
        System.out.println("Digite o Custo de Fábrica: ");
        double custoFabrica = sc.nextDouble();
        
        double valorFinal = (custoFabrica+(custoFabrica*0.45)) + ((custoFabrica+(custoFabrica*0.45))*0.28);
        System.out.println("Valor Final: " + valorFinal);
    }
    static void q10(){
        int a = 10;
        int b = 20;
        int temp;
        System.out.println("(1)Variável A: " + a);
        System.out.println("(1)Variável B: " + b);
        
        temp=a;
        a=b;
        b=temp;
        
        System.out.println("\n(2)Variável A: " + a);
        System.out.println("(2)Variável B: " + b);
        
    }
    static void q14(){
        System.out.println("Digite Um Valor: ");
        int valor = sc.nextInt();
        
        System.out.println("Seu Sucessor: " + (valor+1));
        System.out.println("Seu Antecessor: " + (valor-1));
        
    }
    static void q15(){
        System.out.println("Digite a Base: ");
        int base = sc.nextInt();
        
        System.out.println("Digite a Altura: ");
        int altura = sc.nextInt();
        
        int area = base * altura;
        System.out.println("A Área do Retângulo é: " + area);
    }
    static void q16(){
        System.out.println("Quantos Anos: ");
        int anos = sc.nextInt();
        
        System.out.println("Quantos Meses: ");
        int meses = sc.nextInt();
        
        System.out.println("Quantos dias: ");
        int dias = sc.nextInt();
        
        int diasFinal = (anos * 365) + (meses * 30) + dias;
        System.out.println("Quantidade Total em Dias: " + diasFinal);
    }
    static void q17(){
        System.out.println("Total de Eleitores: ");
        int totalEleitores = sc.nextInt();
        
        System.out.println("Votos em Branco: ");
        int votosEmBranco = sc.nextInt();
        
        System.out.println("Votos Nulos: ");
        int votosNulos = sc.nextInt();
        
        System.out.println("Votos Válidos: ");
        int votosValidos = sc.nextInt();
        
        float brancoPercentagem     = (totalEleitores * votosEmBranco)/100;
        float nulosPercentagem      = (totalEleitores * votosNulos)/100;
        float validosPercentagem    = (totalEleitores * votosValidos)/100;
        
        System.out.println("\nPercentagem Votos em Branco: " + brancoPercentagem + "%");
        System.out.println("Percentagem Votos Nulos: " + nulosPercentagem + "%");
        System.out.println("Percentagem Votos Válidos: " + validosPercentagem + "%");
    }
    static void q18(){
        System.out.println("Digite o Salário Atual: ");
        double salarioAtual = sc.nextDouble();
        
        System.out.println("Digite o Reajuste(%): ");
        float reajuste = sc.nextFloat()/100;
        
        double salarioFinal = salarioAtual + (salarioAtual*reajuste);
        System.out.println("Salário Final Com Reajuste: " + salarioFinal);
    }
    static void q19(){
        System.out.println("Digite o Custo de Fábrica: ");
        double custoFabrica = sc.nextDouble();
        
        double valorFinal = (custoFabrica+(custoFabrica*0.45)) + ((custoFabrica+(custoFabrica*0.45))*0.28);
        System.out.println("Valor Final: " + valorFinal);
    }
    static void q20(){
        System.out.println("Digite a Quantidade de Carros Vendidos: ");
        int carrosVendidos = sc.nextInt();
        
        System.out.println("Digite o Total de Vendas(R$): ");
        double valorVendas = sc.nextDouble();
        
        System.out.println("Digite o Salário Fixo: ");
        double salarioFixo = sc.nextDouble();
        
        System.out.println("Digite a Comissão Por Carro Vendido(%): ");
        float comissao = sc.nextFloat()/100;
        
        double salarioFinal = salarioFixo + (carrosVendidos*comissao) + (valorVendas*0.5);
        System.out.println("Salario Final: " + salarioFinal);
    }
    static void q21(){
        System.out.println("Digite Um Valor: ");
        float valor = sc.nextFloat();
        
        if(valor>10){
            System.out.println("É MAIOR QUE 10!");
        }else{
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
    static void q22(){
        System.out.println("Digite Um Valor: ");
        float valor = sc.nextFloat();
        
        if(valor>=0){
            System.out.println("Valor Positivo!");
        }else{
            System.out.println("Valor Negativo!");
        }
    }
    static void q23(){
        System.out.println("Digite a Quantidade de Maçãs: ");
        int quantidadeMaca = sc.nextInt();
        
        double precoMaca = (quantidadeMaca>=12)?1:1.30;
        double precoFinal = quantidadeMaca * precoMaca;
        
        System.out.println("Preço Final: " + precoFinal);
        
    }
    static void q24(){
        System.out.println("Digite a Primeira Nota: ");
        float primeiraNota = sc.nextFloat();
        
        System.out.println("Digite a Segunda Nota");
        float segundaNota = sc.nextFloat();
        
        float media = (primeiraNota + segundaNota)/2;
        if(media>=6){
            System.out.println("Aprovado!");
            System.out.println("Média: " + media);
        }else{
            System.out.println("Reprovado!");
            System.out.println("Média: " + media);
        }
    }
    static void q25(){
        System.out.println("Digite o Ano de Nascimento: ");
        int anoNascimento = sc.nextInt();
        
        System.out.println("Digite o Ano Atual: ");
        int anoAtual = sc.nextInt();
        
        if((anoAtual - anoNascimento)>=16){
            System.out.println("Já Pode Votar!");
        }else{
            System.out.println("Não Pode Votar!");
        }
    }
    static void q26(){
        System.out.println("Escreva Um Valor: ");
        float valorUm = sc.nextFloat();
        
        System.out.println("Escreva Outro Valor: ");
        float valorDois = sc.nextFloat();
        
        System.out.println((valorUm>valorDois)?valorUm:valorDois);
        
    }
    static void q27(){
        System.out.println("Escreva Um Valor: ");
        float valorUm = sc.nextFloat();
        
        System.out.println("Escreva Outro Valor: ");
        float valorDois = sc.nextFloat();
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaprogramacao;
import java.util.Scanner;

/**
 *
 * @author SNZ
 */
public class Respostas {
    static Scanner sc = new Scanner(System.in);
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
        
        if(valorDois>valorUm){
            System.out.println(valorUm);
            System.out.println(valorDois);
        }else{
            System.out.println(valorDois);
            System.out.println(valorUm);
        }
    }
    static void q28(){
        System.out.println("Digite o Horário de Início: ");
        int horaInicio = sc.nextInt();
        
        System.out.println("Digite o Horário do Término: ");
        int horaFim = sc.nextInt();
        horaFim =(horaInicio>horaFim)?horaFim+24:horaFim;
        
        int horaTotal = horaFim - horaInicio;
        System.out.println("A Partida Durou: " + horaTotal + " Horas");   
    }
    static void q29(){
        System.out.println("Digite o Total de Horas Trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();
        
        System.out.println("Digite o Salário Por Hora: ");
        float salarioPorHora = sc.nextFloat();
        
        int horasExtras = horasTrabalhadas - 160;
        double salarioFinal;
        
        if(horasExtras>0){
            salarioFinal = (horasTrabalhadas*salarioPorHora)+(horasExtras*(salarioPorHora*0.5));
        }else{
            salarioFinal = horasTrabalhadas * salarioPorHora;
        }
        System.out.println("Salário Final: " + salarioFinal);
    }
    static void q31(){
        System.out.println("Digite o Salário Fixo: ");
        double salarioFixo = sc.nextDouble();
        
        System.out.println("Digite o Total de Vendas(R$): ");
        double totalVendas = sc.nextDouble();
        
        double salarioFinal;
        if(totalVendas>=1500){
            salarioFinal = salarioFixo + (totalVendas*0.05);
        }else{
            salarioFinal = salarioFixo + (totalVendas*0.03);
        }
        
        System.out.println("Salário Final: " + salarioFinal);
    }
    static void q32(){
        System.out.println("Digite o Número da Conta: ");
        String numeroConta = sc.nextLine();
        
        System.out.println("Digite o Saldo: ");
        double saldo = sc.nextDouble();
        
        System.out.println("Digite o Debito: ");
        double debito = sc.nextDouble();
        
        System.out.println("Digite o Crédito: ");
        double credito = sc.nextDouble();
        
        double saldoAtual = saldo - debito + credito;
        System.out.println("Saldo Atual: " + saldoAtual);
        
        if(saldoAtual>=0){
            System.out.println("Saldo Positivo!");
        }else{
            System.out.println("Saldo Negativo!");
        }
    }
    static void q33(){
        System.out.println("Quantidade Atual em Estoque: ");
        int qtdAtual = sc.nextInt();
        
        System.out.println("Quantidade Maxima em Estoque: ");
        int qtdMaxima = sc.nextInt();
        
        System.out.println("Quantidade Mínima em Estoque: ");
        int qtdMinima = sc.nextInt();
        
        float qtdMedia = (qtdMaxima + qtdMinima)/2;
        
        System.out.println((qtdAtual>qtdMedia)?"Não Efetuar Compra":"Efetuar Compra");
    }
    static void q34(){
        System.out.println("Digite um Valor: ");
        int valor = sc.nextInt();
        
        if(valor>0){
            System.out.println("Valor Positivo!");
        }else if(valor<0){
            System.out.println("Valor Negativo!");
        }else{
            System.out.println("Valor Zero!");
        } 
    }
    static void q35(){
        System.out.println("Digite o Primeiro Valor: ");
        int primeiroValor = sc.nextInt();
        
        System.out.println("Digite o Segundo Valor: ");
        int segundoValor = sc.nextInt();
        
        System.out.println("Digite o Terceiro Valor: ");
        int terceiroValor = sc.nextInt();
        
        int maior;
                
        if((primeiroValor>segundoValor) && (primeiroValor>terceiroValor)){
            maior = primeiroValor;
        }else if((segundoValor>primeiroValor) && (segundoValor>terceiroValor)){
            maior = segundoValor;
        }else{
            maior = terceiroValor;
        }
        System.out.println("Maior Valor: " + maior);
    }
    static void q36(){
        System.out.println("Digite o Primeiro Valor: ");
        int primeiroValor = sc.nextInt();
        
        System.out.println("Digite o Segundo Valor: ");
        int segundoValor = sc.nextInt();
        
        System.out.println("Digite o Terceiro Valor: ");
        int terceiroValor = sc.nextInt();
        
        int primeiroMaior,segundoMaior;
        
        if((primeiroValor>segundoValor) && (primeiroValor>terceiroValor)){
            primeiroMaior = primeiroValor;
            
            if(segundoValor>terceiroValor){
                segundoMaior = segundoValor;
            }else{
                segundoMaior = terceiroValor;
            }
        }else if((segundoValor>primeiroValor) && (segundoValor>terceiroValor)){
            primeiroMaior = segundoValor;
            
            if(primeiroValor>terceiroValor){
                segundoMaior = primeiroValor;
            }else{
                segundoMaior = terceiroValor;
            }
        }else{
            primeiroMaior = terceiroValor;
            
            if(segundoValor>primeiroValor){
                segundoMaior = segundoValor;
            }else{
                segundoMaior = primeiroValor;
            }
        }
        
        int somaMaiores = primeiroMaior + segundoMaior;
        System.out.println("A Soma dos 2 Maiores: " + somaMaiores);
        
    }
    static void q37(){
        System.out.println("Digite o Primeiro Valor: ");
        int primeiroValor = sc.nextInt();
        
        System.out.println("Digite o Segundo Valor: ");
        int segundoValor = sc.nextInt();
        
        System.out.println("Digite o Terceiro Valor: ");
        int terceiroValor = sc.nextInt();
        
        int primeiroMaior,segundoMaior,terceiroMaior;
        
        if((primeiroValor>segundoValor) && (primeiroValor>terceiroValor)){
            primeiroMaior = primeiroValor;
            
            if(segundoValor>terceiroValor){
                segundoMaior = segundoValor;
                terceiroMaior = terceiroValor;
            }else{
                segundoMaior = terceiroValor;
                terceiroMaior = segundoValor;
            }
        }else if((segundoValor>primeiroValor) && (segundoValor>terceiroValor)){
            primeiroMaior = segundoValor;
            
            if(primeiroValor>terceiroValor){
                segundoMaior = primeiroValor;
                terceiroMaior = terceiroValor;
            }else{
                segundoMaior = terceiroValor;
                terceiroMaior = primeiroValor;
            }
        }else{
            primeiroMaior = terceiroValor;
            
            if(segundoValor>primeiroValor){
                segundoMaior = segundoValor;
                terceiroMaior = primeiroValor;
            }else{
                segundoMaior = primeiroValor;
                terceiroMaior = segundoValor;
            }
        }
        
        System.out.println("Em Ordem Crescente: " + terceiroMaior + ", " + segundoMaior + ", " + primeiroMaior);
    }
    static void q38(){
        System.out.println("Digite o Primeiro Valor: ");
        int primeiroValor = sc.nextInt();
        
        System.out.println("Digite o Segundo Valor: ");
        int segundoValor = sc.nextInt();
        
        System.out.println("Digite o Terceiro Valor: ");
        int terceiroValor = sc.nextInt();
        
        if(primeiroValor<(segundoValor+terceiroValor) &&
           segundoValor<(primeiroValor+terceiroValor) &&
           terceiroValor<(segundoValor+terceiroValor)){
            System.out.println("Pode Formar um Triângulo!");
        }else{
            System.out.println("Não Pode Formar um Triângulo!");
        }
    }
    static void q39(){
        System.out.println("Digite o Nome do Primeiro Time: ");
        String primeiroTime = sc.nextLine();
        
        System.out.println("Digite o Nome do Segundo Time: ");
        String segundoTime = sc.nextLine();
        
        System.out.println("Quantos Gols o " + primeiroTime + " Marcou: ");
        int primeiroGols = sc.nextInt();
        
        System.out.println("Quantos Gols o " + segundoTime + " Marcou: ");
        int segundoGols = sc.nextInt();
        
        if(primeiroGols>segundoGols){
            System.out.println(primeiroTime + " Venceu de " + primeiroGols + " X " + segundoGols);
        }else if(segundoGols>primeiroGols){
            System.out.println(segundoTime + " Venceu de " + segundoGols + " X " + primeiroGols);
        }else{
            System.out.println("EMPATE!");
        }   
    }
    static void q40(){
        System.out.println("Digite o Primeiro Valor: ");
        int primeiroValor = sc.nextInt();
        
        System.out.println("Digite o Segundo Valor: ");
        int segundoValor = sc.nextInt();
        
        if(primeiroValor>segundoValor){
            System.out.println("Primeiro é maior");
        }else if(segundoValor>primeiroValor){
            System.out.println("Segundo é maior");
        }else{
            System.out.println("Números iguais");
        }
    }
    static void q42(){
        System.out.println("Digite Quantos Litros: ");
        int qtdLitros = sc.nextInt();
        
        System.out.println("Selecione: A - álcool,G - gasolina)");
        String opcao = sc.next();
        
        switch (opcao) {
            case "A":
                {
                    double precoAlcool,valorTotal;
                    if(qtdLitros>20){
                        precoAlcool =  2.9 - (2.9 * 0.05);
                    }else{
                        precoAlcool =  2.9 - (2.9 * 0.03);
                    }       valorTotal =  qtdLitros*precoAlcool;
                    System.out.println("Valor Total: " + valorTotal);
                    break;
                }
            case "G":
            {
                double precoGasolina,valorTotal;
                if(qtdLitros>20){
                    precoGasolina =  3.30 - (3.30 * 0.06);
                }else{
                    precoGasolina =  3.30 - (3.30 * 0.04);
                }       valorTotal =  qtdLitros*precoGasolina;
                System.out.println("Valor Total: " + valorTotal);
                    break;
                }
            default:
                System.out.println("Opção Incorreta!");
                break;
        }
    }
    static void q43(){
        
        int maisVelho,maisNovo;
        int maisVelha,maisNova;
        
        System.out.println("Digite a Idade do Primeiro Homem: ");
        int iPrimeiroHomem = sc.nextInt();
        
        System.out.println("Digite a Idade do Segundo Homem: ");
        int iSegundoHomem = sc.nextInt();
        
        System.out.println("Digite a Idade da Primeira Mulher: ");
        int iPrimeiraMulher = sc.nextInt();
        
        System.out.println("Digite a Idade da Primeira Mulher: ");
        int iSegundaMulher = sc.nextInt();
        
        if(iPrimeiroHomem>iSegundoHomem){
            maisVelho = iPrimeiroHomem;
            maisNovo = iSegundoHomem;
        }else{
            maisVelho = iSegundoHomem;
            maisNovo = iPrimeiroHomem;            
        }
        
        if(iPrimeiraMulher>iSegundaMulher){
            maisVelha = iPrimeiraMulher;
            maisNova = iSegundaMulher;
        }else{
            maisVelha = iSegundaMulher;
            maisNova = iPrimeiraMulher;
        }
        System.out.println("Soma: " + (maisVelho + maisNova));
        System.out.println("Produto: " + (maisNovo * maisVelha));
    }
    static void q44(){
        double precoTotal;
        double precoMorango,precoMaca;
        System.out.println("Quantos Morangos(Kg): ");
        int qtdMorangos = sc.nextInt();
        
        System.out.println("Quantas Maçãs(Kg): ");
        int qtdMacas = sc.nextInt();
        
        precoMorango = (qtdMorangos>5)?(qtdMorangos*2.20):(qtdMorangos*2.50);
        precoMaca = (qtdMacas>5)?(qtdMacas*1.50):(qtdMacas*1.80);
        
        if((qtdMorangos + qtdMacas)>8 && (precoMorango + precoMaca)>25){
            precoTotal = (precoMorango + precoMaca) - ((precoMorango + precoMaca)*0.10);
        }else{
            precoTotal = precoMorango + precoMaca;
        }
        
        System.out.println("Preço Total: " + precoTotal);        
    }
    static void q45(){
        System.out.println("Digite o Código de Usuário: ");
        String login = sc.next();
        
        if(login.equals("1234")){
            System.out.println("Digite a Senha do Usuário: ");
            String senha = sc.next();
            
            if(senha.equals("9999")){
                System.out.println("Acesso Permitido!");
            }else{
                System.out.println("Senha Incorreta!");
            }
            
        }else{
            System.out.println("Usuário Inválido!");
        }
        
    }
    static void q47(){
        double desconto;
        
        System.out.println("Digite o Nome do Produto: ");
        String nomeProduto = sc.next();
        
        System.out.println("Digite a Quantidade Adquirida: ");
        int qtdComprada = sc.nextInt();
        
        System.out.println("Digite o Preço Unitário: ");
        double preco = sc.nextDouble();
        
        double precoTotal = qtdComprada * preco;
        
        if(qtdComprada<=5){
            desconto = 0.02;
        }else if(qtdComprada>5 && qtdComprada<=10){
            desconto = 0.03;
        }else{
            desconto = 0.05;
        }
        double valorFinal = precoTotal -(precoTotal*desconto);
        
        System.out.println("Preço Total: " + precoTotal);
        System.out.println("Preço Com Desconto: " + valorFinal);
    }
    static void q48(){
        System.out.println("Digite o Código do Empregado: ");
        String codEmpregado = sc.next();
        
        System.out.println("Digite o Ano de Nascimento: ");
        int anoNascimento = sc.nextInt();
        
        System.out.println("Digite o Ano de Ingresso Na Empresa: ");
        int anoIngresso = sc.nextInt();
        
        int idade = 2019 - anoNascimento;
        int tempoTrabalho = 2019 - anoIngresso;
        
        if(idade>=65 || tempoTrabalho>=30 || (idade>=60 && tempoTrabalho>=25)){
            System.out.println("Requerer Aposentadoria!");
        }else{
            System.out.println("Não Requerer!");
        }
    }
    static void q50(){
        System.out.println("Digite o Primeiro Valor: ");
        float primeiroValor = sc.nextInt();
  
        float segundoValor;
        
        do{
            System.out.println("Digite o Segundo Valor Diferente de 0: ");
            segundoValor = sc.nextInt();
        }while(segundoValor==0);
        
        float divisao = primeiroValor / segundoValor;
        System.out.println("Divisão dos Valores: " + divisao);
    }
    static void q51(){
        System.out.println("Digite o Primeiro Valor: ");
        float primeiroValor = sc.nextInt();
        
        System.out.println("Digite o Segundo Valor: ");
        float segundoValor = sc.nextInt();
        
        while(segundoValor==0){
            System.out.println("Digite o Segundo Valor Diferente de 0: ");
            segundoValor = sc.nextInt();
        }
        float divisao = primeiroValor / segundoValor;
        System.out.println("Divisão dos Valores: " + divisao);
    }
    static void q53(){
        System.out.println("Digite Quantos Litros: ");
        int qtdLitros = sc.nextInt();
        
        System.out.println("Selecione: A - álcool,G - gasolina)");
        String opcao = sc.next();
        
        switch (opcao) {
            case "A":
                {
                    double precoAlcool,valorTotal;
                    if(qtdLitros>20){
                        precoAlcool =  2.9 - (2.9 * 0.05);
                    }else{
                        precoAlcool =  2.9 - (2.9 * 0.03);
                    }       valorTotal =  qtdLitros*precoAlcool;
                    System.out.println("Valor Total: " + valorTotal);
                    break;
                }
            case "G":
            {
                double precoGasolina,valorTotal;
                if(qtdLitros>20){
                    precoGasolina =  3.30 - (3.30 * 0.06);
                }else{
                    precoGasolina =  3.30 - (3.30 * 0.04);
                }       valorTotal =  qtdLitros*precoGasolina;
                System.out.println("Valor Total: " + valorTotal);
                    break;
                }
            default:
                System.out.println("VALOR INVÁLIDO!");
                break;
        }
    }
    static void q54(){
        float primeiraNota,segundaNota;
        
        do{
            System.out.println("Digite a Primeira Nota(0 á 10): ");
            primeiraNota = sc.nextFloat();
        }while(primeiraNota<0 || primeiraNota>10);
        
        do{
            System.out.println("Digite a Segunda Nota(0 á 10): ");
             segundaNota = sc.nextFloat();
        }while(segundaNota<0 || segundaNota>10);
        
        float media = (primeiraNota + segundaNota)/2;
        System.out.println("Média: " + media);
    }
    static void q55(){
        String opcao;
        do{
            System.out.println("Digite o Código de Usuário: ");
            String login = sc.next();
        
            if(login.equals("1234")){
                System.out.println("Digite a Senha do Usuário: ");
                String senha = sc.next();
            
                if(senha.equals("9999")){
                    System.out.println("Acesso Permitido!");
                }else{
                    System.out.println("Senha Incorreta!");
                }
            
            }else{
                System.out.println("Usuário Inválido!");
            }
            System.out.println("NOVO CÁLCULO (S/N)?");
            opcao = sc.next();
        }while(opcao.equals("S") || opcao.equals("s"));
    }
}

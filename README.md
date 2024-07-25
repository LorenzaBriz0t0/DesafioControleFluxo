# Overview
 ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
## DesafioControleFluxo
Como um dos desafios propostos pela trilha de Java Básico da DIO, aqui está o repositório do projeto do algortimo do Contador proposto.

## Lógica do Contador
Como diretrizes básicas, o Contador deve:
- Receber dois números inteiros como ```input```s
- Fazer um loop de for de duração igual à soma desses dois números
- Executar neste loop a ação de printar "Imprimindo número i", sendo i o índice da iteração do loop
- Tratar como exceção o erro gerado pela entrada de um primeiro parâmetro (número) menor que o segundo

## Lógica do Código

Para executar o primeiro requisito, utilizamos a classe ```scanner ```, importada da biblioteca de utilitários do Java:
``` Java
import java.util.Scanner;
```
Para cumprir o segundo requisito, usamos um algoritmo básico de subtração.

Para o terceiro, utilizamos um loop de ```For``` que em cada iteração chama o ```System.out.println()``` combinado com uma mensagem de Strings concatenando seu índice com cada iteração.

Finalmente, para executar o último requisito, criamos a classe PrimeiroMaiorException, da seguinte maneira:

``` Java
public class PrimeiroMaiorException extends Exception {}  
```
Esse arquivo foi separado do ```Contador.java``` por razões de organizaçao e está dentro do ```src``` e poderia integrar um pacote junto com o programa do Contador, eventualmente.

## Referências Bilbiográficas

 - [Link do Desafio de projeto](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo)

## Autora


- [@LorenzaBriz0t0](https://github.com/LorenzaBriz0t0) - Lorenza Costa Brizoto





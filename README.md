## Resolução do documento anexo 

#### 1 - Descreva os quatro elementos básicos de repetição controlada por contador. 
1. Inicialização do contador: A variável contador precisa ser inicializada com um valor inicial antes da primeira iteração ser executada.  
2. Bloco de código a ser iterado pelo loop: contém as instruções que serão executadas repetidamente.  
3. Atualização do contador: No fim de uma iteração do loop, o valor do contador é atualizado de acordo.  
4. Condição de parada: Essa condição é verificada após uma iteração do loop. Se verdadeira, se inicia outra iteração, se falsa, o loop é interrompido.

#### 2 - Compare e contraste as instruções de repetição while e for. 
A principal diferença é que o for tem em sua sintaxe a inicialização, condição e atualização do contador definidos em uma única linha, enquanto o while esses elementos são definidos externamente. Para casos em que se sabe o número de repetições, o for é mais usado pela praticidade de definir o contador na mesma linha. Porém, o while é mais flexível para situações mais complexas ou quando não se sabe o número de vezes que o corpo do loop será executado.
#### 3 - Discuta uma situação em que seria mais adequado utilizar uma instrução do...while do que uma instrução while. Explique por quê. 
Em uma situação em que o corpo do loop deve ser executado pelo menos uma vez, do...while é preferível. Isso ocorre porque o corpo do código é executado antes da condição de parada, portanto, uma execução ocorre mesmo que a condição seja falsa desde a primeira iteração.
#### 4 - Compare e contraste as instruções break e continue. 
`break` interrompe imediatamente a execução do loop, não importando se a condição de continuação é verdadeira ou não. `continue` interrompe apenas a iteração atual e pula para a próxima, portanto o loop continua.
#### 5 - Códigos corrigidos: 
a)
```
for (int i = 100; i >= 1; i--)
    System.out.println(i);
```
b)
```
switch (value % 2) {
    case 0:
        System.out.println("Inteiro par"); break;
    case 1:
        System.out.println("Inteiro ímpar"); break;
    default:
        System.out.println("Valor inválido");
}
```
c)
```
for (int i = 19; i >= 1; i -= 2) 
    System.out.println(i);
```
d)
```
int counter = 2;
do {
    System.out.println(counter);
    counter += 2;
} while (counter <= 100);
```
#### 6 - O que o programa faz? 
```
public class Printing {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            for(int j = 1; j<=5; j++){
                System.out.print('@');
            }
            System.out.println();
        }
    }
}
```
O programa imprime uma matriz de `@` com 10 linhas e 5 colunas. 

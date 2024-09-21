# Exemplo de Padrão Decorator

Este projeto é um exemplo da implementação do padrão de design **Decorator** em Java. O padrão Decorator permite adicionar funcionalidades a objetos de forma dinâmica, sem alterar o código das classes que estão sendo decoradas.

## Estrutura do Código

O código é composto pelas seguintes classes:

1. **Bebida**: Classe base que representa uma bebida. Fornece métodos para obter a descrição da bebida e o custo.

2. **AdicionalDecorator**: Classe abstrata que estende `Bebida` e serve como base para todos os decoradores. Contém um objeto `Bebida` que será decorado.

3. **Leite**: Implementa um decorador que adiciona leite à bebida. Adiciona uma descrição de "Leite" e um custo adicional de $0.50.

4. **Chocolate**: Implementa um decorador que adiciona chocolate à bebida. Adiciona uma descrição de "Chocolate" e um custo adicional de $1.00.

5. **Main**: Classe principal que demonstra a utilização do padrão Decorator. Cria uma bebida básica e adiciona leite e chocolate a ela, exibindo a descrição e o custo final.

## Como Utilizar

1. **Crie uma bebida básica**:
   ```java
   Bebida bebida = new Bebida();
   System.out.println(bebida.getDescricao() + " $" + bebida.custo());
2. **Adicione leite à bebida:**
   ```java
   Bebida bebidaComLeite = new Leite(bebida);
   System.out.println(bebidaComLeite.getDescricao() + " $" + bebidaComLeite.custo());
3. **Adicione chocolate à bebida com leite:**
   ```java
   Bebida bebidaComLeiteEChocolate = new Chocolate(bebidaComLeite);
   System.out.println(bebidaComLeiteEChocolate.getDescricao() + " $" + bebidaComLeiteEChocolate.custo());

## Exemplo de execução
Quando o código é executado, a saída será:

  ```java
Bebida $0.0
Bebida, Leite $0.50
Bebida, Leite, Chocolate $1.50


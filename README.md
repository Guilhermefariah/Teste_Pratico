# Sistema de Gestão de Funcionários

Este projeto é um Sistema de Gestão de Funcionários implementado em Java. Ele demonstra princípios básicos de programação orientada a objetos, como herança, e fornece várias operações em uma lista de funcionários, incluindo agrupamento, ordenação e filtragem.

![texto alternativo](/img/screenResult.jpeg)



## Funcionalidades

1. **Inserir Funcionários**: Adiciona uma lista de funcionários com detalhes predefinidos.
2. **Remover Funcionário**: Remove um funcionário pelo nome.
3. **Imprimir Detalhes dos Funcionários**: Imprime os detalhes de todos os funcionários com datas e salários formatados.
4. **Aumentar Salários**: Aplica um aumento de 10% no salário de todos os funcionários.
5. **Agrupar por Função**: Agrupa os funcionários por suas funções.
6. **Imprimir Funcionários Agrupados**: Imprime os funcionários agrupados por suas funções.
7. **Filtrar por Mês de Aniversário**: Imprime os funcionários que fazem aniversário em outubro e dezembro.
8. **Funcionário Mais Velho**: Identifica e imprime o funcionário mais velho.
9. **Ordem Alfabética**: Imprime a lista de funcionários em ordem alfabética.
10. **Total de Salários**: Calcula e imprime o total dos salários de todos os funcionários.
11. **Comparação com Salário Mínimo**: Calcula e imprime quantos salários mínimos cada funcionário ganha.

## Tecnologias Utilizadas

- Java
- NetBeans IDE

## Pré-requisitos

- JDK 8 ou superior
- NetBeans IDE

## Começando

1. **Clone o Repositório**:
```sh
git clone https://github.com/Guilhermefariah/Teste_Pratico.git
```
## Abra o Projeto no NetBeans

* Abra o NetBeans IDE.
* Clique em Arquivo > Abrir Projeto.
* Navegue até o repositório clonado e abra-o.

## Compile o Projeto

* Clique com o botão direito no projeto no painel Projetos.
* Selecione Limpar e Construir.

## Execute o Projeto

* Clique com o botão direito no projeto no painel Projetos.
* Selecione Executar.

## Estrutura do Projeto

```sh
TESTE_PRATICO/
│
├── src/
│   ├── teste_pratico/
│   │   ├── Person.java
│   │   ├── Employee.java
│   │ 
│   └── Main.java
│
├── nbproject/
│
├── build.xml
├── README.md
└── ...
```

## Uso
### Adicionando Funcionários
Os funcionários são adicionados na classe <strong>Main</strong>. A lista de funcionários é inicializada com os dados predefinidos.

### Removendo um Funcionário
O funcionário chamado "João" é removido da lista usando o método <strong>removeIf</strong>.

### Imprimindo Detalhes dos Funcionários
Os detalhes dos funcionários são impressos com datas e salários devidamente formatados.

### Aplicando Aumento de Salário
Um aumento de 10% no salário é aplicado a todos os funcionários usando o método <strong>multiply</strong>.

### Agrupando e Imprimindo por Função
Os funcionários são agrupados por suas funções usando Java Streams e o método <strong>Collectors.groupingBy</strong>.

### Filtrando por Mês de Aniversário
Os funcionários que fazem aniversário em outubro e dezembro são filtrados e impressos.

### Encontrando o Funcionário Mais Velho
O funcionário mais velho é identificado usando o método <strong>min</strong> com um comparador personalizado.

### Ordenando e Imprimindo em Ordem Alfabética
Os funcionários são ordenados alfabeticamente pelos seus nomes e impressos.

### Calculando o Total dos Salários
O total dos salários de todos os funcionários é calculado usando o método <strong>reduce</strong>.

### Comparação com Salário Mínimo
O número de salários mínimos que cada funcionário ganha é calculado e impresso.

## Licença
Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.

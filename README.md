# 📘 Java Básico — Módulo 3 (Exercícios de Condicionais)

Este repositório compreende o terceiro módulo do meu percurso de aprendizado em Java Básico. O foco aqui é aprofundar os conhecimentos em **estruturas condicionais**, explorando o uso de `if`, `else if`, `else` e `switch case` para implementar lógicas de decisão complexas. Os exercícios são desenhados para consolidar a aplicação de validações, regras de negócio e boas práticas, resultando em código claro, eficiente e fácil de manter.

**Status:** Em evolução, com atualizações semanais.  
**Foco:** Aprimoramento da lógica condicional, clareza e padronização das implementações.  
**Comunidade:** Feedbacks, abertura de issues e pull requests são calorosamente bem-vindos para aprimoramento contínuo.

---

## 📚 Conteúdo do Módulo

Este módulo apresenta uma série de exercícios dedicados ao domínio das estruturas condicionais em Java:

| Exercício | Descrição                                                                                                                                                                                                                           |
| :-------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `Exe01`   | Implementação de um sistema de semáforo utilizando `switch case`, determinando a ação apropriada para estados como vermelho, amarelo ou verde.                                                                                         |
| `Exe02`   | Programa que recebe uma nota musical (A, B, C, D, E ou F) e fornece informações detalhadas sobre ela, como a frequência.                                                                                                                |
| `Exe03`   | Desenvolvimento de um conversor de unidades de medida (metro, centímetro, quilômetro), realizando conversões entre as unidades com base na entrada do usuário.                                                                       |
| `Exe04`   | **Ingressos para o Zoológico:** Calculadora de preço de ingresso baseada na idade (crianças até 12 anos grátis, adultos R$ 20,00, idosos acima de 60 pagam metade).                                                                    |
| `Exe05`   | **Feira de Descontos do Mercado Mix Tadeu:** Aplicação de descontos em compras conforme a quantidade de itens (até 5 itens sem desconto; de 6 a 10 itens, 5% de desconto; acima de 10 itens, 10% de desconto).                         |
| `Exe06`   | **Jogo do Palpite:** Um jogo onde o usuário tenta adivinhar um número aleatório entre 1 e 100, recebendo feedback "Muito baixo!", "Parabéns, acertou!" ou "Muito alto!".                                                              |
| `Exe07`   | **Aprovado, Recuperação ou Chocolate?** Avaliação do status do aluno com base na média de três notas: aprovado (>=7), recuperação (<7), e um chocolate para média 10.                                                                 |
| `Exe08`   | **Desconto no Plano da Academia:** Cálculo do valor com desconto de 20% para pessoas que treinam mais de 5 vezes por semana.                                                                                                            |
| `Exe09`   | **Velocidade Limite:** Verificação da velocidade de um carro, aplicando multa de R$5 por Km acima de 80km/h se houver infração.                                                                                                         |
| `Exe10`   | Programa que calcula a idade a partir do ano de nascimento e determina se a pessoa pode ou não votar.                                                                                                                                 |
| `Exe11`   | Desenvolvimento de um programa que lê um número inteiro e informa se ele é PAR ou ÍMPAR.                                                                                                                                              |
| `Exe12`   | Algoritmo que lê um ano e verifica se ele é ou não BISSEXTO.                                                                                                                                                                          |
| `Exe13`   | Programa que lê o ano de nascimento e exibe a situação do rapaz em relação ao alistamento militar (quantos anos faltam ou já se passaram).                                                                                            |
| `Exe14`   | **Promoção Dia da Mulher:** Calcula preço com desconto (Homens 5%, Mulheres 13%) com base no nome, gênero e valor das compras.                                                                                                         |
| `Exe15`   | Algoritmo que calcula o preço da passagem baseado na distância: R$0.50/Km para até 200Km e R$0.45/Km para viagens mais longas.                                                                                                        |
| `Exe16`   | Programa que lê o tamanho de três segmentos de reta e determina se é possível formar um triângulo, aplicando a regra matemática.                                                                                                     |
| `Exe17`   | Algoritmo que lê dois números inteiros, compara-os e mostra qual é o maior, ou se são iguais.                                                                                                                                         |
| `Exe18`   | Programa que lê duas notas, calcula a média e classifica o aluno como Reprovado (até 4,9), Recuperação (5,0 a 6,9) ou Aprovado (7,0 ou superior).                                                                                    |
| `Exe19`   | Calcula a área de um terreno retangular e o classifica como TERRENO POPULAR (abaixo de 100m²), TERRENO MASTER (entre 100m² e 500m²) ou TERRENO VIP (acima de 500m²).                                                                 |
| `Exe20`   | **Reajuste Salarial:** Calcula o novo salário de um funcionário com base no tempo de empresa (até 3 anos: +3%; entre 3 e 10 anos: +12.5%; 10 anos ou mais: +20%).                                                                   |
| `Exe21`   | Refaz o exercício do triângulo (`Exe16`), adicionando a classificação do tipo de triângulo: EQUILÁTERO, ISÓSCELES ou ESCALENO.                                                                                                       |
| `Exe22`   | Implementação de um jogo de JoKenPo (Pedra-Papel-Tesoura) contra o computador.                                                                                                                                                        |
| `Exe23`   | Cria um jogo de adivinhação onde o computador sorteia um número entre 1 e 5 e o jogador tenta acertar.                                                                                                                               |
| `Exe24`   | **Empréstimo Bancário:** Avalia a aprovação de um empréstimo para compra de casa, verificando se a prestação mensal não excede 30% do salário.                                                                                      |
| `Exe25`   | **Calculadora IMC:** Calcula o Índice de Massa Corpórea e classifica o indivíduo nas faixas de peso (Abaixo do peso, Peso ideal, Sobrepeso, Obesidade, Obesidade mórbida).                                                              |
| `Exe26`   | **Aluguel de Carros:** Calcula o preço do aluguel de carro (popular ou luxo) com base nos dias e Km percorridos, aplicando tarifas variáveis.                                                                                        |
| `Exe27`   | **Programa de Vida Saudável:** Calcula pontos e dinheiro ganhos por horas de atividade física no mês, com diferentes pontuações por faixa de horas.                                                                               |
| `Exe28`   | **Reajuste Salarial Avançado:** Calcula o novo salário com base no salário atual, gênero do funcionário e tempo de empresa, aplicando diferentes percentuais de aumento para homens e mulheres.                                        |

---

## 📝 Observações Importantes

Para a implementação e avaliação dos exercícios, as seguintes diretrizes são cruciais:

*   **Validações Essenciais:**
    *   Certifique-se de validar todas as entradas de usuário conforme as regras de negócio de cada exercício para prevenir comportamentos inesperados.
    *   Atenção especial à prevenção de divisão por zero e tratamento de entradas numéricas ou textuais fora do escopo esperado.
*   **Formatação de Saída:**
    *   Valores monetários devem ser exibidos com precisão de duas casas decimais, utilizando o `Locale pt-BR` quando apropriado para consistência.
    *   Resultados de cálculos (IMC, médias, etc.) devem ser apresentados com formatação clara e legível.
*   **Regras de Negócio Específicas:**
    *   Siga rigorosamente as condições e cálculos especificados em cada exercício, como as faixas de desconto, multas, regras de votação, alistamento, IMC e reajustes salariais.

---

## 📁 Estrutura do Projeto

A organização do repositório segue uma estrutura padrão para projetos Java, facilitando a navegação e o entendimento:


**Boas práticas de pacotes:** Recomenda-se o uso de nomes em minúsculas para pacotes (ex.: `package condicionais;`).

---

## ⚙️ Pré-requisitos

Para compilar e executar os exercícios contidos neste repositório, é necessário ter instalado:

*   **JDK 17+:** Certifique-se de que `javac` e `java` estejam configurados corretamente no seu `PATH`.
*   **Editor/IDE de Preferência:** Você pode utilizar qualquer ambiente de desenvolvimento que desejar, como VS Code, IntelliJ IDEA ou Eclipse.

**Dica em IDEs:** Para facilitar a execução, configure uma "Application" run configuration para cada classe que possuir o método `main`.

---

## 🧭 Princípios Aplicados

A construção do código nestes exercícios adere aos seguintes princípios de boas práticas:

*   **`try-with-resources`:** Garante o fechamento automático de recursos, como instâncias de `Scanner`.
*   **Separação de Lógica e E/S:** Promove uma arquitetura que facilita a testabilidade e manutenção do código.
*   **Constantes:** Utilização de constantes para evitar "números mágicos", tornando o código mais legível e configurável.
*   **`printf` para Formatação:** Emprego consistente de `printf` para formatação de saída, especialmente com `pt-BR`.
*   **Nomes Claros e Mensagens Objetivas:** Prioriza a clareza na nomenclatura de variáveis, métodos e classes, acompanhada de mensagens diretas e amigáveis ao usuário.

---

## 📝 Convenções Adotadas

*   **Versão Java:** Desenvolvimento utilizando Java 17+.
*   **Nomenclatura de Classes:** As classes dos exercícios seguem o padrão `Exe01` a `Exe28`.
*   **Estilo de Código:** Linhas de código limitadas a aproximadamente 120 colunas para melhor legibilidade. Mensagens ao usuário concisas e diretas.
*   **Formatação Monetária:** Saídas que envolvem valores monetários são formatadas com duas casas decimais (ex.: `System.out.printf("R$ %.2f%n", valor)`).
*   **Controle de Versão:** Artefatos de build (como os diretórios `out/` e `bin/`) são explicitamente excluídos do controle de versão.

---

## 📄 Licença

Este projeto é distribuído sob a licença **MIT**. O uso, estudo e contribuições são incentivados e bem-vindos.

---

## 👨‍💻 Autor

**Adriano Miranda**  
GitHub: [https://github.com/adrianommiranda](https://github.com/adrianommiranda)



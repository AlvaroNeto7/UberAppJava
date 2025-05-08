# 🚗 UberAppJava

Aplicativo simples de terminal desenvolvido em Java para motoristas de aplicativo registrarem seus dias de trabalho, com cálculo automático de ganhos e relatórios financeiros.

---

## 📋 Funcionalidades

- Registro diário de:
  - Horas trabalhadas
  - Ganhos brutos (R$)
  - Gastos com abastecimento (R$)
- Cálculo automático de:
  - Lucro líquido (ganhos - abastecimento)
  - Ganho por hora (lucro ÷ horas)
- Armazenamento dos dados em arquivo `ganhos.csv`
- Relatório com médias:
  - Horas trabalhadas
  - Ganhos brutos
  - Gastos com abastecimento
  - Lucro líquido
  - **Ganho por hora**

---

## 🛠️ Tecnologias usadas

- Java 8+
- Console (linha de comando)
- Manipulação de arquivos `.csv` com `java.io`
- Data e hora com `java.time.LocalDate`

---

## ▶️ Como usar

### ✅ Pré-requisitos

- Java instalado: [Baixar aqui](https://www.java.com/pt-BR/download/)

### ⚙️ Executar via terminal

1. Abra o terminal na pasta do projeto
2. Execute o comando:

```bash
java -jar UberMotorista.jar

🧾 Menu interativo

=== Menu Uber Motorista ===
1 - Registrar novo dia
2 - Ver médias (semanais/mensais)
0 - Sair

💾 Estrutura do CSV

O arquivo ganhos.csv é salvo automaticamente após cada registro. Exemplo:

data,horas,ganhos,abastecimento,lucro,ganhoPorHora
2025-05-08,8.0,250.0,100.0,150.00,18.75
2025-05-09,6.5,180.0,60.0,120.00,18.46

📦 Compilar e gerar .jar manualmente (opcional)

javac DiaTrabalho.java RelatorioFinanceiro.java AppMotorista.java
jar cfm UberMotorista.jar manifest.txt AppMotorista.class DiaTrabalho.class RelatorioFinanceiro.class ganhos.csv

📌 Melhorias futuras (ideias)

    Interface gráfica com JavaFX ou Swing

    Versão Web (HTML + JS + LocalStorage)

    Exportação de gráficos de desempenho

    Integração com banco de dados (MySQL ou SQLite)

👨‍💻 Autor

Desenvolvido por Alvaro Neto
Projeto educacional para prática com Java e Spring Boot.

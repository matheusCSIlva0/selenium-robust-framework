# Selenium Robust Framework - E-commerce 2026

Framework moderno, robusto e profissional para automação de testes com Selenium + Java, pensado para e-commerces e cenários dinâmicos.

## Principais Recursos
- WebDriverManager automático (sem download manual de drivers)
- Waits inteligentes com FluentWait para páginas dinâmicas
- Page Object Model organizado e escalável
- Screenshots automáticos em falhas
- Logging com Log4j2
- Relatórios Allure detalhados
- Configuração externa via `config.properties`
- Utilitários específicos para e-commerce (carrinho, checkout, preços)
- JavaFaker para dados realistas
- Execução paralela com TestNG

## Stack
- Java 17
- Selenium 4.41.0
- TestNG 7.10.2
- WebDriverManager 6.3.4
- Allure Reports 2.27.0
- Maven 3.8+
- JavaFaker 1.0.2
- Log4j2 2.23.1

## Estrutura do Projeto
```
.
├─ src/main/java/br/com/curso/seleniumframework/base
├─ src/main/java/br/com/curso/seleniumframework/pages
├─ src/main/java/br/com/curso/seleniumframework/utils
├─ src/main/resources/config.properties
├─ src/test/java/br/com/curso/seleniumframework/tests
├─ testng.xml
├─ logs
├─ screenshots
└─ .allure/allure-2.20.1
```

## Configuração
- Edite `src/main/resources/config.properties` e defina: `url.base` (URL do ambiente), `browser` (ex.: chrome) e `timeout.explicit` (segundos, padrão 15).
- Certifique-se de ter Java 17 e Maven 3.8+ instalados e no `PATH`.

## Como Executar
1. Clonar o repositório:
   ```bash
   git clone https://github.com/matheusCSIlva0/selenium-robust-framework.git
   cd selenium-robust-framework
   ```
2. Rodar a suíte padrão (TestNG):
   ```bash
   mvn clean test
   ```

## Relatórios Allure
- Após `mvn clean test`, os resultados ficam em `target/allure-results`.
- Para abrir o relatório com o Allure CLI já incluso no projeto (Windows):
  ```bash
  .\\.allure\\allure-2.20.1\\bin\\allure.bat serve target\\allure-results
  ```
- Alternativa via Maven:
  ```bash
  mvn allure:serve
  ```

## Criar Novos Testes
- Crie Page Objects em `src/main/java/.../pages` estendendo `BasePage`.
- Use os utilitários em `.../utils` para waits, screenshots e dados.
- Escreva testes em `src/test/java/.../tests` estendendo `BaseTest`.
- A suíte é configurada em `testng.xml` (inclua novas classes de teste aqui).

## Repositório e Autor
- Repositório: https://github.com/matheusCSIlva0/selenium-robust-framework
- Autor: Matheus — foco em automação robusta para e-commerces.

## Proposta Comercial (opcional)
Use este template caso queira apresentar o framework a um cliente:
```markdown
Assunto: Framework Profissional de Automação de Testes para seu E-commerce

Olá,

Desenvolvi um framework completo e robusto de automação de testes com Selenium + Java, focado em e-commerces.

O framework inclui:
- Waits inteligentes (evita testes flaky)
- Page Object Model organizado
- Relatórios Allure com screenshots
- Logging completo
- Configuração via properties
- Suporte a execução paralela

Entrego:
- Código fonte completo no GitHub
- Principais fluxos configurados (login, carrinho, checkout, cupons)
- 3 a 5 testes iniciais
- 1 hora de explicação + treinamento
- 30 dias de suporte

Valor: R$ 9.500 (ou US$ 1.700)
Prazo: 7 a 10 dias úteis após aprovação do escopo.

Podemos agendar uma call rápida (15 minutos) para demonstrar o framework ao vivo?

Atenciosamente,
Matheus
```

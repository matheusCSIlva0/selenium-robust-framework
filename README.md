# Selenium Robust Framework - E-commerce 2026

Framework moderno, robusto e profissional para automação de testes com Selenium + Java, especialmente projetado para e-commerces.

Desenvolvido com as melhores práticas de 2026 para eliminar testes flaky, facilitar a manutenção e gerar relatórios profissionais.

## Funcionalidades

- WebDriverManager automático (sem necessidade de baixar drivers manualmente)
- Waits inteligentes (FluentWait) - ideal para carrinhos dinâmicos e preços que mudam
- Page Object Model completo e limpo
- Screenshot automático em caso de falha
- Logging profissional com Log4j2
- Relatórios Allure detalhados e bonitos
- Configuração externa via arquivo properties
- Utilitários específicos para e-commerce (carrinho, cupons, checkout)
- JavaFaker para geração de dados realistas
- Execução em paralelo com TestNG
- Estrutura escalável e fácil de manter

## Tecnologias Utilizadas

- Java 17
- Selenium 4.41.0
- TestNG 7.10.2
- WebDriverManager 6.3.4
- Allure Reports 2.27.0
- JavaFaker 1.0.2
- Log4j2
- Maven


### 1. Configurar o site
Edite o arquivo src/main/resources/config.properties e altere a URL:

```properties
> url.base=https://SEU-E-COMMERCE-AQUI.com.br

2. Rodar os testes
Bashmvn clean test
3. Gerar relatório Allure
Bashmvn allure:serve

Maven Wrapper (já incluso no projeto). 
Basta rodar:Bash./mvnw clean test      (no Linux/Mac)
mvnw.cmd clean test        (no Windows)

> ----Como Criar Novos Testes-----

> Crie uma nova Page Object na pasta pages/
> Utilize os métodos prontos da classe BasePage (clicar, escrever, obterTexto, etc.)
> Crie a classe de teste na pasta tests/ extendendo BaseTest
Utilize as anotações @Description e @Feature para enriquecer o relatório Allure

Exemplo completo está disponível em CompraSimplesTest.java.
Roadmap

> Adicionar suporte a múltiplos browsers
> Testes mobile via Chrome DevTools
> Suporte a Data-Driven com Excel ou CSV
> Integração com CI/CD (GitHub Actions, Jenkins)

Autor Matheus Alves   
Gmail Matheuslog7@gmail.com    
       
> Framework desenvolvido com foco em automação robusta para e-commerces.

> Pronto para uso profissional.

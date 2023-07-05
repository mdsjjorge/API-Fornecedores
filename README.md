# API para cadastro de Fornecedores
Projeto em Spring Boot para cadastrar e listar fornecedores

## Pré-requisitos

JDK (Java Development Kit) - versão 8 ou superior <br>
Maven - ferramenta de gerenciamento de dependências <br>
Git - sistema de controle de versão distribuído <br>

Clone do projeto

```
git clone https://github.com/mdsjjorge/API-Fornecedores.git

cd API-Fornecedores
```

Importe o projeto em sua IDE (IntelliJ, Eclipse, VSCode, NetBeans, etc). <br>
Configure as credenciais do banco de dados: <br>
Abra o arquivo src/main/resources/application.properties. <br>
Edite as configurações de banco de dados de acordo com o seu ambiente. Por exemplo: <br>

```
spring.datasource.url=jdbc:mysql://localhost:3306/nome-do-banco
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha
Salve as alterações feitas no arquivo.
```

Build e execução <br>
Para compilar e executar o projeto, siga as etapas abaixo: <br>

Abra um terminal e navegue até o diretório do projeto. <br>

Execute o seguinte comando para construir o projeto usando o Maven: <br>

```
mvn clean install
```

Após a conclusão da construção, execute o seguinte comando para iniciar o aplicativo:

```
mvn spring-boot:run
```

Aguarde até que o aplicativo seja iniciado e você veja uma mensagem indicando que o aplicativo está em execução. <br>

Abra um navegador da web e acesse http://localhost:3040 para ver a página inicial do projeto.

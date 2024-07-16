
[![My Skills](https://skillicons.dev/icons?i=java,spring,javascript,bootstrap,docker&theme=light)](https://skillicons.dev)

CADASTRO DE CLIENTES
---

**_:green_heart:Spring Boot(Back-End):green_heart: e BootStrap(Front-End)_**


Neste repositorio esta feito um CRUD em Spring Boot, que tem a entidade Cliente, usando o Design DTO e Repository("DAO"). Banco de dados em H2 merante teste para validar os endpoints des projeto.

O Front-End esta feito em BootStrap e JavaScript. Para acessar os HTTPs dos endpoints uso o Assincrono(async) e fetch(_tem trativas a serem melhoradas_).


:world_map: Executar o projeto localmente
---
Para o projeto rodar na sua máquina, pode ter o :whale: Docker com o container em **Apache**(_Front-End_) e **Tomcat**(_Back-End, para o Boot_), **lembrando que ambos devem ter portas diferentes**. Ou pode ter o Xampp, e as consultas feitas pelos EndPoints no Front-End deve esta rodando em uma Service.

Com isso execute o Spring Boot e depois abra a pagina(index.html), e pronto :sunglasses:. Teste e verifique como funciona o código. :smile:

:no_entry: **OBSERVAÇÕES EM ERROS POSSÍVEIS:**

**Causas Comuns e Soluções Servidor Local Não Está em Execução:**

Certifique-se de que o servidor backend (Spring Boot) está em execução na porta 8080 e está acessível. Verifique se você pode acessar http://localhost:8080/clientes diretamente no navegador. Se não puder, o servidor pode não estar rodando ou pode haver um problema com a configuração do servidor. Problemas de :upside_down_face: **CORS**  (Cross-Origin Resource Sharing):

Quando você faz uma solicitação de um cliente (frontend) hospedado em uma origem (por exemplo, file:// ou outra porta) para um servidor em http://localhost:8080, pode haver problemas de CORS. Para resolver problemas de CORS, você pode configurar seu backend Spring Boot para permitir essas solicitações. Remova o numero da porta e pronto.

**Fontes Icones:**

https://github.com/tandpfun/skill-icons

https://github.com/ikatyang/emoji-cheat-sheet/blob/master/README.md

Causas Comuns e Soluções
Servidor Local Não Está em Execução:

Certifique-se de que o servidor backend (Spring Boot) está em execução na porta 8080 e está acessível.
Verifique se você pode acessar http://localhost:8080/clientes diretamente no navegador. Se não puder, o servidor pode não estar rodando ou pode haver um problema com a configuração do servidor.
Problemas de CORS (Cross-Origin Resource Sharing):

Quando você faz uma solicitação de um cliente (frontend) hospedado em uma origem (por exemplo, file:// ou outra porta) para um servidor em http://localhost:8080, pode haver problemas de CORS.
Para resolver problemas de CORS, você pode configurar seu backend Spring Boot para permitir essas solicitações.
Exemplo de Configuração CORS no Spring Boot:

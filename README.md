# ms-email
Micro Service spring para envio de email

## @PostMapping("/sending-email")
Recebe os dados via rest e faz o envio do email e posterior salva o status em um banco de dados.

Serviço tambem pode ser usado via fila RABBITMQ 

## Depedencias
-  data-jpa 
- starter-mail
-  validation
- starter-web
- starter-amqp


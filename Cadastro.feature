            #language: pt

            Funcionalidade: Tela de cadastro
            Como cliente da SWAGLABS 
            Quero fazer concluir meu cadastro   
            Para realizar compra

            Contexto:
            Dado que eu acesse a página de cadastro da loja SWAGLABS para realização de compra

            Cenário: Checkout válido
            Quando eu digitar nome, sobrenome, país, endereço, cidade, cep, telefone, e-mail
            Então deve exibir a mensagem " Pedido efetuado com sucesso"

            Cenário: Checkout inválido
            Quando eu digitar nome, sobrenome, país, endereço, cidade, cep, telefone, e-mail com formato inválido
            Então deve exibir mensagem "E-mail inválido"

            Cenário: Checkout inválido
            Quando eu deixar algum campo de preenchimento obrigátorio vazio como nome, sobrenome, país, endereço, cidade, cep, telefone, e-mail 
            Então deve exibir mensagem "Para a finalização do pedido deve-se preencher corretamente os campos obrigátorios indicados por asteristico acima"

            Esquena do Cenário: Autenticar multiplos checkouts válidos
            Quando eu digitar <nome>, <sobrenome>,  <país>, <endereço>, <cidade>, <telefone>, <e-mail> 
            Então deve exibir <mensagem>

            Exemplos: 
            | nome | sobrenome | país | endereço | cidade | cep | telefone | e-mail |  mensagem |
            | "jessica" | "teixeira araujo" | "Brasil" | "Passagem A, nº 00" | " Teste" | "60821-354" | "(21)98161-8930" | "jessicateixeiraaraujo@gmail.com" | "Pedido efetuado com sucesso"|
            | "jessica" | "teixeira araujo" | "Brasil" | "Passagem A, nº 00" | " Teste" | "60821-354" | "(21)98161-8930" | "jessicateixeiraaraujogmail.com" | "E-mail inválido"|
            | "jessica" | "teixeira araujo" | "Brasil" | "Passagem A, nº 00" | " Teste" | "60821-354" | "  " | "jessicateixeiraaraujo@gmail.com" | "Para a finalização do pedido deve-se preencher corretamente os campos obrigátorios indicados por asteristico acima"|
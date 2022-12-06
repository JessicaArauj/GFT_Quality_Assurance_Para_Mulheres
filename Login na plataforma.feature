            #language: pt

            Funcionalidade: Tela de login
            Como cliente da EBAC-SHOP
            Quero fazer o login (autenticação) na plataforma  
            Para visualizar meus pedidos


            Contexto:
            Dado que eu acesse a página de autenticação da loja EBAC-SHOP

            Cenário: Autenticação válida
            Quando eu digitar o usuário "jessicateixeiraaraujo@gmail.com"
            E a senha "8161je"
            Então deve redirecionar-me para a "tela de checkout"

            Cenário: Usuário inexistente
            Quando eu digitar o usuário "jessicateixeiraaraujo_2020@gmail.com"
            E a senha "8161je"
            Então deve exibir uma mensagem de erro "Usuário ou senha inválidos"

            Esquena do Cenário: Autenticar multiplos usuários ou senha inválidos
            Quando eu digitar o <usuário>
            E a <senha>
            Então deve exibir a <mensagem> de erro

            Exemplos:
            | usuário             | senha    |  login  | mensagem                     |
            | "jessicateixeiraaraujo_2020@gmail.com" | "8161je" | "login" | "Usuário ou senha inválidos" |
            | "jessicaaraujo@gmail.com" | "abcdje" | "login" | "Usuário ou senha inválidos" |
            | "jessicataraujo@gmail.com" | "1545je" | "login" | "Usuário ou senha inválidos" |




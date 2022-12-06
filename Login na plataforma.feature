            #language: pt

            Funcionalidade: Tela de login
            Como cliente da SWAGLABS
            Quero fazer o login (autenticação) na plataforma  
            Para visualizar meus pedidos


            Contexto:
            Dado que eu acesse a página de autenticação da loja SWAGLABS

            Cenário: Autenticação válida
            Quando eu digitar o usuário "standard_user"
            E a senha "secret_sauce"
            Então deve redirecionar-me para a "tela de pedidos"

            Cenário: Usuário inexistente
            Quando eu digitar o usuário "standard"
            E a senha "secret_sauce"
            Então deve exibir uma mensagem de erro "Usuário ou senha inválidos"

            Esquena do Cenário: Autenticar multiplos usuários ou senha inválidos
            Quando eu digitar o <usuário>
            E a <senha>
            Então deve exibir a <mensagem> de erro

            Exemplos:
            | usuário             | senha    |  login  | mensagem                     |
            | "standard_us" | "secret_sauce" | "login" | "Usuário ou senha inválidos" |
            | "standard_udsgs" | "secret_sauce" | "login" | "Usuário ou senha inválidos" |
            | "stand_us" | "secret_sauce" | "login" | "Usuário ou senha inválidos" |



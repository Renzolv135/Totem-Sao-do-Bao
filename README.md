São do Bão - Totem de Fast Food

Sobre o projeto

O São do Bão é um sistema de totem de autoatendimento para fast food, desenvolvido com o objetivo de tornar o processo de compra mais rápido, prático e automatizado.

O sistema permite que o próprio cliente realize seu pedido, escolha produtos, aplique descontos e finalize o pagamento sem precisar de atendimento direto.

Objetivo

Este projeto foi criado para facilitar a experiência do cliente em estabelecimentos de fast food, reduzindo filas e agilizando o atendimento por meio de um sistema simples e intuitivo.

Tecnologias utilizadas

Java 17 -
MySQL 5.1.16 -
NetBeans 8.2 -
JDBC (conexão com banco de dados) -
iText (geração de PDF) -

Arquitetura

O sistema foi desenvolvido utilizando o padrão MVC (Model-View-Controller):

* Model: responsável pelo banco de dados (produtos e pedidos)
* View: interface gráfica (telas do sistema)
* Controller: faz a comunicação entre interface e banco

Essa estrutura ajuda a manter o código organizado e facilita futuras manutenções.

Funcionalidades

Requisitos Funcionais

* Inserir produtos no banco de dados
* Cancelar pedido
* Exibir subtotal da compra
* Aplicar desconto
* Finalizar pedido
* Gerar nota fiscal em PDF
* Inserir nome do cliente
* Inserir CPF do cliente

Requisitos Não Funcionais

* Uso de banco de dados MySQL
* Atualização automática do subtotal
* Sistema leve e eficiente

Fluxo do sistema

1. Tela inicial (toque para iniciar)
2. Menu principal (produtos + subtotal)
3. Escolha de categorias:

   * Lanches
   * Bebidas
   * Acompanhamentos
   * Sobremesas
   * Combos
4. Inserção de CPF (opcional)
5. Inserção do nome
6. Seleção de descontos
7. Aplicação do desconto
8. Escolha do pagamento:

   * Débito
   * Crédito
   * Dinheiro
   * Pix
9. Confirmação do pagamento
10. Geração da nota fiscal em PDF


Banco de Dados

O sistema segue o seguinte fluxo:

1. Criação do banco de dados
2. Criação da tabela de produtos
3. Inserção dos produtos
4. Criação da tabela de pedidos
5. Associação dos produtos ao pedido
6. Registro de CPF (opcional)
7. Registro do nome do cliente
8. Aplicação de desconto no valor final

Geração de Nota Fiscal

Após a finalização do pedido, o sistema gera automaticamente uma nota fiscal em PDF contendo:

* Produtos selecionados
* Valor total
* Nome do cliente
* CPF (se informado)

Autor

Renan da Silva Oliveira
📧 ren.olv.18@gmail.com

Versão

Versão: 1.0
Data: 31/03/2026

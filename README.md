**São do Bão - Totem de Fast Food**

Sobre o projeto

O São do Bão é um sistema de totem de autoatendimento para fast food, desenvolvido com o objetivo de tornar o processo de compra mais rápido, prático e automatizado.

O sistema permite que o próprio cliente realize seu pedido, escolha produtos, aplique descontos e finalize o pagamento sem precisar de atendimento direto.

**Objetivo**

Este projeto foi criado para facilitar a experiência do cliente em estabelecimentos de fast food, reduzindo filas e agilizando o atendimento por meio de um sistema simples e intuitivo.

**Tecnologias utilizadas**

* *Java 17*
* *MySQL 5.1.16*
* *NetBeans 8.2*
* *JDBC (conexão com banco de dados)*
* *iText (geração de PDF)*

**Arquitetura**

O sistema foi desenvolvido utilizando o padrão MVC (Model-View-Controller):

* Model: responsável pelo banco de dados (produtos e pedidos)
* View: interface gráfica (telas do sistema)
* Controller: faz a comunicação entre interface e banco

Essa estrutura ajuda a manter o código organizado e facilita futuras manutenções.

**Funcionalidades**

*Requisitos Funcionais*

* Inserir produtos no banco de dados
* Cancelar pedido
* Exibir subtotal da compra
* Aplicar desconto
* Finalizar pedido
* Gerar nota fiscal em PDF
* Inserir nome do cliente
* Inserir CPF do cliente

*Requisitos Não Funcionais*

* Uso de banco de dados MySQL
* Atualização automática do subtotal
* Sistema leve e eficiente

*Fluxo do sistema*

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


**Banco de Dados**

O sistema segue o seguinte fluxo:

1. Criação do banco de dados
2. Criação da tabela de produtos
3. Inserção dos produtos
4. Criação da tabela de pedidos
5. Associação dos produtos ao pedido
6. Registro de CPF (opcional)
7. Registro do nome do cliente
8. Aplicação de desconto no valor final

**Geração de Nota Fiscal**

Após a finalização do pedido, o sistema gera automaticamente uma nota fiscal em PDF contendo:

* Produtos selecionados
* Valor total
* Nome do cliente
* CPF (se informado)

**Imagens do Sistema-**

*Tela inicial-*

<img width="499" height="550" alt="image" src="https://github.com/user-attachments/assets/514481ad-acea-4ee2-87c2-6c8958e131d2" />

*Tela Geral-*

<img width="602" height="749" alt="image" src="https://github.com/user-attachments/assets/966aaf1d-a3f1-4a39-a15a-b9723df46bb8" />

*Tela de Lanches-*

<img width="599" height="753" alt="image" src="https://github.com/user-attachments/assets/97df163f-d98d-48ba-b478-659a3453832d" />

*Tela de Bebidas-*

<img width="599" height="748" alt="image" src="https://github.com/user-attachments/assets/aa060f8c-2975-4066-906b-d441e11f4080" />

*Tela de Acompanhamentos-*

<img width="597" height="746" alt="image" src="https://github.com/user-attachments/assets/e897fdf2-77fa-4acc-aa98-27db6609f816" />

*Tela de Sobremesas-*

<img width="597" height="739" alt="image" src="https://github.com/user-attachments/assets/9e266c26-e0d4-49f9-ae3a-83bef4f3fe72" />

*Tela de CPF-*

<img width="431" height="529" alt="image" src="https://github.com/user-attachments/assets/7455205c-1532-4940-a89a-ae9c9e744782" />

*Tela de Nome-*

<img width="396" height="447" alt="image" src="https://github.com/user-attachments/assets/a9309de6-e588-4b36-9251-c996a6b5fe1a" />

*Tela de Caixas (Parte da Funcao de Descontos)-*

<img width="400" height="449" alt="image" src="https://github.com/user-attachments/assets/ad28ec18-04b1-4861-967c-b20b12b9f97a" />

*Tela de Informacao do Desconto-*

<img width="400" height="450" alt="image" src="https://github.com/user-attachments/assets/cb6c7c6d-e109-4a5c-8b14-9f5463c469bf" />

*Tela de Opcões de Pagamentos-*

<img width="402" height="448" alt="image" src="https://github.com/user-attachments/assets/6281d848-42cd-493c-8c62-01436d3ea74e" />

*Tela de Pagamento do Pix-*

<img width="448" height="437" alt="image" src="https://github.com/user-attachments/assets/2f800a5d-ca8c-4796-9bb3-3385cc7c254c" />

*Tela de Pagamento Debito/Credito-*

<img width="401" height="452" alt="image" src="https://github.com/user-attachments/assets/9d7dd465-c0c1-47c6-afda-a3fb0f7bfd16" />

*Pdf Gerado-*

<img width="604" height="471" alt="image" src="https://github.com/user-attachments/assets/8b797668-50f9-44fc-b4db-4e9e0408cd6b" />


**Autor**

**Renan da Silva Oliveira**
📧 ren.olv.18@gmail.com

*Versão*

* Versão: 1.0
* Data: 31/03/2026

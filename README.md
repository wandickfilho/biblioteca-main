📚 Sistema de Biblioteca
Sistema de gerenciamento de empréstimos de livros desenvolvido em Java.
🗂️ Estrutura do Projeto
src/
└── Projeto/
    ├── Livro.java   → Modelo do livro
    ├── Menu.java    → Interface com o usuário e lógica do sistema
    └── Main.java    → Ponto de entrada da aplicação
⚙️ Funcionalidades

Cadastrar livros com ID, título e estoque
Listar todos os livros do catálogo
Buscar livro por ID
Emprestar livro (diminui estoque)
Devolver livro (aumenta estoque)

🧱 Classes
Livro
Representa um livro do acervo. Armazena ID, título, quantidade em estoque e quantidade emprestada. Controla empréstimo e devolução através dos métodos diminuirEstoque() e aumentarEstoque().
Menu
Responsável pelo menu interativo e pela lógica do sistema. Utiliza um vetor (Livro[]) para armazenar até 100 livros, percorrendo-o manualmente para busca e listagem.
Main
Inicia a aplicação chamando o método iniciar() da classe Menu.
▶️ Como executar

Importe o projeto no Eclipse
Certifique-se que os 3 arquivos estão dentro do pacote Projeto
Execute a classe Main.java

🛠️ Tecnologias

Java
Eclipse IDE
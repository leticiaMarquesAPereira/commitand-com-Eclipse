## Criando repositório e fazendo PUSH com Eclipse

Passo 1: Iniciar um repositório Git no seu projeto

- Clique com o botão direito no projeto que você deseja versionar com o Git.
- Selecione Team > Share Project.
- Escolha Git e clique em Next.
- Selecione Create para criar um novo repositório Git local (ou escolha um repositório existente, se aplicável).
- Clique em Finish.

##
        
Passo 2: Adicionar Arquivos e Fazer Commit

- Clique com o botão direito no projeto.
- Vá em Team > Add to Index.
  
Fazer commit dos arquivos:

- Clique com o botão direito no projeto.
- Vá em Team > Commit.
- Adicione uma mensagem de commit e selecione os arquivos que deseja comitar (só funcionará para os arquivos que você fez alguma modificação desde o último commit).
- Clique em Commit.

##
      
Passo 3: Configurar Repositório Remoto no GitHub

- Vá para o GitHub e crie um novo repositório (não adicione README, .gitignore ou licença).

Adicionar repositório remoto no Eclipse:

- Clique com o botão direito no projeto.
- Vá em Team > Remote > Push.
- Configure a URL do repositório GitHub (copie a URL do repositório criado).
- Insira seu user do GitHub (no meu caso, é leticiaMarquesAPereira).
- Gere um Token no GitHub e insira-o no lugar de SENHA.
  -- Se você tentar colocar sua senha GitHub, não funcionará. Se tiver dúvidas de como criar seu Token de acesso, assista esse [vídeo de 1 munitinho](https://www.youtube.com/watch?v=H_uyu9pzUE0).
- Clique em Next e depois selecione a opção All Branches.
- Clique em Finish.

##
          
Passo 4: Pushing para o GitHub

Pushing do projeto para o repositório remoto:

- Clique com o botão direito no projeto.
- Vá em Team > Push to Upstream.

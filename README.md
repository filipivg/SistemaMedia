# SistemaMedia

## Questões finais

### 1. Qual era o principal problema do código original?
Código mal estruturado, nomes pouco descritivos, dificultando o entendimento.

### 2. Quais melhorias você realizou?
Substituição dos nomes de variáveis por(`nomeAluno`, `nota1`, `nota2`, `media`, `situacao`);
Modularização do código em métodos: `calcularMedia`, `verificarSituacao` e `exibirResultado`;
Padronização de indentação, camelCase.

### 3. Como a modularização facilitou a organização do código?
Cada parte do código passou a ser mais fácil de entender, testar e manter isoladamente. Isso também tornou o código mais limpo.

### 4. Como o Git ajudou a controlar as alterações realizadas no sistema?
O Git permitiu registrar o histórico completo da evolução do sistema, mantendo o código original preservado no primeiro commit e isolando as melhorias em uma branch separada (`melhoria-boas-praticas`), sem afetar a versão estável na `main`. Isso possibilitou revisar as mudanças por meio do Pull Request antes de integrá-las definitivamente, garantindo rastreabilidade e segurança em todo o processo de refatoração.

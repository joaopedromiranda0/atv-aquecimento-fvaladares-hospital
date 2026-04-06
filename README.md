Sistema de Atendimento Hospitalar 

Descrição: 
Este projeto implementa um sistema de controle de atendimento hospitalar utilizando a estrutura de dados Fila.
O sistema simula a geração de senhas para pacientes e o atendimento em ordem de chegada, conforme proposto no trabalho prático da disciplina de Estrutura de Dados. 

Conceito Utilizado 
> Foi utilizado a estrutura de dados File (Queue), que segue o princípios:
> FIFO (First In, First Out), O primeiro elemento a entrar é o primeiro a sair.

 Funcionalidade
 > gerarSenha()
. Gera uma nova senha sequencial
. Adiciona o paciente à filade atendimento

> chamarProximo()
. Remove o primeiro paciente da fila
. Registra o atendimento no histórico
. Só funciona se houver pacientes na fila

> mostrarFila()
. Exibe os pacientes que ainda aguardem atendimento

> mostrarHistorico()
. Exibe as senhas já atindidas

> Exemplo de Execução
> FilaHospital fh = new FilaHospital();
> fh.gerarSenha();
> fh.gerarSenha();
> fh.gerarSenha();
> fh.mostrarFila();
> fh.chamarProximo();
> fh.chamarProximo();
> fh.mostrarFila();
> fh.mostrarHistorico();

> Comportamento do Sistema
. As senhas são geradas de forma sequencial (1,2,3 ...)
. O atendimento ocorre respeitando a ordem de chegada
. Não é possível chamar pacientes se a fila estiver vazia
. O sistema mantém um histórico dos atendimentos realizados

> Melhorias Implementadas
Além dos requisitos do trabalho, foram adicionadas melhorias:
> Organização do código em classes separadas
> Histórico de atendimentos
> Código estruturado e de fácil leitura
> Simulação clara do funcionamento real de um sistema de filas

Objetivo Acadêmico
Este projeto tem como obejetivo aplicar na prática os conceitos de filas, demonstrando seu uso em sistemas reais, como o atendimento em hospitais. 

Alunos 
> João Pedro Miranda Reis Silva - 972310486
> João Victor Nunes Inácio - 972311105





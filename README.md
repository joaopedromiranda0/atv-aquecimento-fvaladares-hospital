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



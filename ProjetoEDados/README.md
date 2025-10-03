# Comparador de Listas Java

## Descrição
Projeto Java que compara o desempenho de `ArrayList`, `LinkedList` e `Vector` no cadastro, ordenação e exportação de 350.000 alunos.

## Estruturas Utilizadas
- ArrayList
- LinkedList
- Vector

## Funcionalidades
- Geração de alunos aleatórios
- Cadastro em diferentes listas
- Ordenação por nome
- Exportação para CSV
- Medição de tempo das operações

## Resultados Obtidos (Exemplo)
| Operação     | ArrayList (ms) | LinkedList (ms) | Vector (ms) |
|--------------|----------------|------------------|-------------|
| Cadastro     | 950            | 1100             | 1350        |
| Ordenação    | 400            | 850              | 600         |
| Exportação   | 550            | 650              | 700         |

## Execução
```bash
javac com/example/*.java
java com.example.ComparadorListas

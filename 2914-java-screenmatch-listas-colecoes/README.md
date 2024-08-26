![thumbnail-Formação Java (3)](https://user-images.githubusercontent.com/66698429/226652162-77d758f2-3d34-4f6d-bb9b-37b3c00d0759.png)


# Java: trabalhando com listas e coleções de dados

Projeto desenvolvido no terceiro curso da formação Java da Alura


## 🔨 Objetivos do projeto

- Mergulhar mais profundamente em Java, entendendo a hierarquia de classes e métodos;
- Aprender a representar uma lista de objetos; 
- Conhecer os recursos para manipulação dessa lista, como inclusão, exclusão, ordenação;
- Fazer casting de objetos e identificar o tipo dos mesmo;
- Construir os objetos já com valores e com diferentes critérios;
- Avançar nos estudos e entender novos conceitos primordiais para o desenvolvimento de aplicações back-end.


## Principais tipos de listas vistas nesse curso
ArrayList: 
A principal característica do ArrayList é que ele é baseado em um array dinâmico. Ele armazena os elementos em uma matriz interna e, conforme novos elementos são adicionados, o tamanho da matriz é automaticamente ajustado para acomodar o novo elemento. Da mesma forma, quando um elemento é removido, o tamanho do array é ajustado para evitar o desperdício de espaço. O ArrayList é amplamente utilizado devido à sua facilidade de uso e eficiência em termos de desempenho.

LinkedList: 
A classe LinkedList fornece uma lista encadeada de elementos. Diferentemente do ArrayList, que é baseado em um array, o LinkedList é baseado em uma lista encadeada, o que significa que cada elemento da lista é um objeto que contém uma referência para o próximo elemento. Isso permite que os elementos sejam adicionados e removidos de maneira eficiente em qualquer posição da lista, mas pode tornar a pesquisa de um elemento específico menos eficiente.

O LinkedList é uma boa escolha quando a inserção e remoção de elementos em qualquer posição da lista é frequente e quando não é necessário acessar os elementos de forma aleatória.

Vector: 
A classe Vector é semelhante ao ArrayList, mas é sincronizada, o que significa que é segura para uso em threads concorrentes. No entanto, a sincronização adiciona uma sobrecarga de desempenho, então o Vector pode ser mais lento que o ArrayList em algumas situações.

Stack: 
A classe Stack implementa uma pilha, que é uma coleção ordenada de elementos onde a inserção e remoção de elementos ocorrem sempre no mesmo extremo da lista. Os elementos são adicionados e removidos em uma ordem conhecida como "last-in, first-out" (LIFO), ou seja, o último elemento adicionado é o primeiro a ser removido. A classe Stack é usada com frequência em algoritmos de processamento de texto, bem como em outras situações em que a LIFO é a maneira natural de organizar os dados.

Cada uma dessas classes tem seus próprios pontos fortes e fracos, e a escolha de qual usar dependerá das necessidades específicas da aplicação. Para um melhor entendimento sobre estruturas de dados.

## Map e HashMap
Uma das características mais importantes do Java é sua vasta biblioteca padrão, que oferece muitas classes e interfaces úteis para os desenvolvedores. Entre elas, estão o Map e o HashMap, que são ferramentas essenciais para associação de chaves e valores em muitas aplicações Java.

Map: 
O Map é uma interface que permite que os desenvolvedores associem chaves a valores. É uma estrutura de dados útil para muitas aplicações Java, especialmente aquelas que envolvem a manipulação de grandes quantidades de dados, portanto, é comum usá-lo para realizar buscas, atualização e recuperação de elementos por chaves

Ele é implementado por diversas classes, sendo a mais comum delas o HashMap.

HashMap: 
O HashMap é uma classe que implementa a interface Map usando uma tabela hash para armazenar os pares chave-valor. Ele é conhecido por sua eficiência em termos de tempo de execução. Essa classe tem uma complexidade de tempo O(1) - constante - para inserção, recuperação e remoção de elementos. Isso significa que o desempenho do HashMap não depende do tamanho da coleção de dados!

No entanto, é importante lembrar que o HashMap não mantém a ordem de inserção dos elementos e não garante a ordem dos elementos na saída. Isso ocorre porque a ordem dos elementos depende da função de hash usada para mapear as chaves para índices na tabela hash. Além disso, o desempenho do HashMap pode ser afetado se houver muitas colisões de hash entre as chaves.
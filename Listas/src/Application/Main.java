package Application;

import java.util.ArrayList;//classe que implementa a interfase (mais otimizada)
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        AULA SOBRE LISTAS E SEUS METODOS:

//        CRIACAO DE UMA LISTA
        List <String> list = new ArrayList<>();
//        List <String> list = new ArrayList<String>(); pode ser feito dessa forma tambem
//           <generics> = String, Integer, Double ... nao eh aceito tipos primitivos

        list.add("Maria");//forma de adicionar elemento
        list.add("bob");
        list.add("Mia");
        list.add(2,"marcos");//adicionando em uma posicao desejada

        // printando o tamanho de uma lista
        System.out.println(list.size());

        //remover elemento da lista
        list.remove("Mia"); //remove um elemento desejado
        list.remove(1);// remove o elemento presente no index 1 da lista
        //removendo elementos com base em um predicado
        list.removeIf( x -> x.charAt(0) == 'M'); // remove da lista elementos que comecam com a letra M
        list.removeIf( x -> x.charAt(0) != 'M'); // remove da lista elementos que nao comecam com a letra M

        //encontrar a posicao de um elemento
        list.indexOf("bob");

     // usando filtro na lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        //criacao de uma lista chamado result
//        conventemos a Lista list para Stream
//        fazemos uma operacao lambida
//        retornamos(convertemos) para um lista

//        encontrar um elemento da lista com um predicado
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
//      findfirst (pega o primeiro elemento da lista que atende ao predicado) se ele nao existir ele retorna nulo.
    }
}
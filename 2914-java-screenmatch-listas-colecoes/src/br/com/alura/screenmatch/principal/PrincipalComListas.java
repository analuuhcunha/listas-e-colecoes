package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        var meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(9);
        var outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(6);
        var filmeDaAna = new Filme("Dogville",2003);
        filmeDaAna.avalia(10);
        var lost = new Serie("Lost",2000);

        Filme f1 = filmeDaAna;

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDaAna);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);
        for (Titulo item: listaDeAssistidos) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) { //para eliminar a linha 26 já declaramos filme como Filme aqui
                //var filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        //Lista de artistas aleatórios somente para aprender a ordenação alfabética da lista feita pelo Collections.sort
        //linha de baixo também poderia ser escrita como ArrayList<String> buscaPorArtista = new ArrayList<>() visto que List
        //é uma interface generalista de ArrayList, é melhor usar o mais geral (genérico) para código mais robusto
        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Keanu Rives");
        buscaPorArtista.add("Jim Carry");
        buscaPorArtista.add("Jeniffer Aniston");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);

        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenação por ano: " + listaDeAssistidos);
    }
}

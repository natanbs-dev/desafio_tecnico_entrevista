package org.barbosa.dev;

import java.util.ArrayList;
import java.util.List;

public class Invert_list {
//  COMANDO DO SCRIPT:
//      faça uma aplicação que printe as frases em ordem inversa
//      utilize de array ou lista para fazer este desafio
//      coloque um loop para este desafio

    public static List<String> inverterLista(List<String> lista) {
        List<String> listaInvertida = new ArrayList<>();

        for (int i = lista.size()- 1; i >=0; i--) {
            listaInvertida.add(lista.get(i));
        }
        return listaInvertida;
    }

    public static void main (String[] args) {
        List<String> listaOriginal = new ArrayList<>();
        listaOriginal.add("java");
        listaOriginal.add("python");

        System.out.println("Lista Original" + listaOriginal);

        List<String> listaIvertida = inverterLista(listaOriginal);

        System.out.println("lista invertida" + listaIvertida);
    }


}
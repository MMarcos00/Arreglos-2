package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;

import java.util.HashSet;
import java.util.LinkedList;

public class EjercicioLinkedList {

    // Problema 1: Eliminar duplicados en una LinkedList<Integer>
    public static LinkedList<Integer> eliminarDuplicados(LinkedList<Integer> lista) {
        HashSet<Integer> seen = new HashSet<>();
        LinkedList<Integer> resultado = new LinkedList<>();
        for (Integer num : lista) {
            if (!seen.contains(num)) {
                seen.add(num);
                resultado.add(num);
            }
        }
        return resultado;
    }

    // Problema 2: Invertir una LinkedList<String> sin usar otra lista o ArrayList
    public static void invertirLista(LinkedList<String> lista) {
        for (int i = 0; i < lista.size() / 2; i++) {
            String temp = lista.get(i);
            lista.set(i, lista.get(lista.size() - 1 - i));
            lista.set(lista.size() - 1 - i, temp);
        }
    }

    // Problema 3: Intercalar dos listas ordenadas en una nueva LinkedList<Integer>
    public static LinkedList<Integer> intercalarListas(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {
        LinkedList<Integer> resultado = new LinkedList<>();
        int i = 0, j = 0;
        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) < lista2.get(j)) {
                resultado.add(lista1.get(i++));
            } else {
                resultado.add(lista2.get(j++));
            }
        }
        while (i < lista1.size()) resultado.add(lista1.get(i++));
        while (j < lista2.size()) resultado.add(lista2.get(j++));
        return resultado;
    }
}

package Prim;

import java.util.Arrays;

public class Solver {
	
	public static void algoritmoPrim(int[][] grafo) {
        int vertices = grafo.length;
        boolean[] visitado = new boolean[vertices];
        int[] padre = new int[vertices];
        int[] clave = new int[vertices];

        // Inicializar las claves con infinito y el padre como -1
        Arrays.fill(clave, Integer.MAX_VALUE);
        Arrays.fill(padre, -1);

        // El vértice inicial es el 0
        clave[0] = 0;

        for (int i = 0; i < vertices - 1; i++) {
            int u = minimaClave(clave, visitado);
            visitado[u] = true;

            for (int j = 0; j < vertices; j++) {
                if (grafo[u][j] != 0 && !visitado[j] && grafo[u][j] < clave[j]) {
                    padre[j] = u;
                    clave[j] = grafo[u][j];
                }
            }
        }

        // Imprimir el AGM
        System.out.println("Aristas del AGM:");
        for (int i = 1; i < vertices; i++) {
            System.out.println("Vertice " + padre[i] + " - Vertice " + i + " (Peso: " + grafo[i][padre[i]] + ")");
        }
    }

    public static int minimaClave(int[] clave, boolean[] visitado) {
        int minimo = Integer.MAX_VALUE;
        int indiceMinimo = -1;

        for (int v = 0; v < clave.length; v++) {
            if (!visitado[v] && clave[v] < minimo) {
                minimo = clave[v];
                indiceMinimo = v;
            }
        }

        return indiceMinimo;
    }

}

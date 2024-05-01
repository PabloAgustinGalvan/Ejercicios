package Prim;

public class main {

	public static void main(String[] args) {
		
		int[][] grafo = {
	            {0, 2, 0, 6},
	            {2, 0, 3, 8},
	            {0, 3, 0, 0},
	            {6, 8, 0, 0}
	        };
		
		
		Solver.algoritmoPrim(grafo);
		
		//punto 2 grafo con pesos que tenga mas de un agm
		int[][] grafo2MasAgm = {
		            {0, 1, 0, 1, 0},
		            {1, 0, 1, 0, 1},
		            {0, 1, 0, 1, 0},
		            {1, 6, 1, 0, 1},
		            {0, 1, 0, 1, 0}
		            
		        };
		
		Solver.algoritmoPrim(grafo2MasAgm);
		
		//punto 3 grafo con pesos con exactamente 2 agm
		int[][] grafo2Agm = {
	            {0, 1, 1, 0},
	            {1, 0, 0, 1},
	            {1, 0, 0, 1},
	            {0, 1, 1, 0}
	        };
		
		Solver.algoritmoPrim(grafo2Agm);
		
		
		
		
		
	
		


	}

}

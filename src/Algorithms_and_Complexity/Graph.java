package Algorithms_and_Complexity;

public class Graph {
	// Adjacency Matrix representation in Java
	  private boolean adjMatrix[][];
	  private int numVertices;

	  // Initialize the matrix
	  public Graph(int numVertices) {
	    this.numVertices = numVertices;
	    adjMatrix = new boolean[numVertices][numVertices];
	  }

	  // Add edges
	  public void addEdge(int i, int j) {
	    adjMatrix[i][j] = true;
	    adjMatrix[j][i] = true;
	  }

	  // Remove edges
	  public void removeEdge(int i, int j) {
	    adjMatrix[i][j] = false;
	    adjMatrix[j][i] = false;
	  }

	  // Print the matrix
	  public String toString() {
	    StringBuilder s = new StringBuilder();
	    for (int i = 0; i < numVertices; i++) {
	      s.append(i + ": ");
	      for (boolean j : adjMatrix[i]) {
	        s.append((j ? 1 : 0) + " ");
	      }
	      s.append("\n");
	    }
	    return s.toString();
	  }
}

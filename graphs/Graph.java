package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {
public static void printDfsHelper(int edges [][],int sv, boolean []visited) {
	System.out.println(sv);
	visited[sv]=true;
	int n=edges.length;
	for(int i=0;i<n;i++) {
		if(edges[sv][i]==1 && !visited[i]) {
			printDfsHelper(edges,i,visited);
		}
	}
}


public static void DFS(int edges[][]) {
	boolean visited[]=new boolean[edges.length];
	for(int i=0;i<edges.length;i++) {
		if(!visited[i]) {
	printDfsHelper(edges, i, visited);
		}
	}
}
public static void printBfsHelper(int edges[][],int sv, boolean[]visited){
	Queue<Integer> q= new LinkedList<>();
	
	q.add(sv);
	visited[sv]= true;
	
	while( ! q.isEmpty() )
	{
		int n= q.remove();
		System.out.print(n + " ");
		
		for( int i= 0; i<edges.length; i++ )
		{
			if( edges[n][i] == 1 && ! visited[i] )
			{
				q.add(i);
				visited[i]= true;
			}
		}
		
	}
	
}
public static void BFS(int [][]edges) {
	boolean visited[]=new boolean[edges.length];
	for(int i=0;i<edges.length;i++) {
		if(!visited[i]) {
			printBfsHelper(edges, i, visited);

		}

	}
}
	public static void main(String[] args) {
		int n;
		int e;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		e = s.nextInt();
		int edges[][] = new int[n][n];
		for(int i=0;i<e;i++) {
			int fv=s.nextInt();
			int sv=s.nextInt();
			edges[fv][sv]=1;
			edges[sv][fv]=1;

		}
		System.out.println("DFS");
		DFS(edges);
		System.out.println("BFS");
		BFS(edges);

	}

}

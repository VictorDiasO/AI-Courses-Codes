package DepthFirstSearch.withRecursion;

import java.util.List;
import java.util.Stack;

public class DFS {
	
	private Stack<Vertex> stack;
	
	public DFS() {
		this.stack = new Stack<>();
	}
	
	public void dfs(List<Vertex> vertexList) {
		
		for(Vertex v : vertexList) {
			if( !v.isVisited() ) {
				v.setVisited(true);
				dfsRecursive(v);
			}
		}
		
	}
	
	private void dfsRecursive(Vertex v) {
		System.out.print(v+" ");
		
		for(Vertex vertex : v.getNeighbourList()) {
			if( !vertex.isVisited() ) {
				vertex.setVisited(true);
				dfsRecursive(vertex);
			}
		}
	}

	private void dfsWithStack(Vertex rootVertex) {
		this.stack.add(rootVertex);
		rootVertex.setVisited(true);
		
		while( !stack.isEmpty() ) {
			
			Vertex actualVertex = this.stack.pop();
			System.out.print(actualVertex+" ");
			
			for(Vertex v : actualVertex.getNeighbourList()) {
				if( !v.isVisited() ) {
					v.setVisited(true);
					this.stack.push(v);
				}
			}
			
		}
		
	}

}

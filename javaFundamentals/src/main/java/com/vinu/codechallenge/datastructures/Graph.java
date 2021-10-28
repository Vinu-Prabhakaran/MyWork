/**
 * 
 */
package com.vinu.codechallenge.datastructures;

/**
 * @author Vinu Prabhakaran
 *         on Sep 17, 2021
 *
 */
import java.util.*;
import java.util.Queue;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
class Vertex{
	private String name;
	
	public Vertex(String name) {
		this.name=name;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "[name=" + name + "]";
	}
	
	
}
@Getter
@Setter
public class Graph {
	
	private Map<Vertex,List<Vertex>> graphVertices;
	
	public Graph() {
		this.graphVertices = new HashMap<>();
	}
	
	public void addVertex(String name) {
		Vertex v=new Vertex(name);
		
		graphVertices.putIfAbsent(v, new ArrayList<>());
	}
	
	public void removeVertex(String name) {
		Vertex v=new Vertex(name);
		graphVertices.values().stream().forEach(l -> l.remove(v));// remove all references from adjlist
		graphVertices.remove(v);

	}
	
	public void addEdge(String n1,String n2) {
		Vertex v1=new Vertex(n1);
		Vertex v2=new Vertex(n2);
		graphVertices.get(v1).add(v2); // add v2 to adjList of v1
		graphVertices.get(v2).add(v1); // add v1 to adjList of v2

	}
	
	public void removeEdge(String n1,String n2) {
		Vertex v1=new Vertex(n1);
		Vertex v2=new Vertex(n2);	
		List<Vertex> eV1 = graphVertices.get(v1);
		if (!eV1.isEmpty()) {
			eV1.add(v2); // remove v2 from adjList of v1
		}
		List<Vertex> eV2 = graphVertices.get(v2);
		if (!eV2.isEmpty()) {
			eV2.add(v1); // remove v1 from adjList of v2
		}
	}
	
	public List<Vertex> getAdjacentVerticles(String name) {
		Vertex v= new Vertex(name);
		return graphVertices.get(v);
	}
	
	public static Set<Vertex> depthFirstTraversal(Graph graph,Vertex root){
		
		Set<Vertex> visited = new LinkedHashSet<>();
		Deque<Vertex> stack= new LinkedList<>();
		
		stack.push(root);
		while(!stack.isEmpty()) {
			Vertex currItem = stack.pop();
			if (!visited.contains(currItem)) {
				visited.add(currItem);
			}
			for (Vertex v: graph.getAdjacentVerticles(currItem.getName())){
				if (!visited.contains(v)) {
					stack.push(v);
				}
			}
		}
		
		return visited;
	}
	public static Set<Vertex> breadthFirstTraversal(Graph graph,Vertex root){
		
		Set<Vertex> visited = new LinkedHashSet<>();
		Queue<Vertex> queue= new LinkedList<>();
		
		queue.offer(root);
		while(!queue.isEmpty()) {
			Vertex currItem = queue.poll();
			if (!visited.contains(currItem)) {
				visited.add(currItem);
			}
			for (Vertex v: graph.getAdjacentVerticles(currItem.getName())){
				if (!visited.contains(v)) {
					queue.offer(v);
				}
			}
		}
		
		return visited;
	}
	
	
	public static void main(String[] args) {
	    Graph graph = new Graph();
	    graph.addVertex("Bob");
	    graph.addVertex("Alice");
	    graph.addVertex("Mark");
	    graph.addVertex("Rob");
	    graph.addVertex("Maria");
	    graph.addEdge("Bob", "Alice");
	    graph.addEdge("Bob", "Rob");
	    graph.addEdge("Alice", "Mark");
	    graph.addEdge("Rob", "Mark");
	    graph.addEdge("Alice", "Maria");
	    graph.addEdge("Rob", "Maria");
	    
	    graph.getGraphVertices().forEach((k,v) ->
	    	{
	    		System.out.println(k+"=>"+v);
	    	}
	    );
	    
	    System.out.println("DepthFirstTraversal :"+depthFirstTraversal(graph,new Vertex("Bob")));
	    System.out.println("BreadthFirstTraversal :"+breadthFirstTraversal(graph,new Vertex("Bob")));

	}
		
}

package com.chandu.algo;

import java.util.*;

public class BFS {
	int V;
	LinkedList<Integer> adj[];

	BFS(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++)
			adj[i] = new LinkedList<>();
	}

	void addEdge(int u, int v) {
		adj[u].add(v);
	}

	void BFS(int s, int x) {
		boolean visited[] = new boolean[V];
		int[] levelcount = new int[s];
		int level[] = new int[s];
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		level[s] = 1;
		levelcount[level[s]]++;
		queue.add(s);
		while (!queue.isEmpty()) {
			int temp = queue.poll();
			for (Integer i : adj[temp]) {
				if (!visited[i]) {
					level[i] = level[temp] + 1;
					levelcount[level[i]]++;
					queue.add(i);
					visited[i] = true;
				}
			}
		}
		System.out.println(levelcount[x]);

	}

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BFS tree = new BFS(N);
		for (int i = 1; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			tree.addEdge(a, b);
		}

		int x = sc.nextInt();
		tree.BFS(1, x);
	}
}

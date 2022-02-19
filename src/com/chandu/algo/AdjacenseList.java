package com.chandu.algo;

import java.util.Scanner;

public class AdjacenseList {
	public static void main(String args[]) throws Exception {
		int[][] adjMatrix;
		Scanner reader = new Scanner(System.in);

		int nodes, edges, edgeConnection1, edgeConnection2, queryNumber;

		nodes = reader.nextInt();
		edges = reader.nextInt();

		adjMatrix = new int[nodes][nodes];

		for (int i = 0; i < edges; i++) {
			edgeConnection1 = reader.nextInt();
			edgeConnection2 = reader.nextInt();

			adjMatrix[edgeConnection1][edgeConnection2] = 1;
		}

		queryNumber = reader.nextInt();

		for (int i = 0; i < queryNumber; i++) {
			edgeConnection1 = reader.nextInt();
			edgeConnection2 = reader.nextInt();

			if (adjMatrix[edgeConnection1][edgeConnection2] == 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}

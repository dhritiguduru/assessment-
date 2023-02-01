package com.q2;

public class TestClient {
	// main class

	public static void main(String[] args) {
		JavaLang jl = new JavaLang();
		CLang cl = new CLang();

		Thread jl1 = new Thread((Runnable) jl);
		Thread cl1 = new Thread((Runnable) cl);
		// for both classes to run simultaneously
		jl1.start();
		cl1.start();

	}

}

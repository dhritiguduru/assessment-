package com.q2;

//implementing runnable interface for multi threading 
public class JavaLang implements Language, Runnable {

	@Override
	public void showMessage() {
		System.out.println("Java Program is running.");

	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			showMessage();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

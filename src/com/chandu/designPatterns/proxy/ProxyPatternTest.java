package com.chandu.designPatterns.proxy;

public class ProxyPatternTest {
	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("chandu", "chandu123");
		try {
			//executor.runCommand("cd");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}
	}
}

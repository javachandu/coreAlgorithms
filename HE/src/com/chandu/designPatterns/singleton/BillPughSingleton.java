package com.chandu.designPatterns.singleton;

public class BillPughSingleton {
	
	private BillPughSingleton(){}
	
	private static class LazyInstance{
		private static final BillPughSingleton INSTANCE= new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance(){
		return LazyInstance.INSTANCE;
	}
	
	
	public static void main(String args[]){
		System.out.println(BillPughSingleton.getInstance().hashCode());
		System.out.println(BillPughSingleton.getInstance().hashCode());
	}

}

package com.chandu.designPatterns.adapter;
/*
 * Class Adapter Implementation
Here is the class adapter approach implementation of our adapter.
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		Volt v= getVolt();
		return convertVolt(v,12);
	}

	@Override
	public Volt get45Volt() {
		// TODO Auto-generated method stub
		Volt v= getVolt();
		return convertVolt(v,45);
	}

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return getVolt();
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
		}

}

package com.chandu.designPatterns.adapter;
/*
 * While implementing Adapter pattern, there are two approaches – class
adapter and object adapter, however both these approaches produce same
result.
1. Class Adapter – This form uses java inheritance and extends the
source interface, in our case Socket class.
2. Object Adapter – This form uses Java Composition and adapter
contains the source object
 */
public interface SocketAdapter {
	
	public Volt get12Volt();
	public Volt get45Volt();
	public Volt get120Volt();

}

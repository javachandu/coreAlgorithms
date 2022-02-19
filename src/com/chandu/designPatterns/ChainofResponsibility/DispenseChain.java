package com.chandu.designPatterns.ChainofResponsibility;

public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);

	void dispense(Currency cur);
}
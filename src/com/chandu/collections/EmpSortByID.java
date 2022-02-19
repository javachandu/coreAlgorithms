package com.chandu.collections;

import java.util.Comparator;

public class EmpSortByID implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		int val=0;
		if(o1.getId()>o2.getId())
			val=1;
		else if(o1.getId()<o2.getId())
			val=-1;
		else if(o1.getId()==o2.getId())
			val=0;
		return val;
	}

	

}

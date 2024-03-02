package com.curso.v1;

import java.util.Comparator;

public class ComparatorEdad implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		return o2.edad - o1.edad;
	}

}

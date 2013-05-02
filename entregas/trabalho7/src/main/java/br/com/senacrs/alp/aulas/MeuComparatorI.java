package br.com.senacrs.alp.aulas;

import java.util.Comparator;

public class MeuComparatorI implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, o2) {
		
		if  (par(o1) == par(o2)){
			int resultado = 0;
			
			else {
				
				resultado = compareParidadeDistinta (o1,o2);
				
			}
			return resultado;
		}
		
		return 0;
	}

}

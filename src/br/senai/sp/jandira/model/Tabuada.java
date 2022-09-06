package br.senai.sp.jandira.model;

public class Tabuada {
	
	public int multiplicando;
	public int minMult;
	public int maxMult;
	
	public String[] getTabuada() {
		
		int tamanho = maxMult - minMult + 1;
		String[] tabuada = new String[tamanho];
		int i = 0;
		
		while(minMult < maxMult) {
			
		int produto = multiplicando * minMult;
		
		String resultado = multiplicando + " X " + minMult + " = " + produto;
		
		tabuada[i] = resultado;
		i++;
		minMult++;		
		
		}
		
		return tabuada;
	}
}

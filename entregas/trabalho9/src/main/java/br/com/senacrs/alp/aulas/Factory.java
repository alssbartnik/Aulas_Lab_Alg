package br.com.senacrs.alp.aulas;


public class Factory {
	
	private static final Factory instancia = new Factory();
	
	private Factory() {
	}
	
	public EmissorMensagens criarEmissor(String arquivoEntrada) {
	
		EmissorMensagens resultado = null;
		
		resultado = new MeuEmissorMens(arquivoEntrada);
	
		return resultado;
	}
	
	public static Factory getInstancia() {
		return instancia;
	}
}

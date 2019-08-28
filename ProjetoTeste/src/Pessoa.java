import java.text.NumberFormat;

import org.junit.platform.commons.util.StringUtils;

public class Pessoa {

	private String nome = "";
	private String cpf = "";
	private int CPFSIZE = 11;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public String getCpf() {
		return cpf;
	}
	public boolean setCpf(String cpf) {
				
		if(cpf.length() == CPFSIZE && cpf.matches("^[0-9]*$") == true) {
			this.cpf = cpf;
			return true;
		}
		
		return false;
	}
	
}

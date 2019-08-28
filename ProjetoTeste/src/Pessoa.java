import java.text.NumberFormat;
import java.util.Date;

import org.junit.platform.commons.util.StringUtils;

public class Pessoa {

	private String nome = "";
	private String cpf = "";
	private Date data;
	private String cep = "";
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
	public boolean setNome(String nome) {
		
		if(nome.matches("^[[ ]|\\p{L}*]+$")) {
			this.nome = nome.toUpperCase();
			return true;
		}
		
		return false;
	}
	public String getCpf() {
		return cpf;
	}
	public boolean setCpf(String cpf) {
		
		if(cpf.length() == CPFSIZE && cpf.matches("^[0-9]*$")) {
			this.cpf = cpf;
			return true;
		}
		
		return false;
	}
	
}

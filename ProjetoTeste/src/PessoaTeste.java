import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PessoaTeste {

	@Test
	void getSetNomeTeste() {
		Pessoa p = new Pessoa();
		
		String nomeCorreto = "JOÃO DA SILVA";
		
		p.setNome("João da Silva");
		
		String nomeArmazenado = p.getNome();
		
		assertEquals(nomeCorreto, nomeArmazenado);
	}
	
	@Test
	void getSetCpfTeste() {
		Pessoa p = new Pessoa();
		
		String cpfCorreto = "12312312312";
		
		p.setCpf("12312312312");
		
		String cpfArmazenado = p.getCpf();
		
		assertEquals(cpfCorreto, cpfArmazenado);
	}

	@Test
	void sizeCpfTeste() {
		Pessoa p = new Pessoa();
		
		boolean cpfCorretoSize = true;
		
		String cpfCorreto = "12312312313";
		
		boolean cpfArmazenadoSize = p.setCpf(cpfCorreto);
		
		assertEquals(cpfCorretoSize, cpfArmazenadoSize);
	}
	
	@Test
	void contentCpfTeste() {
		Pessoa p = new Pessoa();
		
		boolean cpfCorretoContent = true;
		
		String cpfCorreto = "12312312311";
		
		boolean cpfArmazenadoContent = p.setCpf(cpfCorreto);
		
		assertEquals(cpfCorretoContent, cpfArmazenadoContent);
	}
}

package teste.view;

import java.io.Serializable;

import javax.inject.Inject;

import org.slf4j.Logger;

import teste.util.EnvironmentConfig;
import br.gov.frameworkdemoiselle.stereotype.ViewController;

@ViewController
public class IndexMB implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private EnvironmentConfig config;
	
	@Inject
	private Logger log;
	
	private String nome = "OK";

	public String getNome() {
		log.info("conseguiu injetar config? "+(config==null));
		log.info("Valor do parametro teste: "+config.getTeste());
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

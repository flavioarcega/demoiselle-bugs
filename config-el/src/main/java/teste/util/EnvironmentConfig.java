package teste.util;

import br.gov.frameworkdemoiselle.annotation.Name;
import br.gov.frameworkdemoiselle.configuration.ConfigType;
import br.gov.frameworkdemoiselle.configuration.Configuration;

//@Named @StaticScoped						// Se usar somente essas tags encontra na EL 
@Configuration(type=ConfigType.SYSTEM)  	// Se usar só essa não encontra
public class EnvironmentConfig {
	@Name("teste")
	private String teste = "TESTE OK";

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}
	
	public boolean isTestable() {
		return true;
	}
}

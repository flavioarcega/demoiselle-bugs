package demoiselle.bugs.security;

import javax.inject.Inject;

import org.slf4j.Logger;

import br.gov.frameworkdemoiselle.security.InvalidCredentialsException;
import br.gov.frameworkdemoiselle.security.User;

public class Authenticator implements br.gov.frameworkdemoiselle.security.Authenticator {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Credential user;
	
	@Inject
	private Logger logger;

	@Override
	public void authenticate() throws Exception {
		if ("123".equals(user.getSenha())) {
			logger.info("Usuário "+user.getId()+" entrou no sistema.");
			return;
		}
		
		user.reset();
		throw new InvalidCredentialsException("Usuário ou senha inválido(a).");
	}

	@Override
	public void unauthenticate() throws Exception {
		logger.info("Usuário "+user.getId()+" saiu do sistema.");
		user.reset();
	}

	@Override
	public User getUser() {
		return (user.getId()==null) ? null : user;
	}
}

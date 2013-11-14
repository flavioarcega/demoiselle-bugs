package demoiselle.bugs.security;

import javax.inject.Inject;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;
import br.gov.frameworkdemoiselle.security.InvalidCredentialsException;
import br.gov.frameworkdemoiselle.security.SecurityContext;

@RunWith(DemoiselleRunner.class)
public class SecurityTest {
	@Inject
	private Credential user;
	
	@Inject
	private SecurityContext securityContext;

	@Test(expected=InvalidCredentialsException.class)
	public void loginInvalido() {
		Assert.assertFalse(securityContext.isLoggedIn());
		
		user.setId("admin");
		user.setSenha("admin");
		securityContext.login();
		Assert.assertFalse(securityContext.isLoggedIn());
	}
	
	@Test
	public void loginValido() {
		Assert.assertFalse(securityContext.isLoggedIn());
		
		user.setId("admin");
		user.setSenha("123");
		securityContext.login();
		Assert.assertTrue(securityContext.isLoggedIn());
		
		securityContext.logout();
		Assert.assertFalse(securityContext.isLoggedIn());
	}
}

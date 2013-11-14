package demoiselle.bugs.security;

public class Authorizer implements br.gov.frameworkdemoiselle.security.Authorizer {
	private static final long serialVersionUID = 1L;

	@Override
	public boolean hasRole(String role) throws Exception {
		return false;
	}

	@Override
	public boolean hasPermission(String resource, String operation) throws Exception {
		return false;
	}
}

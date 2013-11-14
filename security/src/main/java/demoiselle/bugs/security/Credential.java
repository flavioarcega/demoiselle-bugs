package demoiselle.bugs.security;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class Credential implements br.gov.frameworkdemoiselle.security.User {
	private static final long serialVersionUID = 1L;

	private String id;
	private String senha;
	private Map<Object, Object> attributes;
	
	public Credential() {
		this.attributes = new HashMap<Object, Object>();
	}
	
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getId() {
		return this.id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public Object getAttribute(Object key) {
		return this.attributes.get(key);
	}

	@Override
	public void setAttribute(Object key, Object value) {
		this.attributes.put(key, value);
	}
	
	public void reset() {
		this.id = null;
		this.senha = null;
		this.attributes.clear();
	}
}

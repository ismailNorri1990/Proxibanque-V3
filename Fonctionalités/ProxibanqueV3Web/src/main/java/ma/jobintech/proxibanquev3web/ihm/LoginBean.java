package ma.jobintech.proxibanquev3web.ihm;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import ma.jobintech.proxibanquev3.metier.conseillerclient.IConseillerClientEJBLocal;

@Named /* ("loginBean") */
@SessionScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 5507679929773455081L;

	@EJB
	IConseillerClientEJBLocal conseillerClientEJBLocal;

	private String login;
	private String password;

	public String getLogin() {
		System.out.println("in getLogin");
		return login;
	}

	public void setLogin(String login) {
		System.out.println("in setLogin with " + login);
		this.login = login;
	}

	public String getPassword() {
		System.out.println("in getPassword");
		return password;
	}

	public void setPassword(String password) {
		System.out.println("in setPassword with " + password);
		this.password = password;
	}

	public String returnAction() {
		System.out.println("in returnAction");
		if (conseillerClientEJBLocal.recupererConseillerClient(this.login) != null && conseillerClientEJBLocal.recupererConseillerClient(this.login).getPassword() == password)
			return "OK";
			else 
			return "ERREUR";
	}

}

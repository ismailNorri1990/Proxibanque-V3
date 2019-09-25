package ma.jobintech.proxibanquev3web.service;

import javax.ejb.EJB;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ma.jobintech.proxibanquev3.metier.compte.ICompteEJBLocal;

@Path("/Services")
public class VirementWsRest {
	@EJB
	ICompteEJBLocal iLocal;

	@POST
	@Path(value = "/Versements/{MONTANT}-{NUMEROCOMPTE}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean verser(@PathParam(value = "MONTANT") double montant, @PathParam(value = "NUMEROCOMPTE") long numeroCompte) {
		return iLocal.verser(montant, numeroCompte);
	}

	@POST
	@Path(value = "/Retraits/{MONTANT}-{NUMEROCOMPTE}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean retirer(@PathParam(value = "MONTANT") double montant, @PathParam(value = "NUMEROCOMPTE")long numeroCompte) {
		return iLocal.retirer(montant, numeroCompte);
	}
	
	@POST
	@Path(value = "/Virements/{MONTANT}-{NUMEROPAY}-{COMPTEREMOVE}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean virement(@PathParam(value = "MONTANT") Double montant, @PathParam(value = "COMPTEPAY")Long comptePay, @PathParam(value = "COMPTEREMOVE")Long compteRemove) {
		return iLocal.virement(montant, comptePay, compteRemove);
	}
	
}

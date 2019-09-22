package ma.jobintech.proxibanquev3web;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;

public class JsfConfig {
	
	@ApplicationScoped
	@FacesConfig( version = FacesConfig.Version.JSF_2_3 )         // Activation de CDI
	public class ApplicationConfiguration {
	    
	}
}

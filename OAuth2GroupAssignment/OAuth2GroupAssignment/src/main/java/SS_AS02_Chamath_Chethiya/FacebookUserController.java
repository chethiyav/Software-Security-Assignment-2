package SS_AS02_Chamath_Chethiya;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class FacebookUserController {

	 @GetMapping
	    public Principal getUser(Principal user) {
	        return user;
	    }
	 
	 
	
}

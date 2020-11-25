package tw.group4._03_.cms.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectReservationController {

	@RequestMapping(path = "/03/cms/reservation/index", method = RequestMethod.GET)
	public String redirectToIndex() {
		return "03/cms_reservation/index";
	}

	@RequestMapping(path = "/03/cms/reservation/create", method = RequestMethod.GET)
	public String redirectToCreate() {
		return "03/cms_reservation/create";
	}
	
	@RequestMapping(path = "/03/cms/reservation/search", method = RequestMethod.GET)
	public String redirectToSearch() {
		return "03/cms_reservation/search";
	}
	
	@RequestMapping(path = "/03/cms/reservation/update", method = RequestMethod.GET)
	public String redirectToUpdate() {
		return "03/cms_reservation/update";
	}
	
	@RequestMapping(path = "/03/cms/reservation/delete", method = RequestMethod.GET)
	public String redirectToDelete() {
		return "03/cms_reservation/delete";
	}
	
	
	
	
	
	
	
}

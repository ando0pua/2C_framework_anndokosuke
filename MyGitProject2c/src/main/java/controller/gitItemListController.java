package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class gitItemListController {
	@RequestMapping(path = "/gititemlist", method = RequestMethod.GET)
	public String eidht() {
		return"gititemlist";

	}


}

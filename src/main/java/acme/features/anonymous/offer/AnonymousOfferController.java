
package acme.features.anonymous.offer;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.offers.Offer;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/offer/")
public class AnonymousOfferController extends AbstractController<Anonymous, Offer> {

	// Internal state

	@Autowired
	private AnonymousOfferListService	listService;

	@Autowired
	private AnonymousOfferCreateService	createService;


	//Constructors

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}
}

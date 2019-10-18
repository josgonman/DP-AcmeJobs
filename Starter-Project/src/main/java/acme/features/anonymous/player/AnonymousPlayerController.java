
package acme.features.anonymous.player;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.players.Player;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/player/")
public class AnonymousPlayerController extends AbstractController<Anonymous, Player> {

	// Internal state -------------------------------------------

	@Autowired
	private AnonymousPlayerListService		listService;

	@Autowired
	private AnonymousPlayerCreateService	createService;


	// Constructors ---------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}
}

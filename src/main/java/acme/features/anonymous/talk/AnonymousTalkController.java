
package acme.features.anonymous.talk;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.talk.Talk;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/talk/")
public class AnonymousTalkController extends AbstractController<Anonymous, Talk> {

	// Internal state -------------------------------------------

	@Autowired
	private AnonymousTalkListService	listService;

	@Autowired
	private AnonymousTalkCreateService	createService;


	// Constructors ---------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}
}

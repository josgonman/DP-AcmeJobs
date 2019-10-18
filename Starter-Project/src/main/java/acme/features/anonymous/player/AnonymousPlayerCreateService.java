
package acme.features.anonymous.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.players.Player;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousPlayerCreateService implements AbstractCreateService<Anonymous, Player> {

	// Internal State ----------------------------------------------

	@Autowired
	AnonymousPlayerRepository repository;


	// AbstractListService<Administrator, Shout> interface ---------

	@Override
	public boolean authorise(final Request<Player> request) {
		assert request != null;

		return true;
	}

	@Override
	public Player instantiate(final Request<Player> request) {
		assert request != null;

		Player result;

		result = new Player();
		result.setPlayer("Michael Jordan");
		result.setTeam("Washington Wizards");
		result.setTeamLastSeason("Miami Heat");
		result.setQuote("Talent wins games, but teamwork and intelligence wins championships");

		return result;
	}

	@Override
	public void unbind(final Request<Player> request, final Player entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "player", "team", "teamLastSeason", "quote");
	}

	@Override
	public void bind(final Request<Player> request, final Player entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void validate(final Request<Player> request, final Player entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
	}

	@Override
	public void create(final Request<Player> request, final Player entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);
	}
}

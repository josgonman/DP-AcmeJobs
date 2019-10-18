
package acme.features.anonymous.player;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.players.Player;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousPlayerListService implements AbstractListService<Anonymous, Player> {

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
	public Collection<Player> findMany(final Request<Player> request) {
		assert request != null;

		Collection<Player> result;

		result = this.repository.findMany();

		return result;
	}

	@Override
	public void unbind(final Request<Player> request, final Player entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "player", "team", "teamLastSeason", "quote");
	}
}

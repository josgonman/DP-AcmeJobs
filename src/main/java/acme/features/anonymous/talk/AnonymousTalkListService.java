
package acme.features.anonymous.talk;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.talk.Talk;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousTalkListService implements AbstractListService<Anonymous, Talk> {

	// Internal state -------------------------------------------

	@Autowired
	private AnonymousTalkRepository repository;


	// AbstractListService<Administrator, Shout> interface
	@Override
	public boolean authorise(final Request<Talk> request) {
		assert request != null;
		return true;
	}

	@Override
	public Collection<Talk> findMany(final Request<Talk> request) {
		assert request != null;
		Collection<Talk> result;
		result = this.repository.findMany();
		return result;
	}

	@Override
	public void unbind(final Request<Talk> request, final Talk entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "employer", "age", "moment");
	}

}

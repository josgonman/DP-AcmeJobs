
package acme.features.anonymous.talk;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.talk.Talk;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousTalkCreateService implements AbstractCreateService<Anonymous, Talk> {

	// Internal state -------------------------------------------

	@Autowired
	private AnonymousTalkRepository repository;


	// AbstractListService<Administrator, Talk> interface
	@Override
	public boolean authorise(final Request<Talk> request) {
		assert request != null;
		return true;
	}

	@Override
	public void bind(final Request<Talk> request, final Talk entity, final Errors errors) {
		// TODO Auto-generated method stub
		assert request != null;
		assert entity != null;
		assert errors != null;
		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<Talk> request, final Talk entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "employer", "age");

	}

	@Override
	public Talk instantiate(final Request<Talk> request) {
		assert request != null;

		Talk result;
		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);
		result = new Talk();
		result.setEmployer("Amigos de Gines");
		result.setAge(20);
		result.setMoment(moment);
		return result;
	}

	@Override
	public void validate(final Request<Talk> request, final Talk entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Talk> request, final Talk entity) {
		assert request != null;
		assert entity != null;

		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);
		entity.setMoment(moment);
		this.repository.save(entity);
	}
}

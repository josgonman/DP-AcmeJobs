
package acme.features.anonymous.offer;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.offers.Offer;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousOfferListService implements AbstractListService<Anonymous, Offer> {

	//Internal State
	@Autowired
	private AnonymousOfferRepository rep;


	//AbstractListService<Administrator, Shout> interface

	@Override
	public boolean authorise(final Request<Offer> request) {
		assert request != null;
		return true;
	}

	@Override
	public Collection<Offer> findMany(final Request<Offer> request) {
		assert request != null;
		Collection<Offer> result;
		result = this.rep.findMany();

		return result;
	}

	@Override
	public void unbind(final Request<Offer> request, final Offer entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "company", "job", "salary", "moment");

	}

}

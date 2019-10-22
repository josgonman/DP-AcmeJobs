
package acme.features.anonymous.book;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.books.Book;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousBookListService implements AbstractListService<Anonymous, Book> {

	@Autowired
	private AnonymousBookRepository rep;


	@Override
	public boolean authorise(final Request<Book> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Book> request, final Book entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "title", "moment");
	}

	@Override
	public Collection<Book> findMany(final Request<Book> request) {
		assert request != null;
		Collection<Book> result;
		result = this.rep.findMany();
		return result;
	}

}

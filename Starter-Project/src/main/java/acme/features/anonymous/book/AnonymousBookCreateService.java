
package acme.features.anonymous.book;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.books.Book;
import acme.features.anonymous.shout.AnonymousShoutRepository;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousBookCreateService implements AbstractCreateService<Anonymous, Book> {

	@Autowired
	AnonymousShoutRepository repository;


	@Override
	public boolean authorise(final Request<Book> request) {
		assert request != null;

		return true;
	}

	@Override
	public void bind(final Request<Book> request, final Book entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<Book> request, final Book entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "title");

	}

	@Override
	public Book instantiate(final Request<Book> request) {
		assert request != null;
		Book result;
		Date moment;
		moment = new Date(System.currentTimeMillis() - 1);
		result = new Book();
		result.setAuthor("John Doe");
		result.setTitle("new book");
		result.setMoment(moment);

		return result;
	}

	@Override
	public void validate(final Request<Book> request, final Book entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Book> request, final Book entity) {
		assert request != null;
		assert entity != null;

		Date moment;
		moment = new Date(System.currentTimeMillis() - 1);
		entity.setMoment(moment);
		this.repository.save(entity);

	}

}

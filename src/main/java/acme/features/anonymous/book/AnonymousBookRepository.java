
package acme.features.anonymous.book;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;

import acme.entities.books.Book;
import acme.framework.repositories.AbstractRepository;

public interface AnonymousBookRepository extends AbstractRepository {

	@Query("select s from Book s")
	Collection<Book> findMany();

}


package acme.features.anonymous.talk;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.talk.Talk;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousTalkRepository extends AbstractRepository {

	@Query("select s from Talk s")
	Collection<Talk> findMany();
}

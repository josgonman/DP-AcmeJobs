
package acme.features.anonymous.player;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.players.Player;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousPlayerRepository extends AbstractRepository {

	@Query("select p from Player p")
	Collection<Player> findMany();

}

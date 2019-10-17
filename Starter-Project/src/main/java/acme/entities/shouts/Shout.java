
package acme.entities.shouts;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Shout extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				player;

	@NotBlank
	private String				team;

	@NotBlank
	private String				teamLastSeason;

	@NotBlank
	private String				quote;

}

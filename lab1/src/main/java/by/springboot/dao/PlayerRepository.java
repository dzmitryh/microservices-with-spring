package by.springboot.dao;

import by.springboot.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by dzmitry on 11/13/16.
 */
@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player, Long> {
}

package by.springboot.dao;

import by.springboot.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by dzmitry on 11/13/16.
 */
@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository<Team, Long> {
}

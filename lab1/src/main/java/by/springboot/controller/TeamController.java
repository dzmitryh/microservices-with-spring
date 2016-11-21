package by.springboot.controller;

import by.springboot.dao.TeamRepository;
import by.springboot.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dzmitry on 11/13/16.
 */
//@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @RequestMapping("/teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }

    @RequestMapping("/teams/{id}")
    public Team getTeam(@PathVariable("id") Long id) {
        return teamRepository.findOne(id);
    }
}

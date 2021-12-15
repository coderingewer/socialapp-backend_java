package stud.app.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import stud.app.entities.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer> {

}

package stud.app.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import stud.app.entities.Education;

public interface EducationDao extends JpaRepository<Education, Integer> {

}

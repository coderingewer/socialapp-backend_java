package stud.app.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import stud.app.entities.AppUser;

public interface AppUserDao extends JpaRepository<AppUser, Integer>{

}

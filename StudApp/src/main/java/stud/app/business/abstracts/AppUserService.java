package stud.app.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;

import stud.app.core.results.DataResult;
import stud.app.core.results.Result;
import stud.app.entities.AppUser;

public interface AppUserService {

	Result add(AppUser appUser);

	Result update(AppUser appUser, int id);

	Result deleteById(int id, String password);

	DataResult<List<AppUser>> getAll();

	DataResult<AppUser> getById(int id);

	DataResult<List<AppUser>> getByAsc(Sort sort);

	DataResult<List<AppUser>> getByDesc(Sort sort);

}

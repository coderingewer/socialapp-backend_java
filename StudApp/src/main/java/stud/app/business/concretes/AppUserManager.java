package stud.app.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import stud.app.business.abstracts.AppUserService;
import stud.app.core.results.DataResult;
import stud.app.core.results.ErrorResult;
import stud.app.core.results.Result;
import stud.app.core.results.SuccessDataResult;
import stud.app.core.results.SuccessResult;
import stud.app.core.validation.abstracts.UserValidService;
import stud.app.dataAccess.abstracts.AppUserDao;
import stud.app.entities.AppUser;

@Service
public class AppUserManager implements AppUserService {

	private AppUserDao userDao;
	private UserValidService userValidService;

	@Autowired
	public AppUserManager(AppUserDao userDao, UserValidService userValidService) {
		super();
		this.userDao = userDao;
		this.userValidService = userValidService;
	}

	@Override
	public Result add(AppUser appUser) {
		if (userValidService.validInfo(appUser.getPassword(), appUser.getEmail())) {

			this.userDao.save(appUser);
			return new SuccessResult("added");
		} else {
			return new ErrorResult("error");
		}
	}

	@Override
	public Result update(AppUser appUser, int id) {
		// bu kalsın : )
		return null;
	}

	@Override
	public Result deleteById(int id, String password) {

		AppUser deleteUser = this.userDao.getById(id);
		if (password == deleteUser.getPassword()) {
			this.userDao.deleteById(id);
			return new SuccessResult("deleted");
		} else {
			return new ErrorResult("try again");
		}
	}

	@Override
	public DataResult<List<AppUser>> getAll() {
		return new SuccessDataResult<List<AppUser>>(this.userDao.findAll());
	}

	@Override
	public DataResult<AppUser> getById(int id) {
		return new SuccessDataResult<AppUser>(this.userDao.getById(id));
	}

	@Override
	public DataResult<List<AppUser>> getByAsc(Sort sort) {
		return new SuccessDataResult<List<AppUser>>(this.userDao.findAll(Sort.by(Sort.Direction.ASC, "id")));
	}

	@Override
	public DataResult<List<AppUser>> getByDesc(Sort sort) {
		return new SuccessDataResult<List<AppUser>>(this.userDao.findAll(Sort.by(Sort.Direction.DESC, "id")));
	}

}

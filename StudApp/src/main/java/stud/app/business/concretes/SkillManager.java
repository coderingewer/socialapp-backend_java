package stud.app.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stud.app.business.abstracts.SkillService;
import stud.app.core.results.DataResult;
import stud.app.core.results.Result;
import stud.app.core.results.SuccessDataResult;
import stud.app.core.results.SuccessResult;
import stud.app.dataAccess.abstracts.SkillDao;
import stud.app.entities.Skill;

@Service
public class SkillManager implements SkillService {
	private SkillDao skillDao;

	@Autowired
	public SkillManager(SkillDao skillDao) {
		super();
		this.skillDao = skillDao;
	}

	@Override
	public Result add(Skill skill) {
		this.skillDao.save(skill);
		return new SuccessResult("added");
	}

	@Override
	public Result update(int id, Skill skill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result deleteById(int id) {
		this.skillDao.deleteById(id);
		return new SuccessResult("deleted");
	}

	@Override
	public DataResult<Skill> getById(int id) {
		return new SuccessDataResult<Skill>(this.skillDao.getById(id));
	}

	@Override
	public DataResult<List<Skill>> getAll() {
		return new SuccessDataResult<List<Skill>>(this.skillDao.findAll());
	}

}

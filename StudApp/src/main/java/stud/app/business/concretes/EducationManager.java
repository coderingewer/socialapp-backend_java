package stud.app.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stud.app.business.abstracts.EducationService;
import stud.app.core.results.DataResult;
import stud.app.core.results.Result;
import stud.app.core.results.SuccessDataResult;
import stud.app.core.results.SuccessResult;
import stud.app.dataAccess.abstracts.EducationDao;
import stud.app.entities.Education;

@Service
public class EducationManager implements EducationService {
	
	private EducationDao educationDao;

	@Autowired
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public Result add(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("added");
	}

	@Override
	public Result update(int id, Education education) {
		// bu kalsın
		return null;
	}

	@Override
	public Result deleteById(int id) {
		this.educationDao.deleteById(id);
		return new SuccessResult("deleted");
	}

	@Override
	public DataResult<Education> getById(int id) {
		return new SuccessDataResult<Education>(this.educationDao.getById(id));
	}

	@Override
	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<List<Education>>(this.educationDao.findAll());
	}
	

}

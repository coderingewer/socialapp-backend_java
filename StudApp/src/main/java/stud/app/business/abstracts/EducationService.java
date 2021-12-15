package stud.app.business.abstracts;



import java.util.List;

import stud.app.core.results.DataResult;
import stud.app.core.results.Result;
import stud.app.entities.Education;

public interface EducationService {
	
	Result add(Education education);
	
	Result update(int id, Education education);
	
	Result deleteById(int id);
	
	DataResult<Education> getById(int id);
	
	DataResult<List<Education>>  getAll();
	
	

}

package stud.app.business.abstracts;

import java.util.List;

import stud.app.core.results.DataResult;
import stud.app.core.results.Result;
import stud.app.entities.Skill;

public interface SkillService {

	Result add(Skill skill);

	Result update(int id, Skill skill);

	Result deleteById(int id);

	DataResult<Skill> getById(int id);

	DataResult<List<Skill>> getAll();

}

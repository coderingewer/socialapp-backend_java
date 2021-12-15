package stud.app.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stud.app.business.abstracts.SkillService;
import stud.app.core.results.DataResult;
import stud.app.core.results.Result;
import stud.app.entities.Skill;

@RestController
@RequestMapping("/api/skills")
public class SkillController {
	
	private SkillService skillService;

	@Autowired
	public SkillController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Skill skill) {
		return this.skillService.add(skill);
	}

	/*
	@PostMapping("/update")
	public Result  update(int id, Skill skill) {
		return this.skillService.update(id, skill);
	}*/

	@DeleteMapping("/delete")
	public Result deleteById(int id) {
		return this.skillService.deleteById(id);
	}

	@GetMapping("/getById")
	public DataResult<Skill> getById(int id){
		return this.skillService.getById(id);
	}

	@GetMapping("/getAll")
	public DataResult<List<Skill>> getAll(){
		return this.skillService.getAll();
	}
	
	

}

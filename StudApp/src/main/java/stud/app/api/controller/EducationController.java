package stud.app.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stud.app.business.abstracts.EducationService;
import stud.app.core.results.DataResult;
import stud.app.core.results.Result;
import stud.app.entities.Education;

@RestController
@RequestMapping("/api/educations")
public class EducationController {

	private EducationService educationService;

	@Autowired
	public EducationController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody Education education) {
		return this.educationService.add(education);
	}
/*
	@PostMapping("update")
	public Result update(int id, Education education) {
		return this.educationService.update(id, education);
	}*/

	@DeleteMapping("/delete")
	public Result deleteById(int id) {
		return this.educationService.deleteById(id);
	}

	@GetMapping("/getById")
	public DataResult<Education> getById(int id) {
		return this.educationService.getById(id);
	}

	@GetMapping("/getAll")
	public DataResult<List<Education>> getAll() {
		return this.educationService.getAll();
	}
}

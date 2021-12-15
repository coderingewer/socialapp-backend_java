package stud.app.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stud.app.business.abstracts.AppUserService;
import stud.app.core.results.DataResult;
import stud.app.core.results.Result;
import stud.app.entities.AppUser;

@RestController
@RequestMapping("/api/appUsers")
public class AppUserConroller {

	private AppUserService appUserService;

	@Autowired
	public AppUserConroller(AppUserService appUserService) {
		super();
		this.appUserService = appUserService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody @Valid AppUser appUser) {
		return this.appUserService.add(appUser);
	}
/*
	@PostMapping("/update")
	public Result update(AppUser appUser, int id) {
		return this.appUserService.update(appUser, id);
	}*/

	@DeleteMapping("/delete")
	public Result deleteById( int id, String password) {
		return this.appUserService.deleteById(id, password);
	}

	@GetMapping("7getall")
	public DataResult<List<AppUser>> getAll() {
		return this.appUserService.getAll();
	}

	@GetMapping("/getById")
	public DataResult<AppUser> getById(int id) {
		return this.appUserService.getById(id);
	}

	@GetMapping("/getByAsc")
	public DataResult<List<AppUser>> getByAsc(Sort sort) {
		return this.appUserService.getByAsc(sort);
	}

	@GetMapping("/getbyDesc")
	public DataResult<List<AppUser>> getByDesc(Sort sort) {
		return this.appUserService.getByDesc(sort);
	}

}

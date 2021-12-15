package stud.app.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import stud.app.core.entities.User;

@EqualsAndHashCode(callSuper = false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "app_users")
public class AppUser extends User {

	@Column(name = "cover_letter")
	private String coverLetter;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "image")
	private Image image;
	
	@JsonIgnore
	@OneToMany(mappedBy = "appUser")
	private List<Skill> skills;
	
	@JsonIgnore
	@OneToMany(mappedBy = "appUser")
	private List<Education> educations;



}

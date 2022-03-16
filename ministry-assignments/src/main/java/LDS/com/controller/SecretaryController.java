package LDS.com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import LDS.com.models.Secretary;
import LDS.com.services.SecretaryService;

//import com.revature.models.RoleEnum;
//import com.revature.models.User;
//import com.revature.services.UserService;

@RestController
@RequestMapping("/sec")
@CrossOrigin("*")
public class SecretaryController {

	private SecretaryService ss;

	// constructor injection, Spring will use this constructor to handle the
	// dependency with UserService
	@Autowired
	public SecretaryController(SecretaryService ss) {
		this.ss = ss;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Secretary> getAllSecretarys(@RequestParam(name = "role", required = false)) {
		// if a query param of name "role" is passed in, returns users of this role
		return ss.getAllSecretarys();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Secretary> getSecretaryById(@PathVariable("id") int id) {
		return new ResponseEntity<>(ss.getSecretaryById(id), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<String> createUser(@Valid @RequestBody Secretary sec) {
		ss.createSecretary(sec);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateSecretary(@PathVariable("id") int id, @Valid @RequestBody Secretary sec,
			@RequestParam(name = "role", required = false)) {
		ss.updateSecretary(id, sec);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

}

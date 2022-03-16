package LDS.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import LDS.com.daos.SecretaryRepository;
import LDS.com.exception.SecretaryNotFoundException;
import LDS.com.models.Secretary;

@Service
public class SecretaryService {

	private SecretaryRepository sr;

	@Autowired
	public SecretaryService(SecretaryRepository sr) {
		this.sr = sr;
	}

	public List<Secretary> getAllSecretarys() {
		return sr.findAll();
	}

	public Secretary getSecretaryById(int id) {
		return sr.findById(id).orElseThrow(SecretaryNotFoundException::new);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void createSecretary(Secretary s) {

		sr.save(s);
	}

	
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateSecretary(int id, Secretary s) {
		Secretary temp = sr.getById(id);
		temp.setFirstName(s.getFirstName());
		temp.setLastName(s.getLastName());
		temp.setNumber(s.getNumber());
		temp.setUsername(s.getUsername());
		temp.setPassword(s.getPassword());
		sr.save(temp);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateDistrict(int id) {
		Secretary temp = sr.getById(id);
	}
}


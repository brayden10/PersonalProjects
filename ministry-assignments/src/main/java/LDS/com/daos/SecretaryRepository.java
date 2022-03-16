package LDS.com.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import LDS.com.models.Secretary;

@Repository
public interface SecretaryRepository extends JpaRepository<Secretary, Integer> {
	Secretary findSecretaryByUsername(String name);
}

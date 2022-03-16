package LDS.com.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Length;
import lombok.Data;

@Entity
@Data
@Table(name = "sec")
public class Secretary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int secId;
	@Length(min = 3)
	@Column(nullable = false, unique = true)
	private String username;
	@Length(min = 3)
	@Column(nullable = false)
	private String password;
	@Length(min = 3)
	@Column(nullable = false)
	private String firstName;
	@Length(min = 3)
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false, unique = true)
	private String number;
//	@ManyToMany
//	@Column(nullable=false)
//	private String a_district;

}

package springrest.exam.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "friend")
public class Friend {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fname;
	private Integer fage;

	@Builder
	public Friend(int id, String fname, Integer fage) {
		this.id = id;
		this.fname = fname;
		this.fage = fage;
	}
}

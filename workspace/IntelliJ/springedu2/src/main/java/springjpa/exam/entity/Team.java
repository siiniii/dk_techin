package springjpa.exam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "Team")
public class Team {
	@Id
	@Column(name = "TEAM_ID")
	private String id;
	private String teamname;

	public Team() {

	}

	public Team(String id, String teamname) {
		super();
		this.id = id;
		this.teamname = teamname;
	}
}

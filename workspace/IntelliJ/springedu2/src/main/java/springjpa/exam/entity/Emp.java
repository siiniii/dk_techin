package springjpa.exam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name = "EMP")
public class Emp {
	@Id
	private int empno;
	private String ename;
	private String job;
	private String mgr;
	private java.sql.Date hiredate;
	private int sal;
	private Integer comm;
	private Integer deptno;
}

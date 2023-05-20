package springrest.exam.domain;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// entity 객체의 정보를 JSON으로 변환할 때 password와 ssn을 제외하고 변환하는 어노테이션.
@JsonIgnoreProperties(value = {"password", "ssn"}) // 클래스 블록에 추가
public class User extends RepresentationModel<User> {
	private Integer id;

	@Size(min = 2, message = "이름은 2글자 이상 입력해주세요.")
	private String name;

	// 과거시간만 입력
	@Past(message = "과거 시간을 입력해주세요.")
	private Date joinDate;

	private String password;
	private String ssn;
}

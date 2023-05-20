package springrest.exam.domain;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComicActorModel extends RepresentationModel<ComicActorModel> {
	String name;
}

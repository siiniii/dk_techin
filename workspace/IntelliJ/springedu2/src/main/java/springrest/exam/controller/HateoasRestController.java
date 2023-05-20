package springrest.exam.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springrest.exam.domain.ComicActor;
import springrest.exam.domain.ComicActorModel;

@RestController
public class HateoasRestController {
	@GetMapping(path = {"/all"})
	public CollectionModel<ComicActorModel> allActor() {
		List<ComicActorModel> comicActors = new ArrayList<>();

		ComicActorModel cam1 = new ComicActorModel("둘리");
		cam1.add(Link.of("http://localhost:8088/dooly"));

		ComicActorModel cam2 = new ComicActorModel("또치");
		cam2.add(Link.of("http://localhost:8088/ddochi"));

		ComicActorModel cam3 = new ComicActorModel("도우너");
		cam3.add(Link.of("http://localhost:8088/dauner"));

		comicActors.add(cam1);
		comicActors.add(cam2);
		comicActors.add(cam3);

		CollectionModel<ComicActorModel> collectionModel = CollectionModel.of(comicActors);

		return collectionModel;
	}

	@GetMapping(path = {"/dooly"})
	public ResponseEntity<ComicActor> getDooly() {
		ComicActor dooly = new ComicActor("둘리", "쌍문동", "dooly.jpg");
		return ResponseEntity.ok(dooly);
	}

	@GetMapping("/ddochi")
	public ResponseEntity<ComicActor> getDdochi() {
		ComicActor ddochi = new ComicActor("또치", "아프리카", "ddochi.jpg");
		return ResponseEntity.ok(ddochi);
	}

	@GetMapping("/dauner")
	public ResponseEntity<ComicActor> getDauner() {
		ComicActor dauner = new ComicActor("도우너", "깐따삐아", "dauner.png");
		return ResponseEntity.ok(dauner);
	}
}

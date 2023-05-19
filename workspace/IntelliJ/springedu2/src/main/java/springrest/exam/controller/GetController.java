package springrest.exam.controller;

//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiParam;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.nio.charset.Charset;
import java.util.Map;

import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import springrest.exam.dto.MemberDTO;

@RestController
@RequestMapping("/restapi")
@Slf4j
public class GetController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String getHello() {
		log.info("getHello 메소드가 호출되었습니다.");
		return "안녕하세요?";
	}

	@GetMapping(value = "/name")
	public String getName() {
		log.info("getName 메소드가 호출되었습니다.");
		return "둘리";
	}

	@GetMapping(value = "/var1/{variable}")
	public String getVariable1(@PathVariable String variable) {
		log.info("@PathVariable을 통해 들어온 값 : {}", variable);
		return variable;
	}

	@GetMapping(value = "/var2/{variable}")
	public String getVariable2(@PathVariable("variable") String var) {
		return var;
	}

	@GetMapping(value = "/req1")
	public String getRequestParam1(String name, String email, String phone) {
		return name + " " + email + " " + phone;
	}

	@GetMapping(value = "/req2")
	public String getRequestParam2(@RequestParam Map<String, String> param) {
		StringBuilder sb = new StringBuilder();
		param.entrySet().forEach(map -> {
			sb.append(map.getKey() + " : " + map.getValue() + "\n");
		});
		return sb.toString();
	}

	@GetMapping(value = "/req3")
	public String getRequestParam3(MemberDTO memberDTO) {
		return memberDTO.toString();
	}

	@GetMapping(value = "/req4")
	public MemberDTO getRequestParam4(MemberDTO memberDTO) {
		return memberDTO;
	}

	@GetMapping(value = "/req5")
	public ResponseEntity getRequestParam5(String name) {
		MemberDTO dto = new MemberDTO();
		dto.setName(name);
		dto.setEmail("aaa@naver.com");
		dto.setPhone("010-3333-4444");

		HttpHeaders header = new HttpHeaders();
		header.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

		return new ResponseEntity<>(dto, header, HttpStatus.OK);
	}

	@GetMapping(value = "/req6")
	public ResponseEntity<MemberDTO> getRequestParam6() {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setName("unico");
		memberDTO.setEmail("unicodaum@hanmail.net");
		memberDTO.setPhone("010-1111-2222");

		WebMvcLinkBuilder linkTo = linkTo(methodOn(GetController.class).getRequestParam6());
		return new ResponseEntity<>(memberDTO.add(linkTo.withSelfRel()), HttpStatus.OK);
	}
}

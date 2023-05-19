package springrest.exam.controller;

import java.net.URLEncoder;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springrest.exam.entity.Friend;
import springrest.exam.repository.FriendRepository;

@RestController
@RequestMapping("/friends")
public class FriendController {

	@Autowired
	private FriendRepository friendRepository;

	// 친구 데이터의 전체 리스트를 JSON 형식으로 리턴
	@GetMapping(path = {"/all"})
	public ResponseEntity loadAllFriend() {
		return new ResponseEntity<>(friendRepository.findAll(), HttpStatus.OK);
	}

	// ID 를 입력하면 해당 친구 데이터를 JSON 형식으로 리턴
	@GetMapping(path = {"/id"})
	public ResponseEntity<Friend> getFriendById(int id) {
		Optional<Friend> result = friendRepository.findById(id);

		try {
			if (result.isPresent()) {
				return new ResponseEntity<>(result.get(), HttpStatus.OK);
			} else {
				MultiValueMap<String, String> header = new LinkedMultiValueMap<>();
				header.add("BAD_ID", String.valueOf(id));
				return new ResponseEntity<>(header, HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// 친구 이름을 입력하면 해당 친구 데이터를 JSON 형식으로 리턴
	@GetMapping(path = {"/name"})
	public ResponseEntity<Friend> getFriendByName(String name) {
		Optional<Friend> result = friendRepository.findAllByFname(name);
		try {
			if (result.isPresent()) {
				return new ResponseEntity<>(result.get(), HttpStatus.OK);
			} else {
				MultiValueMap<String, String> header = new LinkedMultiValueMap<>();
				try {
					header.add("BAD_NAME", URLEncoder.encode(name, "utf-8"));
				} catch (Exception e) {
					e.printStackTrace();
				}
				return new ResponseEntity<>(header, HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity("실패하였읍니다.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// 클라이언트에서 JSON 형식으로 전달된 데이터를 Friend 테이블에 저장
	@PostMapping(path = {"/insert"})
	public ResponseEntity<Friend> insertNewFriend(@RequestBody Friend friend) {
		try {
			friendRepository.save(friend);
			return new ResponseEntity("성공하였읍니다.", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity("실패하였읍니다.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// 클라이언트에서 JSON 형식으로 전달된 데이터를 Friend 테이블에 저장
	@PutMapping(path = {"/update/{id}"})
	public ResponseEntity<Friend> updateFriendById(@PathVariable("id") int id, @RequestBody Friend friend) {
		try {
			Friend uFriend = friendRepository.findById(id).orElse(null);
			uFriend.setFname(friend.getFname());
			uFriend.setFage(friend.getFage());
			friendRepository.save(uFriend);
			return new ResponseEntity("성공하였읍니다.", HttpStatus.RESET_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity("실패하였읍니다.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// 클라이언트에서 전달된 ID 를 가지고 데이터를 삭제
	@DeleteMapping(path = {"/delete/{id}"})
	public ResponseEntity<Friend> deleteFriend(@PathVariable int id) {
		try {
			Friend friend = friendRepository.findById(id).orElse(null);
			friendRepository.delete(friend);
			return new ResponseEntity("성공하였읍니다.", HttpStatus.RESET_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity("실패하였읍니다.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

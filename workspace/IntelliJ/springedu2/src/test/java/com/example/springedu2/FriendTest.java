package com.example.springedu2;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import springrest.exam.entity.Friend;
import springrest.exam.repository.FriendRepository;

@SpringBootTest
public class FriendTest {
	@Autowired
	private FriendRepository friendRepository;

	@Test
	@Rollback(false)
	@Order(1)
	void save() {
		friendRepository.save(Friend.builder().fname("짱구").fage(1).build());
		friendRepository.save(Friend.builder().fname("철수").fage(2).build());
		friendRepository.save(Friend.builder().fname("맹구").fage(3).build());
		friendRepository.save(Friend.builder().fname("훈이").fage(4).build());
	}

	@Test
	@Order(2)
	void list() {
		List<Friend> friends = friendRepository.findAll();
		friends.stream().forEach(System.out::println);
	}

	@Test
	@Order(3)
	void selectById() {
		friendRepository.findById(1);
	}

	@Test
	@Rollback(false)
	@Order(4)
	void update() {
		friendRepository.save(Friend.builder().id(4).fname("짱아").fage(4).build());
	}

	@Test
	@Rollback(false)
	@Order(5)
	void delete() {
		friendRepository.delete(Friend.builder().id(4).build());
	}

}

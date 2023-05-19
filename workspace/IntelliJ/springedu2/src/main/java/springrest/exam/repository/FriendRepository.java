package springrest.exam.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import springrest.exam.entity.Friend;

public interface FriendRepository extends JpaRepository<Friend, Integer> {
	public Optional<Friend> findAllByFname(String name);
}

package cl.idesoft.sample.repository;

import cl.idesoft.sample.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {

    Users findUserByUsername(String username);

}

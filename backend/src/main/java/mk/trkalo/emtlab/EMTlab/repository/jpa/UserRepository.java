package mk.trkalo.emtlab.EMTlab.repository.jpa;

import mk.trkalo.emtlab.EMTlab.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    void deleteAllByActivatedFalseAndRegisteredOnBefore(LocalDateTime dateTime);
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
}
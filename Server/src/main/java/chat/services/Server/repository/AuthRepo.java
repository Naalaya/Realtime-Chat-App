package chat.services.Server.repository;

import chat.services.Server.model.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepo extends JpaRepository<Auth, Long> {
    Auth findByUserName(String username);
}

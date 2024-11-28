package chat.services.Server.repository;

import chat.services.Server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<User, Long> { }

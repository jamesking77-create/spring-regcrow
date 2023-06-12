package africa.semicolon.wisp.data.repositories;

import africa.semicolon.wisp.data.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository <Message, Long> {
}

package africa.semicolon.wisp.data.repositories;

import africa.semicolon.wisp.data.models.ChatBox;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatBoxRepository extends JpaRepository<ChatBox,Long> {
}

package africa.semicolon.wisp.data.repositories;

import africa.semicolon.wisp.data.models.Sender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SenderRepository extends JpaRepository<Sender,Long> {
}

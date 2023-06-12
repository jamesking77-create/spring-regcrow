package africa.semicolon.wisp.data.repositories;

import africa.semicolon.wisp.data.models.FriendsList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendListRepository extends JpaRepository<FriendsList,Long> {
}

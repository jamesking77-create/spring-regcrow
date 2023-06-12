package africa.semicolon.wisp.data.repositories;

import africa.semicolon.wisp.data.models.BioData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BioDataRepository extends JpaRepository<BioData, Long> {

  }

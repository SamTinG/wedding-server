package sam.tendousouji.wedding_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sam.tendousouji.wedding_server.entity.UninvitedGuestEntity;

@Repository
public interface UninvitedGuestRepository extends JpaRepository<UninvitedGuestEntity, String> {
}
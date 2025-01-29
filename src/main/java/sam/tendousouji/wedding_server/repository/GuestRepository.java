package sam.tendousouji.wedding_server.repository;

import sam.tendousouji.wedding_server.entity.GuestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<GuestEntity, String> {
}
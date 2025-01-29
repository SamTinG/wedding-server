package sam.tendousouji.wedding_server.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@Entity
@AllArgsConstructor
@Table(name = "uninvited_guest")
public class UninvitedGuestEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Integer id;
        private String name;
        private String phone;
        private Integer companion;
        private Boolean attending;

        public UninvitedGuestEntity() {
                
        }
}

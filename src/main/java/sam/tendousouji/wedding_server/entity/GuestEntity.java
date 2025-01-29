package sam.tendousouji.wedding_server.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@Entity
@AllArgsConstructor
@Table(name = "guest")
public class GuestEntity {
        @Id
        private String uuid;
        private String actual_name;
        private String name;
        private String phone;
        private Integer companion;
        private Boolean attending;

        public GuestEntity() {
                
        }
}

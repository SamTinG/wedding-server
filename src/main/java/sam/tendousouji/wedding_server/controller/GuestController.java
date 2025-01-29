package sam.tendousouji.wedding_server.controller;

import sam.tendousouji.wedding_server.entity.GuestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sam.tendousouji.wedding_server.entity.UninvitedGuestEntity;
import sam.tendousouji.wedding_server.repository.GuestRepository;
import sam.tendousouji.wedding_server.repository.UninvitedGuestRepository;

import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class GuestController {
    @Autowired
    private GuestRepository guestRepository;

    @Autowired
    private UninvitedGuestRepository uninvitedGuestRepository;

    @PostMapping("/submit")
    public ResponseEntity<HttpStatus> submit(@RequestBody Map<String, String> payload) {
        String uuid = payload.get("uuid");
        if (uuid == null || !guestRepository.existsById(uuid)) {
            UninvitedGuestEntity uninvitedGuestEntity = UninvitedGuestEntity
                    .builder()
                    .name(payload.get("name"))
                    .phone(payload.get("phone"))
                    .companion(Integer.parseInt(payload.get("companion")))
                    .attending(true)
                    .build();
            uninvitedGuestRepository.save(uninvitedGuestEntity);
            return ResponseEntity.status(HttpStatus.OK).body(HttpStatus.OK);
        }

        GuestEntity guest1 = guestRepository.findById(uuid).orElse(new GuestEntity());

        GuestEntity guest = GuestEntity
                .builder()
                .uuid(uuid)
                .actual_name(guest1.getActual_name())
                .name(payload.get("name"))
                .phone(payload.get("phone"))
                .companion(Integer.parseInt(payload.get("companion")))
                .attending(true)
                .build();
        guestRepository.save(guest);

        return ResponseEntity.status(HttpStatus.OK).body(HttpStatus.OK);
    }
}


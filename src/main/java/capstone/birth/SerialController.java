package capstone.birth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/number"})
public class SerialController {
    private final SerialRepository serialRepository;

    public SerialController(SerialRepository serialRepository) {
        this.serialRepository = serialRepository;
    }

    @GetMapping({"/{serial}"})
    public Serial getBySerial(@PathVariable String serial) {
        return this.serialRepository.findBySerial(serial);
    }

    @PostMapping
    public ResponseEntity<Serial> createSerial(@RequestBody Serial serial) {
        String serialValue = serial.getSerial();
        String expireDate = serialValue.substring(serialValue.lastIndexOf('-') + 1);

        serial.setExpire_date(expireDate);
        Serial savedSerial = serialRepository.save(serial);
        return new ResponseEntity<>(savedSerial, HttpStatus.CREATED);
    }
}
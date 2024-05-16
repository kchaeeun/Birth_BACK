package capstone.birth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
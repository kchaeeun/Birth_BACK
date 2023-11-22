package grad.birth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/number")
public class SerialController {

    private final SerialRepository serialRepository;

    public SerialController(SerialRepository serialRepository) {
        this.serialRepository = serialRepository;
    }

    @GetMapping("/{serial}")
    public Serial getBySerial(@PathVariable String serial) {  // 메서드 명이 모델의 필드명과 동일해야한다.(메서드 이름 짓는 것도 무시하면 안됨!)
        return serialRepository.findBySerial(serial);
    }

}
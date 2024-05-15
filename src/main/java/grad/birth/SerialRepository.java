package grad.birth;
import org.springframework.data.repository.CrudRepository;


public interface SerialRepository extends CrudRepository<Serial, Long> {
    Serial findBySerial(String serial_num);
}

package grad.birth;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity // 얘 때문에 오류 발생
@Getter
@Setter
public class Serial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 12)
    private String serial;

    @Column(nullable = false, length = 3)
    private String name;

    @Column(nullable = false, length = 10)
    private String expire_date;
}

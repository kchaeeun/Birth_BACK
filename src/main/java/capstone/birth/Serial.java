package capstone.birth;


import jakarta.persistence.*;

@Entity
public class Serial {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @Column(
            nullable = false,
            length = 12
    )
    private String serial;
    @Column(
            nullable = false,
            length = 3
    )
    private String name;
    @Column(
            nullable = false,
            length = 10
    )
    private String expire_date;

    public Serial() {
    }

    public Long getId() {
        return this.id;
    }

    public String getSerial() {
        return this.serial;
    }

    public String getName() {
        return this.name;
    }

    public String getExpire_date() {
        return this.expire_date;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setSerial(final String serial) {
        this.serial = serial;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setExpire_date(final String expire_date) {
        this.expire_date = expire_date;
    }
}

package webapp.spring.webapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String adress;

//    public Publisher() {
//    }
//
//    public Publisher(String name, String adress) {
//        this.name = name;
//        this.adress = adress;
//    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}

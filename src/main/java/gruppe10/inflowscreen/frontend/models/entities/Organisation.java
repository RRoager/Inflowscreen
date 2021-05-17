package gruppe10.inflowscreen.frontend.models.entities;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Organisation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    private String logoPath;

    // @OneToMany()
    // private Set<Slide> slides;

    @OneToMany(mappedBy = "organisation")
    // @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "filmId")
    private Set<Account> accounts;

    @Override
    public String toString() {
        return "Organisation{" +
                "id=" + id +
                ", accounts=" + accounts +
                '}';
    }
}

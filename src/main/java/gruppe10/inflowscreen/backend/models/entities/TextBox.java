package gruppe10.inflowscreen.backend.models.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TextBox {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String text;
    private String font;
    private int fontSize;
    private String fontColour;
    private boolean isList;
    private boolean bold;
    private boolean italic;
    private boolean underline;
    private String margin;
    private double x;
    private double y;

}

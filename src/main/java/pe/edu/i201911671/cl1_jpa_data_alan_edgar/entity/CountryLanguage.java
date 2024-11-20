package pe.edu.i201911671.cl1_jpa_data_alan_edgar.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id;

    @Enumerated(EnumType.STRING)
    @Column(name = "IsOfficial")
    private IsOfficial isOfficial; // Enum

    private Double Percentage;

    // Relación con Country
    @ManyToOne
    @MapsId("CountryCode")
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country country;

}

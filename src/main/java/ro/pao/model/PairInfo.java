package ro.pao.model;

import ro.pao.model.abstracts.AbstractEntity;

import java.util.UUID;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
public class PairInfo extends AbstractEntity {
    private UUID studentId;
    private Integer grade;

}
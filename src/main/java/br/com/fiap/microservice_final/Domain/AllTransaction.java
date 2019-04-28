package br.com.fiap.microservice_final.Domain;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AllTransaction {

    private double sum;
    private double min;
    private double max;
    private double avg;
    private long count;
}

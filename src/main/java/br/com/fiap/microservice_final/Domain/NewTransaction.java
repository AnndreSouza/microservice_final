package br.com.fiap.microservice_final.Domain;


import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class NewTransaction {

    private double amount;
    private long data;
    private long timestamp;
}

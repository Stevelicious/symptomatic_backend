package se.symptomatic.symptomatic.model;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Symptom {
    String id;
    String name;
}

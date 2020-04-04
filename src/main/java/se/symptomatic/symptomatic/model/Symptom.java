package se.symptomatic.symptomatic.model;

import lombok.*;

import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Symptom {
    long id;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Symptom symptom = (Symptom) o;
        return id == symptom.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

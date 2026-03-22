package com.pm.patientservice.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//By default, Jackson often serializes fields in the order they appear in the class, but this behavior can be affected by JVM optimization or reflections,
// which might cause them to appear alphabetically (like your example: address, dateOfBirth, email, id, name).
@JsonPropertyOrder({ "id", "name", "email", "address", "dateOfBirth" })
public class PatientResponseDTO {
    private String id;
    private String name;
    private String email;
    private String address;
    private String dateOfBirth;
}

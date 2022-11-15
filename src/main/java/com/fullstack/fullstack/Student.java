package com.fullstack.fullstack;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Student {

    private Long id;
    private String name;
    private String email;
    private Gender gender;

}

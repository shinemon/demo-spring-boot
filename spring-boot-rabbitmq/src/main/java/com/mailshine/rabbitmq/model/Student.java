package com.mailshine.rabbitmq.model;

import lombok.*;

@Getter @Setter
@ToString
@AllArgsConstructor @NoArgsConstructor
public class Student {

    private String studentId;
    private String name;
    private String course;
}

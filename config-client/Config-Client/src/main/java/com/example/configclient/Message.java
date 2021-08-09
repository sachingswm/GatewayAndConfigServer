package com.example.configclient;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Message {
    @Id
    @GeneratedValue
    private Long id;
    private String message;
    public Message(String message) {
        this.message = message;
    }
}

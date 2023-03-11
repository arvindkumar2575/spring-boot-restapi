package com.arvindkumar2575.usermanagement.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String firstName;
    private  String lastName;
    private  String userType;
    @NonNull
    @Column(unique = true)
    private  String emailId;
}

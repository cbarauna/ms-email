package com.ms.email.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Getter
@Setter
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private Integer number;

    private String street;

    private String complemets;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private User user;

    public Address() {
    }
}

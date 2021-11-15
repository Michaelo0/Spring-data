package com.example.demo.entity

import org.hibernate.annotations.NaturalId
import java.time.LocalDate
import javax.persistence.*

@Entity
class Student(
    @Id
    @GeneratedValue
    var id: Long = 0,

    @Column(name = "first_name", length = 127)
    var name: String,

    @NaturalId
    var email: String,

    var birthDate: LocalDate,

    @OneToMany
    var books: MutableList<Book>? = null,

    @ManyToOne
    var group: Group? = null
)
package com.example.demo.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Group {
    @Id
    @GeneratedValue
    var id: Long = 0

    @Column(name = "name", length = 127)
    lateinit var name: String

}
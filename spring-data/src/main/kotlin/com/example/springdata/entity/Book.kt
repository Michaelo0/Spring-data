package com.example.demo.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "books")
class Book {
    @Id
    @GeneratedValue
    private val id: Long? = null
    private val name: String? = null
}
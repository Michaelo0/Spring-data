package com.example.springdata

import com.example.demo.entity.Book

interface CustomBookRepository {
    fun save(entity: Book)
    fun findAll()
    fun delete(entity: Book)
}
package com.example.springdata

import com.example.demo.entity.Book
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import java.util.*
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

class BookRepositoryImpl(
    @PersistenceContext
    private val entityManager: EntityManager
) : CustomBookRepository {
     override fun save(entity: Book) {
        entityManager.persist(entity)
    }

     override fun findAll() {
         entityManager.createQuery("""from Books""").resultList as MutableList<Book>
    }

     override fun delete(entity: Book) {
        entityManager.remove(entity)
    }

}
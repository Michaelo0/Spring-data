package com.example.demo

import com.example.demo.dao.StudentDAO
import com.example.demo.entity.Book
import com.example.demo.entity.Group
import com.example.demo.entity.Student
import org.hibernate.cfg.Configuration
import java.time.LocalDate

fun main(){
    val sessionFactory = Configuration().configure()
        .addAnnotatedClass(Student::class.java)
        .addAnnotatedClass(Book::class.java)
        .addAnnotatedClass(Group::class.java)
        .buildSessionFactory()

    sessionFactory.use { sessionFactory ->
        val dao = StudentDAO(sessionFactory)


        val student1 = Student(
            name = "Petr",
            email = "petr@student.ru",
           birthDate = LocalDate.now().minusYears(20),
        )
        val student2 = Student(
            name = "Ivan",
            email = "ivan@student.ru",
            birthDate = LocalDate.now().minusYears(24),
        )

        dao.save(student1)

        dao.save(student2)

        var found = dao.find(student1.id)
        println("Найден студент: $found \n")

        val allStudents = dao.findAll()
        println("все студенты: $allStudents")

    }
}
package com.example.demo.dao

import com.example.demo.entity.Student
import org.hibernate.SessionFactory

class StudentDAO(
    private val sessionFactory: SessionFactory
)
{
        fun save(student: Student) {
            sessionFactory.openSession().use { session ->
                session.beginTransaction()
                session.save(student)
                session.transaction.commit()
            }
        }

        fun find(id: Long): Student? {
            val result: Student?
            sessionFactory.openSession().use { session ->
                session.beginTransaction()
                result = session.get(Student::class.java, id)
                session.transaction.commit()
            }
            return result
        }

        fun findAll(): List<Student> {
            val result: List<Student>
            sessionFactory.openSession().use { session ->
                session.beginTransaction()
                result = session.createQuery("from Student").list() as List<Student>
                session.transaction.commit()
            }
            return result
        }
}
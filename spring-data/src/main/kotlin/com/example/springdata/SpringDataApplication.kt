package com.example.springdata

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDataApplication (
    private val customBookRepository: CustomBookRepository
) : CommandLineRunner {
    override fun run(vararg args: String?) {
//        val kotlinDev = Developer(firstName = "Вася", lastName = "Иванов", specialty = Specialty.KOTLIN, experience = 1)
//        val kotlinDev2 = Developer(firstName = "Вася2", lastName = "Иванов", specialty = Specialty.KOTLIN, experience = 2)
//        val javaDev1 = Developer(firstName = "Вася3", lastName = "Иванов", specialty = Specialty.JAVA, experience = 3)
//        val javaDev2 = Developer(firstName = "Вася4", lastName = "Иванов", specialty = Specialty.JAVA, experience = 2)
//
//        developerRepository.saveAll(listOf(kotlinDev, kotlinDev2, javaDev1, javaDev2))

//        val kotlinDevs = developerRepository.findBySpecialty(Specialty.KOTLIN)
//        val skilledDevs = developerRepository.findSkilled(2)

//        println(kotlinDevs)
//
//        println(skilledDevs)
//        val pageResult = developerPagingRepository.findAll(PageRequest.of(1, 2))
//        println("Total elements: ${pageResult.totalElements}")
//        println("Total pages: ${pageResult.totalPages}")
//        println("page 1: ${pageResult.content}")

        val resultAll = customBookRepository.findAll()
        println(resultAll)
    }
}

fun main(args: Array<String>) {
    runApplication<SpringDataApplication>(*args)
}

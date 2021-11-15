package com.example.springdata

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDataApplication (
    private val customBookRepository: CustomBookRepository
) : CommandLineRunner {
    override fun run(vararg args: String?) {

        val resultAll = customBookRepository.findAll()
        println(resultAll)
    }
}

fun main(args: Array<String>) {
    runApplication<SpringDataApplication>(*args)
}

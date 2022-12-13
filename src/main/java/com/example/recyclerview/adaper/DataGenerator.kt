package com.example.recyclerview.adaper


fun createListOfPersons(): List<Person> {
    return listOf(
        Person("firstName", "lastNme"),
        Person("john", "boo"),
        Person("marry", "christmas"),
        Person("john", "doe"),
        Person("alex", "smith"),

    )
}

data class Person(
    val firsName: String,
    val lastName: String
)
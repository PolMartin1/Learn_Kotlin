package com.example.learn_kotlin

class Person {

    var name="Pol"
    var surname="Martín"

    /* Setter personalizado

    var name = "Name"
        set(value) {
            name = "Name: $value"
        }
    */

    fun getFullName(): String {
        return "$name $surname"
    }
}

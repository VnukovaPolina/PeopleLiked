package ru.netology

fun main() {
    val likes = 21

    if (likes % 10 == 1) {
        println("Понравилость $likes человеку")
    }
    else {
        println("Понравилость $likes людям")
    }
}
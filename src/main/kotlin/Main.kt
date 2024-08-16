package ru.netology

fun main() {
    val likes = 11

    if (likes % 10 == 1 && likes % 100 != 11) {
        println("Понравилость $likes человеку")
    }
    else {
        println("Понравилость $likes людям")
    }
}
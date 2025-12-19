package io.github.dsdolzhenko.sandbox

object Application {
    @JvmStatic
    fun main(args: Array<String>) {
        print(System.getenv("SECRET_KEY"))
    }
}
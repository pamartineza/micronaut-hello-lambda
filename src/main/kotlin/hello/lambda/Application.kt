package hello.lambda

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("hello.lambda")
                .mainClass(Application.javaClass)
                .start()
    }
}
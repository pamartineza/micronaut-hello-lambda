package hello.lambda

import io.micronaut.function.FunctionBean
import java.util.function.Supplier

@FunctionBean("hello-lambda")
class HelloLambdaFunction : Supplier<String> {

    override fun get(): String {
        return "hello-lambda"
    }
}
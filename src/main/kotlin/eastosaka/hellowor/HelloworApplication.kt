package eastosaka.hellowor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloworApplication

fun main(args: Array<String>) {
    runApplication<HelloworApplication>(*args)
}

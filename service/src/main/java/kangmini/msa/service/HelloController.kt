package kangmini.msa.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.util.HashMap

@RestController
class HelloController {

    @Value("\${kangmini.a}")
    internal var a: String? = null

    @Value("\${kangmini.b}")
    internal var b: String? = null

    @GetMapping("/")
    fun index(): Mono<Map<String, String?>> {
        return Mono.just(object : HashMap<String, String?>() {
            init {
                this["a"] = a
                this["b"] = b
            }
        })
    }
}

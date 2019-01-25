package kangmini.msa.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import java.util.HashMap;
import java.util.Map;

@RestController
class HelloController {

    @Value("${kangmini.a}")
    String a;

    @Value("${kangmini.b}")
    String b;

    @GetMapping("/")
    public Mono<Map<String, String>> index() {
        return Mono.just(new HashMap<>() {{
                this.put("a", a);
                this.put("b", b);
        }});
    }
}

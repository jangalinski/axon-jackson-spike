package io.toolisticon.spike.axon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

fun main(args: Array<String>) = runApplication<AxonSerializerSpikeApplication>(*args).let { Unit }

@SpringBootApplication
@RestController
class AxonSerializerSpikeApplication {


  @GetMapping
  fun  hello() : ResponseEntity<String> = ResponseEntity.ok("hello world")

}

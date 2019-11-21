package io.toolisticon.spike.axon

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.ResponseEntity
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AxonSerializerSpikeApplicationITest {

  @Autowired
  lateinit var rest: TestRestTemplate

  @Test
  fun `call hello`() {
    val response = rest.getForEntity<String>("/")

    assert(response.body == "hello world")
  }
}

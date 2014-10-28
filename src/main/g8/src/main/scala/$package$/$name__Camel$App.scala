package $package$

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import com.mangofactory.swagger.plugin.EnableSwagger

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableSwagger
class $name;format="Camel"$App

object $name;format="Camel"$App extends App {
  SpringApplication.run(classOf[$name;format="Camel"$App])
}

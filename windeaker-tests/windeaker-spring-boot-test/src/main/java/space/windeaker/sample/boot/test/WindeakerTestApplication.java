package space.windeaker.sample.boot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import space.windeaker.sample.boot.starter.HelloService;

/**
 * TODO: WindeakerTestApplication 注释
 *
 * @author xq
 * @date 2022/7/19
 */
@RestController
@SpringBootApplication
public class WindeakerTestApplication {

	public static void main(String[] args) {
//		SpringApplication.run(WindeakerTestApplication.class,args);
		SpringApplication springApplication = new SpringApplication(WindeakerTestApplication.class);
		springApplication.run(args);
	}

	@Autowired
	HelloService helloService;

	@GetMapping("")
	public void test(){
		helloService.sayHello("windeaker");
	}
}

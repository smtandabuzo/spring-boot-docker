package converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@SpringBootApplication
@RestController
public class TempConverterController {

	/*@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}*/
	@Autowired
	TempConverterService tempConverterService;

	@RequestMapping("/resource")
	public Map<String,Object> home() {
		Map<String,Object> model = new HashMap<>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Hello World");
		return model;
	}

	@RequestMapping("/celsius")
	public double toCelsius(int fahrenheit){
		return tempConverterService.toCelsius(fahrenheit);
	}

	@RequestMapping("/fahrenheit")
	public int toFahrenheit(int celsius){
		return tempConverterService.toFahrenheit(celsius);
	}


	public static void main(String[] args) {
		SpringApplication.run(TempConverterController.class, args);
	}

}

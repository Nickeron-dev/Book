package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller			// mark it as a Controller
public class HomeController {
	
	@GetMapping("/")			// mark as GetMapping for /
	public String home() {
		return "home";		// returns home for request with /
	}
}

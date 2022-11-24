package org.tourGo.controller.plan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlannerController {

		
	@GetMapping("/plan")
	public String plannerDetails() {
		return "plan/planDetails";
	}
	@GetMapping("/makeplan")
	public String makePlan() {
		return "plan/makePlan";
	}
		
		
}
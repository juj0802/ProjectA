package org.tourGo.controller.plan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tourGo.models.plan.tourList.TourList;
import org.tourGo.service.plan.TourService;

@RestController
public class TourListController {

	@Autowired
	TourService service;
	
	@GetMapping("/tourList")
	public List<TourList> tourList(String keyword){
		List<TourList> items = service.process(keyword);
		
		
		return items;
	}
}

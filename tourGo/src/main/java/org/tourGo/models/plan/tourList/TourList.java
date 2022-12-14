package org.tourGo.models.plan.tourList;

import java.util.Date;
import java.util.List;

import org.tourGo.models.plan.PlannerRq;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class TourList {//관광지관련 dto
	
	private String addr1;
	private String addr2;
	private String areacode;
	private String booktour;
	private String cat1;
	private String cat2;
	private String cat3;
	private String contentid;
	private String contenttypeid;
	private String createdtime;
	private String dist;
	private String firstimage;
	private String firstimage2;
	private String mapx;
	private String mapy;
	private String mlevel;
	private String modifiedtime;
	private String readcount;
	private String sigungucode;
	private String tel;
	private String title;
}

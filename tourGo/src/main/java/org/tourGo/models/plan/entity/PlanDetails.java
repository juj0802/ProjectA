package org.tourGo.models.plan.entity;

import java.time.LocalTime;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.tourGo.common.BaseEntity;
import org.tourGo.models.plan.details.PlanDetailsRq;

import lombok.*;


@Entity
@Table(name="planDetails")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlanDetails extends BaseEntity {


	@Id @GeneratedValue
	private Long DetailsNo; // pk
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="plannerNo")
    private Planner plannerNo; // 관계매핑용
    @DateTimeFormat(pattern="HH : mm")
    private LocalTime stime; // 관광지 시작시간
    @DateTimeFormat(pattern="a KK : mm")
    private LocalTime etime;//관광지 종료시간
    private String name;//관광지이름
    private String address; //관광지 주소
	@Column(nullable=true)
    private Integer day; // day1,day2...등 일자 표시용
    private String image;//관광지 이미지
    private String sigungu;//시,군,구
	private Double mapX;
	private Double mapY;
}


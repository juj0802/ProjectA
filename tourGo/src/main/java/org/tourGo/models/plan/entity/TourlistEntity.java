package org.tourGo.models.plan.entity;

import javax.persistence.*;

import org.tourGo.common.BaseEntity;

import lombok.*;
/**
@Getter @Setter @ToString
@Entity
@Table(indexes={@Index(name="mapXY", columnList="mapX,mapY")})
public class TourlistEntity extends BaseEntity {
	@Id @GeneratedValue
	private Long id;
	private String title;
	private String image1;
	private String image2;
	private Double mapX;
	private Double mapY;
	private String zipcode;
	private String address;
}
*/
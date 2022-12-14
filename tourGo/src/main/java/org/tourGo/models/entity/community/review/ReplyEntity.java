package org.tourGo.models.entity.community.review;

import javax.persistence.*;

import org.tourGo.common.BaseEntity;
import org.tourGo.models.entity.user.User;

import lombok.*;

@Entity
@Table(name="reply")
@Getter @Setter
public class ReplyEntity extends BaseEntity{

	@Id @GeneratedValue
	private Long replyNo;				//식별자
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="reviewNo")
	private ReviewEntity review;	//게시글 번호
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userNo")
	private User user;					//작성자
	
	@Lob
	@Column(nullable=false)
	private String replyContent;	//댓글내용
	
	private int depth;					
	private Long idParent;				//모댓글 글번호
	private String listOrder;				//1차 정렬
	@Column(nullable=false, columnDefinition="char(1) default 'N'", insertable=false)
	private String deleteYn; 					// 삭제 여부

	@Override
	public String toString() {
		return "ReplyEntity [replyNo=" + replyNo + ", user=" + user + ", replyContent=" + replyContent + "]";
	}
}

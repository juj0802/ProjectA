const btnFn = {
	/**목록으로 돌아가기 S */
	back(){
		const keyword = document.getElementById("keyword").value;
		console.log(keyword);
		location.href = `../review_main?keyword=${keyword}`;
	},
	/**목록으로 돌아가기 E */
	
	/**게시글 수정하기 S */
	modify(reviewNo){
		location.href = "../review_modify?reviewNo="+reviewNo;
	},
	/**게시글 수정하기 E */
	
	/**게시글 삭제하기 S */
	delete(reviewNo){
		
		if(!confirm("삭제하시겠습니까?")){
			return;
		}		
		
		const xhr = new XMLHttpRequest();
		let url = "../review_delete?reviewNo="+reviewNo;
		xhr.open("GET", url);
		xhr.addEventListener("readystatechange", function(){
			if(xhr.status==200&&xhr.readyState==XMLHttpRequest.DONE){
				const result = JSON.parse(xhr.responseText);
				if(result.success){
					alert("게시글을 삭제했습니다.");
					location.href="../review_main";
				}
			}else{
				alert(err.message);
			}
		});
		xhr.send();		
	}
	/**게시글 삭제하기 E */
}

window.addEventListener("DOMContentLoaded", function(){
	
	/**목록이동 이벤트 선택 처리 S */
	const backBtnEl = document.getElementById("backBtn");
	if(backBtnEl){
		backBtnEl.addEventListener("click", function(){
			btnFn.back();
		});
	}
	/**목록이동 이벤트 선택 처리 E */
	
	const reviewNoEl = document.getElementById("reviewNo");
	if(reviewNoEl){
		const reviewNo = reviewNoEl.value;
	
		/**수정 이벤트 선택 처리 S */
		const modifyBtnEl = document.getElementById("modifyBtn");
		if(modifyBtnEl){
			modifyBtnEl.addEventListener("click", function(){
				console.log("modify : ", reviewNo);
				btnFn.modify(reviewNo);
			});
		}
		/**수정 이벤트 선택 처리 E */
		
		/**삭제 이벤트 선택 처리 S */
		const deleteBtnEl = document.getElementById("deleteBtn");
		if(deleteBtnEl){
			deleteBtnEl.addEventListener("click", function(){
				console.log("delete : ", reviewNo);
				btnFn.delete(reviewNo);		
			})
		}
		/**삭제 이벤트 선택 처리 E */
	} 
});
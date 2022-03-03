package com.examples.postservice.model;

import javax.persistence.Id;

public class CommentsDto {
	
		
		int cid;
		
		int pid;
		
		String commenter;
		
		String comment;
		
		public CommentsDto() {
			
		}

		public int getCid() {
			return cid;
		}

		public void setCid(int cid) {
			this.cid = cid;
		}

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getCommenter() {
			return commenter;
		}

		public void setCommenter(String commenter) {
			this.commenter = commenter;
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public CommentsDto(int cid, int pid, String commenter, String comment) {
			super();
			this.cid = cid;
			this.pid = pid;
			this.commenter = commenter;
			this.comment = comment;
		}
		

	}




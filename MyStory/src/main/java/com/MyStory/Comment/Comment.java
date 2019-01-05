package com.MyStory.Comment;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.MyStory.Feed.Feeds;
import com.MyStory.Profile.Profile;

@Entity
@Table(name="Comment")
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Comment_Key")
	private int Comment_Key;
	
	@ManyToOne
	private Profile Comment_By;
	
	@ManyToOne
	private Feeds Comment_On;
	
	@OneToMany(mappedBy="Reply_Key")
	private Set<Reply> Comment_Reply;
	
	@Column(name = "Comment_Body")
	private String Comment_Body;
	
	@Column(name = "Comment_Date")
	private Date Comment_Date;
	
	@Column(name = "Has_Replies")
	private boolean Has_Replies;
	
	@Column(name = "Is_Comment_Deleted")
	private boolean Is_Comment_Deleted;

	public int getComment_Key() {
		return Comment_Key;
	}

	public void setComment_Key(int comment_Key) {
		Comment_Key = comment_Key;
	}

	public Profile getComment_By() {
		return Comment_By;
	}

	public void setComment_By(Profile comment_By) {
		Comment_By = comment_By;
	}

	public Feeds getComment_On() {
		return Comment_On;
	}

	public void setComment_On(Feeds comment_On) {
		Comment_On = comment_On;
	}


	public Set<Reply> getComment_Reply() {
		return Comment_Reply;
	}

	public void setComment_Reply(Set<Reply> comment_Reply) {
		Comment_Reply = comment_Reply;
	}

	public String getComment_Body() {
		return Comment_Body;
	}

	public void setComment_Body(String comment_Body) {
		Comment_Body = comment_Body;
	}

	public Date getComment_Date() {
		return Comment_Date;
	}

	public void setComment_Date(Date comment_Date) {
		Comment_Date = comment_Date;
	}

	public boolean isHas_Replies() {
		return Has_Replies;
	}

	public void setHas_Replies(boolean has_Replies) {
		Has_Replies = has_Replies;
	}

	public boolean isIs_Comment_Deleted() {
		return Is_Comment_Deleted;
	}

	public void setIs_Comment_Deleted(boolean is_Comment_Deleted) {
		Is_Comment_Deleted = is_Comment_Deleted;
	}

	
}

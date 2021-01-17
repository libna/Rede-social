package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date moment;
	private String title;
	private String content;
	private Integer  likes;
	private List<Coment> coments = new ArrayList<>(); 
	
	public Post() {
		
	}

	public Post(Date moment, String title, String content, int likes) {
		
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}
	

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	

	public List<Coment> getComents() {
		return coments;
	}
	
	public void addComent(Coment coment) {
		coments.add(coment);
	}

	public void removeComent(Coment coment) {
		coments.remove(coment);
	}

	@Override
	public String toString() {
		return "Post [moment=" + moment + ", title=" + title + ", content=" + content + ", likes=" + likes
				+ ", coments=" + coments + "]";
	}

	
	
	
}


package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.bson.types.ObjectId;

@Entity
@Table(name = "comments")
public class Comment implements Serializable{
	@Id
	private ObjectId id;
	
	private String email;
	private String name;
	private String text;
	private Date date;
	@ManyToOne
	@JoinColumn(name = "movie_id")
	
	private Movies movie;

	public Comment(ObjectId id, String email, String name, String text, Date date, Movies movie) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.text = text;
		this.date = date;
		this.movie = movie;
	}
	public Comment() {
		super();
	}
	public Comment(ObjectId id, String email, String name, String text, Movies movie) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.text = text;
		this.movie = movie;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Movies getMovie() {
		return movie;
	}
	public void setMovie(Movies movie) {
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", email=" + email + ", name=" + name + ", text=" + text + ", date=" + date + "]";
	}
	
	
	
	

}

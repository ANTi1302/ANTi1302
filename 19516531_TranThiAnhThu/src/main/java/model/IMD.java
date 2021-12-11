package model;


import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Table;


@Embeddable
@Table(name = "imdb")
public class IMD implements Serializable{

	private int id;
	private double rating;
	private int votes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public IMD(int id, double rating, int votes) {
		super();
		this.id = id;
		this.rating = rating;
		this.votes = votes;
	}
	
	public IMD() {
		super();
	}
	@Override
	public String toString() {
		return "IMD [id=" + id + ", rating=" + rating + ", votes=" + votes + "]";
	}
	
	
}

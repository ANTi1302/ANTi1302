package model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.bson.types.ObjectId;

@Entity
@Table(name = "movies")
public class Movies implements Serializable{
	
	@Id
	private ObjectId id;
	@ElementCollection(fetch = FetchType.EAGER)
	private Set<String> cast;
	@ElementCollection(fetch = FetchType.EAGER)
	private Set<String> directors;
	@ElementCollection(fetch = FetchType.EAGER)
	private Set<String> genres;
	@ElementCollection(fetch = FetchType.EAGER)
	private Set<String> languages;
	private int runtime;
	private String title;
	@ElementCollection(fetch = FetchType.EAGER)
	private Set<String> writers;
	private int year;
	
	@Embedded
	private IMD imdb;

	public Movies() {
		super();
	}
	

	public Movies(ObjectId id) {
		super();
		this.id = id;
	}


	public Movies(ObjectId id, Set<String> cast, Set<String> directors, Set<String> genres, Set<String> languages,
			int runtime, String title, Set<String> writers, int year) {
		super();
		this.id = id;
		this.cast = cast;
		this.directors = directors;
		this.genres = genres;
		this.languages = languages;
		this.runtime = runtime;
		this.title = title;
		this.writers = writers;
		this.year = year;
	}

	public Movies(ObjectId id, Set<String> cast, Set<String> directors, Set<String> genres, Set<String> languages,
			int runtime, String title, Set<String> writers, int year, IMD imdb) {
		super();
		this.id = id;
		this.cast = cast;
		this.directors = directors;
		this.genres = genres;
		this.languages = languages;
		this.runtime = runtime;
		this.title = title;
		this.writers = writers;
		this.year = year;
		this.imdb = imdb;
	}

	public Movies(IMD imdb) {
		super();
		this.imdb = imdb;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public Set<String> getCast() {
		return cast;
	}

	public void setCast(Set<String> cast) {
		this.cast = cast;
	}

	public Set<String> getDirectors() {
		return directors;
	}

	public void setDirectors(Set<String> directors) {
		this.directors = directors;
	}

	public Set<String> getGenres() {
		return genres;
	}

	public void setGenres(Set<String> genres) {
		this.genres = genres;
	}

	public Set<String> getLanguages() {
		return languages;
	}

	public void setLanguages(Set<String> languages) {
		this.languages = languages;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<String> getWiriters() {
		return writers;
	}

	public void setWiriters(Set<String> writers) {
		this.writers = writers;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public IMD getImdb() {
		return imdb;
	}

	public void setImdb(IMD imdb) {
		this.imdb = imdb;
	}


	@Override
	public String toString() {
		return "Movies [id=" + id + ", cast=" + cast + ", directors=" + directors + ", genres=" + genres
				+ ", languages=" + languages + ", runtime=" + runtime + ", title=" + title + ", writers=" + writers
				+ ", year=" + year + ", imdb=" + imdb + "]";
	}

//	@Override
//	public String toString() {
//		return "Movies [id=" + id + ", cast=" + cast + ", directors=" + directors + ", genres=" + genres
//				+ ", languages=" + languages + ", runtime=" + runtime + ", title=" + title + ", wiriters=" + writers
//				+ ", year=" + year + "]";
//	}
//	
	

}

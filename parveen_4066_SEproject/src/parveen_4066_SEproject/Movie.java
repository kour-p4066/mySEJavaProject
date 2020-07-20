package parveen_4066_SEproject;

public class Movie {

	int movie_id;
	String movie_date,movie_time;
	String movie_name,movie_theatre;
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_date() {
		return movie_date;
	}
	public void setMovie_date(String movie_date) {
		this.movie_date = movie_date;
	}
	public String getMovie_time() {
		return movie_time;
	}
	public void setMovie_time(String movie_time) {
		this.movie_time = movie_time;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getMovie_theatre() {
		return movie_theatre;
	}
	public void setMovie_theatre(String movie_theatre) {
		this.movie_theatre = movie_theatre;
	}
	public Movie(int movie_id, String movie_date, String movie_time, String movie_name, String movie_theatre) {
		super();
		this.movie_id = movie_id;
		this.movie_date = movie_date;
		this.movie_time = movie_time;
		this.movie_name = movie_name;
		this.movie_theatre = movie_theatre;
	}
	
	

}

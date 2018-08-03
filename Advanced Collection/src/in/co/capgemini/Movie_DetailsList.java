package in.co.capgemini;

import java.util.LinkedList;
import java.util.List;

public class Movie_DetailsList {
	static List<Movie_Details> movie=new LinkedList<Movie_Details>();

	public static void add_movie()
	{

		movie.add(new Movie_Details("Dhoom","John","Bipasha", "Action"));
		movie.add(new Movie_Details("Dhoom3","Aamir","Katrina", "Action"));
		movie.add(new Movie_Details("MSD","Sushant","Disha", "Biopic"));
	    movie.add(new Movie_Details("Raazi","Vicky","Alia", "Action"));
	}
	
	public static void remove_movie(String movieToBeRemoved)
	{   Movie_Details movie2=null;
		for(Movie_Details movie1: movie)
		{    
			if(movieToBeRemoved==movie1.getMov_Name())
		     movie2=movie1;
	
		}
		   movie.remove(movie2);
	}
	
	
	public static void removeAll_Movies()
	{
		movie.removeAll(movie);
	}
	public static Movie_Details find_movie_By_mov_Name(String search_Name)
	{
		for(Movie_Details movie1: movie)
		{
			if(search_Name==movie1.getMov_Name())
		        return movie1;
	
		}
		return null;
	}
	public static List<Movie_Details> find_movie_By_Genre(String search_Genre)
	{   
		 List<Movie_Details> movie5=new LinkedList<Movie_Details>();
		for(Movie_Details movie1: movie)
		{
			if(search_Genre==movie1.getGenre())
		        movie5.add(movie1);
	
		}
		return movie5;
	}
	
}

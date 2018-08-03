package in.co.capgemini;


public class TestMovie_Details {

	public static void main(String[] args) {
		
	    Movie_DetailsList.add_movie();
	    System.out.println(Movie_DetailsList.movie);
	    Movie_DetailsList.remove_movie("Dhoom3");
	    System.out.println(Movie_DetailsList.movie);
	    if(Movie_DetailsList.find_movie_By_mov_Name("Dhoom")==null)
	    {
	    	System.out.println("Not found");
	    }
	    else
	    {
	    	System.out.println("Found");
	    }
	    System.out.println(Movie_DetailsList.find_movie_By_Genre("Action"));
	    
	}

}

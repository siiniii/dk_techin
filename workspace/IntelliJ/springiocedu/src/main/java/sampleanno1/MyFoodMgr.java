package sampleanno1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myFood")  //default : myFoodMgr
public class MyFoodMgr{
	@Autowired
	//@Qualifier(value="unFavoriteFood")
	private Food favoriteFood;     
	@Autowired
	private Food unFavoriteFood;
	                 
	
	@Override
	public String toString() {
		return "[favoriteFood=" + favoriteFood + ", unFavoriteFood=" + unFavoriteFood + "]";
	}
}

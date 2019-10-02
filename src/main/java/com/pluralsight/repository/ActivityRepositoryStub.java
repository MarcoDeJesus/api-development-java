package com.pluralsight.repository;

import java.util.List;
import java.util.ArrayList;
import com.pluralsight.model.*;

public class ActivityRepositoryStub implements ActivityRepository {


	@Override
	public void delete(String activityId) {
		// Delete from activity where activityid = ?
		
		
	}	

	@Override
	public void create(Activity activity) {
		// TODO Should issue a insert statement to the db 
		
	}

	@Override
	public List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<Activity>();
				
		Activity activity1 = new Activity();
		
		activity1.setId("1234");
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		
		activities.add(activity1);
		
		Activity activity2 = new Activity();
		
		activity2.setDescription("Cycling");
		activity2.setDuration(120);
		
		activities.add(activity2);
		
		return activities;
	}
	
	@Override
	public Activity findActivity(String activityId) {
		
		if(activityId.equals("7777")) {
			return null;
		}
		
		Activity activity1 = new Activity();
		
		activity1.setId("1234");
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		
		User user = new User();
		user.setId("5678");
		user.setName("Bryan");
		
		activity1.setUser(user);
		
		
		return activity1;
	}

	@Override
	public Activity update(Activity activity) {
		// TODO Search the database to see if we have an activity with that id already
		// select * from Activity where id= ?
		// if resultset size == 0
		// insert into Activity table 
		// else 
		// update the Activity on table
		
		return activity;
		
	}

	@Override
	public List<Activity> findByDescription(List<String> descriptions, int durationFrom, int durationTo) {
		// select * from activities where description in (?,?,?) and duration > ? and duration < ?
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity activity = new Activity();
		
		activity.setId("2345");
		activity.setDescription("Swimming");
		activity.setDuration(55);
		
		activities.add(activity);
		
		return activities;
	}

	@Override
	public List<Activity> findByConstraints(ActivitySearch search) {
		// select * from activities where description in (?,?,?) and duration > ? and duration < ?
		
		System.out.println(search.getDurationTo());
		System.out.println(search.getSearchType());
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity activity = new Activity();
		
		activity.setId("2345");
		activity.setDescription("Swimming");
		activity.setDuration(55);
		
		activities.add(activity);
		
		return activities;
	}
	
}

package com.MyStory.Profile;

import org.springframework.stereotype.Repository;

@Repository
public interface ProfileService {

	public Profile create(ProfileDto profileDto);
}

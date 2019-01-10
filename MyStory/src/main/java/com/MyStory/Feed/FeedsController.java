package com.MyStory.Feed;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.MyStory.Profile.ProfileDto;
import com.MyStory.Utils.ConfigMain;

@RestController
@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
public class FeedsController {

	@Autowired
	private FeedsService feedsService;
	
//	@Autowired
//    RestTemplate restTemplate;
//	  
//	@RequestMapping(value = "/third")
//	   public String getProductList() {
//		  final String uri = "https://api.hearthstonejson.com/v1/19776/enUS/cards.json";
//		  RestTemplate restTemplate = new RestTemplate();
//          HttpHeaders headers = new HttpHeaders();
//          headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//          headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
//          HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
//          Object response = restTemplate.exchange(uri, HttpMethod.GET,entity,Object.class);
//          System.out.println(response);
//          return response.toString();
//	}
	
	@GetMapping(ConfigMain.SAVE_FEEDS)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
    public void create(FeedsDto feedsDto){ 
		ProfileDto profileDto = new ProfileDto();
		profileDto.setProfile_Key(3);
		
		feedsDto.setFeed_Key(3);
		feedsDto.setFeed_Title("Feed Title 3");
		feedsDto.setFeed_Description("This is a feed description. 2 This is a feed description. 2 This is a feed description. 2");
		feedsDto.setFeed_Upload_Date(new Date());
		feedsDto.setTotal_Likes(10);
		feedsDto.setFeed_Uploaded_By(profileDto);
//		feedsDto.setImage_Of_Feed_Key(imagesDto);
		feedsDto.setIs_Feed_Deleted(false);
		feedsDto.setTotal_Views(58741);
		feedsService.create(feedsDto);
    }
	
	@GetMapping(ConfigMain.GET_ALL_FEEDS)
	@CrossOrigin(origins = "*")
	public List<Feeds> getAllFeeds() {
		return feedsService.getAllFeeds();
	}
	
	@GetMapping("/getAllFeedsByProfileKey/{Profile_Key}")
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public List<Feeds> getAllFeedsByProfileKey(@PathVariable("Profile_Key") int Profile_Key) {
		return feedsService.getAllFeedsByProfileKey(Profile_Key);
	}
	
	@GetMapping(ConfigMain.GET_FEED_VIA_FEED_ID)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public Optional<Feeds> getFeed(@PathVariable("feed_key") int feed_key) {
		return feedsService.getFeed(feed_key);
	}
}

package masterSpringMvc.search.api;

import masterSpringMvc.search.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel
 * Date: 03/04/2016
 * Time: 09:20 PM
 */
@RestController
@RequestMapping("api/search")
public class SearchApiController {

    private SearchService searchService;

    @Autowired
    public SearchApiController(SearchService searchService) {
        this.searchService = searchService;
    }

    @RequestMapping(value = "/{searchType}", method = RequestMethod.GET)
    public List<LightTweet> search(@PathVariable String searchType, @MatrixVariable List<String> keywords) {
        return searchService.search(searchType, keywords);
    }
}

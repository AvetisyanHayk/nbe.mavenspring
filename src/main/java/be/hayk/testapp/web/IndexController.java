package be.hayk.testapp.web;

import be.hayk.testapp.data.services.TestEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Hayk
 */
@Controller
@RequestMapping("/")
public class IndexController {

    private static final String VIEW = "index";
    private final TestEntityService testEntityService;
    
    @Autowired
    IndexController(TestEntityService testEntityService) {
        this.testEntityService = testEntityService;
    }

    @RequestMapping(method = RequestMethod.GET)
    ModelAndView index() {
        return new ModelAndView(VIEW)
                .addObject("testentity", testEntityService.read(1L).toString());
    }
}

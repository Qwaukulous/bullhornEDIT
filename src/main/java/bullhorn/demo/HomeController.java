package bullhorn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    MessageRepository messageRepository;

    @RequestMapping("/")
    public String listCourses



    @RequestMapping("/")
    public String index(Model model){


    }
}

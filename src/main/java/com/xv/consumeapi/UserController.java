package com.xv.consumeapi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/hello")
    @ResponseBody
    private String hello() {
        return "Hello World";
    }
    @RequestMapping("/todos/{id}")
    private ModelAndView getUser(@PathVariable Integer id, Model model)   {
        String uri = "https://jsonplaceholder.typicode.com/todos/" + id;
        RestTemplate restTemplate = new RestTemplate();

        User user = restTemplate.getForObject(uri, User.class);
        Integer userId = user.getUserId();
        Integer Id = user.getId();
        String title = user.getTitle();
        boolean completed = user.getCompleted();

        ModelAndView modelAndView = new ModelAndView("user");
        modelAndView.addObject("user", user);
        modelAndView.addObject("userId", userId);
        modelAndView.addObject("id", Id);
        modelAndView.addObject("name", title);
        modelAndView.addObject("completed", completed);

        return modelAndView;
    }
}

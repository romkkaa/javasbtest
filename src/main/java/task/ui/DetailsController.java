package task.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import task.repository.DetailsRepository;
import task.repository.ItemRepository;

import java.util.HashMap;

@Controller
@RequestMapping("/details")
public class DetailsController {

    @Autowired
    private DetailsRepository detailsRepository;

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("")
    public String renderDetailsListPage(Model model) {
        model.addAttribute("details", detailsRepository.findAll());
        return "details_list";
    }

    @GetMapping(path = "/add")
    public String renderAddDetailsPage(Model model) {
        model.addAttribute("items", itemRepository.findAll());
        return "add_details";
    }

}

package ccampo133.redditvoicemail.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    
    @RequestMapping(value = "/main.xml", method = RequestMethod.GET, produces = {"application/xml"})
    public String main(Model model) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        model.addAttribute("time", sdf.format(cal.getTime()));
        return "main";
    }
}

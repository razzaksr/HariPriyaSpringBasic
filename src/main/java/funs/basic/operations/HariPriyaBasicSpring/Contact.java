package funs.basic.operations.HariPriyaBasicSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
// url router
public class Contact {

    @PostMapping("/pointing")
    public String reads(@RequestParam("skill") String skill, @RequestParam("exp") int exp){
        System.out.println("Parameters "+skill+" and "+exp);
        return "sendBasic";
    }

    @GetMapping("/peer")
    public String read(@RequestParam("skill") String skill, @RequestParam("exp") int exp){
        System.out.println("Parameters "+skill+" and "+exp);
        return "sendBasic";
    }

    @GetMapping("/push")
    public String open(){
        return "sendBasic";
    }

    @GetMapping("/more")
    public String moreSend(Model model){
        model.addAttribute("myImage","/imgs/corporate.ico");
        return "fourth";
    }

    // send from controller/ back end to view in the front end/ thymeleaf
    @GetMapping("/pass")
    public String sendWithData(Model mod){
        mod.addAttribute("mnw","Mahindra nextWealth");
        mod.addAttribute("exp",89);

        int[] tmp={12,56,3,90,21,89};
        mod.addAttribute("group",tmp);

        double[] sim={4.5,9.2,12.5,8.1,7.9};
        mod.addAttribute("pics",sim);

        return "third";
    }

    //@RequestMapping(value="/priya",method = RequestMethod.GET)
    @GetMapping("/hari")
    public String hell(){
        return "second";
    }

    // by default get
    @RequestMapping("/says")
    public String yet(){
        return "first";
    }

    @RequestMapping(value="/priya",method = RequestMethod.GET)
    public void heyThere(){
        System.out.println("Basic URL method");
    }
}

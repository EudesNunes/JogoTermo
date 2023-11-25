package termo.univille.termo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import termo.univille.termo.model.FormulariosModel;
import termo.univille.termo.service.contratos.SeletorService;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private SeletorService service;

    @GetMapping
    @ResponseBody
    public ModelAndView index() {
        var listpalavras = service.RequisicaoInicial();
        return new ModelAndView("home/index", "listpalavras", listpalavras);
    }
    
    @PostMapping("verificar")
    public ModelAndView verificar(FormulariosModel form) {
      
        ModelAndView modelAndView = new ModelAndView("home/index", "listpalavras", form);
        return modelAndView;
    }
}

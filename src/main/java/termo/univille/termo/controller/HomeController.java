package termo.univille.termo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import termo.univille.termo.service.contratos.SeletorService;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private SeletorService service;

    @GetMapping
    @ResponseBody
    public ModelAndView index() {
        var palavra = service.palavraSelecionada();
        return new ModelAndView("home/index", "palavra", palavra);
    }
    @GetMapping("consultar/{parametros}")
    public ModelAndView consultar(@PathVariable("parametros") String parametros) {
        String[] partes = parametros.split("&");
        String palavra = partes[0];
        String palavraJogada = partes[1];
        
        var resultado = service.checarpalavra(palavra, palavraJogada);
        ModelAndView modelAndView = new ModelAndView("home/index", "resultado", resultado);
        modelAndView.addObject("palavra", palavra);
        return modelAndView;
    }
}

package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {
	@Autowired
    private ICategoryService catServ;
    
    @PostMapping("/new/conversion")
    public void agregarFahrenheit(@RequestBody Category cat){
        catServ.crearFahrenheit(cat);
    }
    @GetMapping("/ver/conversion")
    @ResponseBody
    public List<Fahrenheit> verFahrenheit(){
//        return listaPersonas;
           return fahServ.verFahrenheit();
    } 
}

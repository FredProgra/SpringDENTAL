package cibertec.edu.pe.Proyecto_Bancario.Controller;

import cibertec.edu.pe.Proyecto_Bancario.Model.Cliente;
import cibertec.edu.pe.Proyecto_Bancario.Model.ResultadoResponse;
import cibertec.edu.pe.Proyecto_Bancario.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@Controller

@RequestMapping("/admin/cliente")
public class ClienteController {
    private ClienteService clienteService;
    @GetMapping("/frmcliente")
    public String home(Model model)
    {
        model.addAttribute("list",clienteService.Listar());
        return "/admin/frmcliente";
    }

    @PostMapping("/registrar")
    @ResponseBody
    public ResultadoResponse registrar(@RequestBody Cliente objclie)
    {

        return clienteService.registarCliente(objclie);
    }
    @ResponseBody
    @DeleteMapping("/eliminar")
    public  ResultadoResponse resultado(@RequestBody Cliente objclie){
        return  clienteService.Eliminar(objclie.getCod());

    }

}

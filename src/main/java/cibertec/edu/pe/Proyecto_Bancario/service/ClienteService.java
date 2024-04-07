package cibertec.edu.pe.Proyecto_Bancario.service;

import cibertec.edu.pe.Proyecto_Bancario.Model.Cliente;
import cibertec.edu.pe.Proyecto_Bancario.Model.ResultadoResponse;
import cibertec.edu.pe.Proyecto_Bancario.Repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteService{
    private ClienteRepository clienteRepository;
public List<Cliente> Listar(){return clienteRepository.findAll();}
    public ResultadoResponse registarCliente(Cliente cliente){
    String mensaje="Cliente agregado";
    boolean respuesta=true;
    try {
        clienteRepository.save(cliente);
    }catch (Exception e){
        mensaje="Cliente NO AGREGADO";
        respuesta=false;
    }


    return ResultadoResponse.builder().respuesta(respuesta).mensaje(mensaje).build();
    }
    public ResultadoResponse Eliminar(Integer codcliente){
    String mensaje="Eliminado correctamente";
    boolean respuesta=true;

    try {
        clienteRepository.deleteById(codcliente);
    }catch (Exception e){
        mensaje=" No Eliminado correctamente";
         respuesta=false;
    }
    return  ResultadoResponse.builder().respuesta(respuesta).mensaje(mensaje).build();

    }


}

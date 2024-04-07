package cibertec.edu.pe.Proyecto_Bancario.Model;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.bind.annotation.ResponseBody;

@Data
@ResponseBody
@Builder
public class ResultadoResponse {
    private String mensaje;
    private boolean respuesta;
}

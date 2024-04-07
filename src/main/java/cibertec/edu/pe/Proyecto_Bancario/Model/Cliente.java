package cibertec.edu.pe.Proyecto_Bancario.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity

@Data
@Table(name = "tb_paciente")
public class Cliente {
    @Id
   @Column(name="cod")
private Integer cod;
    @Column(name = "nom")
private String nom;
    @Column(name = "apell")
private String apell;
    @Column(name = "edad")
    private Integer edad;
@Column(name = "tele")
    private  Integer tele;


}

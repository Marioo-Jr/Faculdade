package Poo.com.TrabalhoJava.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //cria os gets e sets automaticamente.
@NoArgsConstructor // Cria um construtor sem argumentos.
@Entity

public class Tarefa {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //auto incremento do ID.
    private Long id;
    public String status;
    public String prioridade;
    @ManyToOne
    private Tarefa tarefa;

}

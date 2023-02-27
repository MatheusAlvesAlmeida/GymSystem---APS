@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cpf;
    private String nome;
    private String rg;
    private String dataNascimento;
}
import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Banco {
    protected String nome;
    protected List<Conta> contas;
    protected List<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void adicionarConta(Conta conta){ contas.add(conta);}

    }

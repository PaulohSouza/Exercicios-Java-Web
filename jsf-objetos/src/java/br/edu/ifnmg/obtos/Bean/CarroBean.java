
package br.edu.ifnmg.obtos.Bean;

import br.edu.ifnmg.objtos.entidade.Carro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;

@ManagedBean
@SessionScoped
public class CarroBean implements Serializable {
    
    private Carro carro;
    private List<Carro> carros = new ArrayList<>();
    
    public void adicionar(){
        carros.add(carro);
        carro = new Carro();
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
    
    
}

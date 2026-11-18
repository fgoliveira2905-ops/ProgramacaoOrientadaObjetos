import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GestorCromos implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<cromo> listaCromos;

    public GestorCromos() {
        this.listaCromos = ArrayList<cromo>();
    }

    public boolean adicionarCromo(cromo c) {
        for(cromo cr : this.listaCromos) {
            if (cr.getNumero() == c.getNumero()) { //ja está na lista
                return false;
            }
        }
        listaCromos.add(c);
        return true;
    }

    //listar de cromos
    public List<cromo> getListaCromos() {
        return this.listaCromos;
    }

    // Pesquisar cromos por categoria
    public List<cromo> pesquisarPorCategoria(String categoria) {
        List<cromo> cr = new ArrayList<>();
        for(cromo c : this.listaCromos) {
            if(c.getCategoria().equals(categoria)) {
                cr.add(c);
            }
        }
        return cr;
    }
    
    // Pesquisar cromos por localização
    public List<cromo> pesquisarPorLocalizacao(String localizacao) {
        List<cromo> cr = new ArrayList<>();
        for (cromo c : this.listaCromos) {
            if (c.getLocalizacao().equals(localizacao)) {
                cr.add(c);
            }
        }
        return cr;
    }

    // Marcar cromo como desaparecido

}

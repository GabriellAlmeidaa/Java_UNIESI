
package testeinterface;

public class Impressora {
    
    private String nomeImp;

    public String getNomeImp() {
        return nomeImp;
    }

    public Impressora(String nomeImp) {
        this.nomeImp = nomeImp;
    }
    
    public void print (String textoImprimir) {
        System.out.println(textoImprimir);
    }
}

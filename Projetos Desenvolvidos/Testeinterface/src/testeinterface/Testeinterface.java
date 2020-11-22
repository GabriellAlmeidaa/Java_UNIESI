package testeinterface;

public class Testeinterface {

    Documento d;
    Pessoa p;
    
    public Testeinterface(){
        d = new Documento();
        p = new Pessoa();
        d.setNumDoc(1);
        d.setDados("Carta para empresa X Ltda. XXXXX XXXXX XXXXX");        
        d.imprimir(d.toString());
        p.setNome("Carlos Augusto do Nascimento");
        p.setEmail("carlos@gmail.com");
        p.setTelefone("19-9090-0909");
        p.imprimir(p.toString());
    }

    public static void main(String[] args) {
        Testeinterface t = new Testeinterface();
        t.d.toString();
    }
}

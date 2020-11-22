
package testeinterface;

public class Documento implements imprimivel{
    
    private int numDoc;
    private String dados;
    
    @Override
    public void imprimir(String dados){
        Impressora imp = new Impressora("HP da Secretaria");
        System.out.println("Imprimindo na impressora: " + imp.getNomeImp());
        imp.print(dados);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numero de Documentos: ").append(getNumDoc()).append("\n");
        sb.append("Dados a serem impressos: \n");
        sb.append(getDados());
        sb.append("\n");
        return sb.toString();
    }

    /**
     * @return the numDoc
     */
    public int getNumDoc() {
        return numDoc;
    }

    /**
     * @param numDoc the numDoc to set
     */
    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    /**
     * @return the dados
     */
    public String getDados() {
        return dados;
    }

    /**
     * @param dados the dados to set
     */
    public void setDados(String dados) {
        this.dados = dados;
    }
}

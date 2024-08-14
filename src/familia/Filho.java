package familia;

public class Filho extends Pessoa {
    protected int atributoFilho;
    public void setAtributoFilho(int a) {
        this.atributoFilho = a;
    }
    public int getAtributoFilho() {
        return atributoFilho;
    }
    @Override
    public String getTipoVoz() {
        return "Fina";
    }
}

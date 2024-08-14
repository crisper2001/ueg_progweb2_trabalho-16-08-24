package familia;

public class Avo extends Pessoa {
    protected int atributoAvo;
    public void setNomeAvo(int a) {
        this.atributoAvo = a;
    }
    public int getNomeAvo() {
        return atributoAvo;
    }
    @Override
    public String getTipoVoz() {
        return "Rouca";
    }
}

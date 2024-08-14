package familia;

public abstract class Pessoa {
    protected int atributoPessoa;
    public void setAtributoPessoa(int a) {
        this.atributoPessoa = a;
    }
    public int getAtributoPessoa() {
        return atributoPessoa;
    }
    public abstract String getTipoVoz();
}

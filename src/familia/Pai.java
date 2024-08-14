package familia;

public class Pai extends Pessoa {
    protected int atributoPai;
    public void setAtributoPai(int a) {
        this.atributoPai = a;
    }
    public int getAtributoPai() {
        return atributoPai;
    }
    @Override
    public String getTipoVoz() {
        return "Grossa";
    }
}

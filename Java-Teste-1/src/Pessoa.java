import java.util.Calendar;

public class Pessoa {

    private int numeroCC = 12345;
    private String nomeProprio = "Luis";
    private String nomeApelido = "Santos";
    private int anoNascimento = 1999;
    private int mesNascimento = 03;
    private int diaNascimento  = 31;

    public int getNumeroCC() {
        return numeroCC;
    }
    public void setNumeroCC(int numeroCC) {
        this.numeroCC = numeroCC;
    }
    public String getNomeProprio() {
        return nomeProprio;
    }
    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }
    public String getNomeApelido() {
        return nomeApelido;
    }
    public void setNomeApelido(String nomeApelido) {
        this.nomeApelido = nomeApelido;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public int getMesNascimento() {
        return mesNascimento;
    }
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
    public int getDiaNascimento() {
        return diaNascimento;
    }
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }
    @Override
    public String toString() {
        return "Pessoa [numeroCC=" + numeroCC + ", nomeProprio=" + nomeProprio + ", nomeApelido=" + nomeApelido
                + ", anoNascimento=" + anoNascimento + ", mesNascimento=" + mesNascimento + ", diaNascimento="
                + diaNascimento + "]";
    }

    public Pessoa() {
        this.anoNascimento = 0;
        this.diaNascimento = 0;
        this.mesNascimento = 0;
        this.nomeApelido = "";
        this.nomeProprio = "";
        this.numeroCC = 0;
        
    }

    public Pessoa(int numeroCC, String nomeProprio, String nomeApelido, int anoNascimento, int mesNascimento,
            int diaNascimento) {
        this.numeroCC = numeroCC;
        this.nomeProprio = nomeProprio;
        this.nomeApelido = nomeApelido;
        this.anoNascimento = anoNascimento;
        this.mesNascimento = mesNascimento;
        this.diaNascimento = diaNascimento;
    }

    void getNomeCompleto(){
        System.out.println(nomeProprio + nomeApelido);

    }

     int currentYear = Calendar.getInstance().get(Calendar.YEAR);

     
   
}

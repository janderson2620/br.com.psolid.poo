package Model;

public class Contato {
    int numeroDeTelefone;
    String email;

    public Contato(int numeroDeTelefone, String email) {
        this.numeroDeTelefone = numeroDeTelefone;
        this.email = email;
    }

    public int getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(int numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Numero Do telefone= " + numeroDeTelefone +
                ", email= " + email;
    }
}

package Model;

import Interfaces.IQuadro;

public class QuadroTinta implements IQuadro {

    @Override
    public String trabalhaCom() {
        return "Trabalhando com quadro de tinta";
    }

    @Override
    public String toString() {
        return trabalhaCom();
    }
}

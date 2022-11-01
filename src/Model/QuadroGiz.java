package Model;

import Interfaces.IQuadro;

public class QuadroGiz implements IQuadro {

    @Override
    public String trabalhaCom() {
        return "Trabalhando com quadro de giz";
    }

    @Override
    public String toString() {
        return trabalhaCom();
    }
}

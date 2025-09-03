package a02_09;

public class Principal {
    public static void main(String[] args) {

        Cliente c = new Cliente();

        c.cadastrar(); //os dados desse cliente c (cadastrar)
        c.exibir(); //exibir

        Cliente c2 = new Cliente();

        c2.cadastrar();
        c2.exibir();

    }
}

import java.util.Random;

public class Registro {
    private int codigo;

    public Registro(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static Registro gerarRegistroAleatorio(int seed) {
        Random random = new Random(seed);
        int codigo = 100000000 + random.nextInt(900000000);
        return new Registro(codigo);
    }
}

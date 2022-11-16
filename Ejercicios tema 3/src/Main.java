public class Main {
    public static void main(String[] args) {
        var suma = suma(10, 20, 30);

        System.out.println(suma);

        Auto miAuto = new Auto();
        miAuto.AgregarPuertas();

        System.out.println(miAuto.puertas);

    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    static class Auto {
        public int puertas = 0;

        public void AgregarPuertas() {
            this.puertas++;
        }
    }
}
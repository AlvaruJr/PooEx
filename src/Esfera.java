public class Esfera {
    private float raio;


    public void setRaio(float r) {
        this.raio = r;
    }


    public float calcularVolume() {
        return (float) ((4.0 / 3.0) * Math.PI * Math.pow(raio, 3));
    }


    public float calcularArea() {
        return (float) (4 * Math.PI * Math.pow(raio, 2));
    }

    public static void main(String[] args) {
        Esfera esfera = new Esfera();
        esfera.setRaio(5);
        System.out.println("Volume da Esfera: " + esfera.calcularVolume());
        System.out.println("Área da Esfera: " + esfera.calcularArea());
    }
}

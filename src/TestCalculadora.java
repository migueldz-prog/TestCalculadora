public class TestCalculadora{
    public static void main(String[] args){
    Calculadora Calculadora = new Calculadora();
    try{
        System.out.println("Resultado: " + Calculadora.calcular(10,5,"suma"));
        System.out.println("Resultado: " + Calculadora.calcular(10,5,"resta"));
        System.out.println("Resultado: " + Calculadora.calcular(10,5,"prueba")); //esto lanza la extepcion
    }catch (OperacionNoValida e){
        System.out.println("Error: " + e.getMessage());
    }catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
    }
    }
}
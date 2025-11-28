public class Calculadora {
    public double calcular(int a, int b, String operacion) throws OperacionNoValida{
        switch (operacion){
            case "suma":
                return a + b;
            case "resta":
                return a - b;
            case "multiplicacion":
                return a * b;
            case "division":
                if (b == 0){
                    throw new ArithmeticException("No se puede dividir por cero");
                }
                return (double) a / b; //cast el (double), transforma a decimal
            default:
                throw new OperacionNoValida("Operacion no valida: " + operacion);
        }
    }
}

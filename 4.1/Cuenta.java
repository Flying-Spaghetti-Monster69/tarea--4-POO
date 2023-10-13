public class Cuenta {

protected int númeroConsignaciones = 0;
protected int númeroRetiros = 0;
protected float tasaAnual;
protected float comisiónMensual = 0;
protected float saldo = 0;
public Cuenta(float saldo, float tasaAnual) {
    this.tasaAnual = tasaAnual;
    this.saldo = saldo;
}

public void consignar(float cantidad) {
saldo = saldo + cantidad; 
númeroConsignaciones = númeroConsignaciones + 1;
}

public void retirar(float cantidad) {
float nuevoSaldo = saldo - cantidad;

if (nuevoSaldo >= 0) {
saldo -= cantidad;
númeroRetiros = númeroRetiros + 1;
} else {
System.out.println("La cantida a retirar excede el saldoactual.");
}
}

public void calcularInterés() {
float tasaMensual = tasaAnual / 12; 
float interesMensual = saldo * tasaMensual;
saldo += interesMensual; 
}

public void extractoMensual() {
saldo -= comisiónMensual;
calcularInterés();
}
}
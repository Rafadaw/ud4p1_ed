package banco;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CuentaBancariaTest {

	
	@Test
	void testIngresar1() {
		//creo objeto cuenta bancaria
		CuentaBancaria cb1 = new CuentaBancaria("Rafael Mora", "5794", "9906", "66", "6137475351");
		//establecemos saldo inicial
		cb1.setSaldo(3000);
		//establecemos cantidad a ingresar
		cb1.ingresar(1000);
		//combrobar resultado esperado y obtenido para lo que creamos un "double" para que se le asigne el valor obtenido cuando llamemos a getSaldo
		double nuevoSaldo = cb1.getSaldo();
		assertEquals(4000, nuevoSaldo);
		
	}
	
	/*@Test
	void testIngresar2() {
		//creo objeto cuenta bancaria
		CuentaBancaria cb1 = new CuentaBancaria("Rafael Mora", "5794", "9906", "66", "6137475351");
		//establecemos saldo inicial
		cb1.setSaldo(3000);
		//establecemos cantidad a ingresar
		cb1.ingresar(-1000);
		
		//combrobar resultado esperado que es que de error
		assertThrows(IllegalArgumentException.class,() ->cb1.ingresar(-1000));
	}*/

	@Test
	void testRetirar1() {
		//creo objeto cuenta bancaria
				CuentaBancaria cb1 = new CuentaBancaria("Rafael Mora", "5794", "9906", "66", "6137475351");
				//establecemos saldo inicial
				cb1.setSaldo(3000);
				//establecemos cantidad a retirar
				cb1.retirar(1000);
				//combrobar resultado esperado y obtenido para lo que creamos un "double" para que se le asigne el valor obtenido cuando llamemos a getSaldo
				double nuevoSaldo = cb1.getSaldo();
				assertEquals(2000, nuevoSaldo);
	}

	/*@Test
	void testRetirar2() {
		//creo objeto cuenta bancaria
				CuentaBancaria cb1 = new CuentaBancaria("Rafael Mora", "5794", "9906", "66", "6137475351");
				//establecemos saldo inicial
				cb1.setSaldo(3000);
				//establecemos cantidad a ingresar
				cb1.retirar(-1500);
				//combrobar resultado esperado que es que de error (el mismo error que da en la clase testeada)
				
				assertThrows(IllegalArgumentException.class,() ->cb1.retirar(-1500));
	}*/
	/*@Test
	void testRetirar3() {
		//creo objeto cuenta bancaria
				CuentaBancaria cb1 = new CuentaBancaria("Rafael Mora", "5794", "9906", "66", "6137475351");
				//establecemos saldo inicial
				cb1.setSaldo(3000);
				//establecemos cantidad a retirar
				cb1.retirar(4000);
				//combrobar resultado esperado que es que de error (el mismo error que da en la clase testeada)
				
				assertThrows(IllegalArgumentException.class,() ->cb1.retirar(4000));
	}*/
	/*@Test
	void testComprobarCCC1() {
		//creo objeto cuenta bancaria
		CuentaBancaria cb1 = new CuentaBancaria("Rafael Mora", "5794", "9906", "66", "6137475351");
		//comprobamos el ccc que nos da la clase con el que esperamos obtener, para lo que creamos un nuevo String nuevoCCC
		String nuevoCCC = cb1.getEntidad() + cb1.getOficina() + cb1.getDigitoControl() + cb1.getNumCuenta();
		
		boolean comprobacion = cb1.comprobarCCC(nuevoCCC);
		assertEquals(true, comprobacion);
	}*/
	@Test
	void testComprobarCCC2() {
		//creo objeto cuenta bancaria
		CuentaBancaria cb1 = new CuentaBancaria("Rafael Mora", "5794", "9906", "66", "6137475351");
		//comprobamos el ccc que nos da la clase con el que esperamos obtener, para lo que creamos un nuevo String nuevoCCC
		//el nuevo ccc se lo introducimos manualmente para que no coincida
		
		String nuevoCCC = "111122223312345678910";
		
		boolean comprobacion = cb1.comprobarCCC(nuevoCCC);
		assertEquals(false, comprobacion);
	}
	

	/*@Test
	void testObtenerDigitosControl() {
		//creo objeto cuenta bancaria
		CuentaBancaria cb1 = new CuentaBancaria("Rafael Mora", "5794", "9906", "66", "6137475351");
		String nuevoDC = "66";
		
		String comprobacion = cb1.obtenerDigitosControl("5794", "9906", "6137475351");
		assertEquals(nuevoDC, comprobacion);
		
	}*/

}

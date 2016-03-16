package EP_4;

public class Cc52255123 {
	
	public static void main(String[] args) {
		
		Padrao pa = new Padrao();
		Economico e = new Economico();
		Potente po = new Potente();
		
	}
	
}

class Padrao {
	
	int tempoMax = 60;
	int potenciaMax = 100;

	String descongelar() {
		return "1";
	}
	String cozinhar() {
		return "1";
	}
	String timer() {
		return "1";
	}
	String fazerPipoca() {
		return "1";
	}
	String fazerCha() {
		return "1";
	}
	String grelhar() {
		return "1";
	}
}

class Economico extends FuncoesFuturasEconomico {
	
	public int cozimentoBaixo(String entrada) {
		return 1;
	}

	@Override
	int pesarCarne(String entrada) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int pesarAves(String entrada) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Potente extends Padrao implements FuncoesFuturasPotente {
	
	public int cozimentoAlto(String entrada) {
		return 1;
	}

	@Override
	public int superDescongelante(String entrada) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int superTostado(String entrada) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

abstract class FuncoesFuturasEconomico extends Padrao {
	
	abstract int pesarCarne(String entrada);
	
	public int pesarPeixe(String entrada) {
		return 1;
	}
	
	abstract int pesarAves(String entrada);
	
}

interface FuncoesFuturasPotente {
	
	abstract int superDescongelante(String entrada);
	
	abstract int superTostado(String entrada);
	
}
import java.util.ArrayList;
import java.util.HashMap;

public class AppQueUsaPessoa {

	public static void main (String args[]) {
		
	/*	ArrayList<Pessoa> lista;
		
		lista = new ArrayList<Pessoa>();
		
		for (int i=1;i<100000;i++){
			lista.add(new Pessoa(i,"Pessoa " + i, i *10));
			
		}
		int idBusca = -1;
		
		long ini = System.currentTimeMillis();
		for (int cont = 1; cont <=1000;cont++) {
			for (int pos=0;pos<lista.size();pos++) {
				if (lista.get(pos).getId()==idBusca){
					System.out.println("achei");
					break;
				}
				
			}
		}
		long fim = System.currentTimeMillis();
		System.out.println("fim do programa - tempo = " + (fim-ini));
		*/
		
		HashMap<Integer,Pessoa> mapa;
		mapa = new HashMap<Integer,Pessoa>();
		
		for (int i=1; i<=1000;i++) {
			mapa.put(i, new Pessoa (i,"Pessoa" +1, i * 100));
		}
		
		

		
		
		int idBusca=-1;
		long ini = System.currentTimeMillis();
		for (int cont=1; cont<1000;cont++) {
			if (mapa.get(idBusca)!=null) {
				System.out.println("Achei");
			}
		}
		long fim = System.currentTimeMillis();
		System.out.println("fim do programa - tempo = " + (fim-ini));
		
	
		
	}
}

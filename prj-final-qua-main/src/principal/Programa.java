package principal;

import principal.daos.IndividuoDAO;
import principal.daos.SequenciaDAO;
import principal.modelo.Individuo;
import principal.modelo.Sequencia;

public class Programa {
	
	public static void main(String[] args) {
		
		IndividuoDAO pdao = new IndividuoDAO();
		
		Individuo p = new Individuo("aaaAna", "ABC456");
		
		Individuo p1 = pdao.buscarPorId(1);
		
		pdao.salvar(p);
		
		SequenciaDAO sdao = new SequenciaDAO(); 
		
		Sequencia s1 = new Sequencia("ATCGATCGATCGATCGATCGATCGATCGATCGATCGATCGATCGATCGATCGATCGATCGATCG",p);
		
		sdao.salvar(s1);
		p.addSed(s1);

		p.setNome("Pedro Silva");
		pdao.atualizar(p);
		
//		pdao.apagar(4);
		
		pdao.close();
		sdao.close();
		

		
	}
}

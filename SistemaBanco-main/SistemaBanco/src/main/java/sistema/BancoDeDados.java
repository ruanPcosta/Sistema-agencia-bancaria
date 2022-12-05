package sistema;
import java.util.LinkedList;
import java.util.List;
import java.time.LocalDate;

public class BancoDeDados {
	private static List<Conta> contas = new LinkedList<>();
	private static int id = 1;
	
	public static void add(Conta c) {
		c.setId(id++);
		c.setData(LocalDate.now());
		contas.add(c);
	}
	public static void remove(Conta c) {
		contas.remove(c);
	}
	public static List<Conta> contas() {
		return contas;
	}
	public static void moneytop() {
		contas.sort((c1,c2) -> Double.compare(c2.getSaldo(),c1.getSaldo()));
	}
	public static Conta search(int id) {
		for(Conta c : contas){
                    if(c.getId()==id)
                        return c;
                }
                return null;
	}
	public static Conta search(String Cpf) {
		for(Conta c : contas){
                    if(c.getCpf().equals(Cpf))
                        return c;
                }
                return null;
	}
}

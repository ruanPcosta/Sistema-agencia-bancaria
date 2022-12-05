package Sistema;
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
	public static void contas() {
		contas.forEach(System.out::println);
	}
	public static void moneytop() {
		contas.sort((c1,c2) -> Double.compare(c2.getSaldo(),c1.getSaldo()));
	}
	public static void search(int id) {
		contas.stream().filter(c -> c.getId()==id).forEach(System.out::println);
	}
	public static void search(String Cpf) {
		contas.stream().filter(c -> c.getCpf().equals(Cpf)).forEach(System.out::println);
	}
}

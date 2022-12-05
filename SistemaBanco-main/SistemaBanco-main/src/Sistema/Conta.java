package Sistema;
import java.time.LocalDate;

class Conta{
	private String cliente;
	private String cpf;
	private String historico="";
	private LocalDate data;
	private int id;
	private double saldo;
	
	public Conta(String cliente,String cpf) {
		this.cliente=cliente;
		this.cpf=cpf;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getHistorico() {
		return this.historico;
	}
	protected void setData(LocalDate data) {
		this.data=data;
	}
	public LocalDate getData() {
		return data;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public boolean saca(double saque) {
		if(saque>this.saldo) {
			System.out.println("Saque maior que o saldo!Saldo: R$"+this.getSaldo()+";Saque: R$"+saque);
			return false;
		}
		this.saldo-=saque;
		this.historico+="\nSaque realizado,R$"+saque+" foram removisdos da conta";
		return true;
	}
	public boolean deposito(int deposito) {
		if(deposito<0) {
			System.out.println("Deposito nao pode ser menor que R$ 0!");
			return false;
		}
		this.saldo+=deposito;
		this.historico+="\nDeposito realizado,R$"+deposito+" foram adicionados a conta";
		return true;
	}
	private boolean deposito(double deposito) {
		if(deposito<0) {
			System.out.println("Deposito nao pode ser menor que R$ 0!");
			return false;
		}
		this.saldo+=deposito;
		return true;
	}
	public void transfere(Conta c,double deposito) {
		this.saca(deposito);
		c.deposito(deposito);
		this.historico+="\nTransferencia realizada, R$"+deposito+" foram enviados para "+c.getCliente();
	}
	@Override
	public String toString() {
		return "[Titular da conta:"+this.getCliente()+"\nId:"+this.getId()+"\nCpf:"+this.getCpf()+"\nSaldo: R$"+this.getSaldo()+"\nData de criacao:"+this.getData()+"]\n";
	}
	
}
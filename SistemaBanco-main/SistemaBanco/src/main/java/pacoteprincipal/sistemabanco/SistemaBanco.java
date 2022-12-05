package pacoteprincipal.sistemabanco;

public class SistemaBanco {

    public static void main(String[] args) {
       System.out.println("Inicando sistema");
       TelaLogin tela = new TelaLogin();       
       tela.setLocationRelativeTo(null);
       tela.setResizable(false);
       tela.setVisible(true);
    }
}

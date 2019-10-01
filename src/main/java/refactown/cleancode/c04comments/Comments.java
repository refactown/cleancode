package refactown.cleancode.c04comments;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.Month;

import refactown.cleancode.c06objects.Order;

public class Comments {
	public void example() {
		Order order = new Order(LocalDate.of(2019, Month.APRIL, 4), false);

		// verifica se o pedido não está cancelado nem tem mais de 1 ano
		if (!order.getCancelled() && order.getDate().isBefore(order.getDate().plusDays(365)))

			if (order.isValid())
				System.out.println("");

	}

	public void callLogon() {

		logon("user", "pass");
	}

	public void load(FileInputStream stream) {

	}

	public void loadProperties(){
	    try {
	    	FileInputStream stream = new FileInputStream("file.properties");
	        load(stream);
	    } catch (Exception e){
	        // Não havia nenhum arquivo para ser lido
	        // Todos já foram carregados
	    }
	}

	// Efetua logon passando "usuário" e "senha" e recebe
	// o usuário logado
	public LoggedUser logon(String username, String password){
	    // TODO ("implementar quando o SSO ficar pronto")
	    return new LoggedUser("Mock", "Mock");
	}

	public void append(String text){

	    //val buffer = StringBuffer() // Precisa ser "Thread Safe"
		StringBuilder buffer = new StringBuilder(); // Precisa ser rápido

	}

	public void save (String cpfCnpj){

	    /*
	    // trim é importante, pois pode vir CPF(11) ou CNPJ(14)
	    if (cpfCnpj.trim().length==11) {
	        validarCpf(cpfCnpj)
	    } else {
	        validarCnpj(cpfCnpj)
	    }
	    */
	    // alterado por Fulano em 27/11/1986
	    validarCnpj(cpfCnpj); // não tem mais CPF


	}

	public void validarCpf(String cpfCnpj) {
	    //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	public void validarCnpj(String cpfCnpj) {
	    //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}


}

class LoggedUser{
	private final String login;
	private final String role;
	public LoggedUser(String login, String role) {
		super();
		this.login = login;
		this.role = role;
	}
	public String getLogin() {
		return login;
	}
	public String getRole() {
		return role;
	}
}

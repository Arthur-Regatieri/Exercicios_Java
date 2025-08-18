import java.util.Scanner;

public abstract sealed class Colaborador permits Gerente, Vendedor, Atendente {
    protected String name;
    protected String email;
    protected String password;
    protected boolean admin;
    protected boolean on = false;
    protected double total;
    protected String [] logins = new String[10];
    protected String [] passwords = new String[10];
    protected String [] cargo = new String[10];
    protected String atribuicao;
    protected String[] produtos = new String[10];
    protected double[] valor = new double[10];
    protected String [] venda = new String[10];
    protected String [] vendedor = new String[10];
    protected int cont = 0;
    Scanner scanner = new Scanner(System.in);

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Colaborador criarLogin() {
        
           
                
                System.out.println("Digite o login: ");
                name = scanner.next();
                this.logins[cont] = name;
                System.out.println("Digite a senha: ");
                password = scanner.next();
                this.passwords[cont] = password;
                System.out.println("Digite o cargo: ");
                this.atribuicao = scanner.next();
                this.cargo[cont] = atribuicao;
                if (this.cargo[cont] == "Vendedor") {
                    this.vendedor[cont] = name;
                }
                
                //this.name = "";
                //this.password = "";
                cont++;
                return criarColaborador(atribuicao);        
    }

    public void realizarLogin() {

        System.out.println("Digite o login: ");
        name = scanner.next();
        System.out.println("Digite a senha: ");
        password = scanner.next();

        
            for(int i = 0; i < logins.length; i++){
            if (logins[i].equals(name) && passwords[i].equals(password)) {
                System.out.println("Login realizado com sucesso!!!");
                this.on = true;
                this.admin = false;
                if (this.cargo[i].equals("Gerente")) {
                    this.admin = true;
                }
                this.atribuicao = this.cargo[i];
                return;                
            }
        }
        name = "";
        password = "";
        System.out.println("Nome ou senha incorreto!!!");
        
    }

    /*public Colaborador realizarLogin() {
    System.out.println("Digite o login: ");
    String loginInput = scanner.next();
    System.out.println("Digite a senha: ");
    String senhaInput = scanner.next();

    for(int i = 0; i < logins.length; i++){
        if (logins[i] != null && logins[i].equals(loginInput) && 
            passwords[i] != null && passwords[i].equals(senhaInput)) {
            
            System.out.println("Login realizado com sucesso!!!");
            
            // Cria uma nova instância do tipo correto
            Colaborador colaboradorLogado = criarColaborador(this.cargo[i]);
            colaboradorLogado.name = loginInput;
            colaboradorLogado.password = senhaInput;
            colaboradorLogado.atribuicao = this.cargo[i];
            colaboradorLogado.on = true;
            colaboradorLogado.admin = this.cargo[i].equalsIgnoreCase("Gerente");
            
            // Copia os arrays compartilhados
            colaboradorLogado.logins = this.logins;
            colaboradorLogado.passwords = this.passwords;
            colaboradorLogado.cargo = this.cargo;
            colaboradorLogado.produtos = this.produtos;
            colaboradorLogado.valor = this.valor;
            colaboradorLogado.venda = this.venda;
            colaboradorLogado.vendedor = this.vendedor;
            colaboradorLogado.cont = this.cont;
            colaboradorLogado.total = this.total;
            
            return colaboradorLogado;
        }
    }
    
    System.out.println("Nome ou senha incorreto!!!");
    return null;
}*/

public static Colaborador criarColaborador(String cargo) {
switch (cargo.toLowerCase()) {
    case "gerente":
        return new Gerente();
    case "vendedor":
        return new Vendedor();
    case "atendente":
        return new Atendente();
    default:
        throw new IllegalArgumentException("Cargo inválido: " + cargo);
}
}

    public void realizarLogff() {
        if (on) {
            this.name = "";
            this.password = "";
            this.on = false;
            System.out.println("Logoff realizado com sucesso!!!");
        } else{
            System.out.println("Você não esta logado");
        }
    }


        public void consultarVendas(){
        if (logins.length >= 0) {
            System.out.println("Escolha um vendedor:");
            for(int i = 0; i < logins.length; i++ ){
            System.out.println( this.vendedor[i]);
            }
            this.name = scanner.nextLine();
            for(int i = 0; i < produtos.length; i++ ){
                if (venda[i].equals(name)) {
                    System.out.println("Produto: " + produtos[i] + " Valor: " + valor[i]);
                }

            }
            
        this.name = "";
        }
        
    }

     public void alterarSenha() {
        for(int i = 0; i < logins.length; i++){
            if (this.logins[i].equals(name)) {
                System.out.println("Digite uma nova senha: ");
                this.password = scanner.next();
                this.passwords[i] = this.password;
                return;        
            }
        }
        
    }

     public void alterarDados() {
        System.out.println("Qual colaborador deseja alterar?");
        for(int i = 0; i < logins.length; i++){
            if (logins[i] != null) {
                    System.out.println("Usuário: " + logins[i] + " Cargo: " + cargo[i]);          
            }
                         
        }
        String colaborador = scanner.next();
        for(int i = 0; i < logins.length; i++){
            if (logins[i].equals(colaborador)) {
                System.out.println("Cargos possíveis: \nVendedor \n Atendente \n Gerente");
                this.cargo[i] = scanner.next();
                System.out.println("Cargo alterado com sucesso!!!");
                return;
            }
        }
    }



}


package empresa;


public class Funcionario {
    private int numat,ndepto,nsuper;
    private String nome;
    private Double salario;
    private String sexo;
    public Funcionario(int numat, String nome, Double salario, String sexo, int ndepto, int nsuper ){
        this.numat = numat;
        this.nome = nome;
        this.salario = salario;
        this.sexo = sexo;
        this.ndepto = ndepto;
        this.nsuper = nsuper;
    }
    public Funcionario(){
        
    }
    

    public int getNumat(){
        return numat;
    }
    public String getNome(){
        return nome;
    }
    public Double getSalario(){
        return salario;
    }
    public String getSexo(){
        return sexo;
    }
    public int getNdepto(){
        return ndepto;
    }
    public int getNsuper(){
        return nsuper;
    }
    
    public void setNumat(int numat){
        this.numat = numat;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setNdepto(int ndepto){
        this.ndepto = ndepto;
    }
    public void setNsuper(int nsuper){
        this.nsuper = nsuper;
    }

}

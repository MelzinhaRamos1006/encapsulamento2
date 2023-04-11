public class Pessoa(){

private String nome;
private int idade;
private String celular;
private String cpf;


//métodos de acesso publico
public String getNome(){
    return this.nome;
}
public void setNome(String nome){
    this.nome=nome; //nome
}
public String getIdade(){
    return this.idade;
}
public void setIdade(String idade){
    this.idade=idade; //idade
}
public String getCelular(){
    return this.celular;
}
public void setCelular(String celular){
    this.celular=celular; //celular
}
public String getCpf(){
    return this.cpf;
}
public void setCpf(String cpf){
    this.cpf=cpf;  //cpf
}


}
import Materias.Lista;
public class Personagem {
    private String nome;
    private int idade;
    private String curso;
    private int semestre;
    private String sexo;
    private int porcEstudo;
    private float charme;
    private float labia;
    private Lista materias;
    private int numeroPersonagem;
    private int numerosemana;

                             // INICIO CONSTRUTORES
    public Personagem() {
        
    }
 
    public Personagem(String no,int id, int s, int cs,int np){
        this.nome = no;
        this.idade = id;
        if(s == 1){
             this.sexo = "Masculino";
        }else{
            this.sexo = "Feminino";
        }             
        this.semestre = 1;
        if(cs == 1){
        this.curso = "BCET";
        }
        this.numeroPersonagem = np;
    }
                             // FIM CONSTRUTORES    
    public void displayStatus(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Curso: " + getCurso());
        System.out.println("Semestre: " + getSemestre());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Porcentagem estudado: " + getPorcEstudo());
        System.out.println("Charme: " + getCharme());
        System.out.println("Labia: " + getLabia());  
    }
                             // FIM CONSTRUTOR
    
                             // METODOS GETTERS
    private String getNome() {
        return nome;
    }
    private int getIdade() {
        return idade;
    }
    private String getSexo() {
        return sexo;
    }
    private int getPorcEstudo() {
        return porcEstudo;
    }
    private float getCharme() {
        return charme;
    }
    private float getLabia() {
        return labia;
    }
     private String getCurso() {
        return curso;
    }
    public int getSemestre() {
        return semestre;
    }
    
                             // FIM METODOS GETTERS                          
                             // INICIO SETTERS

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public void setPorcEstudo(int porcEstudo) {
        this.porcEstudo = this.porcEstudo + porcEstudo;
    }
    public void setLabia(float labia) {
        this.labia = this.labia + labia;
    }
    public void setCharme(float charme){
        this.charme = this.charme + charme;    
    }    
    public void setMaterias(Lista materias) {
        this.materias = materias;
    }
                             // FIM SETTERS

    
    
    
    
    
}

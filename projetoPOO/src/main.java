import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        // inicio variaveis especias
       Random gerar = new Random();
       ArrayList perso = new ArrayList();  
       Personagem p1 = new Personagem();
       Personagem p2 = new Personagem();
       Personagem p3 = new Personagem();
       Scanner input = new Scanner(System.in);
        // fim variaveis especias
        
        String no;
        int op = 0,id,se,cs,in = 0,sem = 0,np = 0,aulas,semanasfim = 18, nprovas = 0;
        double c;
        boolean p;
       
        System.out.println("Bem vindo");
        
        while(op != 3){
            System.out.println("[1] - Novo jogo");
            System.out.println("[2] - Carregar jogo");
            System.out.println("[3] - Sair do jogo");      
            op = input.nextInt();
        
        switch(op){
            case 1:
                if(np == 0){
                System.out.print("Nome do personagem: "); no = input.nextLine();
                System.out.println("Digite a idade: "); id = input.nextInt();
                System.out.println("SEXO: [1] - Masculino ou [2] - Feminino"); se = input.nextInt();
                System.out.println("Digite o curso: [1] - BCET"); cs = input.nextInt();
                np++;
                p1 = new Personagem(no,id,se,cs,np);
                perso.add(p1);                
                }else if(np == 1){
                System.out.print("Nome do personagem: "); no = input.nextLine();
                System.out.println("Digite a idade: "); id = input.nextInt();
                System.out.println("SEXO: [1] - Masculino ou [2] - Feminino"); se = input.nextInt();
                System.out.println("Digite o curso: [1] - BCET"); cs = input.nextInt();
                np++;
                p2 = new Personagem(no,id,se,cs,np);
                perso.add(p2);         
                }else if(np == 2){
                System.out.print("Nome do personagem: "); no = input.nextLine();
                System.out.println("Digite a idade: "); id = input.nextInt();
                System.out.println("SEXO: [1] - Masculino ou [2] - Feminino"); se = input.nextInt();
                System.out.println("Digite o curso: [1] - BCET"); cs = input.nextInt();
                np++;
                p3 = new Personagem(no,id,se,cs,np);
                perso.add(p3);
                }
                break;
            case 2:
                
                break;
            case 3:
                System.exit(0);
                break;
        }
        }
        
          if(sem == 1)
           while(in != 6){
               if(in == 0){
               System.out.println("Você começou sua vida academica");
               }
               System.out.println();
               System.out.println("[1] - Irei cumprir toda a frequncia da semana ou [2] - Írei faltar algumas aulas");
               aulas = input.nextInt();
               if(aulas == 1 && np == 1){
                   p1.setPorcEstudo(gerar.nextInt(30));
               }else if(aulas == 2 && np == 1){
                   p1.setPorcEstudo(gerar.nextInt(15));
               }else{
                   System.out.println("Insira um numero valido");
               }
               
               
               
           }
            
        
    }
    
}

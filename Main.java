import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean tema=false;
    boolean base=false;
    boolean vip=false;
    int sesiones=0;
    
    double price=0;
    
    
    Scanner teclado =new Scanner(System.in);
    
    
    
    System.out.println("Tema?");
    tema=teclado.nextBoolean();
    
    
    System.out.println("Base?");
    // TEMA  BASE  TEMA+BASE
    //  20     30    45
    base=teclado.nextBoolean();
    
    
    
    System.out.println("VIP ?");
    //VIP = -5€
    vip=teclado.nextBoolean();




    System.out.println("Nùmero de sesiones?");
    //NUMERO DE SESIONES 
    //n*10
    sesiones=teclado.nextInt();
    
    
    if(tema){
      price+=30;
    }
    
    if(base){
      price+=30; 
    }
    
    if(base&&tema){
      price-=5;
    }
    
    
    if (vip){
      price-=5;
    }
    
    
    
    price+=sesiones*10;
    
    
    
    
    System.out.printf("%10s%.2f","Price:",price);
    
  }
}
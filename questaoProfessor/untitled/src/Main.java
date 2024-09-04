import  java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner TCD = new Scanner (System.in);



        String nome;
            System.out.println ("Digite o seu nome: ");
                nome = TCD.nextLine();



        double hora;
        System.out.println (nome + " Voce trabalhou quantas horas?: ");
                hora = TCD.nextDouble();


        double nivel1;
            nivel1 = (25 * hora);


        double nivel2;
            nivel2 = (50 * hora);



        double  nomeNivel;
            System.out.println ("Qual e o seu nivel na instituicao? 1 ou 2?: ");
                nomeNivel = TCD.nextDouble();


        {

            if (nomeNivel == 1) {
                if (nomeNivel == 1)
                    System.out.println ( nome + " , esse foi o seu salario: R$" + nivel1 );
        } else{
                System.out.println ("digite uma opcao valida!!!");
            }


            if (nomeNivel == 2 ) {
                if (nomeNivel == 2 )
                        System.out.println (nome + " , esse foi o seu salario: R$" + nivel2 );
            } else{
                System.out.println ("Digite uma opcao valida!!!");
            }


        }

    }

}

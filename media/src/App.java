import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn1 = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        String nome;
        System.out.println("Digite o seu nome: ");
        nome = scn1.nextLine();
        double sum = 0;
        for (int i = 1; i <= 4; ++i){
            double nota;
            System.out.println("Digite a sua "+i+"º nota: ");
            nota = scn1.nextDouble();
            sum += nota;
            lista.add(nota);
        }
        double media = sum/lista.size();
    String situação = (media>=7)? nome+" sua média foi: "+media+" e você está aprovado!":nome+" sua média foi: "+media+" e você está reprovado!";
        System.out.println(situação);
    }
}

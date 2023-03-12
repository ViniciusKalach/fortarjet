package TarjetJob.exercício4;

/**
 *
 * @author Vinícius Kalach
 */
public class Exercício4 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        double total = 180759.98;
        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double Outros = 19849.53 ;   
        
        double SP_por = ((SP * 100)/total);
        double RJ_por = ((RJ * 100)/total);
        double MG_por = ((MG * 100)/total);
        double ES_por = ((ES * 100)/total);
        double Outros_por = ((Outros * 100)/total);
        
        System.out.println("O faturamento total é de: R$: 180.759,98.");
        System.out.printf("O faturamento da distribuidora em São Paulo é de %.2f %n", (SP_por), "% do total.");
        System.out.printf("O faturamento da distribuidora no Rio de Janeiro é de %.2f %n", (RJ_por), "% do total.");
        System.out.printf("O faturamento da distribuidora em Minas Gerais é de %.2f %n", (MG_por), "% do total.");
        System.out.printf("O faturamento da distribuidora em Espírito Santo é de %.2f %n", (ES_por), "% do total.");
        System.out.printf("Por fim, o faturamento da distribuidora em outros estados representam %.2f %n", (Outros_por), "% do total.");
    }
    
}

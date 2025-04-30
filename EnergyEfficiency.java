public class checkEnergyEfficiency {
    public static void main(String[] args) {
        //inicializar variables (del tipo que veas conveniente) para las calificaciones A, B, C, D, E, F y G que correspondan a eficiencia energética e imprime en terminal concatenando cada string con cada variable creada. 
        char energyA = 'A';
        char energyB = 'B';
        char energyC = 'C';
        char energyD = 'D';
        char energyE = 'E';
        char energyF = 'F';
        char energyG = 'G';
        System.out.println("clasificación " + energyA);
        //Reemplaza <very_good> concatenando el String con la variable creada. 
        System.out.println("Una calificación " + energyA + " es muy buena.");

        //Reemplaza <good> concatenando el String con la variable creada. 
        System.out.println("Una calificación " + energyB + " es buena.");
        
        //Reemplaza <fairly_good> concatenando el String con la variable creada. 
        System.out.println("Una calificación " + energyC + " es medianamente buena.");
        
        //Reemplaza <neutral> concatenando el String con la variable creada. 
        System.out.println("Una calificación " + energyD + " es neutral.");
        
        //Reemplaza <fairly_bad> concatenando el String con la variable creada. 
        System.out.println("Una calificación " + energyE + " es medianamente mala.");
        
        //Reemplaza <bad> concatenando el String con la variable creada. 
        System.out.println("Una calificación " + energyF + " es mala.");

        //Reemplaza <very_bad> concatenando el String con la variable creada.
        System.out.println("Una calificación " + energyG + " es muy mala.");
    }
}

import java.util.Scanner;
import java.text.DecimalFormat;
class Distancia {
    //puntos x
    double x1=0,x2=0,x3=0,x4=0,x5=0;
    //puntos y
    double y1=0,y2=0,y3=0,y4=0,y5=0;
    double punto1,punto2,punto3,punto4,punto5;

    public void calcularDistancias(){
        Scanner s=new Scanner(System.in);
        // escaneo de datos
        System.out.println("INGRESE LOS PUNTOS");
        System.out.println("INGRESE EL PUNTO X1");
        double x1 = s.nextDouble();
        System.out.println("INGRESE EL PUNTO Y1");
        double y1 = s.nextDouble();
        System.out.println("INGRESE EL PUNTO X2");
        double x2 = s.nextDouble();
        System.out.println("INGRESE EL PUNTO Y2");
        double y2 = s.nextDouble();
        System.out.println("INGRESE EL PUNTO X3");
        double x3 = s.nextDouble();
        System.out.println("INGRESE EL PUNTO Y3");
        double y3 = s.nextDouble();
        System.out.println("INGRESE EL PUNTO X4");
        double x4 = s.nextDouble();
        System.out.println("INGRESE EL PUNTO Y4");
        double y4 = s.nextDouble();
        System.out.println("INGRESE EL PUNTO X5");
        double x5 = s.nextDouble();
        System.out.println("INGRESE EL PUNTO Y5");
        double y5 = s.nextDouble();

// calculo de datos

        //punto 1 a punto 2
        double distancia1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        //punto 1 a punto 3
        double distancia2 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        //punto 1 a punto 4
        double distancia3 = Math.sqrt(Math.pow(x4 - x1, 2) + Math.pow(y4 - y1, 2));
        //punto 1 a punto 5
        double distancia4 = Math.sqrt(Math.pow(x5 - x1, 2) + Math.pow(y5 - y1, 2));

        //punto 2 a punto 3
        double distancia5 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        //punto 2 a punto 4
        double distancia6 = Math.sqrt(Math.pow(x4 - x2, 2) + Math.pow(y4 - y2, 2));
        //punto 2 a punto 5
        double distancia7 = Math.sqrt(Math.pow(x5 - x2, 2) + Math.pow(y5 - y2, 2));

        //punto 3 a punto 4
        double distancia8 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        //punto 3 a punto 5
        double distancia9 = Math.sqrt(Math.pow(x5 - x3, 2) + Math.pow(y5 - y3, 2));

        //punto 4 a punto 5
        double distancia10 = Math.sqrt(Math.pow(x5 - x4, 2) + Math.pow(y5 - y4, 2));

        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        // Cálculo del mayor y menor
        double mayorDistancia;
        double menorDistancia;

        mayorDistancia = distancia1;
        if (distancia2 > mayorDistancia) {
            mayorDistancia = distancia2;
        }
        if (distancia3 > mayorDistancia) {
            mayorDistancia = distancia3;
        }
        if (distancia4 > mayorDistancia) {
            mayorDistancia = distancia4;
        }
        if (distancia5 > mayorDistancia) {
            mayorDistancia = distancia5;
        }
        if (distancia6 > mayorDistancia) {
            mayorDistancia = distancia6;
        }
        if (distancia7 > mayorDistancia) {
            mayorDistancia = distancia7;
        }
        if (distancia8 > mayorDistancia) {
            mayorDistancia = distancia8;
        }
        if (distancia9 > mayorDistancia) {
            mayorDistancia = distancia9;
        }
        if (distancia10 > mayorDistancia) {
            mayorDistancia = distancia10;
        }

        menorDistancia = distancia1;
        if (distancia2 < menorDistancia) {
            menorDistancia = distancia2;
        }
        if (distancia3 < menorDistancia) {
            menorDistancia = distancia3;
        }
        if (distancia4 < menorDistancia) {
            menorDistancia = distancia4;
        }
        if (distancia5 < menorDistancia) {
            menorDistancia = distancia5;
        }
        if (distancia6 < menorDistancia) {
            menorDistancia = distancia6;
        }
        if (distancia7 < menorDistancia) {
            menorDistancia = distancia7;
        }
        if (distancia8 < menorDistancia) {
            menorDistancia = distancia8;
        }
        if (distancia9 < menorDistancia) {
            menorDistancia = distancia9;
        }
        if (distancia10 < menorDistancia) {
            menorDistancia = distancia10;
        }

        System.out.println("La mayor distancia entre los puntos es: " + decimalFormat.format(mayorDistancia));
        System.out.println("La menor distancia entre los puntos es: " + decimalFormat.format(menorDistancia));


    /*
        //condicional para el mayor de los puntos
        if ((distancia1>distancia2)|(distancia1>distancia3)|(distancia1>distancia4)|(distancia1>distancia5)|(distancia1>distancia6)||(distancia1>distancia7)||(distancia1>distancia8)||(distancia1>distancia9)||(distancia1>distancia10)){
            System.out.println("Los puntos con mayor distancia son "+distancia1);
        }else if ((distancia2>distancia1)|(distancia2>distancia3)|(distancia2>distancia4)|(distancia2>distancia5)|(distancia2>distancia6)||(distancia2>distancia7)||(distancia2>distancia8)||(distancia2>distancia9)||(distancia2>distancia10)){
            System.out.println("Los puntos con mayor distancia son "+distancia2);
        }else if ((distancia3>distancia1)|(distancia3>distancia2)|(distancia3>distancia4)|(distancia3>distancia5)|(distancia3>distancia6)||(distancia3>distancia7)||(distancia3>distancia8)||(distancia3>distancia9)|(distancia3>distancia10)){
            System.out.println("Los puntos con mayor distancia son "+distancia3);
        }else if ((distancia4>distancia1)|(distancia4>distancia2)|(distancia4>distancia3)|(distancia4>distancia5)|(distancia4>distancia6)||(distancia4>distancia7)||(distancia4>distancia8)||(distancia4>distancia9)|(distancia4>distancia10)){
            System.out.println("Los puntos con mayor distancia son "+distancia4);
        }else if ((distancia5>distancia1)|(distancia5>distancia2)||(distancia5>distancia3)|(distancia5>distancia4)||(distancia5>distancia6)||(distancia5>distancia7)||(distancia5>distancia8)||(distancia5>distancia9)|(distancia5>distancia10)){
            System.out.println("Los puntos con mayor distancia son "+distancia5);
        }else if ((distancia6>distancia1)|(distancia6>distancia2)||(distancia6>distancia3)|(distancia6>distancia4)||(distancia6>distancia5)||(distancia6>distancia7)||(distancia6>distancia8)||(distancia6>distancia9)|(distancia6>distancia10)){
            System.out.println("Los puntos con mayor distancia son "+distancia6);
        }else if ((distancia7>distancia1)|(distancia7>distancia2)||(distancia7>distancia3)|(distancia7>distancia4)||(distancia7>distancia5)||(distancia7>distancia6)||(distancia7>distancia8)||(distancia7>distancia9)|(distancia7>distancia10)){
            System.out.println("Los puntos con mayor distancia son "+distancia7);
        }else if ((distancia8>distancia1)|(distancia8>distancia2)||(distancia8>distancia3)|(distancia8>distancia4)||(distancia8>distancia5)||(distancia8>distancia6)||(distancia8>distancia7)||(distancia8>distancia9)|(distancia8>distancia10)){
            System.out.println("Los puntos con mayor distancia son "+distancia8);
        }else if ((distancia9>distancia1)|(distancia9>distancia2)||(distancia9>distancia3)|(distancia9>distancia4)||(distancia9>distancia5)||(distancia9>distancia6)||(distancia9>distancia7)||(distancia9>distancia8)|(distancia9>distancia10)){
            System.out.println("Los puntos con mayor distancia son "+distancia9);
        }else if ((distancia10>distancia1)|(distancia10>distancia2)||(distancia10>distancia3)|(distancia10>distancia4)||(distancia10>distancia5)||(distancia10>distancia6)||(distancia10>distancia7)||(distancia10>distancia8)|(distancia10>distancia9)){
            System.out.println("Los puntos con mayor distancia son "+distancia10);
        }

        if ((distancia1<distancia2)|(distancia1<distancia3)|(distancia1<distancia4)|(distancia1<distancia5)|(distancia1<distancia6)||(distancia1<distancia7)||(distancia1<distancia8)||(distancia1<distancia9)||(distancia1<distancia10)){
            System.out.println("Los puntos con menor distancia son "+distancia1);
        }else if ((distancia2<distancia1)|(distancia2<distancia3)|(distancia2<distancia4)|(distancia2<distancia5)|(distancia2<distancia6)||(distancia2<distancia7)||(distancia2<distancia8)||(distancia2<distancia9)||(distancia2<distancia10)){
            System.out.println("Los puntos con menor distancia son "+distancia2);
        }else if ((distancia3<distancia1)|(distancia3<distancia2)|(distancia3<distancia4)|(distancia3<distancia5)||(distancia3<distancia6)||(distancia3<distancia7)||(distancia3<distancia8)||(distancia3<distancia9)|(distancia3<distancia10)){
            System.out.println("Los puntos con menor distancia son "+distancia3);
        }else if ((distancia4<distancia1)|(distancia4<distancia2)||(distancia4<distancia3)|(distancia4<distancia5)||(distancia4<distancia6)||(distancia4<distancia7)||(distancia4<distancia8)||(distancia4<distancia9)|(distancia4<distancia10)){
            System.out.println("Los puntos con menor distancia son "+distancia4);
        }else if ((distancia5<distancia1)|(distancia5<distancia2)||(distancia5<distancia3)|(distancia5<distancia4)||(distancia5<distancia6)||(distancia5<distancia7)||(distancia5<distancia8)||(distancia5<distancia9)|(distancia5<distancia10)){
            System.out.println("Los puntos con menor distancia son "+distancia5);
        }else if ((distancia6<distancia1)|(distancia6<distancia2)||(distancia6<distancia3)|(distancia6<distancia4)||(distancia6<distancia5)||(distancia6<distancia7)||(distancia6<distancia8)||(distancia6<distancia9)|(distancia6<distancia10)){
            System.out.println("Los puntos con menor distancia son "+distancia6);
        }else if ((distancia7<distancia1)|(distancia7<distancia2)||(distancia7<distancia3)|(distancia7<distancia4)||(distancia7<distancia5)||(distancia7<distancia6)||(distancia7<distancia8)||(distancia7<distancia9)|(distancia7<distancia10)){
            System.out.println("Los puntos con menor distancia son "+distancia7);
        }else if ((distancia8<distancia1)|(distancia8<distancia2)||(distancia8<distancia3)|(distancia8<distancia4)||(distancia8<distancia5)||(distancia8<distancia6)||(distancia8<distancia7)||(distancia8<distancia9)|(distancia8<distancia10)){
            System.out.println("Los puntos con menor distancia son "+distancia8);
        }else if ((distancia9<distancia1)|(distancia9<distancia2)||(distancia9<distancia3)|(distancia9<distancia4)||(distancia9<distancia5)||(distancia9<distancia6)||(distancia9<distancia7)||(distancia9<distancia8)|(distancia9<distancia10)){
            System.out.println("Los puntos con menor distancia son "+distancia9);
        }else if ((distancia10<distancia1)|(distancia10<distancia2)||(distancia10<distancia3)|(distancia10<distancia4)||(distancia10<distancia5)||(distancia10<distancia6)||(distancia10<distancia7)||(distancia10<distancia8)|(distancia10<distancia9)){
            System.out.println("Los puntos con menor distancia son "+distancia10);
        }
    */


        System.out.println("Distancia 1: "+ decimalFormat.format(distancia1));
        System.out.println("Distancia 2: "+ decimalFormat.format(distancia2));
        System.out.println("Distancia 3: "+ decimalFormat.format(distancia3));
        System.out.println("Distancia 4: "+ decimalFormat.format(distancia4));
        System.out.println("Distancia 5: "+ decimalFormat.format(distancia5));
        System.out.println("Distancia 6: "+ decimalFormat.format(distancia6));
        System.out.println("Distancia 7: "+ decimalFormat.format(distancia7));
        System.out.println("Distancia 8: "+ decimalFormat.format(distancia8));
        System.out.println("Distancia 9: "+ decimalFormat.format(distancia9));
        System.out.println("Distancia 10: "+ decimalFormat.format(distancia10));

    }




}


public class Data {
    //#1
    private static final String SEPARADOR = "-";
    private String data;
    int dia;
    int mes;
    int any;

    public String getData() {
        return data;
    }

    public void setData(/*String data*/int dia,int mes, int any) throws Exception {
//#2
        /*if (!data.contains(SEPARADOR)) throw new Exception();
         this.data = Integer.toString(dia)+SEPARADOR+Integer.toString(mes)+SEPARADOR+Integer.toString(any);*/

        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    public int getAny(){
        return any;
    }

   /* private int[] descomposaData(){

        String[] dataDescomposada = data.split(SEPARADOR);
        int[] dataDescomposadaInt = new int[dataDescomposada.length];
        dataDescomposadaInt[0] = Integer.parseInt(dataDescomposada[0]);
        dataDescomposadaInt[1] = Integer.parseInt(dataDescomposada[1]);
        dataDescomposadaInt[2] = Integer.parseInt(dataDescomposada[2]);

        return dataDescomposadaInt;
    }*/
}
class box <T>{
/*classes genericas*/
}

/**
 *
CONTESTA:

1. Reflexiona sobre les linies marcades amb #1 i #2.

 #1
 Al introducir una variable final, asi como esta montado el codigo, siempre que introduzcamos una fecha, debera ir siempre
 con un separador definido en la variable final, si no pusieramos el separador y/o pusieramos uno diferente al definido
 en la variable, la clase entera dejaria de funcionar...en resumidas cuentas, para asegurnarnos de que siempre introducimos
 bien la fecha, en el metodo setData deberemos introducir un string de la siguiente manera:
 "16"+separador+"09"+separador+"2019".

 #2
 Al comparar siempre los datos introducidos en el metodo setData(), restrinje la manera en la que podemos introducir datos,
 esto puede ser bueno por que nos asegura que los datos introducidos siempre estaran como nosotros queremos, pero a la vez
 pienso que podria estar mejor implementado, para que fuera mas permisivo la manera de introducir datos...un ejemplo para
 ser mas permisivo seria utilizar regex para filtrar los datos.


2. Implementa una nova classe anomenada AnyDeTrespas que determini si una determinada data pertany a un any de trespàs
 (per simplificar l'algoritmia considerarem que els anys de trespàs son tots els anys parells). Reflexiona sobre:
A què pots accedir de la superclasse?

 Solo a los metodos getData, getAny y setData

A què no pots accedir?

 A las variables y al metodo descomposaData

3. Ara canvia la implementació de la classe Data. Fes-la amb la representació de la data amb tres atributs enters.
Segueix funcionant la classe AnyDeTrespas ?

 No funciona debido a que la encapsulacion no esta bien implementada

Què hauria passat si per algun motiu haguesis pogut emprar el mètode privat descomposaData.

 Se podria haber usado el metodo (el cual descompone el String en int's) y al implementarlo en la clase AnyDeTraspas
 se hubiese mantenido el principio de encapsulación.
*
**/

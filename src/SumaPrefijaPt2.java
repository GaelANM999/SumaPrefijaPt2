import java.util.ArrayList;
import java.util.List;

public class SumaPrefijaPt2 {
    public static void main(String[] args) {
        List<Integer> argumentos = new ArrayList<>();
        int X = Integer.parseInt(args[0]);
        boolean hay= false;

        for (int i = 1; i < args.length; i++) {
            argumentos.add(Integer.valueOf(args[i]));
        }

        int cuantos = argumentos.size() * argumentos.size();

        for (int i = 0; i < cuantos; i++) {
            for (int j = 0; j < argumentos.size(); j++) {

                int numAle = (int) (Math.random() * argumentos.size());  // Generate random index

                if (numAle == 0) {
                    numAle = 1;
                } else if (numAle == argumentos.size()) {
                    numAle = argumentos.size() - 1;
                }

                Integer argRandom = argumentos.get(numAle);
                if (argRandom == 0) {
                    argRandom = 1;
                }
                if (argRandom + argumentos.get(j) == X) {
                    // System.out.println(argRandom + "+" + argumentos.get(j));
                    System.out.println("Sí hay una suma que da igual a X");
                    hay= true;
                } else {
                    //System.out.println("No hay suma que dé igual a X");
                    //System.out.println(argRandom + "+" + argumentos.get(j));
                }

            }
        }
        if (hay==false){
            System.out.println("No hay suma igual a X");
        }
        else {
            System.out.println("Si hay suma igual a X");
        }
    }
}

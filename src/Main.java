import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Fase 1
        char[] lletresNom = {'j','o','r','g','e','3','a','l','e','j','a','n','d','r','o','t','o','r','r','e','s','g','a','r','c','i','a'};

        for(char lletra: lletresNom){
            System.out.println(lletra);
        }

        // Fase 2
        List<Character> llistaLletres = convert(lletresNom);

        for(Character character:llistaLletres){
            if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
                System.out.println("VOCAL -> " + character);
            } else if (character == '0' || character == '1' || character == '2' || character == '3' || character == '4' || character == '5' ||
                    character == '6' || character == '7' || character == '8' || character == '9'){
                System.out.println("Els noms de persones no contenen números! -> " + character);
            } else{
                System.out.println("CONSONTANT -> " + character);
            }
        }

        // Fase 3
        Map<Character, Integer> mapaLletres = new HashMap<>();

        for(char lletra: lletresNom){
            if(mapaLletres.containsKey(lletra)){
                int numVeces = mapaLletres.get(lletra);
                mapaLletres.put(lletra,numVeces+1);
            } else{
                mapaLletres.put(lletra,1);
            }
        }

        System.out.println(mapaLletres);

        //Fase 4
        char[] lletresNom2 = {'j','o','r','g','e','a','l','e','j','a','n','d','r','o'};
        char[] lletresCognom = {'t','o','r','r','e','s','g','a','r','c','i','a'};

        List<Character> nom2 = convert(lletresNom2);
        List<Character> cognom = convert(lletresCognom);

        List<Character>  fullName = new ArrayList<>();
        fullName.addAll(nom2);
        fullName.add(' ');
        fullName.addAll(cognom);

        System.out.println(fullName);


    }

    public static List<Character> convert(char[] initialList){
        List<Character> aux = new ArrayList<>();

        for (char lletra : initialList) {
            aux.add(lletra);
        }

        return aux;
    }


}

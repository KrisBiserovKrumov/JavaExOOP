package javaAdvance.functionalPrograming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> names = Arrays.stream(reader.readLine().split(" "))
                .collect(Collectors.toCollection(ArrayList::new));

        String command = reader.readLine();


        while (!command.equals("Party!")){
            String[] tokens = command.split("\\s+");
            Predicate<String> predicate = createPredicate(tokens[1],tokens[2]);

            if (tokens[0].equals("Remove")){
               names.removeIf(predicate);
            }else {
                ArrayList<String> namesToAdd = new ArrayList<>();
                names.forEach(name ->{
                    if (predicate.test(name)){
                        namesToAdd.add(name);
                    }
                });
                names.addAll(namesToAdd);


            }

            command = reader.readLine();
        }
        Collections.sort(names);
        System.out.println(names.size()== 0 ? "Nobody is going to the party!" :
                String.join(", ",names) + " are going to the party!");
    }
    public static Predicate<String> createPredicate (String type, String string){
        Predicate<String> predicate;
        switch (type){
            case  "StartsWith":
                predicate = str -> str.startsWith(string);
                break;
            case  "EndsWith":
                predicate = str -> str.endsWith(string);
                break;
            default:
                predicate = str -> str.length() == Integer.parseInt(string);
                break;
        }
        return predicate;
    }
}

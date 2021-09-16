package javaAdvance.Demos.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;


public class HospitalOne {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, HashMap<Integer, List<String>>> departmentRoomPatients = new HashMap<>();
        HashMap<String, List<String>> doctorPatient = new HashMap<>();

        String[] imput = reader.readLine().split(" ");
        int room = 1;

        while (!imput[0].equals("Output")) {
            departmentRoomPatients.putIfAbsent(imput[0], new HashMap<>());

            doctorPatient.putIfAbsent(imput[1] + " " + imput[2], new ArrayList<>());
            doctorPatient.get(imput[1] + " " + imput[2]).add(imput[3]);

            departmentRoomPatients.get(imput[0]).putIfAbsent(room, new ArrayList<>());
            if (departmentRoomPatients.get(imput[0]).get(room).size() == 3) {
                if (departmentRoomPatients.get(imput[0]).values().size() == 20) {
                    continue;
                } else {
                    room++;
                    departmentRoomPatients.get(imput[0]).putIfAbsent(room, new ArrayList<>());
                    departmentRoomPatients.get(imput[0]).get(room).add(imput[3]);
                }
            } else {
                departmentRoomPatients.get(imput[0]).get(room).add(imput[3]);
            }
            imput = reader.readLine().split(" ");
        }
        String[] command = reader.readLine().split(" ");
        while (!command[0].equals("End")) {
            if (command.length == 1) {
                departmentRoomPatients.get(command[0]).values().forEach(e->{
                    for (String s : e) {
                        System.out.println(s);
                    }
                });
            }else {
                if (doctorPatient.containsKey(command[0] + " " + command[1])){
                    doctorPatient.get(command[0] + " " + command[1]).sort(String::compareTo);
                    doctorPatient.get(command[0] + " " + command[1]).forEach(System.out::println);
                }
                else {
                   departmentRoomPatients.get(command[0]).get(Integer.parseInt(command[1])).sort(String::compareTo);

                    departmentRoomPatients.get(command[0]).get(Integer.parseInt(command[1])).forEach(System.out::println);
                }
            }
            command = reader.readLine().split(" ");


        }
    }
}

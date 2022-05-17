package org.loose.fis.sre.services;

import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;
import org.loose.fis.sre.model.Flight;
import org.loose.fis.sre.model.User;

import java.util.ArrayList;

import static org.loose.fis.sre.services.FileSystemService.getPathToFile;

public class FlightService {
    private static ObjectRepository<Flight> flightRepository;

    public static void initDatabase() {
        Nitrite database = Nitrite.builder()
                .filePath(getPathToFile("flight.db").toFile()).openOrCreate();
        flightRepository = database.getRepository(Flight.class);
    }
    public static void add_flight(Flight f){
        flightRepository.insert(f);
    }
    public static ArrayList<Flight> get_flights(){
        ArrayList<Flight> lista=new ArrayList<>();
        for (Flight f:flightRepository.find(
        )){
            lista.add(f);
        }
        return lista;
    }

    public static void delete_flight(Flight f){
        flightRepository.remove(f);
    }
}

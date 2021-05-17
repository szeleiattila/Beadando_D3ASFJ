package org.example.dao_json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.example.exceptions.AruNotFound;
import org.example.models.Aru;
import org.example.service.dao.RaktarDAO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class RaktarDAOJSON implements RaktarDAO {
    File jsonFile;
    ObjectMapper mapper;
    public RaktarDAOJSON(String jsonFilePath) throws IOException {
        jsonFile= new File(jsonFilePath);
        System.out.println(jsonFile.getAbsolutePath());
        if(!jsonFile.exists()){
            jsonFile.createNewFile();
            FileWriter writer = new FileWriter(jsonFile);
            writer.write("[]");
            writer.flush();
            writer.close();
        }

        mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
    }
    
    @Override
    public void addAru(Aru aru) {
        Collection<Aru> aruk = readAllAru();
        
        try {
            mapper.writeValue(jsonFile, aruk);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Collection<Aru> readAllAru() {
        Collection<Aru> aruk = new ArrayList<Aru>();
        TypeReference type = new TypeReference<ArrayList<Aru>>() {};
        try {
            aruk = mapper.readValue(jsonFile,type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return aruk;
    }

    @Override
    public Aru readAru(String id) throws AruNotFound{
        Collection<Aru> aruk = readAllAru();
        for (Aru a: aruk){
            if(a.getId().equalsIgnoreCase(id)){
                return a;
            }
        }
        return null;
    }

    @Override
    public Collection<Aru> readAruById(String id) throws AruNotFound {
        Collection<Aru> aruk= readAllAru();
        Collection<Aru> result = new ArrayList<Aru>();
        for (Aru a: aruk  ){
            if(a.getId().equals(id)){
                result.add(a);
            }
        }
        return result;
    }

    @Override
    public void updateAru(Aru aru) {
        try {
            Aru aruResult= readAru(aru.getId());
            aruResult=aru;
        } catch (AruNotFound aruNotFound) {
            aruNotFound.printStackTrace();
        }
    }
    
    @Override
    public void deleteAru(Aru aru) {
        Collection<Aru> aruk= readAllAru();
        aruk.remove(aru);
    }
}

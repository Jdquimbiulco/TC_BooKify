/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.Bookify.Controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.Bookify.model.User;
import java.util.Scanner;
import org.bson.Document;


/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class MongoDBManager {

    String collection;

    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;

        String uri = "mongodb+srv://jairo:jairo@jqdatabase.0xyetay.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Conexion Exitosa");

        userdatabase = client.getDatabase("JAIRO");

        return userdatabase;

    }

    
    public void CreateUser(User user) {

        MongoDatabase userDB;
        MongoCollection userCollection;
        Document document;
        
        userDB = EstablishConnection();
        userCollection = userDB.getCollection("Users");

        document = new Document();
        
        document.append("Name", user.getUserName());
        document.append("Id", user.getUserId());
        document.append("Email", user.getUserEmail());
        document.append("Phone", user.getUserPhone());
        document.append("Addres", user.getUserAddress());
        document.append("Age", user.getUserAge());
        document.append("Password", user.getUserPassword());

        userCollection.insertOne(document);

    }

    
    

}
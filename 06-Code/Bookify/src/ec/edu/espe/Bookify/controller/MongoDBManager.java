package ec.edu.espe.Bookify.controller;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import ec.edu.espe.Bookify.model.Movie;
import ec.edu.espe.Bookify.model.Book;

import ec.edu.espe.Bookify.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import org.bson.Document;



/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class MongoDBManager {

    String collection;
    MongoDatabase bookifyDB;
    MongoCollection bookifyCollection;
    Document document;
    
    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;
            
        String uri = "mongodb+srv://jdquimbiulco:jdquimbiulco@cluster0.vv6hc.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Conexion Exitosa");

        userdatabase = client.getDatabase("BooKiFi");

        return userdatabase;

    }

    
    public void CreateUser(User user) {

        
        bookifyDB = EstablishConnection();
        bookifyCollection = bookifyDB.getCollection("Users");

        document = new Document();
        
        document.append("Name", user.getUserName());
        document.append("Id", user.getUserId());
        document.append("Email", user.getUserEmail());
        document.append("Phone", user.getUserPhone());
        document.append("Addres", user.getUserAddress());
        document.append("Age", user.getUserAge());
        document.append("Password", user.getUserPassword());

        bookifyCollection.insertOne(document);

    }


      public void CreateMovie(Movie movie) {

        
        bookifyDB = EstablishConnection();
        bookifyCollection = bookifyDB.getCollection("Movies");

        document = new Document();
        
        document.append("Title", movie.getTitle());
        document.append("Genre", movie.getGenre());
        document.append("Idiom", movie.getIdiom());
        document.append("Available", movie.isAvailable());
        
        bookifyCollection.insertOne(document);



    }  




    public void CreateBook(Book book) {

        
        bookifyDB = EstablishConnection();
        bookifyCollection = bookifyDB.getCollection("Books");

        document = new Document();
        
        document.append("Title", book.getTitle());
        document.append("Author", book.getAuthor());
        document.append("Publisher", book.getPublisher());
        document.append("ISBN", book.getISBN());
        document.append("Avaliable", book.isAvailable());


        bookifyCollection.insertOne(document);

    }
    
       
    public void CreateBill(User user,Book book, int bill) {

        
        bookifyDB = EstablishConnection();
        bookifyCollection = bookifyDB.getCollection("Bills");

        document = new Document();
        
        document.append("Name", user.getUserName());
        document.append("Id", user.getUserId());
        document.append("Bill", bill);
        document.append("Book", book.getTitle());
        
        bookifyCollection.insertOne(document);

    }
    
      

}

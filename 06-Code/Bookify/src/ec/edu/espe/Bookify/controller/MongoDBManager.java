package ec.edu.espe.Bookify.controller;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.Bookify.model.Movie;
import ec.edu.espe.Bookify.model.Book;

import java.util.ArrayList;
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
        System.out.println("succesfull conection");

        userdatabase = client.getDatabase("BooKiFi");

        return userdatabase;

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

    public ArrayList ReadBookifyDB(Object bookifyObject, String collection) {

        bookifyDB = EstablishConnection();
        bookifyCollection = bookifyDB.getCollection(collection);
        FindIterable<Document> iterDoc;
        ArrayList<Object> objects;
        Gson gson;

        iterDoc = bookifyCollection.find();
        objects = new ArrayList<>();
        gson = new Gson();

        for (Document doc : iterDoc) {
            objects.add(gson.fromJson(doc.toJson(), bookifyObject.getClass()));
        }

        return objects;

    }

    public void CreateBookifyObject(Object bookifyObject, String collection) {
        bookifyDB = EstablishConnection();
        bookifyCollection = bookifyDB.getCollection(collection);
        Gson gson = new Gson();

        document = Document.parse(gson.toJson(bookifyObject));
        System.out.println("Succesfull convertion");

        bookifyCollection.insertOne(document);
        System.out.println("Succesfull added");

    }

    public void UpdateBookifyObject(String collection, String atributeToFind, Object tofind, String atributetoChange, Object toChange) {

        bookifyDB = EstablishConnection();
        bookifyCollection = bookifyDB.getCollection(collection);
        Document found;
        Document update;
        Document setUpdate;

        document = new Document(atributeToFind, tofind);
        found = (Document) bookifyCollection.find(document).first();

        if (found != null) {
            update = new Document(atributetoChange, toChange);
            setUpdate = new Document("$set", update);
            bookifyCollection.updateOne(found, setUpdate);
        }

    }

    public void DelteBookifyObject(String collection, String atribute, Object findtoDelete) {
        bookifyDB = EstablishConnection();
        bookifyCollection = bookifyDB.getCollection(collection);
        bookifyCollection.deleteOne(Filters.eq(atribute.toLowerCase(), findtoDelete));
        System.out.println("Succesfully Deleted");
    }

    public Document findDocument(String atributeToFind, Object tofind, String collection) {

        bookifyDB = EstablishConnection();
        bookifyCollection = bookifyDB.getCollection(collection);
        Document found;
        Document foundtoReturn = null;

        document = new Document(atributeToFind, tofind);
        found = (Document) bookifyCollection.find(document).first();

        if (found != null) {
            foundtoReturn = found;
        } else {
            System.out.println("Document not found");

        }

        return foundtoReturn;

    }

}

/**
 * Created by Lukasz on 17.03.2018.
 */
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import com.mongodb.MongoCredential;
import com.mongodb.MongoClientOptions;


import java.util.Arrays;

public class App {

    public static void main(String[] args){

        String user ="sda"; // the user name
        String database = "admin"; // the name of the database in which the user is defined
        char[] password = "sda".toCharArray(); // the password as a character array

        MongoCredential credential = MongoCredential.createCredential(user, database, password);
        MongoClientOptions options = MongoClientOptions.builder().sslEnabled(true).build();
        MongoClient mongoClient = new MongoClient(new ServerAddress("cluster0-shard-00-00-eos78.mongodb.net", 27017),
                Arrays.asList(credential),
                options);



    }
}

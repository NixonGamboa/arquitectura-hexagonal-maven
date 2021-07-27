import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
public class Book {
    private UUID id;
    private String title;
    private String author;
    private String description;

    Book(UUID id, String name, String author, String description){
        this.id = id;
        this.title = name;
        this.author= author;
        this.description= description;
    }
    UUID getId(){
        return this.id;
    }
}
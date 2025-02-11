package org.example;

import javax.persistence.*;
import java.io.FileInputStream;
import java.io.IOException;
import org.example.Certificate;         // ✅ Correct import


@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  //  @Column(name="UserPrimaryIDTable")
    @Column(name = "id")
    private int id;
    private String name;
    private String email;

    //embeddable annotation learning
    @Embedded
    private Certificate certi;

    public Certificate getCerti() {
        return certi;
    }

    public void setCerti(Certificate certi) {
        this.certi = certi;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    @Lob
    private  byte[] image;
    //Reading a image.



    // Constructors
    public Student() throws IOException {}
    public Student(String name, String email,byte[] image) throws IOException {
        this.name = name;
        this.email = email;
        this.image=image;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

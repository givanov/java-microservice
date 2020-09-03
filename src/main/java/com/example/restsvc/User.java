package com.example.restsvc;

import javax.xml.bind.annotation.XmlElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.io.Serializable;


public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @JacksonXmlProperty(isAttribute = true)
    private int id;
    @JacksonXmlProperty
    private String name;
    @JacksonXmlProperty
    private String profession;
    public User(){}

    public User(int id, String name, String profession){
        this.id = id;
        this.name = name;
        this.profession = profession;
    }
    public int getId() {
        return id;
    }
    @XmlElement
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
    public String getProfession() {
        return profession;
    }
    @XmlElement
    public void setProfession(String profession) {
        this.profession = profession;
    }
}
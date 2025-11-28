package Librarymanagementapp;

public class Student {
    private String name;
    private int id;
    Student(String name, int id){
        this.name = name;
        this.id = id;

    }

    public void setid(int id){
        this.id = id;
    }
    public int getid(){
        return id;
    }
    public void setname(String name){
         this.name = name;
    }
    public String getname(){
        return name;
    }

    public String toString(){
        return "Name: "+name+" , ID: "+id;
    }
}

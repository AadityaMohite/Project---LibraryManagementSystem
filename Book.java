package Librarymanagementapp;

public class Book {
    private String author , title;
    private int id;
    private double price;

    Book(String author,String title,int id,double price){
          this.id = id;
          this.author = author;
          this.title = title;
          this.price = price;
    }

    public void setid(int id){
         this.id = id;
    }

    public int getid(){
        return id;
    }

    public void settitle(String title){
        this.title = title;
    }

    public String gettitle(){
        return title;
    }

    public void setauthor(String author){
        this.author = author;
    }

    public String getauthor(){
        return author;
    }

    public void setprice(double price){
        this.price = price;
    }
    public double getprice(){
        return price;
    }

    public String toString(){
        return "Title: "+title+",Author: "+author+",ID: "+id+",Price: "+price;

    }
}

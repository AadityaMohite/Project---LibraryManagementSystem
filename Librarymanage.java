package Librarymanagementapp;
import java.util.Scanner;
import java.util.ArrayList;
public class Librarymanage {
      public static void main(String[] args) {
            ArrayList<Book> list = new ArrayList<>();
            Book book = new Book("Java Programming Basics", "James Goshling", 101, 450);
            Book book2 = new Book("Data Structures in Java", "Robert Lafore", 102, 600);
            Book book3 = new Book("Operating System Concepts", "Silberschatz", 103, 550);
            Book book4 = new Book("Database Management Systems", "Raghu Ramakrishnan", 104, 450);
            Book book5 = new Book("Computer Networks", "Andrew Tanenbaum", 105, 650);

            ArrayList<Book> Bookborrowed = new ArrayList<>();

            list.add(book);
            list.add(book2);
            list.add(book3);
            list.add(book4);
            list.add(book5);

            ArrayList<Student> students = new ArrayList<>();

            Student stu = new Student("Ramesh", 201);
            Student stu1 = new Student("Lokesh", 202);
            Student stu2 = new Student("Ram", 203);

            students.add(stu);
            students.add(stu1);
            students.add(stu2);

            Scanner sc = new Scanner(System.in);
            int option = 0;

            while (option != 6) {
                  System.out.println("1:Show all Books");
                  System.out.println("2:Show all Students");
                  System.out.println("3:Add new Book");
                  System.out.println("4:Add new Student");
                  System.out.println("5:Book Borrow");
                  System.out.println("6:Book Return");
                  System.out.println("7:Exit");

                  System.out.println("Enter the Option:");
                  option = sc.nextInt();

                  switch (option) {
                        case 1:
                              for (Book b : list) {
                                    System.out.println("Book list: " + b);
                              }
                              break;
                        case 2:
                              for (Student student : students) {
                                    System.out.println("Student list: " + student);
                              }
                              break;

                        case 3:
                              System.out.println("Enter the Book Title:");
                              String newname = sc.nextLine();
                              
                              System.out.println("Enter the Author Name:");
                              String newAuthor = sc.nextLine();

                              System.out.println("Enter the Book ID:");
                              int id = sc.nextInt();
                              sc.nextLine();
                              System.out.println("Enter the Price");
                              double price = sc.nextDouble();

                              list.add(new Book(newname, newAuthor, id, price));

                              break;

                        case 4:
                              sc.nextLine();
                              System.out.println("Enter the Student name:");
                              String newname2 = sc.nextLine();

                              System.out.println("Enter Student ID");
                              int newid = sc.nextInt();

                              students.add(new Student(newname2, newid));
                              break;

                        case 5:
                              sc.nextLine();
                              System.out.println("Enter the Student Id:");
                              int oldid = sc.nextInt();
                              sc.nextLine();
                              System.out.println("Enter the Book Id");
                              int oldbookid = sc.nextInt();
                              boolean studentfound = false;
                              for (Student student : students) {
                                    if (student.getid() == oldid) {
                                          studentfound = true;
                                          break;
                                    }
                              }
                              boolean bookfound = false;
                              for (Book b : list) {
                                    if (b.getid() == oldbookid) {
                                          bookfound = true;
                                          Bookborrowed.add(b);
                                          list.remove(b);
                                          System.out.println(Bookborrowed);
                                          break;
                                    }
                              }
                              if (studentfound && bookfound) {
                                    System.out.println("Book Borrow Succsesfully");
                                    
                              } else {
                                    System.out.println("Invalid id");
                              }
                              break;
                        case 6: System.out.println("Enter the Student id");
                                  int  id3 = sc.nextInt();
                                  sc.nextLine();
                                  System.out.println("Enter the Book id");
                                  int bid = sc.nextInt();
                                    boolean studentfound2 = false;
                              for (Student student : students) {
                                    if (student.getid() == id3) {
                                          studentfound2 = true;
                                          break;
                                    }
                              }
                                    boolean bookfound2 = false;
                                    for (Book b : list) {
                                          if (b.getid()==bid) {
                                                bookfound2 =true;
                                                break;
                                          }
                                    }
                                   
                                    if (studentfound2 && bookfound2) {
                                        System.out.println("Student And Book is Found");
                                          for(Book b1 : Bookborrowed){
                                          if(b1.getid()==bid){
                                                Book borrowed = b1;
                                                Bookborrowed.remove(b1);
                                                list.add(b1);
                                            System.out.println("Return Book:"+borrowed);
                                            break;
                                          }
                                         
                                    }
                                    }else{
                                            System.out.println("Invalid Student or Book id");
                                    }
                                 break;
                        case 7:
                              System.out.println("Exit System...");
                              break;

                        default:
                              System.out.println("Invalid Option");
                  }

            }
            ;

      }

}

package ejerciciosClases;

public class Libro {

    private String name;
    private String isbn;
    private String author;
    private boolean onLoan;

    public Libro(){
        name = "no-name";
        isbn = "0";
        author = "no-author";
        onLoan = false;
    }

    public Libro(String name, String isbn, String author){
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        onLoan = false;
    }

    public boolean prestamo(){
        if(!onLoan){
            onLoan = true;
            return true;
        }
        return false;
    }

    public boolean devolucion(){
        if(onLoan){
            onLoan = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String str = getName() + ", " + getIsbn() + ", " + getAuthor();
        if(onLoan){
            str += ", NO DISPONIBLE";
            return str;
        }
        str += ", DISPONIBLE";
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

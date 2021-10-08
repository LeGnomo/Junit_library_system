package teste;

public class Livro {

    private Biblioteca biblioteca;

    public String isbn;
    public String titulo;
    public String autor;


    public Livro(String isbn,String titulo, String autor) {
        if(isbn.length()!=4){
            throw new IllegalArgumentException("isbn deve conter 4 caracteries");
        }
        if(titulo.length()>50){
            throw new IllegalArgumentException("titulo não pode ser maior que 50 caracteries");
        }

        if(titulo.length()<=0){
            throw new IllegalArgumentException("titulo não pode ser vazio");

        }
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString(){
        return "isbn :"+isbn + "\ntitulo : "+titulo + "\nautor : "+autor;
    }


}

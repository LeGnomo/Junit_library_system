package teste;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca
{
    private List<Livro> livros = new ArrayList<Livro>();

    public void save(Livro livro){
        if(livros.contains(livro)){
            throw new IllegalArgumentException("Este livro já contem na lista de livros");
        }
        livros.add(livro);
    }

    public void update(Livro livro,int i){
        if(livros.size()>0){
            livros.set(i,livro);
        }
    }

    public int size(){
        return livros.size();
    }

    public Livro getLivro(int i){
        return livros.get(i);
    }

    public void removeLivro(int i){
        if(livros.size()>0 ){
            livros.remove(i);
        }else{
            System.out.println("A lista está vazia");
        }
    }

    public void exibeLista(){
        if(livros.size()>0){
            for (int i = 0; i < livros.size();i++) {
                System.out.println("isbn : "+livros.get(i).isbn +"  autor : "+livros.get(i).autor+"  titulo : "+livros.get(i).titulo);
            }
        }else{
            System.out.println("A lista da biblioteca está vazia");
        }

    }
}

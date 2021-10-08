package teste;

import org.junit.Test;
import org.junit.Assert;


public class REQ01MantemLivro{

    @Test
    public void ct01_cadastrar_livro_com_sucesso(){
        Biblioteca biblioteca = new Biblioteca();

        Livro livro = new Livro("1234","Engenharia de software","PRESSMAN");
        biblioteca.save(livro);
        Assert.assertEquals(1,biblioteca.size());
    }


    @Test
    public void ct02_alterar_autor_e_titulo(){
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro("1111","Engenharia de software","Perssman");
        biblioteca.save(livro);
        biblioteca.exibeLista();
        livro.titulo = "Eng about software";
        livro.autor = "David Commam";
        biblioteca.update(livro,0);
        System.out.println("-------Apos update -------");
        biblioteca.exibeLista();
    }

    @Test
    public void ct03_consultar_livro_com_sucesso(){
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro("1111","Engenharia de software","Perssman");
        biblioteca.save(livro);
        Livro re = new Livro("1111","Engenharia de software","Perssman");
        Assert.assertTrue(re.equals(biblioteca.getLivro(0)));
    };

    @Test
    public void ct04_excluir_livro_com_sucesso(){
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro("1111","Engenharia de software","Perssman");
        biblioteca.save(livro);
        biblioteca.exibeLista();
        biblioteca.removeLivro(0);
        biblioteca.exibeLista();
    }

}
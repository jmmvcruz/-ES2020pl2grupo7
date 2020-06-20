import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {
        public static void main(String[] args) {


            Livro l = new Livro("tituloteste",123,"autorteste", LocalDate.now(),12);
            Livro l2 = new Livro("tituloteste2",1234,"autorteste2", LocalDate.now(),123);
            Repositorio r = new Repositorio();
            r.adicionaLivro(l);
            r.adicionaLivro(l2);
            Livro l3= r.devolvelivro(2);
            System.out.println(l3.getTitulo());
            ArmazemLivros al = new ArmazemLivros(l,2);
            ArmazemLivros al2 = new ArmazemLivros(l2,2);
            r.adicionaLivroArmazem(al);
            r.adicionaLivroArmazem(al2);
            r.Registar_biblioteca("biblioteca","joao","rua",34,1234,"joao@email.com");
            Biblioteca b = r.devolvebiblioteca(1);
            System.out.println(b.getMorada());
            HashMap<Livro,Integer> hm = new HashMap<>();
            hm.put(l,1);
            hm.put(l2,2);
            Voucher v = new Voucher("por usar","30% desconto",LocalDate.now(),b);
            r.criar_encomenda(hm,b,v);

            LivrosEncomenda lv = r.devolvelivrosencomenda(1);
            System.out.println(lv.getEstado());
            r.validar_encomenda(1,b);
            lv = r.devolvelivrosencomenda(1);
            System.out.println(lv.getEstado());
            ArmazemLivros la = r.devolvearmazem(1);
            System.out.println(la.getQuantidade());

        }
    }


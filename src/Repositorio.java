import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Repositorio {

    ArrayList<ArmazemLivros> Laramazemlivros ;
    ArrayList<Biblioteca> Lbiblioteca ;
    ArrayList<Encomenda> Lencomenda ;
    ArrayList<Feedback> Lfeedback ;
    ArrayList<Livro> Llivro ;
    ArrayList<LivrosEncomenda> Llivroencomenda ;
    ArrayList<Responsavel_empresa> Lresponsavelempresa ;
    ArrayList<Responsavel_biblioteca> Lresponsavelbiblioteca ;
    ArrayList<Transportadora> Ltransportadora ;
    ArrayList<Voucher> Lvoucher ;


    public Repositorio() {
        Laramazemlivros = new ArrayList<ArmazemLivros>();
        Lbiblioteca = new ArrayList<Biblioteca>();
        Lencomenda = new ArrayList<Encomenda>();
        Lfeedback = new ArrayList<Feedback>();
        Llivro = new ArrayList<Livro>();
        Llivroencomenda = new ArrayList<LivrosEncomenda>();
        Lresponsavelempresa = new ArrayList<Responsavel_empresa>();
        Lresponsavelbiblioteca = new ArrayList<Responsavel_biblioteca>();
        Ltransportadora = new ArrayList<Transportadora>();
        Lvoucher = new ArrayList<Voucher>();
    }

    public void adicionaLivro(Livro livro) {
        Llivro.add(livro);
    }

    public void adicionaLivroArmazem(ArmazemLivros armazem) {
        Laramazemlivros.add(armazem);
    }
    public void adicionaEncomenda(Encomenda encomenda) {
        Lencomenda.add(encomenda);
    } public void adicionaBiblioteca(Biblioteca biblioteca) {
        Lbiblioteca.add(biblioteca);
    } public void adicionaFeedback(Feedback feedback) {
        Lfeedback.add(feedback);
    } public void adicionaLivrosEncomenda(LivrosEncomenda livrosencomenda) {
        Llivroencomenda.add(livrosencomenda);
    } public void adicionaResponsavelBiblioteca(Responsavel_biblioteca responsavelBiblioteca) {
        Lresponsavelbiblioteca.add(responsavelBiblioteca);
    } public void adicionaResponsavelEmpresa(Responsavel_empresa responsavelEmpresa) {
        Lresponsavelempresa.add(responsavelEmpresa);
    } public void adicionaTransportadora(Transportadora transportadora) {
        Ltransportadora.add(transportadora);
    }
    public void adicionaVoucher(Voucher voucher) {
        Lvoucher.add(voucher);
    }


    public Livro devolvelivro(Integer l){
        Livro e = null;
        int i;
        for(i=0;i<Llivro.size();i++){
            e=Llivro.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public ArmazemLivros devolvearmazem(Integer l){
        ArmazemLivros e = null;
        int i;
        for(i=0;i<Laramazemlivros.size();i++){
            e=Laramazemlivros.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public Encomenda devolveencomenda(Integer l){
        Encomenda e = null;
        int i;
        for(i=0;i<Lencomenda.size();i++){
            e=Lencomenda.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public Biblioteca devolvebiblioteca(Integer l){
        Biblioteca e = null;
        int i;
        for(i=0;i<Lbiblioteca.size();i++){
            e=Lbiblioteca.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public Feedback devolvefeedback(Integer l){
        Feedback e = null;
        int i;
        for(i=0;i<Lfeedback.size();i++){
            e=Lfeedback.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public Responsavel_biblioteca devolveresponsavelbiblioteca(Integer l){
        Responsavel_biblioteca e = null;
        int i;
        for(i=0;i<Lresponsavelbiblioteca.size();i++){
            e=Lresponsavelbiblioteca.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public Responsavel_empresa devolveresponsavelempresa(Integer l){
        Responsavel_empresa e = null;
        int i;
        for(i=0;i<Lresponsavelempresa.size();i++){
            e=Lresponsavelempresa.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public LivrosEncomenda devolvelivrosencomenda(Integer l){
        LivrosEncomenda e = null;
        int i;
        for(i=0;i<Llivroencomenda.size();i++){
            e=Llivroencomenda.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public Transportadora devolvetransportadora(Integer l){
        Transportadora e = null;
        int i;
        for(i=0;i<Ltransportadora.size();i++){
            e=Ltransportadora.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public Voucher devolvevoucher(Integer l){
        Voucher e = null;
        int i;
        for(i=0;i<Lvoucher.size();i++){
            e=Lvoucher.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public void criar_encomenda(HashMap<Livro,Integer>livrosencomendados ,Biblioteca b,Voucher v){

        //Integer nlivros, Biblioteca biblioteca, Voucher voucher, Integer preço
        Livro l;
        Integer nlivros=0;
        Map<Livro,Integer>maplivros= livrosencomendados;
        Integer preco=0;
        for (Map.Entry<Livro, Integer> entry : maplivros.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            nlivros=nlivros+entry.getValue();
            l=entry.getKey();
            preco=preco+l.getPreco();
        }
        Encomenda e = new Encomenda(nlivros,b,v,preco);
        Lencomenda.add(e);
        //Livro livro, Encomenda encomenda
        for (Map.Entry<Livro, Integer> entry : maplivros.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            nlivros=nlivros+entry.getValue();
            l=entry.getKey();
            LivrosEncomenda le = new LivrosEncomenda(l,e,nlivros);
            Llivroencomenda.add(le);
        }



    }


    public Encomenda validar_encomenda(Integer l,Biblioteca b){
        Encomenda e = null;
        LivrosEncomenda le = null;
        int i;
        for(i=0;i<Lencomenda.size();i++){
            e=Lencomenda.get(i);
            if (l.equals(e.getId()) ) {
                Notificacoes n = new Notificacoes("a sua encomenda foi validada",b.getResponsavel_biblioteca());
                e.setEstado("validada");

                e.setDataenvio(LocalDate.now());
                for(i=0;i<Llivroencomenda.size();i++){
                    le=Llivroencomenda.get(i);
                    if ((le.getEncomenda()).equals(e) ) {

                        le.setEstado("validada");



                    }
                }
                return e;
            }
        }

        return null;
    }

    public Encomenda enviar_encomenda(Integer l,Biblioteca b){
        Encomenda e = null;
        LivrosEncomenda le = null;
        int i;
        for(i=0;i<Lencomenda.size();i++){
            e=Lencomenda.get(i);
            if (l.equals(e.getId()) ) {
                Notificacoes n = new Notificacoes("a sua encomenda foi enviada",b.getResponsavel_biblioteca());
                e.setEstado("enviado");

                e.setDataenvio(LocalDate.now());
                for(i=0;i<Llivroencomenda.size();i++){
                    le=Llivroencomenda.get(i);
                    if ((le.getEncomenda()).equals(e) ) {

                        le.setEstado("enviado");



                    }
                }
                return e;
            }
        }

        return null;
    }

    public Encomenda confirmar_encomenda(Integer l,Biblioteca b){
        Encomenda e = null;
        LivrosEncomenda le = null;
        int i;
        for(i=0;i<Lencomenda.size();i++){
            e=Lencomenda.get(i);
            if (l.equals(e.getId()) ) {
                Notificacoes n = new Notificacoes("a encomenda foi entrege",b.getResponsavel_biblioteca());
                e.setEstado("entrege");

                e.setDataenvio(LocalDate.now());
                for(i=0;i<Llivroencomenda.size();i++){
                    le=Llivroencomenda.get(i);
                    if ((le.getEncomenda()).equals(e) ) {

                        le.setEstado("entrege");



                    }
                }
                return e;
            }
        }

        return null;
    }

    public Feedback efecutar_feedback(Biblioteca b , String m , Transportadora t,Integer v)
    {
        Feedback f = new Feedback(v,m,t,b.getResponsavel_biblioteca());
        Lfeedback.add(f);
        return f;
    }

    public void Registar_biblioteca(String nome_biblioteca,String nome_responsavel,String morada,Integer idade,Integer nif,String email){
        Responsavel_biblioteca r = new Responsavel_biblioteca(nome_responsavel,idade,nif,email);
        Biblioteca b = new Biblioteca(nome_biblioteca,morada,r);
        Lbiblioteca.add(b);
        Lresponsavelbiblioteca.add(r);


    }

}

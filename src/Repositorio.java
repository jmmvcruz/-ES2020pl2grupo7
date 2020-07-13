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
    ArrayList<Entrega> Lentrega ;
    ArrayList<Notificacoes> Lnotificacoes ;
    ArrayList<LivrosEntrega> Llivrosentrega ;

    public Repositorio() {
        Laramazemlivros = new ArrayList<>();
        Lbiblioteca = new ArrayList<>();
        Lencomenda = new ArrayList<>();
        Lfeedback = new ArrayList<>();
        Llivro = new ArrayList<>();
        Llivroencomenda = new ArrayList<>();
        Lresponsavelempresa = new ArrayList<>();
        Lresponsavelbiblioteca = new ArrayList<>();
        Ltransportadora = new ArrayList<>();
        Lvoucher = new ArrayList<>();
        Lentrega = new ArrayList<>();
        Lnotificacoes = new ArrayList<>();
        Llivrosentrega = new ArrayList<>();
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
    public void adicionaEntrega(Entrega entrega) {
        Lentrega.add(entrega);
    }
    public void adicionaLivrosEntrega(LivrosEntrega livrosentrega) {
        Llivrosentrega.add(livrosentrega);
    }

    public void adicionaNotificacao(Notificacoes notificacoes) {
        Lnotificacoes.add(notificacoes);
    }

    public Livro devolvelivro(Integer l){
        Livro e ;
        int i;
        for(i=0;i<Llivro.size();i++){
            e=Llivro.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public Notificacoes devolvenotificacoes(Integer l){
        Notificacoes e ;
        int i;
        for(i=0;i<Lnotificacoes.size();i++){
            e=Lnotificacoes.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public Entrega devolveEntrega(Integer l){
        Entrega e ;
        int i;
        for(i=0;i<Lentrega.size();i++){
            e=Lentrega.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public LivrosEntrega devolvelivroentrega(Integer l){
        LivrosEntrega e ;
        int i;
        for(i=0;i<Llivrosentrega.size();i++){
            e=Llivrosentrega.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public ArmazemLivros devolvearmazem(Integer l){
        ArmazemLivros e;
        int i;
        for(i=0;i<Laramazemlivros.size();i++){
            e=Laramazemlivros.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public Encomenda devolveencomenda(Integer l){
        Encomenda e ;
        int i;
        for(i=0;i<Lencomenda.size();i++){
            e=Lencomenda.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public Biblioteca devolvebiblioteca(Integer l){
        Biblioteca e ;
        int i;
        for(i=0;i<Lbiblioteca.size();i++){
            e=Lbiblioteca.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public Feedback devolvefeedback(Integer l){
        Feedback e;
        int i;
        for(i=0;i<Lfeedback.size();i++){
            e=Lfeedback.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public Responsavel_biblioteca devolveresponsavelbiblioteca(Integer l){
        Responsavel_biblioteca e ;
        int i;
        for(i=0;i<Lresponsavelbiblioteca.size();i++){
            e=Lresponsavelbiblioteca.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public Responsavel_empresa devolveresponsavelempresa(Integer l){
        Responsavel_empresa e ;
        int i;
        for(i=0;i<Lresponsavelempresa.size();i++){
            e=Lresponsavelempresa.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public LivrosEncomenda devolvelivrosencomenda(Integer l){
        LivrosEncomenda e ;
        int i;
        for(i=0;i<Llivroencomenda.size();i++){
            e=Llivroencomenda.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public Transportadora devolvetransportadora(Integer l){
        Transportadora e ;
        int i;
        for(i=0;i<Ltransportadora.size();i++){
            e=Ltransportadora.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public Voucher devolvevoucher(Integer l){
        Voucher e ;
        int i;
        for(i=0;i<Lvoucher.size();i++){
            e=Lvoucher.get(i);
            if (l.equals(e.getId()) )
                return e;

        }

        return null;
    }

    public int criar_encomenda(HashMap<Livro,Integer>livrosencomendados ,Biblioteca b,Voucher v){

        //Integer nlivros, Biblioteca biblioteca, Voucher voucher, Integer preço
        Livro l;
        int i;
        Integer nlivros=0;
        Map<Livro,Integer>maplivros= livrosencomendados;
        Integer preco=0;
        for (Map.Entry<Livro, Integer> entry : maplivros.entrySet()) {

            nlivros=nlivros+entry.getValue();
            l=entry.getKey();
            preco=preco+l.getPreco();
           for(i=0;i<Laramazemlivros.size();i++){
                ArmazemLivros la=Laramazemlivros.get(i);
                if ((la.getLivro()).equals(l) ) {

                    if((la.getQuantidade())<entry.getValue()){
                        System.out.println("nao existem livros suficientes");
                        return 0;
                        }
                    System.out.println(entry.getKey() + " = " + entry.getValue());

                }
            }
        }
        Encomenda e = new Encomenda(nlivros,b,v,preco);
        Lencomenda.add(e);
        //Livro livro, Encomenda encomenda
        for (Map.Entry<Livro, Integer> entry : maplivros.entrySet()) {
            System.out.println("le: "+entry.getKey() + " = " + entry.getValue());
            nlivros=entry.getValue();
            l=entry.getKey();
            System.out.println("le: "+l + " = " + nlivros);
            LivrosEncomenda le = new LivrosEncomenda(l,e,nlivros);
            Llivroencomenda.add(le);
        }
        System.out.println("entrega criada");
        return 0;



    }


    public Encomenda validar_encomenda(Integer l,Biblioteca b,Responsavel_empresa r){
        Encomenda e ;
        LivrosEncomenda le ;
        int i,j;
        for(i=0;i<Lencomenda.size();i++){
            e=Lencomenda.get(i);
            if (l.equals(e.getId()) ) {
                Notificacoes n = new Notificacoes("a sua encomenda foi validada",b.getResponsavel_biblioteca(),r);
                e.setEstado("validada");
                Lnotificacoes.add(n);
                e.setDataenvio(LocalDate.now());
                for(i=0;i<Llivroencomenda.size();i++){
                    le=Llivroencomenda.get(i);
                    if ((le.getEncomenda()).equals(e) ) {
                        for(j=0;j<Laramazemlivros.size();j++){
                            ArmazemLivros la=Laramazemlivros.get(j);
                            if ((la.getLivro()).equals(le.getLivro()) ) {

                                la.setQuantidade(la.getQuantidade()-le.getNlivros());
                            }
                        }
                        le.setEstado("validada");



                    }
                }
                System.out.println("entrega validada");
                return e;
            }
        }

        return null;
    }

    public Encomenda enviar_parcialmente_encomenda(Integer it,Transportadora t,Biblioteca b,Responsavel_empresa r,HashMap<Livro,Integer>livros){
        Encomenda e ;
        LivrosEncomenda le ;
        int nlivros;
        Livro l;
        int i;
        for(i=0;i<Lencomenda.size();i++){
            e=Lencomenda.get(i);
            if (it.equals(e.getId()) ) {
                Notificacoes n = new Notificacoes("parte da sua encomenda foi enviada",b.getResponsavel_biblioteca(),r);
                Lnotificacoes.add(n);
                e.setEstado("envioparcial");
                Entrega et= new Entrega(e,t);
                Lentrega.add(et);

                for (Map.Entry<Livro, Integer> entry : livros.entrySet()) {
                    System.out.println("le: "+entry.getKey() + " = " + entry.getValue());
                    nlivros=entry.getValue();
                    l=entry.getKey();
                    System.out.println("let: "+l + " = " + nlivros);
                    LivrosEntrega let = new LivrosEntrega(l,et,nlivros);
                    Llivrosentrega.add(let);
                }
                for(i=0;i<Llivroencomenda.size();i++){
                    le=Llivroencomenda.get(i);
                    if ((le.getEncomenda()).equals(e) ) {


                        for (Map.Entry<Livro, Integer> entry : livros.entrySet()) {
                            System.out.println("le: "+entry.getKey() + " = " + entry.getValue());
                            nlivros=entry.getValue();
                            l=entry.getKey();
                            if ((le.getLivro()).equals(l) ) {
                                int j = le.getNlivrosentregues()+nlivros;
                                le.setNlivrosentregues(j);
                                if ((le.getNlivros()).equals(le.getNlivrosentregues()))
                                {
                                    le.setEstado("enviado");
                                }
                            }

                        }




                    }
                }
                System.out.println("entrega enviada");
                return e;
            }
        }

        return null;
    }
    public Encomenda enviar_encomenda(Integer l,Biblioteca b,Responsavel_empresa r,Transportadora t){
        Encomenda e ;
        LivrosEncomenda le ;
        int i;
        for(i=0;i<Lencomenda.size();i++){
            e=Lencomenda.get(i);
            if (l.equals(e.getId()) ) {
                Notificacoes n = new Notificacoes("a sua encomenda foi enviada",b.getResponsavel_biblioteca(),r);
                e.setEstado("enviado");
                Lnotificacoes.add(n);
                Entrega et= new Entrega(e,t);
                Lentrega.add(et);
                e.setDataenvio(LocalDate.now());
                for(i=0;i<Llivroencomenda.size();i++){
                    le=Llivroencomenda.get(i);
                    if ((le.getEncomenda()).equals(e) ) {
                        le.setEstado("enviado");
                        LivrosEntrega let = new LivrosEntrega(le.getLivro(),et,le.getNlivros());
                        Llivrosentrega.add(let);
                    }
                }
                e.setDataEntrege(LocalDate.now());
                System.out.println("entrega enviada");
                return e;
            }
        }
        return null;
    }

    public Entrega confirmar_Entrega(Integer l,Biblioteca b,Responsavel_empresa r){
        Entrega e ;
        LivrosEntrega le ;
        int i;
        for(i=0;i<Lentrega.size();i++){
            e=Lentrega.get(i);
            if (l.equals(e.getId()) ) {
                Notificacoes n = new Notificacoes("a encomenda foi entrege",b.getResponsavel_biblioteca(),r);
                e.setEstado("entrege");
                Lnotificacoes.add(n);
                e.setDataEntrege(LocalDate.now());
                for(i=0;i<Llivrosentrega.size();i++){
                    le=Llivrosentrega.get(i);
                    if ((le.getEntrega()).equals(e) ) {

                        le.setEstado("entrege");



                    }
                }
                e.setDataEntrege(LocalDate.now());
                System.out.println("entrega confirmada");
                return e;
            }
        }

        return null;
    }

    public Encomenda confirmar_encomenda(Integer l,Biblioteca b,Responsavel_empresa r){
        Encomenda e ;
        LivrosEncomenda le ;
        int i;
        for(i=0;i<Lencomenda.size();i++){
            e=Lencomenda.get(i);
            if (l.equals(e.getId()) ) {
                Notificacoes n = new Notificacoes("a encomenda foi entrege",b.getResponsavel_biblioteca(),r);
                e.setEstado("entrege");
                Lnotificacoes.add(n);
                e.setDataEntrege(LocalDate.now());
                for(i=0;i<Llivroencomenda.size();i++){
                    le=Llivroencomenda.get(i);
                    if ((le.getEncomenda()).equals(e) ) {

                        le.setEstado("entrege");



                    }
                }
                System.out.println("entrega da encomenda confirmada");
                return e;
            }
        }

        return null;
    }

    public Feedback efecutar_feedback(Biblioteca b , String m , Entrega e,Integer v)
    {
        Feedback f = new Feedback(v,m,e,b.getResponsavel_biblioteca());
        Lfeedback.add(f);
        return f;
    }

    public int Registar_biblioteca(String nome_biblioteca,String nome_responsavel,String morada,Integer idade,Integer nif,String email){
       int i;
       Biblioteca bv;
       Responsavel_biblioteca rv;
        Responsavel_biblioteca r = new Responsavel_biblioteca(nome_responsavel,idade,nif,email);
        Biblioteca b = new Biblioteca(nome_biblioteca,morada,r);
        for(i=0;i<Lbiblioteca.size();i++){
            bv=Lbiblioteca.get(i);
            if (bv.getNome().equals(b.getNome()) ) {
                System.out.println("biblioteca ja existe");
                return 0;
            }

        }
        for(i=0;i<Lresponsavelbiblioteca.size();i++){
            rv=Lresponsavelbiblioteca.get(i);
            if (rv.getEmail().equals(r.getEmail()) ) {
                System.out.println("email ja utilizado");
                return 0;
            }
        }
        Lbiblioteca.add(b);
        Lresponsavelbiblioteca.add(r);
        return 0;

    }

}

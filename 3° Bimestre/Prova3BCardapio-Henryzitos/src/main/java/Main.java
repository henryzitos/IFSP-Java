import entity.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import java.util.List;

public class Main {
    //CardapioV1
    public static void main(String[] args) {
        Ingrediente i1 = new Ingrediente("Pão", 70.00, "g");
        Ingrediente i2 = new Ingrediente("Presunto",45.00 , "g");
        Ingrediente i3 = new Ingrediente("Queijo", 50.00, "g");
        Ingrediente i4 = new Ingrediente("Alface", 1.00, "g");

        Receita r1 = new Receita(10.00);
        Receita r2 = new Receita(12.50);
        Receita r3 = new Receita(15.00);
        r1.addIngredientes(i1);
        r2.addIngredientes(i1);
        r2.addIngredientes(i2);
        r2.addIngredientes(i3);
        r3.addIngredientes(i1);
        r3.addIngredientes(i2);
        r3.addIngredientes(i3);
        r3.addIngredientes(i4);

        Cardapio c = new Cardapio();
        c.addReceitas(r1);
        c.addReceitas(r2);
        c.addReceitas(r3);

        Evento e1 = new Evento("Festa do Pedrinho", 50.00);
        Evento e2 = new Evento("Festa da Julia", 25.00);
        e1.addCardapio(c);
        e2.addCardapio(c);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(i1);
        session.persist(i2);
        session.persist(i3);
        session.persist(i4);
        session.persist(r1);
        session.persist(r2);
        session.persist(r3);
        session.persist(c);
        session.persist(e1);
        session.persist(e2);

        transaction.commit();

        List<Ingrediente> ing = session.createQuery("from Ingrediente", Ingrediente.class).list();
        ing.forEach(aux -> System.out.println(aux));

        List<Receita> rec = session.createQuery("from Receita", Receita.class).list();
        rec.forEach(aux -> System.out.println(aux));

        List<Cardapio> car = session.createQuery("from Cardapio", Cardapio.class).list();
        car.forEach(aux -> System.out.println(aux));

        List<Evento> eve = session.createQuery("from Evento", Evento.class).list();
        eve.forEach(aux -> System.out.println(aux));
    }
}
import entity.Estudante;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Isabela", "Crestane", "isabelinha@gmail.com");
        Estudante e2 = new Estudante("Felipe", "Witkowsky", "fefaswit@gmail.com");
        Estudante e3 = new Estudante("Thur", "Lessa", "sadlythur@gmail.com");

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(e1);
        session.persist(e2);
        session.persist(e3);

        transaction.commit();

        List<Estudante> estudantes = session.createQuery("from Estudante", Estudante.class).list();

        estudantes.forEach(p -> System.out.println(p.toString()));
    }
}
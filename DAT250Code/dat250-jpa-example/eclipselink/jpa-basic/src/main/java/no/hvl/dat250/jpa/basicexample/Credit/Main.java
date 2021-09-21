package no.hvl.dat250.jpa.basicexample.Credit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Main {

    private static final String PERSISTENCE_UNIT_NAME = "credit";
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);


    public static void displayPersons(EntityManager em) {
        Query getAllPersons = em.createQuery("select p from Person p");
        List<Person> allPersons = getAllPersons.getResultList();
        for (Person p: allPersons) {
            System.out.println(p);
        }
    }


    public static void main(String[] args) {
        EntityManager em = factory.createEntityManager();

        displayPersons(em);

        em.getTransaction().begin();
        Person person = new Person();
        person.setName("Øystein Vikane");
        em.persist(person);
        em.getTransaction().commit();

        em.getTransaction().begin();
        Address address = new Address();
        address.setStreet("Rosenbergsgaten 11");
        em.persist(address);
        em.getTransaction().commit();


        em.getTransaction().begin();
        Pin pin = new Pin();
        pin.count = 10;
        em.persist(pin);
        em.getTransaction().commit();


        em.getTransaction().begin();
        Bank bank = new Bank();
        bank.bankname = "SPV";
        em.persist(bank);
        em.getTransaction().commit();

        em.getTransaction().begin();
        Card card = new Card();
        card.setBalance(1337);
        card.setLimit(696969);
        card.setNumber(1234);
        card.bank = bank;
        card.pin = pin;
        em.persist(card);
        em.getTransaction().commit();

        em.getTransaction().begin();
        person.setAddress(address);
        person.setCards(card);
        em.persist(person);
        em.getTransaction().commit();

    }
}

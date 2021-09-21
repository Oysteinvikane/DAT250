package no.hvl.dat250.jpa.basicexample.Credit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class creditMain {

    private static final String PERSISTENCE_UNIT_NAME = "credit";
    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

    public static void ListPersons(EntityManager em) {
        Query getAllPersons = em.createQuery("select p from Person p");
        List<Person> allPersons = getAllPersons.getResultList();
        for (Person p: allPersons) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        EntityManager em = factory.createEntityManager();

        ListPersons(em);

        em.getTransaction().begin();
        Person person = new Person();
        person.setName("Øystein Vikane");
        em.persist(person);
        em.getTransaction().commit();

        em.getTransaction().begin();
        Address address = new Address();
        address.addPerson(person);
        address.setStreet("Rosenbergsgaten");
        em.persist(address);
        em.getTransaction().commit();


        em.getTransaction().begin();
        PinCode pinCode = new PinCode();
        pinCode.count = 13;
        em.persist(pinCode);
        em.getTransaction().commit();


        em.getTransaction().begin();
        Bank bank = new Bank();
        bank.Name = "SPV";
        em.persist(bank);
        em.getTransaction().commit();

        em.getTransaction().begin();
        CreditCard card = new CreditCard();
        card.setBalance(420);
        card.setLimit(696969);
        card.setNumber(1337);
        card.bank = bank;
        card.pinCode = pinCode;
        em.persist(card);
        em.getTransaction().commit();

        em.getTransaction().begin();
        person.addAddress(address);
        person.addCreditCard(card);
        em.persist(person);
        em.getTransaction().commit();

    }
}
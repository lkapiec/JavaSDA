package sdajava20190113.lenic.eu;

public class TestEmployee {

    public static void main(String...args)
    {
        Employer pracodawca1 = new Employer("Olaf", "Lubaszenko", "Filmy S.A");
        Employer pracodawca2 = new Employer("Krystyna", "Janda", "Teatr S.A");

        Employee pracownik1 = new Employee("Jan", "Kowalski", 13000, pracodawca1);
        Employee pracownik2 = new Employee("Albin", "Kolano", 3000, pracodawca1);


        System.out.println("Wyplata: " +  pracownik2.calcSalary());
        System.out.println("Pracodawca: " + pracownik2.getEmployer().getCompanyName());
    }
}

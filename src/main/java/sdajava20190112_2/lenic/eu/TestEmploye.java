package sdajava20190112_2.lenic.eu;

public class TestEmploye {

    public static void main(String...args){

        Employer pracownik1 = new Employer("Jan","Nowak","SDA");


        System.out.println(pracownik1.getImie() + " " + pracownik1.getNazwisko() + " " + pracownik1.getCompanyName());

       // Iemp pracownik2 = new Employer("Andrzej","Kowalski","SDA");

//        System.out.println(pracownik2.getImie() + " " + pracownik2.getNazwisko() + " " + pracownik2.getCompanyName());

    }
}

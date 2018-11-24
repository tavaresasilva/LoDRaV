import contract.IPerson;
import contract.IFakeObject;

public class Program {

    public static void main(String args[]){

        var Output = System.out;

        IPerson person = IFakeObject.createAPerson();

        //Exemple 1: Violate the Demeter Law
        System.out.println(person.getHouse().getAddress().getZipCode());

        //Exmple 2: Not Violate the Demeter Law
        Output.println(person.getZipCode());
    }
}

import contract.IPerson;
import contract.IFakeObject;

public class Program {

    public static void main(String[] args){

        IPerson person = IFakeObject.createAPerson();

        //Exemple 1: Violate the Demeter Law
        System.out.println(person.getHouse().getAddress().getZipCode());

        //Prevents the Train Wreck
        var Output = System.out;

        //Exmple 2: Not Violate the Demeter Law
        Output.println(person.getZipCode());
    }
}

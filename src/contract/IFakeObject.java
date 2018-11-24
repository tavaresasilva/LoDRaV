package contract;

import domain.*;

public interface IFakeObject {

    public static IAddress createAnAddress(){

        IAddress address = new Address(
                "56565656",
                "1456",
                "Rua da Aurora",
                "Recife",
                "Pernambuco",
                "Brasil"

        );

        return address;
    };

    public static IHouse createAHouse(){
        IHouse house = new House(
                createAnAddress(),
                "Yellow",
                125.7
        );

        return house;
    };

    public static IPerson createAPerson(){
        IPerson person = new Person(
                "Alexandre Tavares",
                createAHouse()
        );

        return person;
    };
}

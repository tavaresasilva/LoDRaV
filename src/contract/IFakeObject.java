package contract;

import domain.*;

public interface IFakeObject {

    static IAddress createAnAddress(){

        return new Address(

                "56565656",
                "1456",
                "Rua da Aurora",
                "Recife",
                "Pernambuco",
                "Brasil"
        );
    }

    static IHouse createAHouse(){

        return new House(

                createAnAddress(),
                "Yellow",
                125.7
        );
    }

    static IPerson createAPerson(){

        return new Person(

                "Alexandre Tavares",
                createAHouse()
        );
    }
}

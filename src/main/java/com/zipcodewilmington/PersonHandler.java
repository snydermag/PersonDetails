package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        StringBuilder result = new StringBuilder();
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        while (counter < personArray.length) {
            // begin loop

            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[counter];
            // get `string Representation` of `currentPerson`
            String stringRepresentation = currentPerson.toString();

            // append `stringRepresentation` to `result` variable
            result.append(stringRepresentation);

            counter++;

            // end loop
        }
        return result.toString();
    }



    public String forLoop() {
        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < personArray.length; i++){
            Person currentPerson = personArray[i];
            String stringRepresentation = currentPerson.toString();
            result.append(stringRepresentation);
        }



        return result.toString();
    }



    public String forEachLoop() {
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        StringBuilder result = new StringBuilder();

        for (Person person : personArray){
            String stringRepresentation = person.toString();
            result.append(stringRepresentation);
        }

        return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}

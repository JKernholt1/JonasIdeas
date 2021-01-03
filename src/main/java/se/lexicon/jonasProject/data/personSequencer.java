package se.lexicon.jonasProject.data;

public class personSequencer {

    private static int personId;

    public personSequencer(int personId){
        this.personId = personId;

    }

    public static int nextPersonId(){
        personId = ++personId;
        return personId;
    }

    public static int resetPerson(){
        personId = 0;

        return personId;
    }


}

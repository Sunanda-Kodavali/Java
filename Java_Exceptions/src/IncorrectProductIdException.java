public class IncorrectProductIdException extends Exception{
    private long incorrectNumber;

    public IncorrectProductIdException(long incorrectNumber) {
        this.incorrectNumber = incorrectNumber;
    }

    @Override
    public String getMessage(){
        return "There is an incorrect number " + incorrectNumber;
    }


}

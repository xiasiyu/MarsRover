public class CommandIntercepter {
    private String inputCommand;
    private Command commandType;

    public void getInput(String input) {
        this.inputCommand = input;
        if(inputCommand.charAt(0) > '0' &&inputCommand.charAt(0) < '9' && inputCommand.length() < 4){
            this.commandType = Command.FIXMAP;
        }
        else if(inputCommand.charAt(0) > 'A' && inputCommand.charAt(0) < 'Z'){
            this.commandType = Command.MOVE;
        }
        else{
            this.commandType = Command.CREATE;
        }
    }

    public String getCommandInfo() {
        return this.inputCommand;
    }


    public Command getCommandType() {
        return this.commandType;
    }
}

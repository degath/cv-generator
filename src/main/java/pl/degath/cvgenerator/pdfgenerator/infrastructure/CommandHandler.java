package pl.degath.cvgenerator.pdfgenerator.infrastructure;

public interface CommandHandler<T extends Command> {
    void handle(T command) throws Exception;
}

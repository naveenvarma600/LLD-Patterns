package LLD.JavaConcurrency;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;


@Getter
@Setter
public class State {
    private PrinterType nextToPrint;

    public State(@NonNull final PrinterType nextToPrint) {
        this.nextToPrint = nextToPrint;
    }
}

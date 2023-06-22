import lombok.Data;
import strategies.IInputStrategy;

@Data
public class InputReader {
    private IInputStrategy strategy;

//    public int requestInt(){
//        return strategy.getInt();
//    }
    public String requestString(){
        return strategy.getString();
    }
    public double requestDouble(){
        return strategy.getDouble();
    }

    public void setStrategy(IInputStrategy strategy) {
        if (this.strategy != null) {
            this.strategy.close();
        }
        this.strategy = strategy;
    }
}

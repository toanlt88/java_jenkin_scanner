package Hello;

import java.util.logging.Logger;

public class HelloWord {
    private static final Logger logger = Logger.getLogger(HelloWord.class.getName());
    public static void main(String[] args) {
        logger.info("Hello word");
    }
}

package baseball.io;

import baseball.validator.UserInputValidator;
import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class Input {

    public List<Integer> userNumberInput() {
        String userNumberInput = Console.readLine();
        UserInputValidator.validateIsNumberAndRange(userNumberInput);
        UserInputValidator.validateLength(userNumberInput);
        UserInputValidator.validateDuplicate(userNumberInput);

        return Arrays.stream(userNumberInput.split("")).map(Integer::parseInt).toList();
    }

    public String finishOrRestartInput() {
        String userInput = Console.readLine();
        UserInputValidator.validateFinishOrRestart(userInput);

        return userInput;
    }
}

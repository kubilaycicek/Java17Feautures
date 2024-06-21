package org.kubilaycicek.switchCase;

public class SwitchCase {
    private static void improvedSwitch(Fruit fruit) {
        String text = switch (fruit) {
            case APPLE, PEAR -> {
                System.out.println("the given fruit was: " + fruit);
                yield "Common fruit";
            }
            case ORANGE, AVOCADO -> "Exotic fruit";
            default -> "Undefined fruit";
        };
        System.out.println(text);
    }
}

enum Fruit {
    APPLE, PEAR, ORANGE, AVOCADO
}

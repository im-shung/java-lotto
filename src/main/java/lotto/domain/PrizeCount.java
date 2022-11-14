package lotto.domain;

import java.util.HashMap;
import java.util.Map;

public class PrizeCount {

    private final Map<Prize, Integer> items = new HashMap<>();

    public PrizeCount() {
        for (Prize prize : Prize.values()) {
            items.put(prize, 0);
        }
    }

    public void addPrizeCount(Prize prize) {
        items.put(prize, items.get(prize) + 1);
    }

    public int getTotalPrizeMoney(Prize prize) {
        return prize.getMoney() * items.get(prize);
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();

        for (Prize prize : Prize.values()) {
            message.append(prize).append(" - ").append(items.get(prize)).append("개").append("\n");
        }

        return message.toString();
    }
}

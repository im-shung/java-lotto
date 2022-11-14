package lotto.view;

import java.util.List;
import lotto.domain.Lotto;

public class OutputView {

    public static void askPurchaseAmount(){
        System.out.println("구입금액을 입력해 주세요.");
    }

    public static void askNumbers(){
        System.out.println("당첨 번호를 입력해 주세요.");
    }

    public static void askBonusNumber(){
        System.out.println("보너스 번호를 입력해 주세요.");
    }

    public static void printWinningStatisticsMessage(){
        System.out.println("당첨 통계");
        System.out.println("--");
    }

    public static void printLottos(List<Lotto> lottos) {
        lottos.forEach(System.out::println);
    }
}

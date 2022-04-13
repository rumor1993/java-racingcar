package car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import step4.Dice;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RacingTest {

    @Test
    void 랜덤_한_숫자_0에서_9사이_값을_구한다() {
        Matcher matcher = Pattern.compile("[0-9]").matcher(String.valueOf(Dice.roll()));
        Assertions.assertThat(matcher.find()).isTrue();
    }

    @Test
    void 랜덤_값에서_4이상_인_경우_전진한다() {
        Car car = new Car("pobi");
        Assertions.assertThat(car.move(4)).isEqualTo("-");
    }

    @Test
    void 랜덤_값에서_4미만_인_경우_멈춘다() {
        Car car = new Car("pobi");
        Assertions.assertThat(car.move(2)).isEqualTo("");
    }
}


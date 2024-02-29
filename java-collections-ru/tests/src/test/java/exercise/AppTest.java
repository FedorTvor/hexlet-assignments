package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        var listTest = List.of(1, 2, 3, 4);
        var expected = App.take(listTest, 2);
        var actual = List.of(1, 2);
        assertThat(expected).isNotEmpty()
                .isEqualTo(actual)
                .contains(1, 2)
                .hasSize(actual.size());
        // END
    }
}

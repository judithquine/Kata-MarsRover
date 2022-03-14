package com.example.marsrover;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class MarsRoverApplicationTests {

    @Test
    void roverSpinLeft() {
        Rover rover = new Rover(1, 2, "L");
        assertThat(rover.getDirection(), equalTo("E"));

    }

}
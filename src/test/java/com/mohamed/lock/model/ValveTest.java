package com.mohamed.lock.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class ValveTest {
    Valve valve;

    @BeforeEach
    void setUp(){
        valve = new Valve();
    }

    @Nested
    class Constructor {

        @Test
        void shouldBeClosedByDefault() {
            assertEquals(0.0, valve.getOpening(), 1e-9);
            assertFalse(valve.isOpen());
        }
    }


    @Nested
    class SetOpening {

        @Nested
        class WhenOpeningIsPositiveAndInferiorOrEqualToOne {
            
            @Test
            void shouldBeValid(){
                valve.setOpening(0.5);
                assertEquals(0.5, valve.getOpening(), 1e-9);
            }
        }

        @Nested
        class WhenOpeningIsNegative {

            @Test
            void shouldBeInvalid(){
                assertThrows(IllegalArgumentException.class, () -> {
                    valve.setOpening(-0.1);
                });
            }
        }

        @Nested
        class WhenOpeningIsSuperiorToOne {

           @Test
            void shouldBeInvalid(){
                assertThrows(IllegalArgumentException.class, () -> {
                    valve.setOpening(1.1);
                });
            } 
        }
    }

    @Nested
    class GetOpening {

        @Test
        void shouldReturnTheCurrentOpeningLevel(){
            valve.setOpening(0.5);

            assertEquals(0.5, valve.getOpening(), 1e-9);
        }
    }


    @Nested
    class IsOpen {

        @Nested
        class WhenOpeningIsPositive {

            @Test
            void shouldReturnTrue(){
                valve.setOpening(0.5);

                assertTrue(valve.isOpen());
            }
        }

        @Nested
        class WhenOpeningIsNull {
            
            @Test
            void shouldReturnFalse(){
                valve.setOpening(0.0);

                assertFalse(valve.isOpen());
            }
        }
    }
}

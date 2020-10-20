package org.joeltong.app;

import static com.greghaskins.spectrum.Spectrum.afterEach;
import static com.greghaskins.spectrum.Spectrum.beforeAll;
import static com.greghaskins.spectrum.Spectrum.describe;
import static com.greghaskins.spectrum.Spectrum.it;

import com.greghaskins.spectrum.Spectrum;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.CoreMatchers.*;
import org.junit.runner.RunWith;

@RunWith(Spectrum.class)
public class CarTest {{

  describe("Car", () -> {

    describe("#Car()", () -> {
      describe("when the number of wheels is passed", () -> {

        Car car = new Car(4);
        int actual = car.getNumWheels();

        it("should have 4 wheels", () ->
          assertThat(actual, equalTo(4))
        );
      });
    });

    describe("#getNumWheels()", () -> {
      describe("when called", () -> {

        Car car = new Car(4);
        int actual = car.getNumWheels();

        it("should return the instantiated number of wheels", () ->
            assertThat(actual, equalTo(4))
        );
      });
    });

  });
}}



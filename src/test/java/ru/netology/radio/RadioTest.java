package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldRadio(){
        Radio radio = new Radio();
    }

    @Test
    public void shouldSetStation(){
        Radio radio = new Radio(0, 9, 5, 0, 100, 30);

        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationBelowPossible(){
        Radio radio = new Radio(0,9,-1, 0, 100, 30);

        Assertions.assertEquals(0, radio.getFirstStation());
    }

    @Test
    public void shouldSetStationAbovePossible(){
        Radio radio = new Radio(0,9, 10, 0, 100, 30);

        Assertions.assertEquals(0, radio.getFirstStation());
    }


    @Test
    public void shouldNextFirstStation(){
        Radio radio = new Radio(0,9,0, 0, 100, 30);

        radio.nextStation();

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldNextLastStation(){
        Radio radio = new Radio(0,9,9, 0, 100, 30);

        radio.nextStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void shouldPrevFirstStation(){
        Radio radio = new Radio(0,9,0, 0, 100, 30);

        radio.prevStation();

        Assertions.assertEquals(9, radio.getLastStation() );
    }

    @Test
    public void shouldPrevLastStation(){
        Radio radio = new Radio(0,9,9, 0, 100, 30);

        radio.prevStation();

        Assertions.assertEquals(8, radio.getCurrentStation());
    }


    @Test
    public void shouldSetVolume(){
        Radio radio = new Radio(0,9,9, 0, 100, 6);

        Assertions.assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeAbovePossible(){
        Radio radio = new Radio(0,9,9, 0, 100, 101);

        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldSetBelowPossible(){
        Radio radio = new Radio(0,9,9, 0, 100, -1);

        Assertions.assertEquals(0, radio.getMinVolume());
    }

    @Test public void shouldIncreaseMinVolume(){
        Radio radio = new Radio(0,9,9, 0, 100, 99);

        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume(){
        Radio radio = new Radio(0,9,9, 0, 100, 101);

        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldDecreaseMaxVolume() {
        Radio radio = new Radio(0,9,9, 0, 100, 7);

        radio.decreaseVolume();

        Assertions.assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMinVolume() {
        Radio radio = new Radio(0,9,9, 0, 100, -1);

        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getMinVolume());
    }

}

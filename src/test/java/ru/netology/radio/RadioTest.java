package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldRadio() {
        Radio radio = new Radio();
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio(10);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetFirstStation(){
        Radio radio = new Radio(10);;

        Assertions.assertEquals(0, radio.getFirstStation());
    }

    @Test
    public void shouldSetLastStation(){
        Radio radio = new Radio(10);

        Assertions.assertEquals(9, radio.getLastStation());
    }

    @Test
    public void shouldSetStationBelowPossible(){
        Radio radio = new Radio(10);

        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldSetStationAbovePossible(){
        Radio radio = new Radio(10);

        radio.setCurrentStation(10);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextFirstStation(){
        Radio radio = new Radio(10);

        radio.setCurrentStation(0);
        radio.nextStation();

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldNextLastStation(){
        Radio radio = new Radio(10);

        radio.setCurrentStation(9);
        radio.nextStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevFirstStation(){
        Radio radio = new Radio(10);

        radio.setCurrentStation(0);
        radio.prevStation();;

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevLastStation(){
        Radio radio = new Radio(10);

        radio.setCurrentStation(9);
        radio.prevStation();

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldSetVolume(){
        Radio radio = new Radio(10, 50);

        Assertions.assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMinVolume(){
        Radio radio = new Radio(20, 80);

        Assertions.assertEquals(20, radio.getMinVolume());
    }

    @Test
    public void shouldSetMaxVolume(){
        Radio radio = new Radio(20, 80);

        Assertions.assertEquals(80, radio.getMaxVolume());
    }

    @Test
    public void shouldSetVolumeAbovePossible(){
        Radio radio = new Radio(0, 100);

        radio.setCurrentVolume(101);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetBelowPossible(){
        Radio radio = new Radio(0, 100);

        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMinVolume(){
        Radio radio = new Radio(0, 100);

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume(){
        Radio radio = new Radio(0, 100);

        radio.setCurrentVolume(101);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMaxVolume() {
        Radio radio = new Radio(0, 100);

        radio.setCurrentVolume(70);
        radio.decreaseVolume();

        Assertions.assertEquals(69, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMinVolume() {
        Radio radio = new Radio(0, 100);

        radio.setCurrentVolume(-1);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}

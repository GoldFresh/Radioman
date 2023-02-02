package ru.netology.radio;

public class Radio {
    private int firstStation = 0;
    private int lastStation = 9;
    private int currentStation;


    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int firstStation, int lastStation, int currentStation, int minVolume, int maxVolume, int currentVolume){
        this.firstStation = firstStation;
        this.lastStation  = lastStation;
        this.currentStation = currentStation;

        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation(){
        return currentStation;
    }

    public int getFirstStation(){
        return firstStation;
    }

    public int getLastStation(){
        return lastStation;
    }

    public void setCurrentStation(int currentStation){
        if (currentStation > lastStation){
            return;
        }
        if (currentStation < firstStation){
            return;
        }
        this.currentStation = currentStation;
    }

    public void setFirstStation(int firstStation){
        this.firstStation = firstStation;
    }

    public void setLastStation(int lastStation){
        this.lastStation = lastStation;
    }

    public void nextStation(){
        if (currentStation >= lastStation){
            setCurrentStation(firstStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prevStation(){
        if (currentStation <= firstStation){
            setCurrentStation(lastStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume(){
        return currentVolume;
    }

    public int getMinVolume(){
        return minVolume;
    }

    public int getMaxVolume(){
        return maxVolume;
    }

    public void setCurrentVolume(int currentVolume){
        if (currentVolume > maxVolume){
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume){
            currentVolume = minVolume ;
        }
        this.currentVolume = currentVolume;
    }

    public void setMinVolume(int minVolume){
        this.minVolume = minVolume;
    }

    public void setMaxVolume(int maxVolume){
        this.maxVolume = maxVolume;
    }

    public void increaseVolume(){
        if (currentVolume >= maxVolume){
           setCurrentVolume(maxVolume);
        } else {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void decreaseVolume(){
        if (currentVolume <= minVolume){
            setCurrentVolume(minVolume);
        } else {
            setCurrentVolume(currentVolume - 1);
        }
    }

}

package ru.netology.radio;

public class Radio {
    public int currentStation;
    public int firstStation;
    public int lastStation;

    public int currentVolume;
    public int minVolume;
    public int maxVolume;

    public int getCurrentStation(){
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation){
        lastStation = 9;
        firstStation = 0;

        if (newCurrentStation > lastStation){
            return;
        }
        if (newCurrentStation < firstStation){
            return;
        }
        currentStation = newCurrentStation;
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

    public void setCurrentVolume(int newCurrentVolume){
        maxVolume = 10;
        minVolume = 0;

        if (newCurrentVolume > maxVolume){
            newCurrentVolume = maxVolume;
        }
        if (newCurrentVolume < minVolume){
            newCurrentVolume = minVolume ;
        }
        currentVolume = newCurrentVolume;
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




















    //public int getCurrentStation(){
    //    return currentStation;
    //}

   // public void setCurrentStation(int newCurrentStation){

    //    if (newCurrentStation <= 9){
    //        return;
    //    }
    //    if (newCurrentStation >= 0){
    //        return;
    //    }
    //    currentStation = newCurrentStation;
    //}

    //public void  setCurrentStation(int newCurrentStation) {
    //    currentStation = newCurrentStation;
    //    int next;
    //    for (int i = 0; i < 9; i++){
    //        if (newCurrentStation >= i){
    //           next = i++;
    //        }
    //        if (newCurrentStation )
    //    };
    //}

    //public void setToLastStation(){
    //    currentStation = 9;
    //}

    //public void setToFirstStation(){
    //    currentStation = 0;
    //}

    //public void increaseStation() {
    //    if (currentStation < 9) {
    //        currentStation = currentStation + 1;
    //    }
    //}

}

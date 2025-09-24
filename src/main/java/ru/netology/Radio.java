package ru.netology;

public class Radio {
    private static final int MAX_STATION = 9;
    private static final int MAX_VOLUME = 10;
    private static final int MIN_STATION = 0;
    private static final int MIN_VOLUME = 0;
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation > MAX_STATION) {
            return;
        }

        if (newStation < MIN_STATION) {
            return;
        }

        currentStation = newStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume > MAX_VOLUME) {
            return;
        }

        if (newVolume < MIN_VOLUME) {
            return;
        }

        currentVolume = newVolume;
    }


    public void next() {
        if (currentStation < MAX_STATION) {
            currentStation = currentStation + 1;
        } else {
            currentStation = MIN_STATION;
        }
    }

    public void prev() {
        if (currentStation > MIN_STATION) {
            currentStation = currentStation - 1;
        }
        else {
            currentStation = MAX_STATION;
        }
    }


    public void increaseVolume() {
        if (currentVolume < MAX_VOLUME) {
          currentVolume = currentVolume + 1;
        }
        else {
            currentVolume = MAX_VOLUME;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > MIN_VOLUME) {
          currentVolume = currentVolume - 1;
        }
        else {
            currentVolume = MIN_VOLUME;
        }
    }
}

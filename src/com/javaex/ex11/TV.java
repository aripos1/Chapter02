package com.javaex.ex11;

public class TV {

    private int channel;
    private int volume;
    private boolean power;
    private static final int min = 1;
    private static final int max = 255;
    
    public TV(int channel, int volume, boolean power) {
        this.channel = channel;
        this.volume = volume;
        this.power = power;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getPower() {
        return power;
    }

    public void power(boolean on) {
        this.power = on;
    }

    public void channel(int channel) {
        if (channel >= min && channel <= max) {
            this.channel = channel;
        }
    }

    public void channel(boolean up) {
        if (up) {
            if (channel < max) {
                channel++;
            } else {
                channel = min;
            }
        } else {
            if (channel > min) {
                channel--;
            } else {
                channel = max;
            }
        }
    }

    public void volume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }else if(volume >= 100) {
        	this.volume = 100;
        }
    }

    public void volume(boolean up) {
        if (up) {
            if (volume < 100) {
                volume++;
            }
        } else {
            if (volume > 0) {
                volume--;
            }
        }
    }

    public void status() {
        System.out.println("파워: " + power + " 채널: " + channel + " 볼륨: " + volume);
    }
}
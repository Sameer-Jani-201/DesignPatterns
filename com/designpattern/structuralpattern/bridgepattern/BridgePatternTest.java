package com.designpattern.structuralpattern.bridgepattern;

public class BridgePatternTest {
    public static void main(String[] args) {
        Remote oldRemote = new OldRemote();
        Remote newRemote = new NewRemote();
        TV sonyTVWithOldRemote = new SonyTv(oldRemote);
        sonyTVWithOldRemote.on();
        sonyTVWithOldRemote.off();
        System.out.println();

        TV sonyTvWithNewRemote = new SonyTv(newRemote);
        sonyTvWithNewRemote.on();
        sonyTvWithNewRemote.off();
        System.out.println();

        TV phillipsTvWithOldRemote = new PhillipsTV(oldRemote);
        phillipsTvWithOldRemote.on();
        phillipsTvWithOldRemote.off();
        System.out.println();

        TV phillipsTvWithNewRemote = new PhillipsTV(newRemote);
        phillipsTvWithNewRemote.on();
        phillipsTvWithNewRemote.off();
        System.out.println();

    }
}

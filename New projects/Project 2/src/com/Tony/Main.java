package com.Tony;

public class Main {

    public static void main(String[] args) {
        
        int myValue = 10000;

        int myMinIntvalue = Integer.MIN_VALUE;
        int myMaxIntvalue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value =" + myMinIntvalue);
        System.out.println("Integer Maximum Value =" + myMaxIntvalue);
        System.out.println("Busted MAX value = " + (myMaxIntvalue + 1));
        System.out.println("Busted MIN Value = " + (myMinIntvalue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value=" + myMaxByteValue);
        System.out.println("Byte Maximum Value="+ myMinByteValue);
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value=" + myMaxShortValue);
        System.out.println("Short Maximum Value="+ myMinShortValue);
        
         long myLongvalue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value=" + myMaxLongValue);
        System.out.println("Long Maximum Value="+ myMinLongValue);
        long bigLongLiteralValue = 2_147_483_647L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntvalue / 2);

        byte myNewByteValue = (byte) (myMinByteValue /2);

        short myNewShortValue = (short) (myMinShortValue /2);

    }
}   
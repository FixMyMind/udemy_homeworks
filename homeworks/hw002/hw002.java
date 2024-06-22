package hw002;

public class hw002 {
    public static void main(String[] args) {
        byte bDec = 12;
        byte bOct = 0_14;
        byte bBin = 0b1100;
        byte bHex = 0xC;
        System.out.println(bDec);
        System.out.println(bOct);
        System.out.println(bBin);
        System.out.println(bHex);

        short sDec = 1300;
        short sOct = 0_2424;
        short sBin = 0b0101_0001_0100;
        short sHex = 0x514;
        System.out.println(sDec);
        System.out.println(sOct);
        System.out.println(sBin);
        System.out.println(sHex);

        int iDec = 0;
        int iOct = 0_0;
        int iBin = 0b0;
        int iHex = 0x0;
        System.out.println(iDec);
        System.out.println(iOct);
        System.out.println(iBin);
        System.out.println(iHex);

        long lDec = 123_456_789L;
        long lOct = 0_726_746_425L;
        long lBin = 0b0111_0101_1011_1100_1101_0001_0101L;
        long lHex = 0x75B_CD15L;

        System.out.println(lDec);
        System.out.println(lOct);
        System.out.println(lBin);
        System.out.println(lHex);

        float fOne = 3.14f;
        float fTwo = -3.14F;
        System.out.println(fOne);
        System.out.println(fTwo);

        double dOne = 5.7777d;
        double dTwo = -5.7777;
        System.out.println(dOne);
        System.out.println(dTwo);

        boolean bOne = true;
        boolean bTwo = false;
        System.out.println(bOne);
        System.out.println(bTwo);

        char cOne = 'A';
        char cTwo = 500;
        char cThree = '\u0500';
        System.out.println(cOne);
        System.out.println(cTwo);
        System.out.println(cThree);
    }
}

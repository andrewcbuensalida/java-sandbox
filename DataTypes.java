public class DataTypes {
  public static void main(String[] args) {
    // primitives
    byte byte1 = 100; // byte is 8 bits, aka -2^7 to 2^7-1, aka -127 to 127
    // to typecast, prefix value with (type). This is explicit conversion
    int int1 = 20;
    byte1 = (byte) int1;
    System.out.println(byte1);
    // implicit conversion is when java assumes you're trying to convert something with a smaller range into a bigger range
    byte byte2 = 10;
    int int2 = byte2;
    System.out.println(int2);
    // int is 4 bytes,
    // long is 8 bytes, suffix with l
    // short 2 bytes
    // float 4 bytes less precision than double. You have to explicitly tell java that it is a float. can't just assign float num = 1.2; Have to put 1.2f
    // double 8 bytes. this is default rather than float
    // char have to use single quotes. 2 bytes
    // boolean true or false, not 0 or 1
    }
}

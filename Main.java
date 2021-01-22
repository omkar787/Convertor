package Converter;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
	    int ch;
        while(true) {
            System.out.println("\n");
            System.out.println("1.bit to bytes");
            System.out.println("2.bytes to kb");
            System.out.println("3. kb to mb");
            System.out.println("4. mb to gb");
            ch = in.nextInt();
            switch (ch) {
                case 1 -> {
                    Calculate one = () -> {
                        System.out.print("Enter the value in bits : ");
                        double temp = in.nextShort();
                        if (temp < 8) {
                            System.out.println("" +
                                    "" +
                                    "Enter a number more than 8");
                            return 0;
                        } else
                            temp = temp / 8.0;

                        return temp;
                    };
                    double tp = one.cal();
                    if(tp == 0.0){}
                    else
                        System.out.println(df.format(tp) + " Bytes");
                }
                case 2 -> {
                    Calculate two = () -> {
                        System.out.print("Enter the value in bytes(1 kb = 1024 bytes) : ");
                        double temp1 = in.nextDouble();
                        temp1 = temp1 / 1024;
                        return temp1;
                    };
                    double t = two.cal();
                    System.out.println(df.format(t) + " KiloBytes");
                }

                case 3 -> {
                    Calculate three = () -> {
                        System.out.print("Enter the value in kb : ");
                        double temp2 = in.nextDouble();
                        temp2 = temp2 / 1024;
                        return temp2;
                    };
                    double t = three.cal();
                    System.out.println(df.format(t) + " Megabytes");
                }

                case 4 ->{
                    Calculate four = () -> {
                        System.out.print("Enter the value in mb : ");
                        double temp3 = in.nextDouble() / 1024;
                        return temp3;
                    };
                    double t = four.cal();
                    System.out.println(df.format(t) + " Gigabytes");
                }

                default -> throw new IllegalStateException("Unexpected value: " + ch);
            }
        }




    }
}

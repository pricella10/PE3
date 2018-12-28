package com.stackroute.javape3;



public class Exception8 {





    public String negativeArray() {



        String str = "";

        try {



            String string="Hai Chandu";

            char[] charArray1 ;

            char[] charArray2 = new char[-10];

            charArray1 = string.toCharArray();

            for (int i = 0; i < string.length(); i++) {

                charArray2[i] = charArray1[i];

            }

        } catch (NegativeArraySizeException n) {

            str = n.getClass().toString();

            System.out.println(n.getClass());

            return str;

        }



        return null;

    }



    public String indexOutOfBoundArray() {

        String string="Hai Chandu";

        char[] charArray1 = new char[string.length()];

        char[] charArray2 = new char[string.length()];

        String str = "";

        charArray1 = string.toCharArray();

        try {

            for (int i = 0; i <= string.length(); i++) {

                charArray2[i] = charArray1[i];

            }

        } catch (IndexOutOfBoundsException i) {

            str=i.getClass().toString();

            System.out.println(i.getClass());

            return str;

        }

        return null;

    }





    public String nullPointerException() {

        String string="Hai Chandu";

        String str = null;

        try {

            if (str.equals(string)){

                System.out.println("equal");

            }

            else{

                System.out.println("not equal");

            }

        } catch (NullPointerException n) {

            str=n.getClass().toString();

            System.out.println(n.getClass());

            return str;

        }

        return null;

    }



}
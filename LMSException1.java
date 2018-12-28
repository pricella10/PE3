package com.stackroute.javape3;



public class LMSException1 {



    private int numStud;

    public LMSException1(int  numStud) {

        this.numStud=numStud;

    }





    public String studentMarks(int[] marks){



        System.out.println("Number of Students: "+ numStud);

        String s;

        try {

            for (int d : marks) {

                if (d >= 0 && d <= 100) {



                } else {

                    throw new MarksOutOfBound("Marks should lie between 0 to 100");

                }

            }

        }catch(MarksOutOfBound m){

            System.out.println(m.getMessage());

            return m.getMessage();

        }finally {

            s="Marks are between 0 to 100";

        }



        return s;



    }



}
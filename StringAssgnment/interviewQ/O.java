package StringAssgnment.interviewQ;

import java.util.ArrayList;

public class O {
    String fname;
    String lname;
    String DOB;

    O(String fname,String lname,String DOB){
        this.fname=fname;
        this.lname=lname;
        this.DOB=DOB;

    }
    public static void main(String[] args) {


        int id=0;
        O o1=new O("Suraj","K","14-5-87");
        O o2=new O("Mrinal","S","14-5-97");
        O o3=new O("Suraj","K","14-5-99");
        O o4=new O("Shivam","K","14-5-00");

        O ox[]={o1,o2,o3,o4};

        for (int i=0;i<ox.length;i++){
            System.out.print(++id+" ");
            System.out.print(ox[i].fname+" ");
            System.out.print(ox[i].lname+" ");
            System.out.print(ox[i].DOB+" ");
            System.out.println();
        }
    }
}

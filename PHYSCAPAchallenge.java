public class PHYSCAPAchallenge {
    public static void main(String[] args){
        double x=1;
        double v;
        int n=0;
        double t;
        double a;
        for(v=36;v>0;v-=0.03*(9.8+(0.000771*Math.pow(v,2))/0.142)){
            x+=v*0.03-0.5*(9.8+(0.000771*Math.pow(v,2))/0.142)*Math.pow(0.03,2);
            n++;
        }
        System.out.println("The maximum height is "+x);
        for(x=x;x>0;x-=v*0.03+0.5*(9.8-(0.000771*Math.pow(v,2))/0.142)*Math.pow(0.03,2)){
            n++;
            v+=0.03*(9.8-(0.000771*Math.pow(v,2))/0.142);
        }
        t=n*0.03;
        a=9.8-(0.000771*Math.pow(v,2))/0.142;
        System.out.println("The time that it is in the air is "+t);
        System.out.println("Its speed just before it hits the ground is "+v);
        System.out.println("Its acceleration when it hits the ground is "+a);
    }
}
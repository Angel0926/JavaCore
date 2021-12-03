package ClassWork.allLessons.lesson15.p2;

public class OtherPackage {
    OtherPackage() {
        ClassWork.allLessons.lesson15.p1.Protection p = new ClassWork.allLessons.lesson15.p1.Protection();
        System.out.println("kons iz drugovo paketa");
        //System.out.println("n= "+p.n);
        //System.out.println("n= "+p.n_pri);
        //System.out.println("n= "+p.n_pr0);
        System.out.println("n= "+p.n_pub);
    }

}

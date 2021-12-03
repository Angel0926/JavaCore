package ClassWork.allLessons.lesson12;

class Test {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    int a, b;
    Test(int i){

    }
void meth(Test p){
        p.a *=2;
        p.b /=2;
}
    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test o, Test c) {
        if (o.a == a && o.b == b && c.a == a && c.b == b) return true;
        else return false;
    }


}


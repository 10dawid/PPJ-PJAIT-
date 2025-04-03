package ppj24.Task2;

public class Frac {
    private int num;
    private int denum;

    @Override
    public String toString() {
        if (this.denum == 1){
            return " " + this.num;
        }
        else{
            if(this.num % this.denum == 0){
                int result = this.num / this.denum;
                return " " + result;
            }
            else if(gcd(this.num, this.denum) != 0){
                int gcd = gcd(this.num, this.denum);
                return" "  + this.num / gcd + "/" + this.denum / gcd;
            }

            return " " + this.num + "/" + this.denum;
        }

    }

    // Constructors
    public Frac(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }
    public Frac(int num) {
        this.num = num;
        this.denum = 1;
    }
    public Frac() {
        this.num = 0;
        this.denum = 1;
    }


    // getters
    public int getNum() {
        return num;
    }
    public int getDenum() {
        return denum;
    }

    private int gcd(int a, int b){
        if (b == 0) return a;
        else return gcd(b, (a % b));
    }


    //non-static
    public Frac add(Frac other){
        if (this.denum == other.getDenum())
            return new Frac(this.getNum() + other.getNum(), this.denum);
        else{
            int commonDenum = this.getDenum() * other.getDenum();
            int numResult = this.num * other.getDenum() + other.getNum() * this.denum;
            return new Frac(numResult, commonDenum);
        }
    }
    public Frac sub(Frac other){
        if (this.denum == other.getDenum())
            return new Frac(this.getNum() - other.getNum(), this.denum);
        else{
            int commonDenum = this.getDenum() * other.getDenum();
            int numResult = this.num * other.getDenum() - other.getNum() * this.denum;
            return new Frac(numResult, commonDenum);
        }
    }
    public Frac mul( Frac other){
        return new Frac(this.num * other.getNum(), this.denum * other.getDenum());
    }
    public Frac div(Frac other){
        if (other.getDenum() == 0 && this.denum == 0) throw new ArithmeticException("cannot divide by 0");
        else{
            return new Frac(this.num * other.getDenum(), this.denum * other.getNum());
        }
    }


    //static
    public static Frac add(Frac a, Frac b){
        if(a.getDenum() == b.getDenum())
            return new Frac(a.getNum()+b.getNum(), a.getDenum());
        else{
            int commonDenum = a.getDenum() * b.getDenum();
            int numResult = a.getNum() * b.getDenum() + b.getNum() * a.getDenum();
            return new Frac(numResult, commonDenum);
        }
    }
    public static Frac sub(Frac a, Frac b){
        if(a.getDenum() == b.getDenum()){
            return new Frac(a.getNum() - b.getNum(), a.getDenum());
        }
        else{
            int commonDenum = a.getDenum() * b.getDenum();
            int numResult = a.getNum() * b.getDenum() - b.getNum() * a.getDenum();
            return new Frac(numResult, commonDenum);
        }
    }
    public static Frac mul(Frac a, Frac b){
        return new Frac(a.getNum() * b.getNum(), a.getDenum() * b.getDenum());
    }
    public static Frac div(Frac a, Frac b){
        if (b.getDenum() == 0 && a.getDenum() == 0) throw new ArithmeticException("cannot divide by 0");
        else{
            return new Frac(a.getNum() * b.getDenum(), a.getDenum() * b.getNum());
        }
    }
}

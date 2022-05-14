package javaeducation;
/*
Определение длины гипотенузы исходя из длины катетов,
по теореме пифагора.
 */
class hypot {

    public static void main(String[] args) {
        double x, y, z;
        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);
        System.out.println("Длина гипоетенузы: " + z);
        }
    }


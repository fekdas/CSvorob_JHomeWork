package constantine.svorob;

public class HomeWork61 {

    public static void main(String[] args) {
        int[] m1 = mgenerator(5);
        int[] m2 = mgenerator(3);
        int[] m3 = {0, 1, 2};
        int[] array = mplus(mplus(m1, m2), m3);
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }

    public static int[] mgenerator(int x) {
        int[] m01 = new int[x];
        for (int i = 0; i < m01.length; i++) {
            m01[i] = (int) ( Math.random() * x);
        }
        return m01;
    }

    public static int[] mplus(int[] a, int[] b) {
        int[] arrayplus = new int[a.length + b.length];
        System.arraycopy(a, 0, arrayplus, 0, a.length);
        System.arraycopy(b, 0, arrayplus, a.length, b.length);
        return arrayplus;
    }

}

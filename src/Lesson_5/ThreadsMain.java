package Lesson_5;

public class ThreadsMain extends Thread {
    static final int size = 10000000;
    public static float[] arr = new float[size];
    public static final int h = size / 2;
    //Половинки массива
    public static float[] a1 = new float[h];
    public static float[] a2 = new float[h];

    public static void main(String[] args) {
        ThreadsMain var1 = new ThreadsMain();
        ThreadsMain var2 = new ThreadsMain();
        ThreadsMain var3 = new ThreadsMain();

        var1.CalckArray_1(arr); // Один массив
        var2.CalckArray_2(arr); // Два массива в 1 поток
        var3.CalckArray_3(arr); // Два массива в 2 потока
    }

    public void CalckArray_1(float[] arr) {
        for (int i = 0; i < size; i++)
            arr[i] = (float) 1;
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = calck(arr[i], i);
        }
        System.out.println("\nОдин массив в 1 поток");
        System.out.println((float) (System.currentTimeMillis() - a) / 1000 + " sec Время работы с целым массивом");
    }

    public void CalckArray_2(float[] arr) {
        for (int i = 0; i < size; i++)
            arr[i] = (float) 1;
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        long b = System.currentTimeMillis();
        for (int i = 0; i < h; i++) {
            a1[i] = calck(a1[i], i);//a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        for (int i = 0; i < h; i++) {
            a2[i] = calck(a2[i], i);//a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long c = System.currentTimeMillis();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        long d = System.currentTimeMillis();

        System.out.println("\nДва массива в 1 поток");
        printRes( a, b, c, d);
    }

    public void CalckArray_3(float[] arr) {
        for (int i = 0; i < size; i++)
            arr[i] = (float) 1;
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        long b = System.currentTimeMillis();

        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
                t1.start();
                t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long c = System.currentTimeMillis();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        long d = System.currentTimeMillis();

        System.out.println("\nДва массива в 2 потока");
        printRes( a, b, c, d);
    }

    class MyThread1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < h; i++)
                a1[i] = calck(a1[i], i);
        }
    }

    class MyThread2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < h; i++)
                a2[i] = calck(a2[i], i);
        }
    }
// Повторяющиеся операции вынес в отдельные методы
    public float calck(float ai, int it){
        return ai = (float) (ai * Math.sin(0.2f + it / 5) * Math.cos(0.2f + it / 5) * Math.cos(0.4f + it / 2));
    }

    public void printRes(long a, long b, long c, long d) {
        System.out.println((float) (b - a) / 1000 + " sec - время деления массива на два");
        System.out.println((float) (c - b) / 1000 + " sec - время просчёта двух массивов");
        System.out.println((float) (d - c) / 1000 + " sec - время склейки массивов");
        System.out.println("-----------------------------------------");
        System.out.println((float) (d - a) / 1000 + " sec - полное время");
    }
}
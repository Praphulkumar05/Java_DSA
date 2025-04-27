
public class Grumpy_Customer {
    public static int grumphy(int crr[], int grr[], int time) {
        int n = crr.length;
        int PreS = 0;
        int MaxS = 0;
        int MaxSIdx = 0;
        for (int i = 0; i < time; i++) {
            if (grr[i] == 1) {
                PreS += crr[i];
            }
        }
        MaxS = PreS;
        int i = 1;
        int j = time;
        while (j < n) {
            int CurrS = PreS;
            if (grr[j] == 1)
                CurrS += crr[j];
            if (grr[i - 1] == 1)
                CurrS -= crr[i - 1];
            if (MaxS < CurrS) {
                MaxS = CurrS;
                MaxSIdx = i;
             

            }
            PreS=CurrS;
            i++;
            j++;

        }

        for (int p = MaxSIdx; p < MaxSIdx + time; p++) {
            grr[p] = 0;
        }
        int sum = 0;
        for (int h = 0; h < n; h++) {
            if (grr[h] == 0) {
                sum += crr[h];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int crr[] = { 1, 0, 1, 2, 1, 1, 7, 5 };
        int grr[] = { 0, 1, 0, 1, 0, 1, 0, 1 };
        int time = 3;
        System.out.println(grumphy(crr, grr, time));

    }

}

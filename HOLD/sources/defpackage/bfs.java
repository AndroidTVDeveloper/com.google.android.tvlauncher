package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bfs  reason: default package */
/* compiled from: PG */
final class bfs implements bdl {
    private final List a;
    private final int b;
    private final long[] c;
    private final long[] d;

    public bfs(List list) {
        this.a = list;
        int size = list.size();
        this.b = size;
        this.c = new long[(size + size)];
        for (int i = 0; i < this.b; i++) {
            bfm bfm = (bfm) list.get(i);
            int i2 = i + i;
            long[] jArr = this.c;
            jArr[i2] = bfm.p;
            jArr[i2 + 1] = bfm.q;
        }
        long[] jArr2 = this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public final List b(long j) {
        ArrayList arrayList = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = null;
        bfm bfm = null;
        for (int i = 0; i < this.b; i++) {
            long[] jArr = this.c;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                bfm bfm2 = (bfm) this.a.get(i);
                if (bfm2.e != -3.4028235E38f || bfm2.h != 0.5f) {
                    arrayList.add(bfm2);
                } else if (bfm == null) {
                    bfm = bfm2;
                } else if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) bks.a(bfm.b)).append((CharSequence) "\n").append((CharSequence) bks.a(bfm2.b));
                } else {
                    spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) bks.a(bfm2.b));
                }
            }
        }
        if (spannableStringBuilder != null) {
            bfl bfl = new bfl();
            bfl.c = spannableStringBuilder;
            arrayList.add(bfl.b());
        } else if (bfm != null) {
            arrayList.add(bfm);
        }
        return arrayList;
    }

    public final long a(int i) {
        boolean z = true;
        bks.a(i >= 0);
        if (i >= this.d.length) {
            z = false;
        }
        bks.a(z);
        return this.d[i];
    }

    public final int b() {
        return this.d.length;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean, boolean):int
     arg types: [long[], long, int, int]
     candidates:
      blm.a(long, alb, long, long):long
      blm.a(long[], long, boolean, boolean):int */
    public final int a(long j) {
        int a2 = blm.a(this.d, j, false, false);
        if (a2 >= this.d.length) {
            return -1;
        }
        return a2;
    }
}

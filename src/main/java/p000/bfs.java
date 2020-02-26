package p000;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bfs */
/* compiled from: PG */
final class bfs implements bdl {

    /* renamed from: a */
    private final List f3717a;

    /* renamed from: b */
    private final int f3718b;

    /* renamed from: c */
    private final long[] f3719c;

    /* renamed from: d */
    private final long[] f3720d;

    public bfs(List list) {
        this.f3717a = list;
        int size = list.size();
        this.f3718b = size;
        this.f3719c = new long[(size + size)];
        for (int i = 0; i < this.f3718b; i++) {
            bfm bfm = (bfm) list.get(i);
            int i2 = i + i;
            long[] jArr = this.f3719c;
            jArr[i2] = bfm.f3699p;
            jArr[i2 + 1] = bfm.f3700q;
        }
        long[] jArr2 = this.f3719c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f3720d = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: b */
    public final List mo1783b(long j) {
        ArrayList arrayList = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = null;
        bfm bfm = null;
        for (int i = 0; i < this.f3718b; i++) {
            long[] jArr = this.f3719c;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                bfm bfm2 = (bfm) this.f3717a.get(i);
                if (bfm2.f3410e != -3.4028235E38f || bfm2.f3413h != 0.5f) {
                    arrayList.add(bfm2);
                } else if (bfm == null) {
                    bfm = bfm2;
                } else if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) bks.m3507a(bfm.f3407b)).append((CharSequence) "\n").append((CharSequence) bks.m3507a(bfm2.f3407b));
                } else {
                    spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) bks.m3507a(bfm2.f3407b));
                }
            }
        }
        if (spannableStringBuilder != null) {
            bfl bfl = new bfl();
            bfl.f3691c = spannableStringBuilder;
            arrayList.add(bfl.mo1821b());
        } else if (bfm != null) {
            arrayList.add(bfm);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final long mo1781a(int i) {
        boolean z = true;
        bks.m3510a(i >= 0);
        if (i >= this.f3720d.length) {
            z = false;
        }
        bks.m3510a(z);
        return this.f3720d[i];
    }

    /* renamed from: b */
    public final int mo1782b() {
        return this.f3720d.length;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean, boolean):int
     arg types: [long[], long, int, int]
     candidates:
      blm.a(long, alb, long, long):long
      blm.a(long[], long, boolean, boolean):int */
    /* renamed from: a */
    public final int mo1780a(long j) {
        int a = blm.m3629a(this.f3720d, j, false, false);
        if (a >= this.f3720d.length) {
            return -1;
        }
        return a;
    }
}

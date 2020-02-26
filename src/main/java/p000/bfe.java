package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: bfe */
/* compiled from: PG */
final class bfe implements bdl {

    /* renamed from: a */
    private final bfb f3657a;

    /* renamed from: b */
    private final long[] f3658b;

    /* renamed from: c */
    private final Map f3659c;

    /* renamed from: d */
    private final Map f3660d;

    /* renamed from: e */
    private final Map f3661e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfb.a(java.util.TreeSet, boolean):void
     arg types: [java.util.TreeSet, int]
     candidates:
      bfb.a(java.lang.String, java.util.Map):android.text.SpannableStringBuilder
      bfb.a(java.util.TreeSet, boolean):void */
    public bfe(bfb bfb, Map map, Map map2, Map map3) {
        this.f3657a = bfb;
        this.f3660d = map2;
        this.f3661e = map3;
        this.f3659c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        bfb.mo1812a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f3658b = jArr;
    }

    /* renamed from: b */
    public final int mo1782b() {
        return this.f3658b.length;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.text.SpannableStringBuilder.delete(int, int):android.text.SpannableStringBuilder}
     arg types: [int, int]
     candidates:
      ClspMth{android.text.SpannableStringBuilder.delete(int, int):android.text.Editable}
      ClspMth{android.text.SpannableStringBuilder.delete(int, int):android.text.SpannableStringBuilder} */
    /* renamed from: b */
    public final List mo1783b(long j) {
        int i;
        int i2;
        long j2 = j;
        bfb bfb = this.f3657a;
        Map map = this.f3659c;
        Map map2 = this.f3660d;
        Map map3 = this.f3661e;
        ArrayList arrayList = new ArrayList();
        bfb.mo1808a(j2, bfb.f3625c, arrayList);
        TreeMap treeMap = new TreeMap();
        bfb.mo1810a(j, false, bfb.f3625c, treeMap);
        bfb.mo1809a(j2, map, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Pair pair = (Pair) arrayList.get(i3);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                bfc bfc = (bfc) map2.get(pair.first);
                arrayList2.add(new bdj(decodeByteArray, bfc.f3636b, bfc.f3637c, bfc.f3639e, bfc.f3640f, bfc.f3641g));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            bfc bfc2 = (bfc) map2.get(entry.getKey());
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) entry.getValue();
            int length = spannableStringBuilder.length();
            for (int i4 = 0; i4 < length; i4++) {
                if (spannableStringBuilder.charAt(i4) == ' ') {
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (i6 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i6) == ' ') {
                        i6++;
                    }
                    int i7 = i6 - i5;
                    if (i7 > 0) {
                        spannableStringBuilder.delete(i4, i4 + i7);
                        length -= i7;
                    }
                }
            }
            if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
                length--;
            }
            int i8 = 0;
            while (true) {
                i = length - 1;
                if (i8 >= i) {
                    break;
                }
                if (spannableStringBuilder.charAt(i8) == 10) {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == ' ') {
                        spannableStringBuilder.delete(i9, i8 + 2);
                        length = i;
                    }
                }
                i8++;
            }
            if (length > 0 && spannableStringBuilder.charAt(i) == ' ') {
                spannableStringBuilder.delete(i, length);
                length = i;
            }
            int i10 = 0;
            while (true) {
                i2 = length - 1;
                if (i10 >= i2) {
                    break;
                }
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    if (spannableStringBuilder.charAt(i11) == 10) {
                        spannableStringBuilder.delete(i10, i11);
                        length = i2;
                    }
                }
                i10++;
            }
            if (length > 0 && spannableStringBuilder.charAt(i2) == 10) {
                spannableStringBuilder.delete(i2, length);
            }
            arrayList2.add(new bdj(spannableStringBuilder, bfc2.f3637c, bfc2.f3638d, bfc2.f3639e, bfc2.f3636b, bfc2.f3640f, bfc2.f3642h, bfc2.f3643i));
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final long mo1781a(int i) {
        return this.f3658b[i];
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean, boolean):int
     arg types: [long[], long, int, int]
     candidates:
      blm.a(long, alb, long, long):long
      blm.a(long[], long, boolean, boolean):int */
    /* renamed from: a */
    public final int mo1780a(long j) {
        int a = blm.m3629a(this.f3658b, j, false, false);
        if (a >= this.f3658b.length) {
            return -1;
        }
        return a;
    }
}

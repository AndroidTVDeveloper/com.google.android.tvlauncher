package defpackage;

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

/* renamed from: bfe  reason: default package */
/* compiled from: PG */
final class bfe implements bdl {
    private final bfb a;
    private final long[] b;
    private final Map c;
    private final Map d;
    private final Map e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfb.a(java.util.TreeSet, boolean):void
     arg types: [java.util.TreeSet, int]
     candidates:
      bfb.a(java.lang.String, java.util.Map):android.text.SpannableStringBuilder
      bfb.a(java.util.TreeSet, boolean):void */
    public bfe(bfb bfb, Map map, Map map2, Map map3) {
        this.a = bfb;
        this.d = map2;
        this.e = map3;
        this.c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        bfb.a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    public final int b() {
        return this.b.length;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.text.SpannableStringBuilder.delete(int, int):android.text.SpannableStringBuilder}
     arg types: [int, int]
     candidates:
      ClspMth{android.text.SpannableStringBuilder.delete(int, int):android.text.Editable}
      ClspMth{android.text.SpannableStringBuilder.delete(int, int):android.text.SpannableStringBuilder} */
    public final List b(long j) {
        int i;
        int i2;
        long j2 = j;
        bfb bfb = this.a;
        Map map = this.c;
        Map map2 = this.d;
        Map map3 = this.e;
        ArrayList arrayList = new ArrayList();
        bfb.a(j2, bfb.c, arrayList);
        TreeMap treeMap = new TreeMap();
        bfb.a(j, false, bfb.c, treeMap);
        bfb.a(j2, map, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Pair pair = (Pair) arrayList.get(i3);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                bfc bfc = (bfc) map2.get(pair.first);
                arrayList2.add(new bdj(decodeByteArray, bfc.b, bfc.c, bfc.e, bfc.f, bfc.g));
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
            arrayList2.add(new bdj(spannableStringBuilder, bfc2.c, bfc2.d, bfc2.e, bfc2.b, bfc2.f, bfc2.h, bfc2.i));
        }
        return arrayList2;
    }

    public final long a(int i) {
        return this.b[i];
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean, boolean):int
     arg types: [long[], long, int, int]
     candidates:
      blm.a(long, alb, long, long):long
      blm.a(long[], long, boolean, boolean):int */
    public final int a(long j) {
        int a2 = blm.a(this.b, j, false, false);
        if (a2 >= this.b.length) {
            return -1;
        }
        return a2;
    }
}

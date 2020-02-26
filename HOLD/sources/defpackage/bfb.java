package defpackage;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: bfb  reason: default package */
/* compiled from: PG */
final class bfb {
    public final long a;
    public final long b;
    public final String c;
    private final String d;
    private final String e;
    private final boolean f;
    private final bfd g;
    private final String[] h;
    private final String i;
    private final HashMap j;
    private final HashMap k;
    private List l;

    public bfb(String str, String str2, long j2, long j3, bfd bfd, String[] strArr, String str3, String str4) {
        boolean z;
        this.d = str;
        this.e = str2;
        this.i = str4;
        this.g = bfd;
        this.h = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        this.a = j2;
        this.b = j3;
        this.c = (String) bks.a((Object) str3);
        this.j = new HashMap();
        this.k = new HashMap();
    }

    private final boolean a(long j2) {
        long j3 = this.a;
        if (j3 == -9223372036854775807L && this.b == -9223372036854775807L) {
            return true;
        }
        if (j3 <= j2 && this.b == -9223372036854775807L) {
            return true;
        }
        if (j3 != -9223372036854775807L || j2 >= this.b) {
            return j3 <= j2 && j2 < this.b;
        }
        return true;
    }

    public final void a(bfb bfb) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.add(bfb);
    }

    private final bfb a(int i2) {
        List list = this.l;
        if (list != null) {
            return (bfb) list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    private final int a() {
        List list = this.l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void a(TreeSet treeSet, boolean z) {
        boolean equals = "p".equals(this.d);
        boolean equals2 = "div".equals(this.d);
        if (z || equals || (equals2 && this.i != null)) {
            long j2 = this.a;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.b;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.l != null) {
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                bfb bfb = (bfb) this.l.get(i2);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                bfb.a(treeSet, z2);
            }
        }
    }

    private static SpannableStringBuilder a(String str, Map map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return (SpannableStringBuilder) map.get(str);
    }

    public final void a(long j2, String str, List list) {
        String str2;
        if (!"".equals(this.c)) {
            str = this.c;
        }
        if (!a(j2) || !"div".equals(this.d) || (str2 = this.i) == null) {
            for (int i2 = 0; i2 < a(); i2++) {
                a(i2).a(j2, str, list);
            }
            return;
        }
        list.add(new Pair(str, str2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: bfd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r11, java.util.Map r13, java.util.Map r14) {
        /*
            r10 = this;
            boolean r0 = r10.a(r11)
            if (r0 == 0) goto L_0x0159
            java.util.HashMap r0 = r10.k
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0147
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.util.HashMap r4 = r10.j
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L_0x0038
            java.util.HashMap r4 = r10.j
            java.lang.Object r4 = r4.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x003a
        L_0x0038:
            r4 = 0
        L_0x003a:
            java.lang.Object r1 = r1.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r4 == r1) goto L_0x0010
            java.lang.Object r3 = r14.get(r3)
            android.text.SpannableStringBuilder r3 = (android.text.SpannableStringBuilder) r3
            bfd r5 = r10.g
            java.lang.String[] r6 = r10.h
            r7 = 1
            if (r5 != 0) goto L_0x0057
            if (r6 != 0) goto L_0x0057
            r5 = 0
            goto L_0x00af
        L_0x0057:
            if (r5 != 0) goto L_0x0066
            int r8 = r6.length
            if (r8 != r7) goto L_0x0066
            r2 = r6[r2]
            java.lang.Object r2 = r13.get(r2)
            r5 = r2
            bfd r5 = (defpackage.bfd) r5
            goto L_0x00af
        L_0x0066:
            if (r5 != 0) goto L_0x0082
            int r8 = r6.length
            if (r8 <= r7) goto L_0x0082
            bfd r9 = new bfd
            r9.<init>()
        L_0x0070:
            if (r2 < r8) goto L_0x0074
            r5 = r9
            goto L_0x00af
        L_0x0074:
            r5 = r6[r2]
            java.lang.Object r5 = r13.get(r5)
            bfd r5 = (defpackage.bfd) r5
            r9.a(r5)
            int r2 = r2 + 1
            goto L_0x0070
        L_0x0082:
            if (r5 == 0) goto L_0x0096
            if (r6 == 0) goto L_0x0096
            int r8 = r6.length
            if (r8 != r7) goto L_0x0096
            r2 = r6[r2]
            java.lang.Object r2 = r13.get(r2)
            bfd r2 = (defpackage.bfd) r2
            r5.a(r2)
            goto L_0x00af
        L_0x0096:
            if (r5 == 0) goto L_0x00ae
            if (r6 == 0) goto L_0x00ae
            int r8 = r6.length
            if (r8 <= r7) goto L_0x00ae
        L_0x009d:
            if (r2 < r8) goto L_0x00a0
            goto L_0x00ae
        L_0x00a0:
            r9 = r6[r2]
            java.lang.Object r9 = r13.get(r9)
            bfd r9 = (defpackage.bfd) r9
            r5.a(r9)
            int r2 = r2 + 1
            goto L_0x009d
        L_0x00ae:
        L_0x00af:
            if (r5 == 0) goto L_0x0010
            int r2 = r5.a()
            r6 = -1
            r8 = 33
            if (r2 == r6) goto L_0x00c6
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            int r6 = r5.a()
            r2.<init>(r6)
            r3.setSpan(r2, r4, r1, r8)
        L_0x00c6:
            int r2 = r5.f
            if (r2 != r7) goto L_0x00d2
            android.text.style.StrikethroughSpan r2 = new android.text.style.StrikethroughSpan
            r2.<init>()
            r3.setSpan(r2, r4, r1, r8)
        L_0x00d2:
            int r2 = r5.g
            if (r2 != r7) goto L_0x00de
            android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
            r2.<init>()
            r3.setSpan(r2, r4, r1, r8)
        L_0x00de:
            boolean r2 = r5.c
            if (r2 == 0) goto L_0x00ec
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            int r6 = r5.b
            r2.<init>(r6)
            r3.setSpan(r2, r4, r1, r8)
        L_0x00ec:
            boolean r2 = r5.e
            if (r2 != 0) goto L_0x00f1
            goto L_0x00fb
        L_0x00f1:
            android.text.style.BackgroundColorSpan r2 = new android.text.style.BackgroundColorSpan
            int r6 = r5.d
            r2.<init>(r6)
            r3.setSpan(r2, r4, r1, r8)
        L_0x00fb:
            java.lang.String r2 = r5.a
            if (r2 == 0) goto L_0x0107
            android.text.style.TypefaceSpan r6 = new android.text.style.TypefaceSpan
            r6.<init>(r2)
            r3.setSpan(r6, r4, r1, r8)
        L_0x0107:
            android.text.Layout$Alignment r2 = r5.m
            if (r2 == 0) goto L_0x0113
            android.text.style.AlignmentSpan$Standard r6 = new android.text.style.AlignmentSpan$Standard
            r6.<init>(r2)
            r3.setSpan(r6, r4, r1, r8)
        L_0x0113:
            int r2 = r5.j
            if (r2 == r7) goto L_0x013a
            r6 = 2
            if (r2 == r6) goto L_0x012e
            r6 = 3
            if (r2 == r6) goto L_0x011f
            goto L_0x0010
        L_0x011f:
            android.text.style.RelativeSizeSpan r2 = new android.text.style.RelativeSizeSpan
            float r5 = r5.k
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r6
            r2.<init>(r5)
            r3.setSpan(r2, r4, r1, r8)
            goto L_0x0010
        L_0x012e:
            android.text.style.RelativeSizeSpan r2 = new android.text.style.RelativeSizeSpan
            float r5 = r5.k
            r2.<init>(r5)
            r3.setSpan(r2, r4, r1, r8)
            goto L_0x0010
        L_0x013a:
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            float r5 = r5.k
            int r5 = (int) r5
            r2.<init>(r5, r7)
            r3.setSpan(r2, r4, r1, r8)
            goto L_0x0010
        L_0x0147:
        L_0x0149:
            int r0 = r10.a()
            if (r2 >= r0) goto L_0x0159
            bfb r0 = r10.a(r2)
            r0.a(r11, r13, r14)
            int r2 = r2 + 1
            goto L_0x0149
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfb.a(long, java.util.Map, java.util.Map):void");
    }

    public final void a(long j2, boolean z, String str, Map map) {
        this.j.clear();
        this.k.clear();
        if (!"metadata".equals(this.d)) {
            if (!"".equals(this.c)) {
                str = this.c;
            }
            if (this.f && z) {
                a(str, map).append((CharSequence) this.e);
            } else if ("br".equals(this.d) && z) {
                a(str, map).append(10);
            } else if (a(j2)) {
                for (Map.Entry entry : map.entrySet()) {
                    this.j.put((String) entry.getKey(), Integer.valueOf(((SpannableStringBuilder) entry.getValue()).length()));
                }
                boolean equals = "p".equals(this.d);
                for (int i2 = 0; i2 < a(); i2++) {
                    a(i2).a(j2, z || equals, str, map);
                }
                if (equals) {
                    SpannableStringBuilder a2 = a(str, map);
                    int length = a2.length() - 1;
                    while (length >= 0 && a2.charAt(length) == ' ') {
                        length--;
                    }
                    if (length >= 0 && a2.charAt(length) != 10) {
                        a2.append(10);
                    }
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    this.k.put((String) entry2.getKey(), Integer.valueOf(((SpannableStringBuilder) entry2.getValue()).length()));
                }
            }
        }
    }
}
